package ir.hiserv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class order_module_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim tf As Typeface=Typeface.LoadFromAssets(\"IRANY";
order_module._tf = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
order_module._tf.setObject(order_module.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("IRANYekanMobileLight.ttf"))));__ref.setField("_tf",order_module._tf);
 //BA.debugLineNum = 3;BA.debugLine="Dim ulv As UltimateListView";
order_module._ulv = RemoteObject.createNew ("flm.b4a.ultimatelistview.UltimateListViewWrapper");__ref.setField("_ulv",order_module._ulv);
 //BA.debugLineNum = 4;BA.debugLine="Dim ulv_pan As UltimateLVPanel";
order_module._ulv_pan = RemoteObject.createNew ("flm.b4a.ultimatelistview.UltimateListViewWrapper.ULVPanel");__ref.setField("_ulv_pan",order_module._ulv_pan);
 //BA.debugLineNum = 5;BA.debugLine="Dim stat_land=1,state_por=2,state As Int";
order_module._stat_land = BA.numberCast(int.class, 1);__ref.setField("_stat_land",order_module._stat_land);
order_module._state_por = BA.numberCast(int.class, 2);__ref.setField("_state_por",order_module._state_por);
order_module._state = RemoteObject.createImmutable(0);__ref.setField("_state",order_module._state);
 //BA.debugLineNum = 6;BA.debugLine="Dim widths_land(100),widths_por(100)As Int";
order_module._widths_land = RemoteObject.createNewArray ("int", new int[] {100}, new Object[]{});__ref.setField("_widths_land",order_module._widths_land);
order_module._widths_por = RemoteObject.createNewArray ("int", new int[] {100}, new Object[]{});__ref.setField("_widths_por",order_module._widths_por);
 //BA.debugLineNum = 7;BA.debugLine="Dim ms As MSCardView";
order_module._ms = RemoteObject.createNew ("com.maximussoft.mscardview.CardViewWrapper");__ref.setField("_ms",order_module._ms);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _content) throws Exception{
try {
		Debug.PushSubsStack("Initialize (order_module) ","order_module",3,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "order_module","initialize", __ref, _ba, _content);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
int _i = 0;
Debug.locals.put("ba", _ba);
Debug.locals.put("content", _content);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(content As Panel)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="ulv.Initialize(0,0,0,\"ulv\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_ulv").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(byte.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.NumberToString(0)),(Object)(RemoteObject.createImmutable("ulv")));
 BA.debugLineNum = 15;BA.debugLine="content.AddView(ulv,1%x,0,98%x,content.Height)";
Debug.ShouldStop(16384);
_content.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_ulv").getObject())),(Object)(order_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(order_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 98)),__ref.getField(false, "ba"))),(Object)(_content.runMethod(true,"getHeight")));
 BA.debugLineNum = 16;BA.debugLine="For i=0 To 10";
