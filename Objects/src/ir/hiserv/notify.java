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

public class notify extends Activity implements B4AActivity{
	public static notify mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.hiserv", "ir.hiserv.notify");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (notify).");
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
		activityBA = new BA(this, layout, processBA, "ir.hiserv", "ir.hiserv.notify");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.hiserv.notify", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (notify) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (notify) Resume **");
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
		return notify.class;
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
        BA.LogInfo("** Activity (notify) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            notify mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (notify) Resume **");
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
public com.maximussoft.mscardview.CardViewWrapper _ms = null;
public amin.shahedi.ariagp.AriaVolley _v = null;
public flm.b4a.ultimatelistview.UltimateListViewWrapper _ultimatelistview1 = null;
public anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
public uk.co.martinpearman.b4a.squareup.picasso.Picasso _picasso = null;
public anywheresoftware.b4a.objects.collections.Map[] _maps = null;
public ir.hiserv.main _main = null;
public ir.hiserv.laundry _laundry = null;
public ir.hiserv.register_login _register_login = null;
public ir.hiserv.firebasemessaging _firebasemessaging = null;
public ir.hiserv.main_ _main_ = null;
public ir.hiserv.main_codes _main_codes = null;
public ir.hiserv.starter _starter = null;
public static String  _acbutton1_click() throws Exception{
RDebugUtils.currentModule="notify";
if (Debug.shouldDelegate(mostCurrent.activityBA, "acbutton1_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "acbutton1_click", null));}
de.amberhome.objects.appcompat.ACButtonWrapper _ac_btn = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _news_url = "";
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub ACButton1_Click";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim ac_btn As ACButton";
_ac_btn = new de.amberhome.objects.appcompat.ACButtonWrapper();
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="ac_btn=Sender";
_ac_btn.setObject((android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="Dim item As Map = maps(ac_btn.Tag)";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = mostCurrent._maps[(int)(BA.ObjectToNumber(_ac_btn.getTag()))];
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="Dim news_url As String = item.Get(\"news_url\")";
_news_url = BA.ObjectToString(_item.Get((Object)("news_url")));
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="ToastMessageShow(news_url,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_news_url),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="notify";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="v.Initialize(\"v\")";
mostCurrent._v.Initialize(processBA,"v");
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="picasso.Initialize";
mostCurrent._picasso.Initialize(processBA);
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="v.AddQueue( v.CreateStringRequest	(\"http://hiserv";
mostCurrent._v.AddQueue(mostCurrent._v.CreateStringRequest(processBA,"http://hiserv.ir/wp-content/msnp/request.php",mostCurrent._v.GET));
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="v.Start";
mostCurrent._v.Start();
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="Activity.LoadLayout(\"notify_lay\")";
mostCurrent._activity.LoadLayout("notify_lay",mostCurrent.activityBA);
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="UltimateListView1.AddLayout(\"lay1\",\"UltimateListV";
mostCurrent._ultimatelistview1.AddLayout("lay1","UltimateListView1_LayoutCreator","UltimateListView1_ContentFiller",anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (82),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="notify";
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="notify";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return "";
}
public static String  _back_iv_click() throws Exception{
RDebugUtils.currentModule="notify";
if (Debug.shouldDelegate(mostCurrent.activityBA, "back_iv_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "back_iv_click", null));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub back_iv_Click";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="End Sub";
return "";
}
public static String  _ultimatelistview1_contentfiller(long _itemid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel,int _position) throws Exception{
RDebugUtils.currentModule="notify";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ultimatelistview1_contentfiller"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ultimatelistview1_contentfiller", new Object[] {_itemid,_layoutname,_layoutpanel,_position}));}
anywheresoftware.b4a.objects.collections.Map _colroot = null;
String _image_url = "";
String _title = "";
String _body = "";
com.maximussoft.mscardview.CardViewWrapper _m = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl1 = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl2 = null;
de.amberhome.objects.appcompat.ACButtonWrapper _btn1 = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub UltimateListView1_ContentFiller(ItemID As Long";
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="Dim colroot As Map=maps(ItemID)";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
_colroot = mostCurrent._maps[(int) (_itemid)];
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="Dim image_url As String = colroot.Get(\"image_url";
_image_url = BA.ObjectToString(_colroot.Get((Object)("image_url")));
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="Dim title As String = colroot.Get(\"title\")";
_title = BA.ObjectToString(_colroot.Get((Object)("title")));
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="Dim body As String = colroot.Get(\"body\")";
_body = BA.ObjectToString(_colroot.Get((Object)("body")));
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="Dim m As MSCardView=LayoutPanel.GetView(0)";
_m = new com.maximussoft.mscardview.CardViewWrapper();
_m.setObject((android.support.v7.widget.CardView)(_layoutpanel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=5898252;
 //BA.debugLineNum = 5898252;BA.debugLine="Dim p As Panel=m.Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = _m.getPanel();
RDebugUtils.currentLine=5898253;
 //BA.debugLineNum = 5898253;BA.debugLine="Dim lbl1 As Label=p.GetView(0)";
_lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl1.setObject((android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=5898254;
 //BA.debugLineNum = 5898254;BA.debugLine="Dim iv1 As ImageView=p.GetView(01)";
_iv1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv1.setObject((android.widget.ImageView)(_p.GetView((int) (01)).getObject()));
RDebugUtils.currentLine=5898255;
 //BA.debugLineNum = 5898255;BA.debugLine="Dim lbl2 As Label=p.GetView(02)";
_lbl2 = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl2.setObject((android.widget.TextView)(_p.GetView((int) (02)).getObject()));
RDebugUtils.currentLine=5898256;
 //BA.debugLineNum = 5898256;BA.debugLine="Dim btn1 As ACButton=p.GetView(03)";
_btn1 = new de.amberhome.objects.appcompat.ACButtonWrapper();
_btn1.setObject((android.widget.Button)(_p.GetView((int) (03)).getObject()));
RDebugUtils.currentLine=5898257;
 //BA.debugLineNum = 5898257;BA.debugLine="lbl1.Text=title";
_lbl1.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=5898258;
 //BA.debugLineNum = 5898258;BA.debugLine="lbl2.Text=body";
_lbl2.setText(BA.ObjectToCharSequence(_body));
RDebugUtils.currentLine=5898259;
 //BA.debugLineNum = 5898259;BA.debugLine="btn1.Tag=ItemID";
_btn1.setTag((Object)(_itemid));
RDebugUtils.currentLine=5898260;
 //BA.debugLineNum = 5898260;BA.debugLine="picasso.LoadUrl(image_url).PlaceholderDrawable(ma";
mostCurrent._picasso.LoadUrl(_image_url).PlaceholderDrawable((android.graphics.drawable.Drawable)(mostCurrent._main_._place_holder)).IntoImageView((android.widget.ImageView)(_iv1.getObject()));
RDebugUtils.currentLine=5898264;
 //BA.debugLineNum = 5898264;BA.debugLine="End Sub";
return "";
}
public static String  _ultimatelistview1_layoutcreator(String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel) throws Exception{
RDebugUtils.currentModule="notify";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ultimatelistview1_layoutcreator"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ultimatelistview1_layoutcreator", new Object[] {_layoutname,_layoutpanel}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub UltimateListView1_LayoutCreator(LayoutName As";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="ms.Initialize(\"ms_card\")";
mostCurrent._ms.Initialize(processBA,"ms_card");
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="LayoutPanel.AddView(ms,2%x,0,96%x,LayoutPanel.Hei";
_layoutpanel.AddView((android.view.View)(mostCurrent._ms.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (96),mostCurrent.activityBA),_layoutpanel.getHeight());
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="ms.Elevation=4dip";
mostCurrent._ms.setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4))));
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="ms.MaxElevation=4dip";
mostCurrent._ms.setMaxElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4))));
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="ms.Radius=5dip";
mostCurrent._ms.setRadius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="ms.Panel.Height=ms.Height";
mostCurrent._ms.getPanel().setHeight(mostCurrent._ms.getHeight());
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="ms.Panel.Width=ms.Width-(2*(ms.Radius+ms.Elevatio";
mostCurrent._ms.getPanel().setWidth((int) (mostCurrent._ms.getWidth()-(2*(mostCurrent._ms.getRadius()+mostCurrent._ms.getElevation()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2))))));
RDebugUtils.currentLine=5832712;
 //BA.debugLineNum = 5832712;BA.debugLine="Log(ms.Radius+ms.Elevation)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(mostCurrent._ms.getRadius()+mostCurrent._ms.getElevation()));
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="ms.Panel.LoadLayout(\"notify_list_lay\")";
mostCurrent._ms.getPanel().LoadLayout("notify_list_lay",mostCurrent.activityBA);
RDebugUtils.currentLine=5832714;
 //BA.debugLineNum = 5832714;BA.debugLine="ms.Panel.Color=0x00FF0000";
mostCurrent._ms.getPanel().setColor((int) (0x00ff0000));
RDebugUtils.currentLine=5832716;
 //BA.debugLineNum = 5832716;BA.debugLine="End Sub";
return "";
}
public static String  _v_onerror(String _error) throws Exception{
RDebugUtils.currentModule="notify";
if (Debug.shouldDelegate(mostCurrent.activityBA, "v_onerror"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "v_onerror", new Object[] {_error}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub   v_OnError (Error As String)";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="LogColor(Error,Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogColor(_error,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return "";
}
public static String  _v_onstringresponse(String _response) throws Exception{
RDebugUtils.currentModule="notify";
if (Debug.shouldDelegate(mostCurrent.activityBA, "v_onstringresponse"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "v_onstringresponse", new Object[] {_response}));}
int _i = 0;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub v_OnStringResponse (response As String)";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim parser As JSONParser";
mostCurrent._parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Dim i As Int=0";
_i = (int) (0);
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="parser.Initialize(response)";
mostCurrent._parser.Initialize(_response);
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = mostCurrent._parser.NextArray();
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="For Each colroot As Map In root";
_colroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _root;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_colroot.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="maps(i).Initialize";
mostCurrent._maps[_i].Initialize();
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="maps(i).Put(\"image_url\",colroot.Get(\"image_url\")";
mostCurrent._maps[_i].Put((Object)("image_url"),_colroot.Get((Object)("image_url")));
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="maps(i).Put(\"ID\",colroot.Get(\"ID\"))";
mostCurrent._maps[_i].Put((Object)("ID"),_colroot.Get((Object)("ID")));
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="maps(i).Put(\"news_url\",colroot.Get(\"news_url\"))";
mostCurrent._maps[_i].Put((Object)("news_url"),_colroot.Get((Object)("news_url")));
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="maps(i).Put(\"title\", colroot.Get(\"title\"))";
mostCurrent._maps[_i].Put((Object)("title"),_colroot.Get((Object)("title")));
RDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="maps(i).Put(\"body\",colroot.Get(\"body\"))";
mostCurrent._maps[_i].Put((Object)("body"),_colroot.Get((Object)("body")));
RDebugUtils.currentLine=5636109;
 //BA.debugLineNum = 5636109;BA.debugLine="UltimateListView1.AddItem(\"lay1\",i)";
mostCurrent._ultimatelistview1.AddItem("lay1",(long) (_i));
RDebugUtils.currentLine=5636110;
 //BA.debugLineNum = 5636110;BA.debugLine="i=i+1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=5636115;
 //BA.debugLineNum = 5636115;BA.debugLine="End Sub";
return "";
}
}