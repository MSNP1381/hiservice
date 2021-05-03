package ir.hiserv;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class register_login extends Activity implements B4AActivity{
	public static register_login mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.hiserv", "ir.hiserv.register_login");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (register_login).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "ir.hiserv", "ir.hiserv.register_login");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.hiserv.register_login", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (register_login) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (register_login) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return register_login.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (register_login) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            register_login mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (register_login) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public Object[] _s = null;
public Object _person = null;
public Object _lock = null;
public anywheresoftware.b4a.object.XmlLayoutBuilder _x = null;
public de.amberhome.viewpager.AHViewPager _ahv = null;
public de.amberhome.viewpager.AHPageContainer _ahc = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _action_panel = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _logo_iv = null;
public anywheresoftware.b4a.objects.PanelWrapper[] _p = null;
public de.amberhome.objects.appcompat.ACButtonWrapper _create_accout_btn = null;
public de.amberhome.objects.appcompat.ACButtonWrapper _enter_btn = null;
public de.amberhome.objects.appcompat.ACButtonWrapper _phone_register = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _progress_iv = null;
public anywheresoftware.b4a.objects.EditTextWrapper _phone_et = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _phone_iv = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ph_test = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _pass_iv = null;
public anywheresoftware.b4a.objects.EditTextWrapper _user_et = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _user_iv = null;
public uk.co.martinpearman.b4a.squareup.picasso.Picasso _pic = null;
public static boolean _phone_incorrect = false;
public anywheresoftware.b4a.objects.IME _ime = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pass_et = null;
public ir.hiserv.main _main = null;
public ir.hiserv.laundry _laundry = null;
public ir.hiserv.firebasemessaging _firebasemessaging = null;
public ir.hiserv.main_ _main_ = null;
public ir.hiserv.main_codes _main_codes = null;
public ir.hiserv.starter _starter = null;
public ir.hiserv.notify _notify = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _i = 0;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="load_drawable";
_load_drawable();
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="pic.Initialize";
mostCurrent._pic.Initialize(processBA);
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="ime.Initialize(\"ime\")";
mostCurrent._ime.Initialize("ime");
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="ahc.Initialize";
mostCurrent._ahc.Initialize(mostCurrent.activityBA);
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="For i=0 To p.Length-1";
{
final int step5 = 1;
final int limit5 = (int) (mostCurrent._p.length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="p(i).Initialize(i)";
mostCurrent._p[_i].Initialize(mostCurrent.activityBA,BA.NumberToString(_i));
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="ahc.AddPage(p(i),i)";
mostCurrent._ahc.AddPage((android.view.View)(mostCurrent._p[_i].getObject()),BA.NumberToString(_i));
 }
};
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="ahv.Initialize2(ahc,\"ahv\")";
mostCurrent._ahv.Initialize2(mostCurrent.activityBA,mostCurrent._ahc,"ahv");
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="ahv.PageMargin=0";
mostCurrent._ahv.setPageMargin((int) (0));
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="ahv.OffscreenPageLimit=0";
mostCurrent._ahv.setOffscreenPageLimit((int) (0));
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="ahv.PagingEnabled=False";
mostCurrent._ahv.setPagingEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="Activity.AddView(ahv,0,0,100%X,100%Y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._ahv.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=1376276;
 //BA.debugLineNum = 1376276;BA.debugLine="End Sub";
return "";
}
public static String  _load_drawable() throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "load_drawable"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "load_drawable", null));}
int _i = 0;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub load_drawable";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="For i=0 To 15";
{
final int step1 = 1;
final int limit1 = (int) (15);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="s(i)=x.GetDrawable($\"state${i}\"$)";
mostCurrent._s[_i] = (Object)(mostCurrent._x.GetDrawable(("state"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"")));
 }
};
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="person=x.GetDrawable(\"baseline_person_black_24\")";
mostCurrent._person = (Object)(mostCurrent._x.GetDrawable("baseline_person_black_24"));
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="lock=x.GetDrawable(\"baseline_lock_black_24\")";
mostCurrent._lock = (Object)(mostCurrent._x.GetDrawable("baseline_lock_black_24"));
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="register_login";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public static String  _ahv_pagecreated(int _position,Object _page) throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ahv_pagecreated"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ahv_pagecreated", new Object[] {_position,_page}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub ahv_PageCreated (Position As Int, Page As Obje";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim pnl As Panel=Page";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl.setObject((android.view.ViewGroup)(_page));
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Select Position";
switch (_position) {
case 0: {
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="pnl.LoadLayout(\"phone_numer_loign_lay\")";
_pnl.LoadLayout("phone_numer_loign_lay",mostCurrent.activityBA);
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="ime.ShowKeyboard(phone_et)";
mostCurrent._ime.ShowKeyboard((android.view.View)(mostCurrent._phone_et.getObject()));
 break; }
case 1: {
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="pnl.LoadLayout(\"register_login_lay\")";
_pnl.LoadLayout("register_login_lay",mostCurrent.activityBA);
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="user_iv.Background=person";
mostCurrent._user_iv.setBackground((android.graphics.drawable.Drawable)(mostCurrent._person));
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="pass_iv.Background=lock";
mostCurrent._pass_iv.setBackground((android.graphics.drawable.Drawable)(mostCurrent._lock));
 break; }
case 2: {
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="pnl.LoadLayout(\"REGISTER_FINISHED\")";
_pnl.LoadLayout("REGISTER_FINISHED",mostCurrent.activityBA);
 break; }
}
;
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="End Sub";
return "";
}
public static String  _create_accout_btn_click() throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "create_accout_btn_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "create_accout_btn_click", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub create_accout_btn_Click";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public static String  _edittext1_enterpressed() throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittext1_enterpressed"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittext1_enterpressed", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub EditText1_EnterPressed";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public static String  _edittext2_enterpressed() throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittext2_enterpressed"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "edittext2_enterpressed", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub EditText2_EnterPressed";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public static void  _enter_btn_click() throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "enter_btn_click"))
	 {Debug.delegate(mostCurrent.activityBA, "enter_btn_click", null); return;}
