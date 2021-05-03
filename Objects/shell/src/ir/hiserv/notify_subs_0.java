package ir.hiserv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class notify_subs_0 {


public static RemoteObject  _acbutton1_click() throws Exception{
try {
		Debug.PushSubsStack("ACButton1_Click (notify) ","notify",10,notify.mostCurrent.activityBA,notify.mostCurrent,119);
if (RapidSub.canDelegate("acbutton1_click")) { return ir.hiserv.notify.remoteMe.runUserSub(false, "notify","acbutton1_click");}
RemoteObject _ac_btn = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACButtonWrapper");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _news_url = RemoteObject.createImmutable("");
 BA.debugLineNum = 119;BA.debugLine="Sub ACButton1_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim ac_btn As ACButton";
Debug.ShouldStop(8388608);
_ac_btn = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");Debug.locals.put("ac_btn", _ac_btn);
 BA.debugLineNum = 121;BA.debugLine="ac_btn=Sender";
Debug.ShouldStop(16777216);
_ac_btn.setObject(notify.mostCurrent.__c.runMethod(false,"Sender",notify.mostCurrent.activityBA));
 BA.debugLineNum = 123;BA.debugLine="Dim item As Map = maps(ac_btn.Tag)";
Debug.ShouldStop(67108864);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = notify.mostCurrent._maps.getArrayElement(false,BA.numberCast(int.class, _ac_btn.runMethod(false,"getTag")));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 124;BA.debugLine="Dim news_url As String = item.Get(\"news_url\")";
Debug.ShouldStop(134217728);
_news_url = BA.ObjectToString(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("news_url")))));Debug.locals.put("news_url", _news_url);Debug.locals.put("news_url", _news_url);
 BA.debugLineNum = 125;BA.debugLine="ToastMessageShow(news_url,False)";
