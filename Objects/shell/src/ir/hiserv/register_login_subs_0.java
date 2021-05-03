package ir.hiserv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class register_login_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,54);
if (RapidSub.canDelegate("activity_create")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","activity_create", _firsttime);}
int _i = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="load_drawable";
Debug.ShouldStop(8388608);
_load_drawable();
 BA.debugLineNum = 57;BA.debugLine="pic.Initialize";
Debug.ShouldStop(16777216);
register_login.mostCurrent._pic.runVoidMethod ("Initialize",register_login.processBA);
 BA.debugLineNum = 58;BA.debugLine="ime.Initialize(\"ime\")";
Debug.ShouldStop(33554432);
register_login.mostCurrent._ime.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("ime")));
 BA.debugLineNum = 60;BA.debugLine="ahc.Initialize";
Debug.ShouldStop(134217728);
register_login.mostCurrent._ahc.runVoidMethod ("Initialize",register_login.mostCurrent.activityBA);
 BA.debugLineNum = 61;BA.debugLine="For i=0 To p.Length-1";
Debug.ShouldStop(268435456);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {register_login.mostCurrent._p.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 62;BA.debugLine="p(i).Initialize(i)";
Debug.ShouldStop(536870912);
register_login.mostCurrent._p.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",register_login.mostCurrent.activityBA,(Object)(BA.NumberToString(_i)));
 BA.debugLineNum = 63;BA.debugLine="ahc.AddPage(p(i),i)";
Debug.ShouldStop(1073741824);
register_login.mostCurrent._ahc.runVoidMethod ("AddPage",(Object)((register_login.mostCurrent._p.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(BA.NumberToString(_i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 66;BA.debugLine="ahv.Initialize2(ahc,\"ahv\")";
Debug.ShouldStop(2);
register_login.mostCurrent._ahv.runVoidMethod ("Initialize2",register_login.mostCurrent.activityBA,(Object)(register_login.mostCurrent._ahc),(Object)(RemoteObject.createImmutable("ahv")));
 BA.debugLineNum = 68;BA.debugLine="ahv.PageMargin=0";
Debug.ShouldStop(8);
register_login.mostCurrent._ahv.runMethod(true,"setPageMargin",BA.numberCast(int.class, 0));
 BA.debugLineNum = 69;BA.debugLine="ahv.OffscreenPageLimit=0";
Debug.ShouldStop(16);
register_login.mostCurrent._ahv.runMethod(true,"setOffscreenPageLimit",BA.numberCast(int.class, 0));
 BA.debugLineNum = 70;BA.debugLine="ahv.PagingEnabled=False";
Debug.ShouldStop(32);
register_login.mostCurrent._ahv.runMethod(true,"setPagingEnabled",register_login.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="Activity.AddView(ahv,0,0,100%X,100%Y)";
Debug.ShouldStop(64);
register_login.mostCurrent._activity.runVoidMethod ("AddView",(Object)((register_login.mostCurrent._ahv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(register_login.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),register_login.mostCurrent.activityBA)),(Object)(register_login.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),register_login.mostCurrent.activityBA)));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,80);
if (RapidSub.canDelegate("activity_pause")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 80;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Resume (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,76);
if (RapidSub.canDelegate("activity_resume")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","activity_resume");}
 BA.debugLineNum = 76;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ahv_pagecreated(RemoteObject _position,RemoteObject _page) throws Exception{
try {
		Debug.PushSubsStack("ahv_PageCreated (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,84);
if (RapidSub.canDelegate("ahv_pagecreated")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","ahv_pagecreated", _position, _page);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Position", _position);
Debug.locals.put("Page", _page);
 BA.debugLineNum = 84;BA.debugLine="Sub ahv_PageCreated (Position As Int, Page As Obje";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Dim pnl As Panel=Page";
Debug.ShouldStop(1048576);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl.setObject(_page);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 86;BA.debugLine="Select Position";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 88;BA.debugLine="pnl.LoadLayout(\"phone_numer_loign_lay\")";
Debug.ShouldStop(8388608);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("phone_numer_loign_lay")),register_login.mostCurrent.activityBA);
 BA.debugLineNum = 89;BA.debugLine="ime.ShowKeyboard(phone_et)";
Debug.ShouldStop(16777216);
register_login.mostCurrent._ime.runVoidMethod ("ShowKeyboard",(Object)((register_login.mostCurrent._phone_et.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 91;BA.debugLine="pnl.LoadLayout(\"register_login_lay\")";
Debug.ShouldStop(67108864);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("register_login_lay")),register_login.mostCurrent.activityBA);
 BA.debugLineNum = 92;BA.debugLine="user_iv.Background=person";
Debug.ShouldStop(134217728);
register_login.mostCurrent._user_iv.runMethod(false,"setBackground",(register_login.mostCurrent._person));
 BA.debugLineNum = 93;BA.debugLine="pass_iv.Background=lock";
Debug.ShouldStop(268435456);
register_login.mostCurrent._pass_iv.runMethod(false,"setBackground",(register_login.mostCurrent._lock));
 break; }
case 2: {
 BA.debugLineNum = 95;BA.debugLine="pnl.LoadLayout(\"REGISTER_FINISHED\")";
Debug.ShouldStop(1073741824);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("REGISTER_FINISHED")),register_login.mostCurrent.activityBA);
 break; }
}
;
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _create_accout_btn_click() throws Exception{
try {
		Debug.PushSubsStack("create_accout_btn_Click (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,145);
if (RapidSub.canDelegate("create_accout_btn_click")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","create_accout_btn_click");}
 BA.debugLineNum = 145;BA.debugLine="Sub create_accout_btn_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext1_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditText1_EnterPressed (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,141);
if (RapidSub.canDelegate("edittext1_enterpressed")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","edittext1_enterpressed");}
 BA.debugLineNum = 141;BA.debugLine="Sub EditText1_EnterPressed";
Debug.ShouldStop(4096);
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
public static RemoteObject  _edittext2_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditText2_EnterPressed (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,137);
if (RapidSub.canDelegate("edittext2_enterpressed")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","edittext2_enterpressed");}
 BA.debugLineNum = 137;BA.debugLine="Sub EditText2_EnterPressed";
Debug.ShouldStop(256);
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
public static void  _enter_btn_click() throws Exception{
try {
		Debug.PushSubsStack("enter_btn_Click (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,101);
if (RapidSub.canDelegate("enter_btn_click")) { ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","enter_btn_click"); return;}
ResumableSub_enter_btn_Click rsub = new ResumableSub_enter_btn_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_enter_btn_Click extends BA.ResumableSub {
public ResumableSub_enter_btn_Click(ir.hiserv.register_login parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.hiserv.register_login parent;
RemoteObject _test_string1 = RemoteObject.createImmutable("");
RemoteObject _test_string2 = RemoteObject.createImmutable("");
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("enter_btn_Click (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,101);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 102;BA.debugLine="user_iv.Background=Null";
Debug.ShouldStop(32);
parent.mostCurrent._user_iv.runMethod(false,"setBackground",(parent.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 103;BA.debugLine="pass_iv.Background=Null";
Debug.ShouldStop(64);
parent.mostCurrent._pass_iv.runMethod(false,"setBackground",(parent.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 104;BA.debugLine="Dim test_string1 As String =user_et.Text";
Debug.ShouldStop(128);
_test_string1 = parent.mostCurrent._user_et.runMethod(true,"getText");Debug.locals.put("test_string1", _test_string1);Debug.locals.put("test_string1", _test_string1);
 BA.debugLineNum = 105;BA.debugLine="Dim test_string2 As String =pass_et.Text";
Debug.ShouldStop(256);
_test_string2 = parent.mostCurrent._pass_et.runMethod(true,"getText");Debug.locals.put("test_string2", _test_string2);Debug.locals.put("test_string2", _test_string2);
 BA.debugLineNum = 107;BA.debugLine="If test_string1.Length>0 And test_string2.Length>";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_test_string1.runMethod(true,"length"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_test_string2.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 108;BA.debugLine="pic.LoadResource(\"baseline_check_black_36\").Into";
Debug.ShouldStop(2048);
parent.mostCurrent._pic.runMethod(false,"LoadResource",(Object)(RemoteObject.createImmutable("baseline_check_black_36"))).runVoidMethod ("IntoImageView",(Object)((parent.mostCurrent._pass_iv.getObject())));
 BA.debugLineNum = 109;BA.debugLine="pic.LoadResource(\"baseline_check_black_36\").Into";
Debug.ShouldStop(4096);
parent.mostCurrent._pic.runMethod(false,"LoadResource",(Object)(RemoteObject.createImmutable("baseline_check_black_36"))).runVoidMethod ("IntoImageView",(Object)((parent.mostCurrent._user_iv.getObject())));
 BA.debugLineNum = 110;BA.debugLine="Sleep(150)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Sleep",register_login.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 150));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 111;BA.debugLine="gotopage(2)";
Debug.ShouldStop(16384);
_gotopage(BA.numberCast(int.class, 2));
 BA.debugLineNum = 112;BA.debugLine="ime.HideKeyboard";
Debug.ShouldStop(32768);
parent.mostCurrent._ime.runVoidMethod ("HideKeyboard",register_login.mostCurrent.activityBA);
 BA.debugLineNum = 114;BA.debugLine="phone_incorrect=False";
Debug.ShouldStop(131072);
parent._phone_incorrect = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 116;BA.debugLine="Dim p1 As Panel= ahc.GetPageObject(2)";
Debug.ShouldStop(524288);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p1.setObject(parent.mostCurrent._ahc.runMethod(false,"GetPageObject",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("p1", _p1);
 BA.debugLineNum = 117;BA.debugLine="Dim v As View=p1.GetView(1)";
Debug.ShouldStop(1048576);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
_v = _p1.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 118;BA.debugLine="v.SetVisibleAnimated(1600,True)";
Debug.ShouldStop(2097152);
_v.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 1600)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 119;BA.debugLine="Sleep(1800)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",register_login.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 1800));
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 BA.debugLineNum = 120;BA.debugLine="progress_iv.Visible=True";
Debug.ShouldStop(8388608);
parent.mostCurrent._progress_iv.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 121;BA.debugLine="main_codes.create_progress_inter( progress_iv)";
Debug.ShouldStop(16777216);
parent.mostCurrent._main_codes.runVoidMethod ("_create_progress_inter",register_login.mostCurrent.activityBA,(Object)(parent.mostCurrent._progress_iv));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 124;BA.debugLine="phone_et.SelectAll";
Debug.ShouldStop(134217728);
parent.mostCurrent._phone_et.runVoidMethod ("SelectAll");
 BA.debugLineNum = 125;BA.debugLine="phone_incorrect=True";
Debug.ShouldStop(268435456);
parent._phone_incorrect = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 127;BA.debugLine="pic.LoadResource(\"baseline_close_black_36\").Into";
Debug.ShouldStop(1073741824);
parent.mostCurrent._pic.runMethod(false,"LoadResource",(Object)(RemoteObject.createImmutable("baseline_close_black_36"))).runVoidMethod ("IntoImageView",(Object)((parent.mostCurrent._pass_iv.getObject())));
 BA.debugLineNum = 128;BA.debugLine="pic.LoadResource(\"baseline_close_black_36\").Into";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._pic.runMethod(false,"LoadResource",(Object)(RemoteObject.createImmutable("baseline_close_black_36"))).runVoidMethod ("IntoImageView",(Object)((parent.mostCurrent._user_iv.getObject())));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 132;BA.debugLine="Sleep(4000)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",register_login.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 4000));
this.state = 9;
return;
case 9:
//C
this.state = -1;
;
 BA.debugLineNum = 133;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 134;BA.debugLine="StartActivity(main_)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",register_login.processBA,(Object)((parent.mostCurrent._main_.getObject())));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim s(16),person,lock As Object";
register_login.mostCurrent._s = RemoteObject.createNewArray ("Object", new int[] {16}, new Object[]{});
register_login.mostCurrent._person = RemoteObject.createNew ("Object");
register_login.mostCurrent._lock = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 17;BA.debugLine="Dim x As XmlLayoutBuilder";
register_login.mostCurrent._x = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 18;BA.debugLine="Dim ahv As AHViewPager";
register_login.mostCurrent._ahv = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPager");
 //BA.debugLineNum = 19;BA.debugLine="Dim ahc As AHPageContainer";
register_login.mostCurrent._ahc = RemoteObject.createNew ("de.amberhome.viewpager.AHPageContainer");
 //BA.debugLineNum = 22;BA.debugLine="Private Panel1 As Panel";
register_login.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Panel2 As Panel";
register_login.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private action_panel As Panel";
register_login.mostCurrent._action_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private logo_iv As ImageView";
register_login.mostCurrent._logo_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim p(3) As Panel";
register_login.mostCurrent._p = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.PanelWrapper", new int[] {3}, new Object[]{});
 //BA.debugLineNum = 29;BA.debugLine="Private create_accout_btn As ACButton";
register_login.mostCurrent._create_accout_btn = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private enter_btn As ACButton";
register_login.mostCurrent._enter_btn = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private phone_register As ACButton";
register_login.mostCurrent._phone_register = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private progress_iv As ImageView";
register_login.mostCurrent._progress_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private phone_et As EditText";
register_login.mostCurrent._phone_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private phone_iv As ImageView";
register_login.mostCurrent._phone_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private ph_test As ImageView";
register_login.mostCurrent._ph_test = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private pass_iv As ImageView";
register_login.mostCurrent._pass_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private user_et As EditText";
register_login.mostCurrent._user_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private user_iv As ImageView";
register_login.mostCurrent._user_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Dim pic As Picasso";
register_login.mostCurrent._pic = RemoteObject.createNew ("uk.co.martinpearman.b4a.squareup.picasso.Picasso");
 //BA.debugLineNum = 42;BA.debugLine="Dim phone_incorrect=False As Boolean";
register_login._phone_incorrect = register_login.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 43;BA.debugLine="Dim ime As IME";
register_login.mostCurrent._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 44;BA.debugLine="Private pass_et As EditText";
register_login.mostCurrent._pass_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _gotopage(RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("gotopage (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,166);
if (RapidSub.canDelegate("gotopage")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","gotopage", _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 166;BA.debugLine="Sub gotopage(i As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="ahv.GotoPage(i,True)";
Debug.ShouldStop(64);
register_login.mostCurrent._ahv.runVoidMethodAndSync ("GotoPage",(Object)(_i),(Object)(register_login.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _load_drawable() throws Exception{
try {
		Debug.PushSubsStack("load_drawable (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,46);
if (RapidSub.canDelegate("load_drawable")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","load_drawable");}
int _i = 0;
 BA.debugLineNum = 46;BA.debugLine="Sub load_drawable";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="For i=0 To 15";
Debug.ShouldStop(16384);
{
final int step1 = 1;
final int limit1 = 15;
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 49;BA.debugLine="s(i)=x.GetDrawable($\"state${i}\"$)";
Debug.ShouldStop(65536);
register_login.mostCurrent._s.setArrayElement ((register_login.mostCurrent._x.runMethod(false,"GetDrawable",(Object)((RemoteObject.concat(RemoteObject.createImmutable("state"),register_login.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("")))))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 51;BA.debugLine="person=x.GetDrawable(\"baseline_person_black_24\")";
Debug.ShouldStop(262144);
register_login.mostCurrent._person = (register_login.mostCurrent._x.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_person_black_24"))));
 BA.debugLineNum = 52;BA.debugLine="lock=x.GetDrawable(\"baseline_lock_black_24\")";
Debug.ShouldStop(524288);
register_login.mostCurrent._lock = (register_login.mostCurrent._x.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_lock_black_24"))));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pass_et_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("pass_et_EnterPressed (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,173);
if (RapidSub.canDelegate("pass_et_enterpressed")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","pass_et_enterpressed");}
 BA.debugLineNum = 173;BA.debugLine="Sub pass_et_EnterPressed";
Debug.ShouldStop(4096);
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _phone_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("phone_et_FocusChanged (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,177);
if (RapidSub.canDelegate("phone_et_focuschanged")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","phone_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 177;BA.debugLine="Sub phone_et_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="If HasFocus And phone_incorrect Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(".",_hasfocus) && RemoteObject.solveBoolean(".",register_login._phone_incorrect)) { 
 BA.debugLineNum = 179;BA.debugLine="phone_et.SelectAll";
Debug.ShouldStop(262144);
register_login.mostCurrent._phone_et.runVoidMethod ("SelectAll");
 };
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _phone_register_click() throws Exception{
try {
		Debug.PushSubsStack("phone_register_Click (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,149);
if (RapidSub.canDelegate("phone_register_click")) { ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","phone_register_click"); return;}
ResumableSub_phone_register_Click rsub = new ResumableSub_phone_register_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_phone_register_Click extends BA.ResumableSub {
public ResumableSub_phone_register_Click(ir.hiserv.register_login parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.hiserv.register_login parent;
RemoteObject _test_string = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("phone_register_Click (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,149);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 152;BA.debugLine="phone_iv.Background=Null";
Debug.ShouldStop(8388608);
parent.mostCurrent._phone_iv.runMethod(false,"setBackground",(parent.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 153;BA.debugLine="Dim test_string As String =phone_et.Text";
Debug.ShouldStop(16777216);
_test_string = parent.mostCurrent._phone_et.runMethod(true,"getText");Debug.locals.put("test_string", _test_string);Debug.locals.put("test_string", _test_string);
 BA.debugLineNum = 154;BA.debugLine="Log(test_string.Length)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_test_string.runMethod(true,"length"))));
 BA.debugLineNum = 155;BA.debugLine="If test_string.StartsWith(\"09\") And test_string.L";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(".",_test_string.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("09")))) && RemoteObject.solveBoolean("=",_test_string.runMethod(true,"length"),BA.numberCast(double.class, 11))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 156;BA.debugLine="pic.LoadResource(\"baseline_check_black_36\").Into";
Debug.ShouldStop(134217728);
parent.mostCurrent._pic.runMethod(false,"LoadResource",(Object)(RemoteObject.createImmutable("baseline_check_black_36"))).runVoidMethod ("IntoImageView",(Object)((parent.mostCurrent._phone_iv.getObject())));
 BA.debugLineNum = 157;BA.debugLine="Sleep(150)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Sleep",register_login.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 150));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 158;BA.debugLine="gotopage(1)";
Debug.ShouldStop(536870912);
_gotopage(BA.numberCast(int.class, 1));
 BA.debugLineNum = 159;BA.debugLine="phone_incorrect=True";
Debug.ShouldStop(1073741824);
parent._phone_incorrect = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 161;BA.debugLine="phone_incorrect=False";
Debug.ShouldStop(1);
parent._phone_incorrect = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 162;BA.debugLine="phone_et.SelectAll";
Debug.ShouldStop(2);
parent.mostCurrent._phone_et.runVoidMethod ("SelectAll");
 BA.debugLineNum = 163;BA.debugLine="pic.LoadResource(\"baseline_close_black_36\").Into";
Debug.ShouldStop(4);
parent.mostCurrent._pic.runMethod(false,"LoadResource",(Object)(RemoteObject.createImmutable("baseline_close_black_36"))).runVoidMethod ("IntoImageView",(Object)((parent.mostCurrent._phone_iv.getObject())));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _user_et_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("user_et_EnterPressed (register_login) ","register_login",2,register_login.mostCurrent.activityBA,register_login.mostCurrent,169);
if (RapidSub.canDelegate("user_et_enterpressed")) { return ir.hiserv.register_login.remoteMe.runUserSub(false, "register_login","user_et_enterpressed");}
 BA.debugLineNum = 169;BA.debugLine="Sub user_et_EnterPressed";
Debug.ShouldStop(256);
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}