ResumableSub_enter_btn_Click rsub = new ResumableSub_enter_btn_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_enter_btn_Click extends BA.ResumableSub {
public ResumableSub_enter_btn_Click(ir.hiserv.register_login parent) {
this.parent = parent;
}
ir.hiserv.register_login parent;
String _test_string1 = "";
String _test_string2 = "";
anywheresoftware.b4a.objects.PanelWrapper _p1 = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="register_login";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="user_iv.Background=Null";
parent.mostCurrent._user_iv.setBackground((android.graphics.drawable.Drawable)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="pass_iv.Background=Null";
parent.mostCurrent._pass_iv.setBackground((android.graphics.drawable.Drawable)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Dim test_string1 As String =user_et.Text";
_test_string1 = parent.mostCurrent._user_et.getText();
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Dim test_string2 As String =pass_et.Text";
_test_string2 = parent.mostCurrent._pass_et.getText();
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="If test_string1.Length>0 And test_string2.Length>";
if (true) break;

case 1:
//if
this.state = 6;
if (_test_string1.length()>0 && _test_string2.length()>0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="pic.LoadResource(\"baseline_check_black_36\").Into";
parent.mostCurrent._pic.LoadResource("baseline_check_black_36").IntoImageView((android.widget.ImageView)(parent.mostCurrent._pass_iv.getObject()));
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="pic.LoadResource(\"baseline_check_black_36\").Into";
parent.mostCurrent._pic.LoadResource("baseline_check_black_36").IntoImageView((android.widget.ImageView)(parent.mostCurrent._user_iv.getObject()));
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="Sleep(150)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "register_login", "enter_btn_click"),(int) (150));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="gotopage(2)";
_gotopage((int) (2));
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="ime.HideKeyboard";
parent.mostCurrent._ime.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="phone_incorrect=False";
parent._phone_incorrect = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="Dim p1 As Panel= ahc.GetPageObject(2)";
_p1 = new anywheresoftware.b4a.objects.PanelWrapper();
_p1.setObject((android.view.ViewGroup)(parent.mostCurrent._ahc.GetPageObject((int) (2))));
RDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="Dim v As View=p1.GetView(1)";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
_v = _p1.GetView((int) (1));
RDebugUtils.currentLine=1638417;
 //BA.debugLineNum = 1638417;BA.debugLine="v.SetVisibleAnimated(1600,True)";
_v.SetVisibleAnimated((int) (1600),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="Sleep(1800)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "register_login", "enter_btn_click"),(int) (1800));
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="progress_iv.Visible=True";
parent.mostCurrent._progress_iv.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638420;
 //BA.debugLineNum = 1638420;BA.debugLine="main_codes.create_progress_inter( progress_iv)";
parent.mostCurrent._main_codes._create_progress_inter(mostCurrent.activityBA,parent.mostCurrent._progress_iv);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1638423;
 //BA.debugLineNum = 1638423;BA.debugLine="phone_et.SelectAll";
parent.mostCurrent._phone_et.SelectAll();
RDebugUtils.currentLine=1638424;
 //BA.debugLineNum = 1638424;BA.debugLine="phone_incorrect=True";
parent._phone_incorrect = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1638426;
 //BA.debugLineNum = 1638426;BA.debugLine="pic.LoadResource(\"baseline_close_black_36\").Into";
parent.mostCurrent._pic.LoadResource("baseline_close_black_36").IntoImageView((android.widget.ImageView)(parent.mostCurrent._pass_iv.getObject()));
RDebugUtils.currentLine=1638427;
 //BA.debugLineNum = 1638427;BA.debugLine="pic.LoadResource(\"baseline_close_black_36\").Into";
parent.mostCurrent._pic.LoadResource("baseline_close_black_36").IntoImageView((android.widget.ImageView)(parent.mostCurrent._user_iv.getObject()));
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1638431;
 //BA.debugLineNum = 1638431;BA.debugLine="Sleep(4000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "register_login", "enter_btn_click"),(int) (4000));
this.state = 9;
return;
case 9:
//C
this.state = -1;
;
RDebugUtils.currentLine=1638432;
 //BA.debugLineNum = 1638432;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
RDebugUtils.currentLine=1638433;
 //BA.debugLineNum = 1638433;BA.debugLine="StartActivity(main_)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main_.getObject()));
RDebugUtils.currentLine=1638434;
 //BA.debugLineNum = 1638434;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _gotopage(int _i) throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gotopage"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "gotopage", new Object[] {_i}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub gotopage(i As Int)";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="ahv.GotoPage(i,True)";
mostCurrent._ahv.GotoPage(_i,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _pass_et_enterpressed() throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pass_et_enterpressed"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pass_et_enterpressed", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub pass_et_EnterPressed";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _phone_et_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "phone_et_focuschanged"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "phone_et_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub phone_et_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="If HasFocus And phone_incorrect Then";
if (_hasfocus && _phone_incorrect) { 
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="phone_et.SelectAll";
mostCurrent._phone_et.SelectAll();
 };
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="End Sub";
return "";
}
public static void  _phone_register_click() throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "phone_register_click"))
	 {Debug.delegate(mostCurrent.activityBA, "phone_register_click", null); return;}
ResumableSub_phone_register_Click rsub = new ResumableSub_phone_register_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_phone_register_Click extends BA.ResumableSub {
public ResumableSub_phone_register_Click(ir.hiserv.register_login parent) {
this.parent = parent;
}
ir.hiserv.register_login parent;
String _test_string = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="register_login";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="phone_iv.Background=Null";
parent.mostCurrent._phone_iv.setBackground((android.graphics.drawable.Drawable)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Dim test_string As String =phone_et.Text";
_test_string = parent.mostCurrent._phone_et.getText();
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Log(test_string.Length)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_test_string.length()));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="If test_string.StartsWith(\"09\") And test_string.L";
if (true) break;

case 1:
//if
this.state = 6;
if (_test_string.startsWith("09") && _test_string.length()==11) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="pic.LoadResource(\"baseline_check_black_36\").Into";
parent.mostCurrent._pic.LoadResource("baseline_check_black_36").IntoImageView((android.widget.ImageView)(parent.mostCurrent._phone_iv.getObject()));
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Sleep(150)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "register_login", "phone_register_click"),(int) (150));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="gotopage(1)";
_gotopage((int) (1));
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="phone_incorrect=True";
parent._phone_incorrect = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="phone_incorrect=False";
parent._phone_incorrect = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="phone_et.SelectAll";
parent.mostCurrent._phone_et.SelectAll();
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="pic.LoadResource(\"baseline_close_black_36\").Into";
parent.mostCurrent._pic.LoadResource("baseline_close_black_36").IntoImageView((android.widget.ImageView)(parent.mostCurrent._phone_iv.getObject()));
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _user_et_enterpressed() throws Exception{
RDebugUtils.currentModule="register_login";
if (Debug.shouldDelegate(mostCurrent.activityBA, "user_et_enterpressed"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "user_et_enterpressed", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub user_et_EnterPressed";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
}