Debug.ShouldStop(268435456);
notify.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_news_url)),(Object)(notify.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (notify) ","notify",10,notify.mostCurrent.activityBA,notify.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return ir.hiserv.notify.remoteMe.runUserSub(false, "notify","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="v.Initialize(\"v\")";
Debug.ShouldStop(33554432);
notify.mostCurrent._v.runVoidMethod ("Initialize",notify.processBA,(Object)(RemoteObject.createImmutable("v")));
 BA.debugLineNum = 27;BA.debugLine="picasso.Initialize";
Debug.ShouldStop(67108864);
notify.mostCurrent._picasso.runVoidMethod ("Initialize",notify.processBA);
 BA.debugLineNum = 28;BA.debugLine="v.AddQueue( v.CreateStringRequest	(\"http://hiserv";
Debug.ShouldStop(134217728);
notify.mostCurrent._v.runVoidMethod ("AddQueue",(Object)(notify.mostCurrent._v.runMethod(false,"CreateStringRequest",notify.processBA,(Object)(BA.ObjectToString("http://hiserv.ir/wp-content/msnp/request.php")),(Object)(notify.mostCurrent._v.getField(true,"GET")))));
 BA.debugLineNum = 29;BA.debugLine="v.Start";
Debug.ShouldStop(268435456);
notify.mostCurrent._v.runVoidMethod ("Start");
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"notify_lay\")";
Debug.ShouldStop(1073741824);
notify.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("notify_lay")),notify.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="UltimateListView1.AddLayout(\"lay1\",\"UltimateListV";
Debug.ShouldStop(-2147483648);
notify.mostCurrent._ultimatelistview1.runVoidMethod ("AddLayout",(Object)(BA.ObjectToString("lay1")),(Object)(BA.ObjectToString("UltimateListView1_LayoutCreator")),(Object)(BA.ObjectToString("UltimateListView1_ContentFiller")),(Object)(notify.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 82)),notify.mostCurrent.activityBA)),(Object)(notify.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Pause (notify) ","notify",10,notify.mostCurrent.activityBA,notify.mostCurrent,69);
if (RapidSub.canDelegate("activity_pause")) { return ir.hiserv.notify.remoteMe.runUserSub(false, "notify","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 69;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (notify) ","notify",10,notify.mostCurrent.activityBA,notify.mostCurrent,65);
if (RapidSub.canDelegate("activity_resume")) { return ir.hiserv.notify.remoteMe.runUserSub(false, "notify","activity_resume");}
 BA.debugLineNum = 65;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _back_iv_click() throws Exception{
try {
		Debug.PushSubsStack("back_iv_Click (notify) ","notify",10,notify.mostCurrent.activityBA,notify.mostCurrent,115);
if (RapidSub.canDelegate("back_iv_click")) { return ir.hiserv.notify.remoteMe.runUserSub(false, "notify","back_iv_click");}
 BA.debugLineNum = 115;BA.debugLine="Sub back_iv_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
notify.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim ms As MSCardView";
notify.mostCurrent._ms = RemoteObject.createNew ("com.maximussoft.mscardview.CardViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim v As AriaVolley";
notify.mostCurrent._v = RemoteObject.createNew ("amin.shahedi.ariagp.AriaVolley");
 //BA.debugLineNum = 18;BA.debugLine="Private UltimateListView1 As UltimateListView";
notify.mostCurrent._ultimatelistview1 = RemoteObject.createNew ("flm.b4a.ultimatelistview.UltimateListViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim parser As JSONParser";
notify.mostCurrent._parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");
 //BA.debugLineNum = 20;BA.debugLine="Dim picasso As Picasso";
notify.mostCurrent._picasso = RemoteObject.createNew ("uk.co.martinpearman.b4a.squareup.picasso.Picasso");
 //BA.debugLineNum = 21;BA.debugLine="Dim maps(10) As Map";
notify.mostCurrent._maps = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.collections.Map", new int[] {10}, new Object[]{});
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _ultimatelistview1_contentfiller(RemoteObject _itemid,RemoteObject _layoutname,RemoteObject _layoutpanel,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("UltimateListView1_ContentFiller (notify) ","notify",10,notify.mostCurrent.activityBA,notify.mostCurrent,89);
if (RapidSub.canDelegate("ultimatelistview1_contentfiller")) { return ir.hiserv.notify.remoteMe.runUserSub(false, "notify","ultimatelistview1_contentfiller", _itemid, _layoutname, _layoutpanel, _position);}
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _image_url = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _body = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("com.maximussoft.mscardview.CardViewWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _iv1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _lbl2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _btn1 = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACButtonWrapper");
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 89;BA.debugLine="Sub UltimateListView1_ContentFiller(ItemID As Long";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 94;BA.debugLine="Dim colroot As Map=maps(ItemID)";
Debug.ShouldStop(536870912);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_colroot = notify.mostCurrent._maps.getArrayElement(false,BA.numberCast(int.class, _itemid));Debug.locals.put("colroot", _colroot);Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 95;BA.debugLine="Dim image_url As String = colroot.Get(\"image_url";
Debug.ShouldStop(1073741824);
_image_url = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("image_url")))));Debug.locals.put("image_url", _image_url);Debug.locals.put("image_url", _image_url);
 BA.debugLineNum = 97;BA.debugLine="Dim title As String = colroot.Get(\"title\")";
Debug.ShouldStop(1);
_title = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 98;BA.debugLine="Dim body As String = colroot.Get(\"body\")";
Debug.ShouldStop(2);
_body = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body")))));Debug.locals.put("body", _body);Debug.locals.put("body", _body);
 BA.debugLineNum = 100;BA.debugLine="Dim m As MSCardView=LayoutPanel.GetView(0)";
Debug.ShouldStop(8);
_m = RemoteObject.createNew ("com.maximussoft.mscardview.CardViewWrapper");
_m.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("m", _m);
 BA.debugLineNum = 101;BA.debugLine="Dim p As Panel=m.Panel";
Debug.ShouldStop(16);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = _m.runMethod(false,"getPanel");Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 102;BA.debugLine="Dim lbl1 As Label=p.GetView(0)";
Debug.ShouldStop(32);
_lbl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl1.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl1", _lbl1);
 BA.debugLineNum = 103;BA.debugLine="Dim iv1 As ImageView=p.GetView(01)";
Debug.ShouldStop(64);
_iv1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv1.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 01))).getObject());Debug.locals.put("iv1", _iv1);
 BA.debugLineNum = 104;BA.debugLine="Dim lbl2 As Label=p.GetView(02)";
Debug.ShouldStop(128);
_lbl2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl2.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 02))).getObject());Debug.locals.put("lbl2", _lbl2);
 BA.debugLineNum = 105;BA.debugLine="Dim btn1 As ACButton=p.GetView(03)";
