package com.app.wordpress.fcm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;

import com.app.wordpress.ActivityMain;
import com.app.wordpress.ActivityPostDetails;
import com.app.wordpress.ActivitySplash;
import com.app.wordpress.R;
import com.app.wordpress.data.SharedPref;
import com.app.wordpress.model.FcmNotif;
import com.app.wordpress.model.Post;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

public class FcmMessagingService extends FirebaseMessagingService {

    private static int VIBRATION_TIME = 500; // in millisecond
    private SharedPref sharedPref;

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        sharedPref = new SharedPref(this);
        if (sharedPref.getNotification()) {
            // play vibration
            if (sharedPref.getVibration()) {
                ((Vibrator) getSystemService(Context.VIBRATOR_SERVICE)).vibrate(VIBRATION_TIME);
            }
            RingtoneManager.getRingtone(this, Uri.parse(sharedPref.getRingtone())).play();

            if (remoteMessage.getData().size() > 0) {
                Map<String, String> data = remoteMessage.getData();
                FcmNotif fcmNotif = new FcmNotif();
                fcmNotif.setTitle(data.get("title"));
                fcmNotif.setContent(data.get("content"));
                fcmNotif.setPost_id(Integer.parseInt(data.get("post_id")));
                displayNotificationIntent(fcmNotif);
            }
        }
    }

    private void displayNotificationIntent(FcmNotif fcmNotif) {
        Intent intent = new Intent(this, ActivitySplash.class);
        if (fcmNotif.getPost_id() != -1) {
            intent = new Intent(this, ActivityPostDetails.class);
            Post post = new Post();
            post.title = fcmNotif.getTitle();
            post.id = fcmNotif.getPost_id();
            boolean from_notif = !ActivityMain.active;
            intent.putExtra(ActivityPostDetails.EXTRA_OBJC, post);
            intent.putExtra(ActivityPostDetails.EXTRA_NOTIF, from_notif);
        }
        PendingIntent pendingIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentTitle(fcmNotif.getTitle());
        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(fcmNotif.getContent()));
        builder.setContentText(fcmNotif.getContent());
        builder.setSmallIcon(R.drawable.ic_notification);
        builder.setDefaults(Notification.DEFAULT_LIGHTS);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            builder.setPriority(Notification.PRIORITY_HIGH);
        }
        builder.setContentIntent(pendingIntent);
        builder.setAutoCancel(true);
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        int unique_id = (int) System.currentTimeMillis();
        notificationManager.notify(unique_id, builder.build());
    }

}
