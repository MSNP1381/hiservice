package com.app.wordpress;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.app.wordpress.connection.API;
import com.app.wordpress.connection.RestAdapter;
import com.app.wordpress.connection.callbacks.CallbackComment;
import com.app.wordpress.data.Constant;
import com.app.wordpress.data.SharedPref;
import com.app.wordpress.model.Post;
import com.app.wordpress.utils.NetworkCheck;
import com.app.wordpress.utils.Tools;
import com.balysv.materialripple.MaterialRippleLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivitySendComment extends AppCompatActivity {

    public static final String EXTRA_OBJC = "key.EXTRA_OBJC";

    private Post post;
    private View parent_view;
    private EditText et_name, et_email, et_comment;
    private TextView tv_message;
    private TextInputLayout input_et_name, input_et_email, input_et_comment;
    private MaterialRippleLayout bt_submit_comment;
    private SharedPref sharedPref;
    private Call<CallbackComment> callbackCall = null;
    private boolean task_running = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_comment);
        parent_view = findViewById(android.R.id.content);

        // make dialog full screen
        getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        // get extra object
        post = (Post) getIntent().getSerializableExtra(EXTRA_OBJC);

        sharedPref = new SharedPref(this);

        input_et_name = (TextInputLayout) findViewById(R.id.input_et_name);
        input_et_email = (TextInputLayout) findViewById(R.id.input_et_email);
        input_et_comment = (TextInputLayout) findViewById(R.id.input_et_comment);
        tv_message = (TextView) findViewById(R.id.tv_message);
        et_name = (EditText) findViewById(R.id.et_name);
        et_email = (EditText) findViewById(R.id.et_email);
        et_comment = (EditText) findViewById(R.id.et_comment);
        bt_submit_comment = (MaterialRippleLayout) findViewById(R.id.bt_submit_comment);

        // get from profile data
        et_name.setText(sharedPref.getYourName());
        et_email.setText(sharedPref.getYourEmail());

        bt_submit_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateAllField();
            }
        });

        ((ImageButton) findViewById(R.id.bt_close)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (task_running) {
                    Toast.makeText(getApplicationContext(), R.string.task_running_msg, Toast.LENGTH_LONG).show();
                }else{
                    onBackPressed();
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    private void submitCommentToApi() {
        setEnableEditText(false);
        bt_submit_comment.setVisibility(View.GONE);
        task_running = true;

        String name = et_name.getText().toString().trim();
        String email = et_email.getText().toString().trim();
        String comment = et_comment.getText().toString().trim();

        API api = RestAdapter.createAPI();
        callbackCall = api.sendComment(post.id, name, email, comment);
        callbackCall.enqueue(new Callback<CallbackComment>() {
            @Override
            public void onResponse(Call<CallbackComment> call, Response<CallbackComment> response) {
                bt_submit_comment.setVisibility(View.VISIBLE);
                setEnableEditText(true);
                task_running = false;

                CallbackComment resp = response.body();
                if (resp != null) {
                    setEnableEditText(true);
                    String str_msg = getString(R.string.after_send_comment) + " " + resp.status.toUpperCase();
                    showMessageLayout(true, false, str_msg);
                    et_comment.setText("");
                } else {
                    onFailRequest();
                }
            }

            @Override
            public void onFailure(Call<CallbackComment> call, Throwable t) {
                if (!callbackCall.isCanceled()) {
                    bt_submit_comment.setVisibility(View.VISIBLE);
                    setEnableEditText(true);
                    task_running = false;
                    onFailRequest();
                }
            }

        });
    }

    private void onFailRequest() {
        setEnableEditText(true);
        if (NetworkCheck.isConnect(this)) {
            showMessageLayout(true, true, getString(R.string.failed_text_comment));
        } else {
            showMessageLayout(true, true, getString(R.string.no_inet_text_comment));
        }
    }

    /**
     * Validating form
     */
    private void validateAllField() {
        showMessageLayout(false, false, "");
        input_et_name.setEnabled(false);
        input_et_email.setEnabled(false);
        input_et_comment.setEnabled(false);
        if (!validateName()) return;
        if (!validateEmail()) return;
        if (!validateComment()) return;
        hideKeyboard();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                submitCommentToApi();
            }
        }, Constant.DELAY_TIME_MEDIUM);
    }

    private boolean validateName() {
        if (et_name.getText().toString().trim().isEmpty()) {
            input_et_name.setEnabled(true);
            input_et_name.setError(getString(R.string.invalid_name));
            requestFocus(et_name);
            return false;
        }
        return true;
    }

    private boolean validateEmail() {
        String email = et_email.getText().toString().trim();
        if (email.isEmpty() || !Tools.isValidEmail(email)) {
            input_et_email.setEnabled(true);
            input_et_email.setError(getString(R.string.invalid_email));
            requestFocus(et_email);
            return false;
        }
        return true;
    }

    private boolean validateComment() {
        if (et_comment.getText().toString().trim().isEmpty()) {
            input_et_comment.setEnabled(true);
            input_et_comment.setError(getString(R.string.invalid_comment));
            requestFocus(et_comment);
            return false;
        }
        return true;
    }

    private void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private void setEnableEditText(boolean flag) {
        et_name.setEnabled(flag);
        et_email.setEnabled(flag);
        et_comment.setEnabled(flag);
    }

    private void showMessageLayout(boolean visible, boolean isError, String msg) {
        tv_message.setText(msg);
        tv_message.setVisibility(View.GONE);
        tv_message.setBackgroundColor(getResources().getColor(R.color.green_color));
        if (visible) tv_message.setVisibility(View.VISIBLE);
        if (isError) tv_message.setBackgroundColor(getResources().getColor(R.color.red_color));
    }


    @Override
    public void onBackPressed() {
        if (task_running) {
            Toast.makeText(getApplicationContext(), R.string.task_running_msg, Toast.LENGTH_LONG).show();
        }else{
            super.onBackPressed();
        }
    }
}