Debug.ShouldStop(256);
_btn1 = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACButtonWrapper");
_btn1.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 03))).getObject());Debug.locals.put("btn1", _btn1);
 BA.debugLineNum = 106;BA.debugLine="lbl1.Text=title";
Debug.ShouldStop(512);
_lbl1.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 107;BA.debugLine="lbl2.Text=body";
Debug.ShouldStop(1024);
_lbl2.runMethod(true,"setText",BA.ObjectToCharSequence(_body));
 BA.debugLineNum = 108;BA.debugLine="btn1.Tag=ItemID";
Debug.ShouldStop(2048);
_btn1.runMethod(false,"setTag",(_itemid));
 BA.debugLineNum = 109;BA.debugLine="picasso.LoadUrl(image_url).PlaceholderDrawable(ma";
Debug.ShouldStop(4096);
notify.mostCurrent._picasso.runMethod(false,"LoadUrl",(Object)(_image_url)).runMethod(false,"PlaceholderDrawable",(Object)((notify.mostCurrent._main_._place_holder))).runVoidMethod ("IntoImageView",(Object)((_iv1.getObject())));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ultimatelistview1_layoutcreator(RemoteObject _layoutname,RemoteObject _layoutpanel) throws Exception{
try {
		Debug.PushSubsStack("UltimateListView1_LayoutCreator (notify) ","notify",10,notify.mostCurrent.activityBA,notify.mostCurrent,75);
if (RapidSub.canDelegate("ultimatelistview1_layoutcreator")) { return ir.hiserv.notify.remoteMe.runUserSub(false, "notify","ultimatelistview1_layoutcreator", _layoutname, _layoutpanel);}
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
 BA.debugLineNum = 75;BA.debugLine="Sub UltimateListView1_LayoutCreator(LayoutName As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="ms.Initialize(\"ms_card\")";
Debug.ShouldStop(2048);
notify.mostCurrent._ms.runVoidMethod ("Initialize",notify.processBA,(Object)(RemoteObject.createImmutable("ms_card")));
 BA.debugLineNum = 77;BA.debugLine="LayoutPanel.AddView(ms,2%x,0,96%x,LayoutPanel.Hei";
Debug.ShouldStop(4096);
_layoutpanel.runVoidMethod ("AddView",(Object)((notify.mostCurrent._ms.getObject())),(Object)(notify.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),notify.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(notify.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 96)),notify.mostCurrent.activityBA)),(Object)(_layoutpanel.runMethod(true,"getHeight")));
 BA.debugLineNum = 78;BA.debugLine="ms.Elevation=4dip";
Debug.ShouldStop(8192);
notify.mostCurrent._ms.runMethod(true,"setElevation",BA.numberCast(float.class, notify.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))));
 BA.debugLineNum = 79;BA.debugLine="ms.MaxElevation=4dip";
Debug.ShouldStop(16384);
notify.mostCurrent._ms.runMethod(true,"setMaxElevation",BA.numberCast(float.class, notify.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))));
 BA.debugLineNum = 80;BA.debugLine="ms.Radius=5dip";
Debug.ShouldStop(32768);
notify.mostCurrent._ms.runMethod(true,"setRadius",BA.numberCast(float.class, notify.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 BA.debugLineNum = 81;BA.debugLine="ms.Panel.Height=ms.Height";
Debug.ShouldStop(65536);
notify.mostCurrent._ms.runMethod(false,"getPanel").runMethod(true,"setHeight",notify.mostCurrent._ms.runMethod(true,"getHeight"));
 BA.debugLineNum = 82;BA.debugLine="ms.Panel.Width=ms.Width-(2*(ms.Radius+ms.Elevatio";
Debug.ShouldStop(131072);
notify.mostCurrent._ms.runMethod(false,"getPanel").runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {notify.mostCurrent._ms.runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),(RemoteObject.solve(new RemoteObject[] {notify.mostCurrent._ms.runMethod(true,"getRadius"),notify.mostCurrent._ms.runMethod(true,"getElevation"),notify.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "++",2, 0))}, "*",0, 0))}, "-",1, 0)));
 BA.debugLineNum = 83;BA.debugLine="Log(ms.Radius+ms.Elevation)";
Debug.ShouldStop(262144);
notify.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {notify.mostCurrent._ms.runMethod(true,"getRadius"),notify.mostCurrent._ms.runMethod(true,"getElevation")}, "+",1, 0))));
 BA.debugLineNum = 84;BA.debugLine="ms.Panel.LoadLayout(\"notify_list_lay\")";
