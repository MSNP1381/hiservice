package ir.hiserv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main__subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,44);
if (RapidSub.canDelegate("activity_create")) { ir.hiserv.main_.remoteMe.runUserSub(false, "main_","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(ir.hiserv.main_ parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.hiserv.main_ parent;
RemoteObject _firsttime;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,44);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 48;BA.debugLine="setup_drawables";
Debug.ShouldStop(32768);
_setup_drawables();
 BA.debugLineNum = 52;BA.debugLine="color_p=ac.GetThemeAttribute(\"colorPrimary\")";
Debug.ShouldStop(524288);
parent._color_p = parent.mostCurrent._ac.runMethod(true,"GetThemeAttribute",main_.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("colorPrimary")));
 BA.debugLineNum = 55;BA.debugLine="Activity.LoadLayout(\"main_lay\")";
Debug.ShouldStop(4194304);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main_lay")),main_.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="p=ScrollView1.Panel";
Debug.ShouldStop(8388608);
parent.mostCurrent._p = parent.mostCurrent._scrollview1.runMethod(false,"getPanel");
 BA.debugLineNum = 63;BA.debugLine="Sleep(200)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Sleep",main_.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 65;BA.debugLine="bottom_nav";
Debug.ShouldStop(1);
_bottom_nav();
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,89);
if (RapidSub.canDelegate("activity_pause")) { return ir.hiserv.main_.remoteMe.runUserSub(false, "main_","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 89;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,85);
if (RapidSub.canDelegate("activity_resume")) { return ir.hiserv.main_.remoteMe.runUserSub(false, "main_","activity_resume");}
 BA.debugLineNum = 85;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bottom_nav() throws Exception{
try {
		Debug.PushSubsStack("bottom_nav (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,96);
if (RapidSub.canDelegate("bottom_nav")) { return ir.hiserv.main_.remoteMe.runUserSub(false, "main_","bottom_nav");}
RemoteObject _m = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACMenuWrapper");
 BA.debugLineNum = 96;BA.debugLine="Sub  bottom_nav";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 98;BA.debugLine="DSBottomNavigationView1.Color=color_p";
Debug.ShouldStop(2);
main_.mostCurrent._dsbottomnavigationview1.runVoidMethod ("setColor",main_._color_p);
 BA.debugLineNum = 99;BA.debugLine="Dim m As ACMenu=DSBottomNavigationView1.Menu";
Debug.ShouldStop(4);
_m = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACMenuWrapper");
_m = main_.mostCurrent._dsbottomnavigationview1.runMethod(false,"getMenu");Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 100;BA.debugLine="m.Add2(0,0,\"سفارشات\",shopping_basket)";
Debug.ShouldStop(8);
_m.runVoidMethod ("Add2",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToCharSequence("سفارشات")),(Object)((main_._shopping_basket)));
 BA.debugLineNum = 101;BA.debugLine="m.Add2(1,0,\"خانه\",home1).Checked=True";
Debug.ShouldStop(16);
_m.runMethod(false,"Add2",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToCharSequence("خانه")),(Object)((main_._home1))).runMethod(true,"setChecked",main_.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="m.Add2(2,0,\"حساب کاربری\",account)";
Debug.ShouldStop(32);
_m.runVoidMethod ("Add2",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToCharSequence("حساب کاربری")),(Object)((main_._account)));
 BA.debugLineNum = 103;BA.debugLine="DSBottomNavigationView1.SetItemIconColors(Colors.";
Debug.ShouldStop(64);
main_.mostCurrent._dsbottomnavigationview1.runVoidMethod ("SetItemIconColors",(Object)(main_.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 140)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(main_.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(BA.numberCast(int.class, 0xffe7cfcf)));
 BA.debugLineNum = 104;BA.debugLine="DSBottomNavigationView1.SetItemTextColors(Colors.";
Debug.ShouldStop(128);
main_.mostCurrent._dsbottomnavigationview1.runVoidMethod ("SetItemTextColors",(Object)(main_.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 140)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(main_.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(BA.numberCast(int.class, 0xffe7cfcf)));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dsbottomnavigationview1_navigationitemselected(RemoteObject _menuitem) throws Exception{
try {
		Debug.PushSubsStack("DSBottomNavigationView1_NavigationItemSelected (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,108);
if (RapidSub.canDelegate("dsbottomnavigationview1_navigationitemselected")) { return ir.hiserv.main_.remoteMe.runUserSub(false, "main_","dsbottomnavigationview1_navigationitemselected", _menuitem);}
RemoteObject _accounts = RemoteObject.declareNull("ir.hiserv.account_module");
Debug.locals.put("MenuItem", _menuitem);
 BA.debugLineNum = 108;BA.debugLine="Sub DSBottomNavigationView1_NavigationItemSelected";
Debug.ShouldStop(2048);
 BA.debugLineNum = 113;BA.debugLine="If bottom_nav_pos = MenuItem.Id Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",main_._bottom_nav_pos,BA.numberCast(double.class, _menuitem.runMethod(true,"getId")))) { 
 }else {
 BA.debugLineNum = 115;BA.debugLine="ScrollView1.Panel.RemoveAllViews";
Debug.ShouldStop(262144);
main_.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 116;BA.debugLine="ScrollView1.Panel.Height=ScrollView1.Height";
Debug.ShouldStop(524288);
main_.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",main_.mostCurrent._scrollview1.runMethod(true,"getHeight"));
 BA.debugLineNum = 117;BA.debugLine="ScrollView1.Padding = Array As Int (0dip, 0dip,";
Debug.ShouldStop(1048576);
main_.mostCurrent._scrollview1.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {main_.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),main_.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),main_.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),main_.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 118;BA.debugLine="Select MenuItem.Id";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(_menuitem.runMethod(true,"getId"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 122;BA.debugLine="order";
Debug.ShouldStop(33554432);
_order();
 break; }
case 1: {
 BA.debugLineNum = 125;BA.debugLine="pan_create";
Debug.ShouldStop(268435456);
_pan_create();
 break; }
case 2: {
 BA.debugLineNum = 128;BA.debugLine="Dim accounts As account_module";
Debug.ShouldStop(-2147483648);
_accounts = RemoteObject.createNew ("ir.hiserv.account_module");Debug.locals.put("accounts", _accounts);
 BA.debugLineNum = 129;BA.debugLine="accounts.Initialize(ScrollView1)";
Debug.ShouldStop(1);
_accounts.runClassMethod (ir.hiserv.account_module.class, "_initialize",main_.mostCurrent.activityBA,(Object)(main_.mostCurrent._scrollview1));
 break; }
}
;
 };
 BA.debugLineNum = 132;BA.debugLine="bottom_nav_pos=MenuItem.Id";
Debug.ShouldStop(8);
main_._bottom_nav_pos = _menuitem.runMethod(true,"getId");
 BA.debugLineNum = 133;BA.debugLine="Log(MenuItem.Title)";
Debug.ShouldStop(16);
main_.mostCurrent.__c.runVoidMethod ("Log",(Object)(_menuitem.runMethod(true,"getTitle")));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Dim p As Panel";
main_.mostCurrent._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ScrollView1 As ScrollView";
main_.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private DSBottomNavigationView1 As DSBottomNaviga";
main_.mostCurrent._dsbottomnavigationview1 = RemoteObject.createNew ("de.amberhome.objects.BottomNavigationViewWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private items_card_view As MSCardView";
main_.mostCurrent._items_card_view = RemoteObject.createNew ("com.maximussoft.mscardview.CardViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private laundry_pnl As Panel";
main_.mostCurrent._laundry_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private services_panel As Panel";
main_.mostCurrent._services_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Panel1 As Panel";
main_.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim x As XmlLayoutBuilder";
main_.mostCurrent._x = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 36;BA.debugLine="Dim ac As AppCompat";
main_.mostCurrent._ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");
 //BA.debugLineNum = 37;BA.debugLine="Private action_panel As Panel";
main_.mostCurrent._action_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private menu_iv As ImageView";
main_.mostCurrent._menu_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Dim bottom_nav_pos As Int";
main_._bottom_nav_pos = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 40;BA.debugLine="Private notify_iv As ImageView";
main_.mostCurrent._notify_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _laundry_pnl_click() throws Exception{
try {
		Debug.PushSubsStack("laundry_pnl_Click (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,140);
if (RapidSub.canDelegate("laundry_pnl_click")) { return ir.hiserv.main_.remoteMe.runUserSub(false, "main_","laundry_pnl_click");}
 BA.debugLineNum = 140;BA.debugLine="Sub laundry_pnl_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="StartActivity(laundry)";
Debug.ShouldStop(4096);
main_.mostCurrent.__c.runVoidMethod ("StartActivity",main_.processBA,(Object)((main_.mostCurrent._laundry.getObject())));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _notify_iv_click() throws Exception{
try {
		Debug.PushSubsStack("notify_iv_Click (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,146);
if (RapidSub.canDelegate("notify_iv_click")) { return ir.hiserv.main_.remoteMe.runUserSub(false, "main_","notify_iv_click");}
 BA.debugLineNum = 146;BA.debugLine="Sub notify_iv_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="StartActivity(notify)";
Debug.ShouldStop(262144);
main_.mostCurrent.__c.runVoidMethod ("StartActivity",main_.processBA,(Object)((main_.mostCurrent._notify.getObject())));
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _openfile_click() throws Exception{
try {
		Debug.PushSubsStack("OpenFile_Click (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,68);
if (RapidSub.canDelegate("openfile_click")) { return ir.hiserv.main_.remoteMe.runUserSub(false, "main_","openfile_click");}
 BA.debugLineNum = 68;BA.debugLine="Sub OpenFile_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
main_.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 70;BA.debugLine="StartActivity(Me)";
Debug.ShouldStop(32);
main_.mostCurrent.__c.runVoidMethod ("StartActivity",main_.processBA,(Object)(main_.getObject()));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _order() throws Exception{
try {
		Debug.PushSubsStack("order (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,136);
if (RapidSub.canDelegate("order")) { return ir.hiserv.main_.remoteMe.runUserSub(false, "main_","order");}
RemoteObject _orders = RemoteObject.declareNull("ir.hiserv.order_module");
 BA.debugLineNum = 136;BA.debugLine="Sub order";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Dim orders As order_module";
Debug.ShouldStop(256);
_orders = RemoteObject.createNew ("ir.hiserv.order_module");Debug.locals.put("orders", _orders);
 BA.debugLineNum = 138;BA.debugLine="orders.Initialize(p)";
Debug.ShouldStop(512);
_orders.runClassMethod (ir.hiserv.order_module.class, "_initialize",main_.mostCurrent.activityBA,(Object)(main_.mostCurrent._p));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pan_create() throws Exception{
try {
		Debug.PushSubsStack("pan_create (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,92);
if (RapidSub.canDelegate("pan_create")) { return ir.hiserv.main_.remoteMe.runUserSub(false, "main_","pan_create");}
RemoteObject _home = RemoteObject.declareNull("ir.hiserv.home_module");
 BA.debugLineNum = 92;BA.debugLine="Sub pan_create";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Dim home As home_module";
Debug.ShouldStop(268435456);
_home = RemoteObject.createNew ("ir.hiserv.home_module");Debug.locals.put("home", _home);
 BA.debugLineNum = 94;BA.debugLine="home.Initialize(ScrollView1.Panel,8)";
Debug.ShouldStop(536870912);
_home.runClassMethod (ir.hiserv.home_module.class, "_initialize",main_.mostCurrent.activityBA,(Object)(main_.mostCurrent._scrollview1.runMethod(false,"getPanel")),(Object)(BA.numberCast(int.class, 8)));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Dim tf_sans As Typeface=Typeface.LoadFromAssets(\"I";
main_._tf_sans = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
main_._tf_sans.setObject(main_.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("IRANYekanMobileLight.ttf"))));
 //BA.debugLineNum = 12;BA.debugLine="Dim color_p As Int";
main_._color_p = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 13;BA.debugLine="Dim score_ic,paid_ic,orders_ic,notify_ic,search_b";
main_._score_ic = RemoteObject.createNew ("Object");
main_._paid_ic = RemoteObject.createNew ("Object");
main_._orders_ic = RemoteObject.createNew ("Object");
main_._notify_ic = RemoteObject.createNew ("Object");
main_._search_box = RemoteObject.createNew ("Object");
main_._account = RemoteObject.createNew ("Object");
main_._shopping_basket = RemoteObject.createNew ("Object");
main_._home1 = RemoteObject.createNew ("Object");
main_._menu = RemoteObject.createNew ("Object");
main_._notif_recived = RemoteObject.createNew ("Object");
main_._guide_frame = RemoteObject.createNew ("Object");
main_._place_holder = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 14;BA.debugLine="Public color_p As Int=0xFF4DCCB7";
main_._color_p = BA.numberCast(int.class, 0xff4dccb7);
 //BA.debugLineNum = 15;BA.debugLine="Public color_s As Int=0xFFEEE7DD";
main_._color_s = BA.numberCast(int.class, 0xffeee7dd);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setup_drawables() throws Exception{
try {
		Debug.PushSubsStack("setup_drawables (main_) ","main_",6,main_.mostCurrent.activityBA,main_.mostCurrent,72);
if (RapidSub.canDelegate("setup_drawables")) { return ir.hiserv.main_.remoteMe.runUserSub(false, "main_","setup_drawables");}
 BA.debugLineNum = 72;BA.debugLine="Sub setup_drawables";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="account=x.GetDrawable(\"baseline_account_circle_w";
Debug.ShouldStop(512);
main_._account = (main_.mostCurrent._x.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_account_circle_white_36dp"))));
 BA.debugLineNum = 75;BA.debugLine="shopping_basket=x.GetDrawable(\"baseline_shopping";
Debug.ShouldStop(1024);
main_._shopping_basket = (main_.mostCurrent._x.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_shopping_cart_white_36dp"))));
 BA.debugLineNum = 76;BA.debugLine="home1=x.GetDrawable(\"baseline_home_white_36dp\")";
Debug.ShouldStop(2048);
main_._home1 = (main_.mostCurrent._x.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_home_white_36dp"))));
 BA.debugLineNum = 78;BA.debugLine="menu=x.GetDrawable(\"baseline_menu_white_36dp\")";
Debug.ShouldStop(8192);
main_._menu = (main_.mostCurrent._x.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_menu_white_36dp"))));
 BA.debugLineNum = 80;BA.debugLine="notif_recived=x.GetDrawable(\"baseline_notificati";
Debug.ShouldStop(32768);
main_._notif_recived = (main_.mostCurrent._x.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_notifications_white_36dp_recived"))));
 BA.debugLineNum = 81;BA.debugLine="place_holder=x.GetDrawable(\"placeholder\")";
Debug.ShouldStop(65536);
main_._place_holder = (main_.mostCurrent._x.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("placeholder"))));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}