Debug.ShouldStop(32768);
{
final int step3 = 1;
final int limit3 = 10;
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 17;BA.debugLine="widths_por(i)=32%x";
Debug.ShouldStop(65536);
__ref.getField(false,"_widths_por").setArrayElement (order_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 32)),__ref.getField(false, "ba")),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 19;BA.debugLine="If 100%x>100%y Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",order_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),BA.numberCast(double.class, order_module.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))))) { 
 BA.debugLineNum = 20;BA.debugLine="state=stat_land";
Debug.ShouldStop(524288);
__ref.setField ("_state",__ref.getField(true,"_stat_land"));
 BA.debugLineNum = 21;BA.debugLine="ulv.AddRowLayout(\"lay1\",\"ulv_RowLayoutCreator\",\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_ulv").runVoidMethod ("AddRowLayout",(Object)(BA.ObjectToString("lay1")),(Object)(BA.ObjectToString("ulv_RowLayoutCreator")),(Object)(BA.ObjectToString("ulv_RowContentFiller")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1.2),__ref.getField(false,"_widths_land").getArrayElement(true,BA.numberCast(int.class, 0))}, "*",0, 0))),(Object)(BA.numberCast(byte.class, 3)),(Object)(__ref.getField(false,"_widths_land")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(4),order_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 3)),__ref.getField(false, "ba"))}, "/",0, 0))),(Object)(order_module.__c.getField(false,"Colors").getField(true,"White")),(Object)(order_module.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 24;BA.debugLine="state=state_por";
Debug.ShouldStop(8388608);
__ref.setField ("_state",__ref.getField(true,"_state_por"));
 BA.debugLineNum = 25;BA.debugLine="ulv.AddRowLayout(\"lay1\",\"ulv_RowLayoutCreator\",\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_ulv").runVoidMethod ("AddRowLayout",(Object)(BA.ObjectToString("lay1")),(Object)(BA.ObjectToString("ulv_RowLayoutCreator")),(Object)(BA.ObjectToString("ulv_RowContentFiller")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1.2),__ref.getField(false,"_widths_por").getArrayElement(true,BA.numberCast(int.class, 0))}, "*",0, 0))),(Object)(BA.numberCast(byte.class, 2)),(Object)(__ref.getField(false,"_widths_por")),(Object)(order_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),__ref.getField(false, "ba"))),(Object)(order_module.__c.getField(false,"Colors").getField(true,"White")),(Object)(order_module.__c.getField(true,"False")));
 };
 BA.debugLineNum = 28;BA.debugLine="ulv.AddLayout(\"lay header\",\"ulv_LayoutCreator\",\"u";
Debug.ShouldStop(134217728);
__ref.getField(false,"_ulv").runVoidMethod ("AddLayout",(Object)(BA.ObjectToString("lay header")),(Object)(BA.ObjectToString("ulv_LayoutCreator")),(Object)(BA.ObjectToString("ulv_ContentFiller")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1.6),__ref.getField(false,"_widths_por").getArrayElement(true,BA.numberCast(int.class, 0))}, "*",0, 0))),(Object)(order_module.__c.getField(true,"False")));
 BA.debugLineNum = 29;BA.debugLine="ulv.AddItem(\"lay header\",0)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_ulv").runVoidMethod ("AddItem",(Object)(BA.ObjectToString("lay header")),(Object)(BA.numberCast(long.class, 0)));
 BA.debugLineNum = 30;BA.debugLine="For i= 01 To 11";
