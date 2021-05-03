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

public class main_ extends Activity implements B4AActivity{
	public static main_ mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.hiserv", "ir.hiserv.main_");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main_).");
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
		activityBA = new BA(this, layout, processBA, "ir.hiserv", "ir.hiserv.main_");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.hiserv.main_", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main_) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main_) Resume **");
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
		return main_.class;
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
        BA.LogInfo("** Activity (main_) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            main_ mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main_) Resume **");
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
public static anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tf_sans = null;
public static int _color_p = 0;
public static Object _score_ic = null;
public static Object _paid_ic = null;
public static Object _orders_ic = null;
public static Object _notify_ic = null;
public static Object _search_box = null;
public static Object _account = null;
public static Object _shopping_basket = null;
public static Object _home1 = null;
public static Object _menu = null;
public static Object _notif_recived = null;
public static Object _guide_frame = null;
public static Object _place_holder = null;
public static int _color_s = 0;
public anywheresoftware.b4a.objects.PanelWrapper _p = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public de.amberhome.objects.BottomNavigationViewWrapper _dsbottomnavigationview1 = null;
public com.maximussoft.mscardview.CardViewWrapper _items_card_view = null;
public anywheresoftware.b4a.objects.PanelWrapper _laundry_pnl = null;
public anywheresoftware.b4a.objects.PanelWrapper _services_panel = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.object.XmlLayoutBuilder _x = null;
public de.amberhome.objects.appcompat.AppCompatBase _ac = null;
public anywheresoftware.b4a.objects.PanelWrapper _action_panel = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _menu_iv = null;
public static int _bottom_nav_pos = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _notify_iv = null;
public ir.hiserv.main _main = null;
public ir.hiserv.laundry _laundry = null;
public ir.hiserv.register_login _register_login = null;
public ir.hiserv.firebasemessaging _firebasemessaging = null;
public ir.hiserv.main_codes _main_codes = null;
public ir.hiserv.starter _starter = null;
public ir.hiserv.notify _notify = null;
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main_";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(ir.hiserv.main_ parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
ir.hiserv.main_ parent;
boolean _firsttime;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main_";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="setup_drawables";
_setup_drawables();
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="color_p=ac.GetThemeAttribute(\"colorPrimary\")";
parent._color_p = parent.mostCurrent._ac.GetThemeAttribute(mostCurrent.activityBA,"colorPrimary");
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="Activity.LoadLayout(\"main_lay\")";
parent.mostCurrent._activity.LoadLayout("main_lay",mostCurrent.activityBA);
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="p=ScrollView1.Panel";
parent.mostCurrent._p = parent.mostCurrent._scrollview1.getPanel();
RDebugUtils.currentLine=3473427;
 //BA.debugLineNum = 3473427;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main_", "activity_create"),(int) (200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=3473429;
 //BA.debugLineNum = 3473429;BA.debugLine="bottom_nav";
_bottom_nav();
RDebugUtils.currentLine=3473430;
 //BA.debugLineNum = 3473430;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setup_drawables() throws Exception{
