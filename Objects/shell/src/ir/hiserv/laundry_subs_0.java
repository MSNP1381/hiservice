package ir.hiserv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class laundry_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (laundry) ","laundry",1,laundry.mostCurrent.activityBA,laundry.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { return ir.hiserv.laundry.remoteMe.runUserSub(false, "laundry","activity_create", _firsttime);}
RemoteObject _close = RemoteObject.declareNull("Object");
int _i = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="start(\"\")";
Debug.ShouldStop(4);
_start(RemoteObject.createImmutable(""));
 BA.debugLineNum = 36;BA.debugLine="cs.Initialize";
Debug.ShouldStop(8);
laundry.mostCurrent._cs.runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="container.Initialize";
Debug.ShouldStop(16);
laundry.mostCurrent._container.runVoidMethod ("Initialize",laundry.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="Dim close As Object=x.GetDrawable(\"ic_close_white";
Debug.ShouldStop(32);
_close = (laundry.mostCurrent._x.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_close_white_24dp"))));Debug.locals.put("close", _close);Debug.locals.put("close", _close);
 BA.debugLineNum = 39;BA.debugLine="For i=0 To 5";
Debug.ShouldStop(64);
{
final int step5 = 1;
final int limit5 = 5;
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 40;BA.debugLine="view_holder.Initialize(\"view_holder\")";
Debug.ShouldStop(128);
laundry.mostCurrent._view_holder.runVoidMethod ("Initialize",laundry.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("view_holder")));
 BA.debugLineNum = 41;BA.debugLine="view_holder.Tag=i";
Debug.ShouldStop(256);
laundry.mostCurrent._view_holder.runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 42;BA.debugLine="container.AddPage(view_holder,i)";
Debug.ShouldStop(512);
laundry.mostCurrent._container.runVoidMethod ("AddPage",(Object)((laundry.mostCurrent._view_holder.getObject())),(Object)(BA.NumberToString(_i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 44;BA.debugLine="Activity.LoadLayout(\"step_two_laundry\")";
Debug.ShouldStop(2048);
laundry.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("step_two_laundry")),laundry.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="AHViewPager1.PageContainer=container";
Debug.ShouldStop(8192);
laundry.mostCurrent._ahviewpager1.runVoidMethod ("setPageContainer",laundry.mostCurrent._container);
 BA.debugLineNum = 47;BA.debugLine="ImageView1.Background=close";
Debug.ShouldStop(16384);
laundry.mostCurrent._imageview1.runMethod(false,"setBackground",(_close));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (laundry) ","laundry",1,laundry.mostCurrent.activityBA,laundry.mostCurrent,58);
if (RapidSub.canDelegate("activity_pause")) { return ir.hiserv.laundry.remoteMe.runUserSub(false, "laundry","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 58;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Resume (laundry) ","laundry",1,laundry.mostCurrent.activityBA,laundry.mostCurrent,54);
if (RapidSub.canDelegate("activity_resume")) { return ir.hiserv.laundry.remoteMe.runUserSub(false, "laundry","activity_resume");}
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _ahviewpager1_pagecreated(RemoteObject _position,RemoteObject _page) throws Exception{
try {
		Debug.PushSubsStack("AHViewPager1_PageCreated (laundry) ","laundry",1,laundry.mostCurrent.activityBA,laundry.mostCurrent,62);
if (RapidSub.canDelegate("ahviewpager1_pagecreated")) { return ir.hiserv.laundry.remoteMe.runUserSub(false, "laundry","ahviewpager1_pagecreated", _position, _page);}
Debug.locals.put("Position", _position);
Debug.locals.put("Page", _page);
 BA.debugLineNum = 62;BA.debugLine="Sub AHViewPager1_PageCreated (Position As Int, Pag";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _barcode_barcodefound(RemoteObject _barcode,RemoteObject _formatname) throws Exception{
try {
		Debug.PushSubsStack("barcode_BarcodeFound (laundry) ","laundry",1,laundry.mostCurrent.activityBA,laundry.mostCurrent,149);
if (RapidSub.canDelegate("barcode_barcodefound")) { return ir.hiserv.laundry.remoteMe.runUserSub(false, "laundry","barcode_barcodefound", _barcode, _formatname);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("barCode", _barcode);
Debug.locals.put("formatName", _formatname);
 BA.debugLineNum = 149;BA.debugLine="Sub barcode_BarcodeFound (barCode As String, forma";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 151;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(4194304);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 152;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(8388608);
_lbl.runVoidMethod ("Initialize",laundry.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 153;BA.debugLine="Activity.AddView(lbl, 0, 20dip, 100%x, 50dip)";
Debug.ShouldStop(16777216);
laundry.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(laundry.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(laundry.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),laundry.mostCurrent.activityBA)),(Object)(laundry.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 154;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(33554432);
laundry.mostCurrent._cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");
 BA.debugLineNum = 155;BA.debugLine="cs.Initialize.Size(20).Append(\"Click on underine";
Debug.ShouldStop(67108864);
laundry.mostCurrent._cs.runMethod(false,"Initialize").runMethod(false,"Size",(Object)(BA.numberCast(int.class, 20))).runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Click on underine word: "))));
 BA.debugLineNum = 156;BA.debugLine="cs.color(Colors.Blue).Clickable(\"cs\", 1).Underlin";
Debug.ShouldStop(134217728);
laundry.mostCurrent._cs.runMethod(false,"Color",(Object)(laundry.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"))).runMethod(false,"Clickable",laundry.processBA,(Object)(BA.ObjectToString("cs")),(Object)(RemoteObject.createImmutable((1)))).runMethod(false,"Underline").runMethod(false,"Pop").runVoidMethod ("PopAll");
 BA.debugLineNum = 160;BA.debugLine="ToastMessageShow(cs,False)";
Debug.ShouldStop(-2147483648);
laundry.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(laundry.mostCurrent._cs.getObject())),(Object)(laundry.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cs_click(RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("cs_Click (laundry) ","laundry",1,laundry.mostCurrent.activityBA,laundry.mostCurrent,68);
if (RapidSub.canDelegate("cs_click")) { return ir.hiserv.laundry.remoteMe.runUserSub(false, "laundry","cs_click", _tag);}
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 68;BA.debugLine="Sub cs_Click (Tag As Object)";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Log($\"You have clicked on word: ${Tag}\"$)";
Debug.ShouldStop(16);
laundry.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("You have clicked on word: "),laundry.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_tag)),RemoteObject.createImmutable("")))));
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
public static RemoteObject  _disablescroolbar(RemoteObject _sv1) throws Exception{
try {
		Debug.PushSubsStack("DisableScroolbar (laundry) ","laundry",1,laundry.mostCurrent.activityBA,laundry.mostCurrent,141);
if (RapidSub.canDelegate("disablescroolbar")) { return ir.hiserv.laundry.remoteMe.runUserSub(false, "laundry","disablescroolbar", _sv1);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("sv1", _sv1);
 BA.debugLineNum = 141;BA.debugLine="Sub DisableScroolbar(sv1 As ScrollView)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(8192);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 144;BA.debugLine="r.Target = sv1";
Debug.ShouldStop(32768);
_r.setField ("Target",(_sv1.getObject()));
 BA.debugLineNum = 146;BA.debugLine="r.RunMethod2(\"setVerticalScrollBarEnabled\", False";
Debug.ShouldStop(131072);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setVerticalScrollBarEnabled")),(Object)(BA.ObjectToString(laundry.mostCurrent.__c.getField(true,"False"))),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Dim x As XmlLayoutBuilder";
laundry.mostCurrent._x = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 18;BA.debugLine="Private AHViewPager1 As AHViewPager";
laundry.mostCurrent._ahviewpager1 = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPager");
 //BA.debugLineNum = 19;BA.debugLine="Private Label1 As Label";
laundry.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label2 As Label";
laundry.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim main_map As Map";
laundry.mostCurrent._main_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 22;BA.debugLine="Dim container As AHPageContainer";
laundry.mostCurrent._container = RemoteObject.createNew ("de.amberhome.viewpager.AHPageContainer");
 //BA.debugLineNum = 23;BA.debugLine="Dim view_holder As Panel";
laundry.mostCurrent._view_holder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ImageView1 As ImageView";
laundry.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim cs As CSBuilder";
laundry.mostCurrent._cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");
 //BA.debugLineNum = 26;BA.debugLine="Private stage_lbl As Label";
laundry.mostCurrent._stage_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _ime_heightchanged(RemoteObject _newheight,RemoteObject _oldheight) throws Exception{
try {
		Debug.PushSubsStack("ime_HeightChanged (laundry) ","laundry",1,laundry.mostCurrent.activityBA,laundry.mostCurrent,105);
if (RapidSub.canDelegate("ime_heightchanged")) { return ir.hiserv.laundry.remoteMe.runUserSub(false, "laundry","ime_heightchanged", _newheight, _oldheight);}
Debug.locals.put("NewHeight", _newheight);
Debug.locals.put("OldHeight", _oldheight);
 BA.debugLineNum = 105;BA.debugLine="Sub ime_HeightChanged (NewHeight As Int, OldHeight";
Debug.ShouldStop(256);
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim tf_yekan_light As Typeface=Typeface.LoadFromA";
laundry._tf_yekan_light = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
laundry._tf_yekan_light.setObject(laundry.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("IRANYekanMobileLight.ttf"))));
 //BA.debugLineNum = 10;BA.debugLine="Dim tf_yekan_reg As Typeface=Typeface.LoadFromAss";
laundry._tf_yekan_reg = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
laundry._tf_yekan_reg.setObject(laundry.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("IRANYekanMobileRegular.ttf"))));
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _set_stage(RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("set_stage (laundry) ","laundry",1,laundry.mostCurrent.activityBA,laundry.mostCurrent,71);
if (RapidSub.canDelegate("set_stage")) { return ir.hiserv.laundry.remoteMe.runUserSub(false, "laundry","set_stage", _stage);}
Debug.locals.put("stage", _stage);
 BA.debugLineNum = 71;BA.debugLine="Sub set_stage(stage As Int)As Object";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="cs.Color(Colors.Black).Typeface(tf_yekan_reg).Size";
Debug.ShouldStop(128);
laundry.mostCurrent._cs.runMethod(false,"Color",(Object)(laundry.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Typeface",(Object)((laundry._tf_yekan_reg.getObject()))).runMethod(false,"Size",(Object)(BA.numberCast(int.class, 20))).runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Click on underine word: "))));
 BA.debugLineNum = 73;BA.debugLine="cs.Clickable(\"cs\", 1).Append(\"One\").Pop.PopAll";
Debug.ShouldStop(256);
laundry.mostCurrent._cs.runMethod(false,"Clickable",laundry.processBA,(Object)(BA.ObjectToString("cs")),(Object)(RemoteObject.createImmutable((1)))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("One")))).runMethod(false,"Pop").runVoidMethod ("PopAll");
 BA.debugLineNum = 75;BA.debugLine="cs.EnableClickEvents(stage_lbl)";
Debug.ShouldStop(1024);
laundry.mostCurrent._cs.runVoidMethod ("EnableClickEvents",(Object)((laundry.mostCurrent._stage_lbl.getObject())));
 BA.debugLineNum = 76;BA.debugLine="stage_lbl.Text = cs";
Debug.ShouldStop(2048);
laundry.mostCurrent._stage_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(laundry.mostCurrent._cs.getObject()));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shop_basket_iv_click() throws Exception{
try {
		Debug.PushSubsStack("shop_basket_iv_Click (laundry) ","laundry",1,laundry.mostCurrent.activityBA,laundry.mostCurrent,163);
if (RapidSub.canDelegate("shop_basket_iv_click")) { return ir.hiserv.laundry.remoteMe.runUserSub(false, "laundry","shop_basket_iv_click");}
 BA.debugLineNum = 163;BA.debugLine="Sub shop_basket_iv_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start(RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("start (laundry) ","laundry",1,laundry.mostCurrent.activityBA,laundry.mostCurrent,28);
if (RapidSub.canDelegate("start")) { return ir.hiserv.laundry.remoteMe.runUserSub(false, "laundry","start", _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 28;BA.debugLine="Public Sub start(s As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="main_map.Initialize";
Debug.ShouldStop(536870912);
laundry.mostCurrent._main_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="main_map.Put(\"count\",4)";
Debug.ShouldStop(1073741824);
laundry.mostCurrent._main_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("count"))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}