Debug.ShouldStop(524288);
notify.mostCurrent._ms.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("notify_list_lay")),notify.mostCurrent.activityBA);
 BA.debugLineNum = 85;BA.debugLine="ms.Panel.Color=0x00FF0000";
Debug.ShouldStop(1048576);
notify.mostCurrent._ms.runMethod(false,"getPanel").runVoidMethod ("setColor",BA.numberCast(int.class, 0x00ff0000));
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
public static RemoteObject  _v_onerror(RemoteObject _error) throws Exception{
try {
		Debug.PushSubsStack("v_OnError (notify) ","notify",10,notify.mostCurrent.activityBA,notify.mostCurrent,34);
if (RapidSub.canDelegate("v_onerror")) { return ir.hiserv.notify.remoteMe.runUserSub(false, "notify","v_onerror", _error);}
Debug.locals.put("Error", _error);
 BA.debugLineNum = 34;BA.debugLine="Sub   v_OnError (Error As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="LogColor(Error,Colors.Red)";
Debug.ShouldStop(4);
notify.mostCurrent.__c.runVoidMethod ("LogColor",(Object)(_error),(Object)(notify.mostCurrent.__c.getField(false,"Colors").getField(true,"Red")));
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
public static RemoteObject  _v_onstringresponse(RemoteObject _response) throws Exception{
try {
		Debug.PushSubsStack("v_OnStringResponse (notify) ","notify",10,notify.mostCurrent.activityBA,notify.mostCurrent,37);
if (RapidSub.canDelegate("v_onstringresponse")) { return ir.hiserv.notify.remoteMe.runUserSub(false, "notify","v_onstringresponse", _response);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("response", _response);
 BA.debugLineNum = 37;BA.debugLine="Sub v_OnStringResponse (response As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(64);
notify.mostCurrent._parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");
 BA.debugLineNum = 40;BA.debugLine="Dim i As Int=0";
Debug.ShouldStop(128);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 41;BA.debugLine="parser.Initialize(response)";
Debug.ShouldStop(256);
notify.mostCurrent._parser.runVoidMethod ("Initialize",(Object)(_response));
 BA.debugLineNum = 42;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = notify.mostCurrent._parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 43;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(1024);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group5 = _root;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_colroot.setObject(group5.runMethod(false,"Get",index5));
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 44;BA.debugLine="maps(i).Initialize";
Debug.ShouldStop(2048);
notify.mostCurrent._maps.getArrayElement(false,_i).runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="maps(i).Put(\"image_url\",colroot.Get(\"image_url\")";
Debug.ShouldStop(4096);
notify.mostCurrent._maps.getArrayElement(false,_i).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("image_url"))),(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("image_url"))))));
 BA.debugLineNum = 46;BA.debugLine="maps(i).Put(\"ID\",colroot.Get(\"ID\"))";
Debug.ShouldStop(8192);
notify.mostCurrent._maps.getArrayElement(false,_i).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ID"))),(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ID"))))));
 BA.debugLineNum = 47;BA.debugLine="maps(i).Put(\"news_url\",colroot.Get(\"news_url\"))";
Debug.ShouldStop(16384);
notify.mostCurrent._maps.getArrayElement(false,_i).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("news_url"))),(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("news_url"))))));
 BA.debugLineNum = 48;BA.debugLine="maps(i).Put(\"title\", colroot.Get(\"title\"))";
Debug.ShouldStop(32768);
notify.mostCurrent._maps.getArrayElement(false,_i).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title"))))));
 BA.debugLineNum = 49;BA.debugLine="maps(i).Put(\"body\",colroot.Get(\"body\"))";
Debug.ShouldStop(65536);
notify.mostCurrent._maps.getArrayElement(false,_i).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("body"))),(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body"))))));
 BA.debugLineNum = 50;BA.debugLine="UltimateListView1.AddItem(\"lay1\",i)";
Debug.ShouldStop(131072);
notify.mostCurrent._ultimatelistview1.runVoidMethod ("AddItem",(Object)(BA.ObjectToString("lay1")),(Object)(BA.numberCast(long.class, _i)));
 BA.debugLineNum = 51;BA.debugLine="i=i+1";
Debug.ShouldStop(262144);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("colroot", _colroot);
;
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
}