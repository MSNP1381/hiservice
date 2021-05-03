package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _main_view = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 33;BA.debugLine="js.Initialize(\"js_slide\")";
Debug.ShouldStop(1);
main.mostCurrent._js.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("js_slide")));
 BA.debugLineNum = 34;BA.debugLine="Activity.AddView(js,0,0,100%x,100%y)";
Debug.ShouldStop(2);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._js.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 35;BA.debugLine="Dim v,main_view As Panel";
Debug.ShouldStop(4);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("v", _v);
_main_view = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("main_view", _main_view);
 BA.debugLineNum = 36;BA.debugLine="v.Initialize(\"v\")";
Debug.ShouldStop(8);
_v.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("v")));
 BA.debugLineNum = 37;BA.debugLine="main_view.Initialize(\"\")";
Debug.ShouldStop(16);
_main_view.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 39;BA.debugLine="js.setMainView(main_view,-1,100%y).setSlideUpView";
Debug.ShouldStop(64);
main.mostCurrent._js.runMethod(false,"setMainView",(Object)((_main_view.getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA))).runMethod(false,"setSlideUpView",(Object)((_v.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA))).runVoidMethod ("Build");
 BA.debugLineNum = 40;BA.debugLine="js.setGravity(Gravity.BOTTOM).setPanelHeight(20%y";
Debug.ShouldStop(128);
main.mostCurrent._js.runMethod(false,"setGravity",(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"BOTTOM"))).runVoidMethod ("setPanelHeight",(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 41;BA.debugLine="v.LoadLayout(\"slide_lay\")";
Debug.ShouldStop(256);
_v.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("slide_lay")),main.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="js.setScrollableView(ListView1)";
Debug.ShouldStop(512);
main.mostCurrent._js.runVoidMethod ("setScrollableView",(Object)((main.mostCurrent._listview1.getObject())));
 BA.debugLineNum = 43;BA.debugLine="ListView1.AddSingleLine(\"سایر لباس ها بچه گانه –";
Debug.ShouldStop(1024);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("سایر لباس ها بچه گانه – 4000 تومان"))));
 BA.debugLineNum = 44;BA.debugLine="ListView1.AddSingleLine(\"عروسک – 3000 تومان\")";
Debug.ShouldStop(2048);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("عروسک – 3000 تومان"))));
 BA.debugLineNum = 45;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(4096);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 46;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(8192);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 47;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(16384);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 48;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(32768);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 49;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(65536);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 50;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(131072);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 51;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(262144);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 52;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(524288);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 53;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(1048576);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 54;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(2097152);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 55;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(4194304);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 56;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(8388608);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 57;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(16777216);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 58;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(33554432);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 59;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(67108864);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 60;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(134217728);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 61;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(268435456);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 62;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(536870912);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 63;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(1073741824);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 64;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(-2147483648);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 65;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(1);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 66;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(2);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 67;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(4);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 68;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(8);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 69;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(16);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 70;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(32);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 71;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(64);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 72;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(128);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 73;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(256);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 74;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(512);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 75;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(1024);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 76;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(2048);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 77;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(4096);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 78;BA.debugLine="ListView1.AddSingleLine(\"بلوز و شلوار - 4000 توما";
Debug.ShouldStop(8192);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بلوز و شلوار - 4000 تومان"))));
 BA.debugLineNum = 79;BA.debugLine="Dim l As Label=	ListView1.SingleLineLayout.Label";
Debug.ShouldStop(16384);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_l = main.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label");Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 80;BA.debugLine="l.TextColor=Colors.Black";
Debug.ShouldStop(32768);
_l.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 81;BA.debugLine="l.Gravity=Gravity.RIGHT";
Debug.ShouldStop(65536);
_l.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 85;BA.debugLine="js.setTouchEnabled(True)";
Debug.ShouldStop(1048576);
main.mostCurrent._js.runVoidMethod ("setTouchEnabled",(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 86;BA.debugLine="js.setPanelState(js.PANEL_STATE_EXPANDED)";
Debug.ShouldStop(2097152);
main.mostCurrent._js.runVoidMethod ("setPanelState",(Object)(main.mostCurrent._js.getField(true,"PANEL_STATE_EXPANDED")));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,93);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 93;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,89);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 89;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,98);
if (RapidSub.canDelegate("button1_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");
 BA.debugLineNum = 98;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="js.setPanelState(js.PANEL_STATE_HIDDEN)";
Debug.ShouldStop(4);
main.mostCurrent._js.runVoidMethod ("setPanelState",(Object)(main.mostCurrent._js.getField(true,"PANEL_STATE_HIDDEN")));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Dim js As JSSlidingUpPanel";
main.mostCurrent._js = RemoteObject.createNew ("com.salvadorjhai.widgets.JSSlidingUpPanel");
 //BA.debugLineNum = 25;BA.debugLine="Dim jsp As JSPanelState";
main.mostCurrent._jsp = RemoteObject.createNew ("com.salvadorjhai.widgets.JSSlidingUpPanel.PanelState");
 //BA.debugLineNum = 26;BA.debugLine="Private Panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ListView1 As ListView";
main.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}