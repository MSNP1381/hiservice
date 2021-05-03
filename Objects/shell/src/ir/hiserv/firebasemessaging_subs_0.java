package ir.hiserv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class firebasemessaging_subs_0 {


public static RemoteObject  _fm_messagearrived(RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("fm_MessageArrived (firebasemessaging) ","firebasemessaging",5,firebasemessaging.processBA,firebasemessaging.mostCurrent,28);
if (RapidSub.canDelegate("fm_messagearrived")) { return ir.hiserv.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","fm_messagearrived", _message);}
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4a.objects.NotificationWrapper");
Debug.locals.put("Message", _message);
 BA.debugLineNum = 28;BA.debugLine="Sub fm_MessageArrived (Message As RemoteMessage)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Log(\"Message arrived\")";
Debug.ShouldStop(268435456);
firebasemessaging.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Message arrived")));
 BA.debugLineNum = 30;BA.debugLine="Log($\"Message data: ${Message.GetData}\"$)";
Debug.ShouldStop(536870912);
firebasemessaging.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Message data: "),firebasemessaging.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_message.runMethod(false,"GetData").getObject()))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 31;BA.debugLine="Dim n As Notification";
Debug.ShouldStop(1073741824);
_n = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");Debug.locals.put("n", _n);
 BA.debugLineNum = 32;BA.debugLine="n.Initialize";
Debug.ShouldStop(-2147483648);
_n.runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="n.Icon = \"icon\"";
Debug.ShouldStop(1);
_n.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 34;BA.debugLine="n.SetInfo(Message.GetData.Get(\"title\"), Message.G";
Debug.ShouldStop(2);
_n.runVoidMethod ("SetInfoNew",firebasemessaging.processBA,(Object)(BA.ObjectToCharSequence(_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))),(Object)(BA.ObjectToCharSequence(_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body")))))),(Object)((firebasemessaging.mostCurrent._main.getObject())));
 BA.debugLineNum = 35;BA.debugLine="n.Notify(1)";
Debug.ShouldStop(4);
_n.runVoidMethod ("Notify",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _post_id() throws Exception{
try {
		Debug.PushSubsStack("post_id (firebasemessaging) ","firebasemessaging",5,firebasemessaging.processBA,firebasemessaging.mostCurrent,61);
if (RapidSub.canDelegate("post_id")) { return ir.hiserv.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","post_id");}
 BA.debugLineNum = 61;BA.debugLine="Sub post_id";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 66;BA.debugLine="v.CreateStringRequest2(\"http://hiserv.ir/wp-conte";
Debug.ShouldStop(2);
firebasemessaging._v.runVoidMethod ("CreateStringRequest2",firebasemessaging.processBA,(Object)(BA.ObjectToString("http://hiserv.ir/wp-content/test.php")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("user_login=msnp&id="),firebasemessaging.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((firebasemessaging._fm.runMethod(true,"getToken")))),RemoteObject.createImmutable("")))),(Object)(firebasemessaging._v.getField(true,"POST")));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fm As FirebaseMessaging";
firebasemessaging._fm = RemoteObject.createNew ("anywheresoftware.b4a.objects.FirebaseNotificationsService.FirebaseMessageWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Dim v As AriaVolley";
firebasemessaging._v = RemoteObject.createNew ("amin.shahedi.ariagp.AriaVolley");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (firebasemessaging) ","firebasemessaging",5,firebasemessaging.processBA,firebasemessaging.mostCurrent,11);
if (RapidSub.canDelegate("service_create")) { return ir.hiserv.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_create");}
 BA.debugLineNum = 11;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="fm.Initialize(\"fm\")";
Debug.ShouldStop(2048);
firebasemessaging._fm.runVoidMethod ("Initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("fm")));
 BA.debugLineNum = 13;BA.debugLine="v.Initialize(\"volley\")";
Debug.ShouldStop(4096);
firebasemessaging._v.runVoidMethod ("Initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("volley")));
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (firebasemessaging) ","firebasemessaging",5,firebasemessaging.processBA,firebasemessaging.mostCurrent,69);
if (RapidSub.canDelegate("service_destroy")) { return ir.hiserv.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_destroy");}
 BA.debugLineNum = 69;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(16);
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
public static void  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (firebasemessaging) ","firebasemessaging",5,firebasemessaging.processBA,firebasemessaging.mostCurrent,21);
if (RapidSub.canDelegate("service_start")) { ir.hiserv.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_start", _startingintent); return;}
ResumableSub_Service_Start rsub = new ResumableSub_Service_Start(null,_startingintent);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Service_Start extends BA.ResumableSub {
public ResumableSub_Service_Start(ir.hiserv.firebasemessaging parent,RemoteObject _startingintent) {
this.parent = parent;
this._startingintent = _startingintent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.hiserv.firebasemessaging parent;
RemoteObject _startingintent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (firebasemessaging) ","firebasemessaging",5,firebasemessaging.processBA,firebasemessaging.mostCurrent,21);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 22;BA.debugLine="If StartingIntent.IsInitialized Then fm.HandleInt";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 6;
if (_startingintent.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent._fm.runVoidMethod ("HandleIntent",(Object)((_startingintent.getObject())));
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 24;BA.debugLine="Sleep(0)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Sleep",firebasemessaging.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _subscribetotopics() throws Exception{
try {
		Debug.PushSubsStack("SubscribeToTopics (firebasemessaging) ","firebasemessaging",5,firebasemessaging.processBA,firebasemessaging.mostCurrent,17);
if (RapidSub.canDelegate("subscribetotopics")) { return ir.hiserv.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","subscribetotopics");}
 BA.debugLineNum = 17;BA.debugLine="Public Sub SubscribeToTopics";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="fm.SubscribeToTopic(\"general\") 'you can subscribe";
Debug.ShouldStop(131072);
firebasemessaging._fm.runVoidMethod ("SubscribeToTopic",(Object)(RemoteObject.createImmutable("general")));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
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