Debug.ShouldStop(536870912);
{
final int step15 = 1;
final int limit15 = 11;
_i = 01 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 31;BA.debugLine="ulv.AddItem(\"lay1\",i)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_ulv").runVoidMethod ("AddItem",(Object)(BA.ObjectToString("lay1")),(Object)(BA.numberCast(long.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 33;BA.debugLine="ulv.FadingEdges(False)";
Debug.ShouldStop(1);
__ref.getField(false,"_ulv").runVoidMethod ("FadingEdges",(Object)(order_module.__c.getField(true,"False")));
 BA.debugLineNum = 34;BA.debugLine="ulv.SetStyle(ulv.STYLE_HOLO_LIGHT)";
Debug.ShouldStop(2);
__ref.getField(false,"_ulv").runVoidMethod ("SetStyle",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_ulv").getField(true,"STYLE_HOLO_LIGHT")));
 BA.debugLineNum = 35;BA.debugLine="ulv.SetScrollbarStyle(ulv.SCROLLBAR_INVISIBLE)";
Debug.ShouldStop(4);
__ref.getField(false,"_ulv").runVoidMethod ("SetScrollbarStyle",(Object)(__ref.getField(false,"_ulv").getField(true,"SCROLLBAR_INVISIBLE")));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ulv_contentfiller(RemoteObject __ref,RemoteObject _itemid,RemoteObject _layoutname,RemoteObject _layoutpanel,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ulv_ContentFiller (order_module) ","order_module",3,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("ulv_contentfiller")) { return __ref.runUserSub(false, "order_module","ulv_contentfiller", __ref, _itemid, _layoutname, _layoutpanel, _position);}
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 39;BA.debugLine="Sub ulv_ContentFiller(ItemID As Long, LayoutName A";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Dim iv As ImageView=LayoutPanel.GetView(0)";
Debug.ShouldStop(128);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("iv", _iv);
 BA.debugLineNum = 41;BA.debugLine="Dim et As EditText=LayoutPanel.GetView(01)";
Debug.ShouldStop(256);
_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
_et.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 01))).getObject());Debug.locals.put("et", _et);
 BA.debugLineNum = 42;BA.debugLine="iv.Bitmap=LoadBitmap(File.DirAssets,\"pager1.jpg\")";
Debug.ShouldStop(512);
_iv.runMethod(false,"setBitmap",(order_module.__c.runMethod(false,"LoadBitmap",(Object)(order_module.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pager1.jpg"))).getObject()));
 BA.debugLineNum = 44;BA.debugLine="et.Hint=\"جستوجو کنید ...\"";
Debug.ShouldStop(2048);
_et.runMethod(true,"setHint",BA.ObjectToString("جستوجو کنید ..."));
 BA.debugLineNum = 45;BA.debugLine="et.Gravity=Gravity.RIGHT";
Debug.ShouldStop(4096);
_et.runMethod(true,"setGravity",order_module.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 46;BA.debugLine="et.Typeface=tf";
Debug.ShouldStop(8192);
_et.runMethod(false,"setTypeface",(__ref.getField(false,"_tf").getObject()));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ulv_layoutcreator(RemoteObject __ref,RemoteObject _layoutname,RemoteObject _layoutpanel) throws Exception{
try {
		Debug.PushSubsStack("ulv_LayoutCreator (order_module) ","order_module",3,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("ulv_layoutcreator")) { return __ref.runUserSub(false, "order_module","ulv_layoutcreator", __ref, _layoutname, _layoutpanel);}
RemoteObject _et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
 BA.debugLineNum = 49;BA.debugLine="Sub ulv_LayoutCreator(LayoutName As String, Layout";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="LayoutPanel.LoadLayout(\"orders_list_inside_num1\")";
Debug.ShouldStop(131072);
_layoutpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("orders_list_inside_num1")),__ref.getField(false, "ba"));
 BA.debugLineNum = 51;BA.debugLine="Dim et As EditText=LayoutPanel.GetView(01)";
Debug.ShouldStop(262144);
_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
_et.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 01))).getObject());Debug.locals.put("et", _et);
 BA.debugLineNum = 52;BA.debugLine="LayoutPanel.Height=et.Top+et.Height+5dip";
Debug.ShouldStop(524288);
_layoutpanel.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_et.runMethod(true,"getTop"),_et.runMethod(true,"getHeight"),order_module.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1));
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
public static RemoteObject  _ulv_rowcontentfiller(RemoteObject __ref,RemoteObject _rowid,RemoteObject _layoutname,RemoteObject _cellpanel,RemoteObject _cellindex,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ulv_RowContentFiller (order_module) ","order_module",3,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("ulv_rowcontentfiller")) { return __ref.runUserSub(false, "order_module","ulv_rowcontentfiller", __ref, _rowid, _layoutname, _cellpanel, _cellindex, _position);}
RemoteObject _q = RemoteObject.declareNull("com.maximussoft.mscardview.CardViewWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _l1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _l2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _l3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("RowID", _rowid);
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("CellPanel", _cellpanel);
Debug.locals.put("CellIndex", _cellindex);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 68;BA.debugLine="Sub ulv_RowContentFiller(RowID As Long, LayoutName";
Debug.ShouldStop(8);
 BA.debugLineNum = 72;BA.debugLine="Dim q As MSCardView=CellPanel.GetView(0)";
Debug.ShouldStop(128);
_q = RemoteObject.createNew ("com.maximussoft.mscardview.CardViewWrapper");
_q.setObject(_cellpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("q", _q);
 BA.debugLineNum = 73;BA.debugLine="q.Panel.LoadLayout(\"orders_inside\")";
Debug.ShouldStop(256);
_q.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("orders_inside")),__ref.getField(false, "ba"));
 BA.debugLineNum = 74;BA.debugLine="Dim p As Panel=q.Panel";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = _q.runMethod(false,"getPanel");Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 75;BA.debugLine="Dim l1 As Label=p.GetView(0)";
Debug.ShouldStop(1024);
_l1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_l1.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("l1", _l1);
 BA.debugLineNum = 76;BA.debugLine="Dim l2 As Label=p.GetView(01)";
Debug.ShouldStop(2048);
_l2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_l2.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 01))).getObject());Debug.locals.put("l2", _l2);
 BA.debugLineNum = 77;BA.debugLine="Dim l3 As Label=p.GetView(02)";
