package ir.hiserv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return ir.hiserv.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 54;BA.debugLine="StartActivity(main_)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._main_.getObject())));
 BA.debugLineNum = 55;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,68);
if (RapidSub.canDelegate("activity_pause")) { return ir.hiserv.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 68;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,65);
if (RapidSub.canDelegate("activity_resume")) { return ir.hiserv.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 65;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _forsertlsupported() throws Exception{
try {
		Debug.PushSubsStack("ForseRtlSupported (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,71);
if (RapidSub.canDelegate("forsertlsupported")) { return ir.hiserv.main.remoteMe.runUserSub(false, "main","forsertlsupported");}
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 71;BA.debugLine="Sub ForseRtlSupported";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Dim j,jo As JavaObject";
Debug.ShouldStop(128);
_j = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("j", _j);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 73;BA.debugLine="jo.InitializeStatic  (\"android.view.View\")";
Debug.ShouldStop(256);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.view.View")));
 BA.debugLineNum = 74;BA.debugLine="If j.InitializeStatic  (\"android.os.Build$VERSION";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _j.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.Build$VERSION"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("SDK_INT")))),BA.numberCast(double.class, 16))) { 
 BA.debugLineNum = 75;BA.debugLine="j.InitializeContext.RunMethodJO(\"getWindow\",Null";
Debug.ShouldStop(1024);
_j.runMethod(false,"InitializeContext",main.processBA).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWindow")),(Object)((main.mostCurrent.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getDecorView")),(Object)((main.mostCurrent.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setLayoutDirection")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("LAYOUT_DIRECTION_RTL")))})));
 };
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 31;BA.debugLine="Private background_iv As ImageView";
main.mostCurrent._background_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private hiserv_logo_iv As ImageView";
main.mostCurrent._hiserv_logo_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private MaterialCircleProgress1 As MaterialCircle";
main.mostCurrent._materialcircleprogress1 = RemoteObject.createNew ("de.donmanfred.MaterialCircleProgressWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private progress_iv As ImageView";
main.mostCurrent._progress_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
laundry_subs_0._process_globals();
register_login_subs_0._process_globals();
firebasemessaging_subs_0._process_globals();
main__subs_0._process_globals();
main_codes_subs_0._process_globals();
starter_subs_0._process_globals();
notify_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("ir.hiserv.main");
laundry.myClass = BA.getDeviceClass ("ir.hiserv.laundry");
register_login.myClass = BA.getDeviceClass ("ir.hiserv.register_login");
order_module.myClass = BA.getDeviceClass ("ir.hiserv.order_module");
account_module.myClass = BA.getDeviceClass ("ir.hiserv.account_module");
firebasemessaging.myClass = BA.getDeviceClass ("ir.hiserv.firebasemessaging");
main_.myClass = BA.getDeviceClass ("ir.hiserv.main_");
home_module.myClass = BA.getDeviceClass ("ir.hiserv.home_module");
main_codes.myClass = BA.getDeviceClass ("ir.hiserv.main_codes");
starter.myClass = BA.getDeviceClass ("ir.hiserv.starter");
notify.myClass = BA.getDeviceClass ("ir.hiserv.notify");
main_builder.myClass = BA.getDeviceClass ("ir.hiserv.main_builder");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 25;BA.debugLine="Dim Timer1 As Timer";
main._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,80);
if (RapidSub.canDelegate("timer1_tick")) { return ir.hiserv.main.remoteMe.runUserSub(false, "main","timer1_tick");}
 BA.debugLineNum = 80;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="Timer1.Enabled=False";
Debug.ShouldStop(131072);
main._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 83;BA.debugLine="StartActivity(main_)";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._main_.getObject())));
 BA.debugLineNum = 84;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}