RDebugUtils.currentModule="main_";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setup_drawables"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setup_drawables", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub setup_drawables";
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="account=x.GetDrawable(\"baseline_account_circle_w";
_account = (Object)(mostCurrent._x.GetDrawable("baseline_account_circle_white_36dp"));
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="shopping_basket=x.GetDrawable(\"baseline_shopping";
_shopping_basket = (Object)(mostCurrent._x.GetDrawable("baseline_shopping_cart_white_36dp"));
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="home1=x.GetDrawable(\"baseline_home_white_36dp\")";
_home1 = (Object)(mostCurrent._x.GetDrawable("baseline_home_white_36dp"));
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="menu=x.GetDrawable(\"baseline_menu_white_36dp\")";
_menu = (Object)(mostCurrent._x.GetDrawable("baseline_menu_white_36dp"));
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="notif_recived=x.GetDrawable(\"baseline_notificati";
_notif_recived = (Object)(mostCurrent._x.GetDrawable("baseline_notifications_white_36dp_recived"));
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="place_holder=x.GetDrawable(\"placeholder\")";
_place_holder = (Object)(mostCurrent._x.GetDrawable("placeholder"));
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="End Sub";
return "";
}
public static String  _bottom_nav() throws Exception{
RDebugUtils.currentModule="main_";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bottom_nav"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bottom_nav", null));}
de.amberhome.objects.appcompat.ACMenuWrapper _m = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub  bottom_nav";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="DSBottomNavigationView1.Color=color_p";
mostCurrent._dsbottomnavigationview1.setColor(_color_p);
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Dim m As ACMenu=DSBottomNavigationView1.Menu";
_m = new de.amberhome.objects.appcompat.ACMenuWrapper();
_m = mostCurrent._dsbottomnavigationview1.getMenu();
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="m.Add2(0,0,\"سفارشات\",shopping_basket)";
_m.Add2((int) (0),(int) (0),BA.ObjectToCharSequence("سفارشات"),(android.graphics.drawable.Drawable)(_shopping_basket));
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="m.Add2(1,0,\"خانه\",home1).Checked=True";
_m.Add2((int) (1),(int) (0),BA.ObjectToCharSequence("خانه"),(android.graphics.drawable.Drawable)(_home1)).setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="m.Add2(2,0,\"حساب کاربری\",account)";
_m.Add2((int) (2),(int) (0),BA.ObjectToCharSequence("حساب کاربری"),(android.graphics.drawable.Drawable)(_account));
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="DSBottomNavigationView1.SetItemIconColors(Colors.";
mostCurrent._dsbottomnavigationview1.SetItemIconColors(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (140),(int) (255),(int) (255),(int) (255)),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (255),(int) (255),(int) (255)),(int) (0xffe7cfcf));
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="DSBottomNavigationView1.SetItemTextColors(Colors.";
mostCurrent._dsbottomnavigationview1.SetItemTextColors(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (140),(int) (255),(int) (255),(int) (255)),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (255),(int) (255),(int) (255)),(int) (0xffe7cfcf));
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main_";
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main_";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return "";
}
public static String  _dsbottomnavigationview1_navigationitemselected(de.amberhome.objects.appcompat.ACMenuItemWrapper _menuitem) throws Exception{
RDebugUtils.currentModule="main_";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dsbottomnavigationview1_navigationitemselected"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "dsbottomnavigationview1_navigationitemselected", new Object[] {_menuitem}));}
ir.hiserv.account_module _accounts = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub DSBottomNavigationView1_NavigationItemSelected";
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="If bottom_nav_pos = MenuItem.Id Then";
if (_bottom_nav_pos==_menuitem.getId()) { 
 }else {
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="ScrollView1.Panel.RemoveAllViews";
mostCurrent._scrollview1.getPanel().RemoveAllViews();
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="ScrollView1.Panel.Height=ScrollView1.Height";
mostCurrent._scrollview1.getPanel().setHeight(mostCurrent._scrollview1.getHeight());
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="ScrollView1.Padding = Array As Int (0dip, 0dip,";
mostCurrent._scrollview1.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0))});
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="Select MenuItem.Id";
switch (BA.switchObjectToInt(_menuitem.getId(),(int) (0),(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=3932174;
 //BA.debugLineNum = 3932174;BA.debugLine="order";
_order();
 break; }
case 1: {
RDebugUtils.currentLine=3932177;
 //BA.debugLineNum = 3932177;BA.debugLine="pan_create";
_pan_create();
 break; }
case 2: {
RDebugUtils.currentLine=3932180;
 //BA.debugLineNum = 3932180;BA.debugLine="Dim accounts As account_module";
_accounts = new ir.hiserv.account_module();
RDebugUtils.currentLine=3932181;
 //BA.debugLineNum = 3932181;BA.debugLine="accounts.Initialize(ScrollView1)";
_accounts._initialize(null,mostCurrent.activityBA,mostCurrent._scrollview1);
 break; }
}
;
 };
RDebugUtils.currentLine=3932184;
 //BA.debugLineNum = 3932184;BA.debugLine="bottom_nav_pos=MenuItem.Id";
_bottom_nav_pos = _menuitem.getId();
RDebugUtils.currentLine=3932185;
 //BA.debugLineNum = 3932185;BA.debugLine="Log(MenuItem.Title)";
anywheresoftware.b4a.keywords.Common.Log(_menuitem.getTitle());
RDebugUtils.currentLine=3932186;
 //BA.debugLineNum = 3932186;BA.debugLine="End Sub";
return "";
}
public static String  _order() throws Exception{
RDebugUtils.currentModule="main_";
if (Debug.shouldDelegate(mostCurrent.activityBA, "order"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "order", null));}
ir.hiserv.order_module _orders = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub order";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim orders As order_module";
_orders = new ir.hiserv.order_module();
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="orders.Initialize(p)";
_orders._initialize(null,mostCurrent.activityBA,mostCurrent._p);
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="End Sub";
return "";
}
public static String  _pan_create() throws Exception{
RDebugUtils.currentModule="main_";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pan_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pan_create", null));}
ir.hiserv.home_module _home = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub pan_create";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim home As home_module";
_home = new ir.hiserv.home_module();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="home.Initialize(ScrollView1.Panel,8)";
_home._initialize(null,mostCurrent.activityBA,mostCurrent._scrollview1.getPanel(),(int) (8));
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="End Sub";
return "";
}
public static String  _laundry_pnl_click() throws Exception{
RDebugUtils.currentModule="main_";
if (Debug.shouldDelegate(mostCurrent.activityBA, "laundry_pnl_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "laundry_pnl_click", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub laundry_pnl_Click";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="StartActivity(laundry)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._laundry.getObject()));
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="End Sub";
return "";
}
public static String  _notify_iv_click() throws Exception{
RDebugUtils.currentModule="main_";
if (Debug.shouldDelegate(mostCurrent.activityBA, "notify_iv_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "notify_iv_click", null));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub notify_iv_Click";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="StartActivity(notify)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._notify.getObject()));
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return "";
}
public static String  _openfile_click() throws Exception{
RDebugUtils.currentModule="main_";
if (Debug.shouldDelegate(mostCurrent.activityBA, "openfile_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "openfile_click", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub OpenFile_Click";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="StartActivity(Me)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,main_.getObject());
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="End Sub";
return "";
}
}