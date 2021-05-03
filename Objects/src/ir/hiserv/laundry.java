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

public class laundry extends Activity implements B4AActivity{
	public static laundry mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.hiserv", "ir.hiserv.laundry");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (laundry).");
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
		activityBA = new BA(this, layout, processBA, "ir.hiserv", "ir.hiserv.laundry");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.hiserv.laundry", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (laundry) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (laundry) Resume **");
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
		return laundry.class;
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
        BA.LogInfo("** Activity (laundry) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            laundry mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (laundry) Resume **");
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
public static anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tf_yekan_light = null;
public static anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tf_yekan_reg = null;
public anywheresoftware.b4a.object.XmlLayoutBuilder _x = null;
public de.amberhome.viewpager.AHViewPager _ahviewpager1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.collections.Map _main_map = null;
public de.amberhome.viewpager.AHPageContainer _container = null;
public anywheresoftware.b4a.objects.PanelWrapper _view_holder = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.CSBuilder _cs = null;
public anywheresoftware.b4a.objects.LabelWrapper _stage_lbl = null;
public ir.hiserv.main _main = null;
public ir.hiserv.register_login _register_login = null;
public ir.hiserv.firebasemessaging _firebasemessaging = null;
public ir.hiserv.main_ _main_ = null;
public ir.hiserv.main_codes _main_codes = null;
public ir.hiserv.starter _starter = null;
public ir.hiserv.notify _notify = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="laundry";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
Object _close = null;
int _i = 0;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="start(\"\")";
_start("");
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="cs.Initialize";
mostCurrent._cs.Initialize();
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="container.Initialize";
mostCurrent._container.Initialize(mostCurrent.activityBA);
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Dim close As Object=x.GetDrawable(\"ic_close_white";
_close = (Object)(mostCurrent._x.GetDrawable("ic_close_white_24dp"));
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="For i=0 To 5";
{
final int step5 = 1;
final int limit5 = (int) (5);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="view_holder.Initialize(\"view_holder\")";
mostCurrent._view_holder.Initialize(mostCurrent.activityBA,"view_holder");
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="view_holder.Tag=i";
mostCurrent._view_holder.setTag((Object)(_i));
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="container.AddPage(view_holder,i)";
mostCurrent._container.AddPage((android.view.View)(mostCurrent._view_holder.getObject()),BA.NumberToString(_i));
 }
};
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="Activity.LoadLayout(\"step_two_laundry\")";
mostCurrent._activity.LoadLayout("step_two_laundry",mostCurrent.activityBA);
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="AHViewPager1.PageContainer=container";
mostCurrent._ahviewpager1.setPageContainer(mostCurrent._container);
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="ImageView1.Background=close";
mostCurrent._imageview1.setBackground((android.graphics.drawable.Drawable)(_close));
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="End Sub";
return "";
}
public static String  _start(String _s) throws Exception{
RDebugUtils.currentModule="laundry";
if (Debug.shouldDelegate(mostCurrent.activityBA, "start"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "start", new Object[] {_s}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub start(s As String)";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="main_map.Initialize";
mostCurrent._main_map.Initialize();
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="main_map.Put(\"count\",4)";
mostCurrent._main_map.Put((Object)("count"),(Object)(4));
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="laundry";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="laundry";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public static String  _ahviewpager1_pagecreated(int _position,Object _page) throws Exception{
RDebugUtils.currentModule="laundry";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ahviewpager1_pagecreated"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ahviewpager1_pagecreated", new Object[] {_position,_page}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub AHViewPager1_PageCreated (Position As Int, Pag";
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="End Sub";
return "";
}
public static String  _barcode_barcodefound(String _barcode,String _formatname) throws Exception{
RDebugUtils.currentModule="laundry";
if (Debug.shouldDelegate(mostCurrent.activityBA, "barcode_barcodefound"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "barcode_barcodefound", new Object[] {_barcode,_formatname}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub barcode_BarcodeFound (barCode As String, forma";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Activity.AddView(lbl, 0, 20dip, 100%x, 50dip)";
mostCurrent._activity.AddView((android.view.View)(_lbl.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Dim cs As CSBuilder";
mostCurrent._cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="cs.Initialize.Size(20).Append(\"Click on underine";
mostCurrent._cs.Initialize().Size((int) (20)).Append(BA.ObjectToCharSequence("Click on underine word: "));
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="cs.color(Colors.Blue).Clickable(\"cs\", 1).Underlin";
mostCurrent._cs.Color(anywheresoftware.b4a.keywords.Common.Colors.Blue).Clickable(processBA,"cs",(Object)(1)).Underline().Pop().PopAll();
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="ToastMessageShow(cs,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(mostCurrent._cs.getObject()),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="End Sub";
return "";
}
public static String  _cs_click(Object _tag) throws Exception{
RDebugUtils.currentModule="laundry";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cs_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cs_click", new Object[] {_tag}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub cs_Click (Tag As Object)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Log($\"You have clicked on word: ${Tag}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("You have clicked on word: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_tag)+""));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public static String  _disablescroolbar(anywheresoftware.b4a.objects.ScrollViewWrapper _sv1) throws Exception{
RDebugUtils.currentModule="laundry";
if (Debug.shouldDelegate(mostCurrent.activityBA, "disablescroolbar"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "disablescroolbar", new Object[] {_sv1}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub DisableScroolbar(sv1 As ScrollView)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="r.Target = sv1";
_r.Target = (Object)(_sv1.getObject());
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="r.RunMethod2(\"setVerticalScrollBarEnabled\", False";
_r.RunMethod2("setVerticalScrollBarEnabled",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False),"java.lang.boolean");
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="End Sub";
return "";
}
public static String  _ime_heightchanged(int _newheight,int _oldheight) throws Exception{
RDebugUtils.currentModule="laundry";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ime_heightchanged"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ime_heightchanged", new Object[] {_newheight,_oldheight}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub ime_HeightChanged (NewHeight As Int, OldHeight";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public static Object  _set_stage(int _stage) throws Exception{
RDebugUtils.currentModule="laundry";
if (Debug.shouldDelegate(mostCurrent.activityBA, "set_stage"))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "set_stage", new Object[] {_stage}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub set_stage(stage As Int)As Object";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="cs.Color(Colors.Black).Typeface(tf_yekan_reg).Size";
mostCurrent._cs.Color(anywheresoftware.b4a.keywords.Common.Colors.Black).Typeface((android.graphics.Typeface)(_tf_yekan_reg.getObject())).Size((int) (20)).Append(BA.ObjectToCharSequence("Click on underine word: "));
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="cs.Clickable(\"cs\", 1).Append(\"One\").Pop.PopAll";
mostCurrent._cs.Clickable(processBA,"cs",(Object)(1)).Append(BA.ObjectToCharSequence("One")).Pop().PopAll();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="cs.EnableClickEvents(stage_lbl)";
mostCurrent._cs.EnableClickEvents((android.widget.TextView)(mostCurrent._stage_lbl.getObject()));
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="stage_lbl.Text = cs";
mostCurrent._stage_lbl.setText(BA.ObjectToCharSequence(mostCurrent._cs.getObject()));
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="End Sub";
return null;
}
public static String  _shop_basket_iv_click() throws Exception{
RDebugUtils.currentModule="laundry";
if (Debug.shouldDelegate(mostCurrent.activityBA, "shop_basket_iv_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "shop_basket_iv_click", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub shop_basket_iv_Click";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
}