Debug.ShouldStop(4096);
_l3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_l3.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 02))).getObject());Debug.locals.put("l3", _l3);
 BA.debugLineNum = 78;BA.debugLine="l1.Typeface=tf";
Debug.ShouldStop(8192);
_l1.runMethod(false,"setTypeface",(__ref.getField(false,"_tf").getObject()));
 BA.debugLineNum = 79;BA.debugLine="l2.Typeface=tf";
Debug.ShouldStop(16384);
_l2.runMethod(false,"setTypeface",(__ref.getField(false,"_tf").getObject()));
 BA.debugLineNum = 80;BA.debugLine="l3.Typeface=tf";
Debug.ShouldStop(32768);
_l3.runMethod(false,"setTypeface",(__ref.getField(false,"_tf").getObject()));
 BA.debugLineNum = 81;BA.debugLine="l1.Text=\"#100\"";
Debug.ShouldStop(65536);
_l1.runMethod(true,"setText",BA.ObjectToCharSequence("#100"));
 BA.debugLineNum = 82;BA.debugLine="l2.Text=\"97/5/14	15:40\"";
Debug.ShouldStop(131072);
_l2.runMethod(true,"setText",BA.ObjectToCharSequence("97/5/14	15:40"));
 BA.debugLineNum = 83;BA.debugLine="l3.Text=\"10.000 تومان\"";
Debug.ShouldStop(262144);
_l3.runMethod(true,"setText",BA.ObjectToCharSequence("10.000 تومان"));
 BA.debugLineNum = 86;BA.debugLine="Log(GetType(CellPanel.GetView(0)))";
Debug.ShouldStop(2097152);
order_module.__c.runVoidMethod ("Log",(Object)(order_module.__c.runMethod(true,"GetType",(Object)((_cellpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject())))));
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
public static RemoteObject  _ulv_rowlayoutcreator(RemoteObject __ref,RemoteObject _layoutname,RemoteObject _cellpanel,RemoteObject _cellindex) throws Exception{
try {
		Debug.PushSubsStack("ulv_RowLayoutCreator (order_module) ","order_module",3,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("ulv_rowlayoutcreator")) { return __ref.runUserSub(false, "order_module","ulv_rowlayoutcreator", __ref, _layoutname, _cellpanel, _cellindex);}
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("CellPanel", _cellpanel);
Debug.locals.put("CellIndex", _cellindex);
 BA.debugLineNum = 55;BA.debugLine="Sub ulv_RowLayoutCreator(LayoutName As String, Cel";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 61;BA.debugLine="ms.Initialize(\"ms_card\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_ms").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ms_card")));
 BA.debugLineNum = 62;BA.debugLine="ms.Tag=CellIndex";
Debug.ShouldStop(536870912);
__ref.getField(false,"_ms").runMethod(false,"setTag",(_cellindex));
 BA.debugLineNum = 63;BA.debugLine="CellPanel.AddView(ms,0,0,CellPanel.Width,CellPane";
Debug.ShouldStop(1073741824);
_cellpanel.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_ms").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_cellpanel.runMethod(true,"getWidth")),(Object)(_cellpanel.runMethod(true,"getHeight")));
 BA.debugLineNum = 64;BA.debugLine="ms.Panel.Height=ms.Height-ms.Radius-ms.MaxElevati";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_ms").runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ms").runMethod(true,"getHeight"),__ref.getField(false,"_ms").runMethod(true,"getRadius"),__ref.getField(false,"_ms").runMethod(true,"getMaxElevation")}, "--",2, 0)));
 BA.debugLineNum = 65;BA.debugLine="ms.Panel.Width=ms.Width";
Debug.ShouldStop(1);
__ref.getField(false,"_ms").runMethod(false,"getPanel").runMethod(true,"setWidth",__ref.getField(false,"_ms").runMethod(true,"getWidth"));
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
}