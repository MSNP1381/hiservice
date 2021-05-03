package ir.hiserv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class home_module_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private item_width As Float=50%x";
home_module._item_width = BA.numberCast(float.class, home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")));__ref.setField("_item_width",home_module._item_width);
 //BA.debugLineNum = 3;BA.debugLine="Private right As Float=5%x";
home_module._right = BA.numberCast(float.class, home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")));__ref.setField("_right",home_module._right);
 //BA.debugLineNum = 4;BA.debugLine="Private top As Float=3%y";
home_module._top = BA.numberCast(float.class, home_module.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),__ref.getField(false, "ba")));__ref.setField("_top",home_module._top);
 //BA.debugLineNum = 5;BA.debugLine="Private div As Float=1%y";
home_module._div = BA.numberCast(float.class, home_module.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba")));__ref.setField("_div",home_module._div);
 //BA.debugLineNum = 6;BA.debugLine="Dim count As Int";
home_module._count = RemoteObject.createImmutable(0);__ref.setField("_count",home_module._count);
 //BA.debugLineNum = 7;BA.debugLine="Dim tf As Typeface=Typeface.LoadFromAssets(\"IRANY";
home_module._tf = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
home_module._tf.setObject(home_module.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("IRANYekanMobileLight.ttf"))));__ref.setField("_tf",home_module._tf);
 //BA.debugLineNum = 9;BA.debugLine="Dim ulv As UltimateListView";
home_module._ulv = RemoteObject.createNew ("flm.b4a.ultimatelistview.UltimateListViewWrapper");__ref.setField("_ulv",home_module._ulv);
 //BA.debugLineNum = 10;BA.debugLine="Dim body,core As Bitmap";
home_module._body = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_body",home_module._body);
home_module._core = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_core",home_module._core);
 //BA.debugLineNum = 11;BA.debugLine="Dim holder As Label";
home_module._holder = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_holder",home_module._holder);
 //BA.debugLineNum = 12;BA.debugLine="Dim s As SmartString";
home_module._s = RemoteObject.createNew ("com.smartstring.arminkh.smartstring");__ref.setField("_s",home_module._s);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _p,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("Initialize (home_module) ","home_module",7,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "home_module","initialize", __ref, _ba, _p, _c);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _a = null;
int _i = 0;
Debug.locals.put("ba", _ba);
Debug.locals.put("p", _p);
Debug.locals.put("c", _c);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(p As Panel,c As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="count=c";
Debug.ShouldStop(131072);
__ref.setField ("_count",_c);
 BA.debugLineNum = 19;BA.debugLine="s.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_s").runVoidMethod ("_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 20;BA.debugLine="ulv.Initialize(0,0,0,\"ulv\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_ulv").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(byte.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.NumberToString(0)),(Object)(RemoteObject.createImmutable("ulv")));
 BA.debugLineNum = 21;BA.debugLine="right=7%X";
Debug.ShouldStop(1048576);
__ref.setField ("_right",BA.numberCast(float.class, home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 7)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 22;BA.debugLine="p.AddView(ulv,0,0,100%x,p.Height)";
Debug.ShouldStop(2097152);
_p.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_ulv").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 23;BA.debugLine="Dim a(6) As Int=Array As Int (50%x,50%x,50%x,50%x";
Debug.ShouldStop(4194304);
_a = RemoteObject.createNewArray("int",new int[] {6},new Object[] {home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))});Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 25;BA.debugLine="ulv.AddRowLayout(\"lay1\",\"ulv_RowLayoutCreator\",\"u";
Debug.ShouldStop(16777216);
__ref.getField(false,"_ulv").runVoidMethod ("AddRowLayout",(Object)(BA.ObjectToString("lay1")),(Object)(BA.ObjectToString("ulv_RowLayoutCreator")),(Object)(BA.ObjectToString("ulv_RowContentFiller")),(Object)(home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(byte.class, 2)),(Object)(_a),(Object)(home_module.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(home_module.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(home_module.__c.getField(true,"True")));
 BA.debugLineNum = 26;BA.debugLine="ulv.DividerHeight=0";
Debug.ShouldStop(33554432);
__ref.getField(false,"_ulv").runMethod(true,"setDividerHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 27;BA.debugLine="For i=0 To (count-1)/2";
Debug.ShouldStop(67108864);
{
final int step9 = 1;
final int limit9 = (int) (0 + RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_count"),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0).<Double>get().doubleValue());
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 28;BA.debugLine="ulv.AddItem(\"lay1\",i)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_ulv").runVoidMethod ("AddItem",(Object)(BA.ObjectToString("lay1")),(Object)(BA.numberCast(long.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 31;BA.debugLine="body=LoadBitmap(File.DirAssets,\"body.png\")";
Debug.ShouldStop(1073741824);
__ref.setField ("_body",home_module.__c.runMethod(false,"LoadBitmap",(Object)(home_module.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("body.png"))));
 BA.debugLineNum = 32;BA.debugLine="core=LoadBitmap(File.DirAssets,\"core.png\")";
Debug.ShouldStop(-2147483648);
__ref.setField ("_core",home_module.__c.runMethod(false,"LoadBitmap",(Object)(home_module.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("core.png"))));
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
public static void  _iv_body_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("iv_body_Click (home_module) ","home_module",7,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("iv_body_click")) { __ref.runUserSub(false, "home_module","iv_body_click", __ref); return;}
ResumableSub_iv_body_Click rsub = new ResumableSub_iv_body_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_iv_body_Click extends BA.ResumableSub {
public ResumableSub_iv_body_Click(ir.hiserv.home_module parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.hiserv.home_module parent;
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("iv_body_Click (home_module) ","home_module",7,__ref.getField(false, "ba"),__ref,77);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 78;BA.debugLine="Dim iv As View=Sender";
Debug.ShouldStop(8192);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
_iv.setObject(parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("iv", _iv);
 BA.debugLineNum = 80;BA.debugLine="Dim a As Animation";
Debug.ShouldStop(32768);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 81;BA.debugLine="a.InitializeScaleCenter(\"ani\",1,01,1.1,1.1,iv)";
Debug.ShouldStop(65536);
_a.runVoidMethod ("InitializeScaleCenter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ani")),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 01)),(Object)(BA.numberCast(float.class, 1.1)),(Object)(BA.numberCast(float.class, 1.1)),(Object)((_iv.getObject())));
 BA.debugLineNum = 82;BA.debugLine="a.RepeatMode = a.REPEAT_REVERSE";
Debug.ShouldStop(131072);
_a.runMethod(true,"setRepeatMode",_a.getField(true,"REPEAT_REVERSE"));
 BA.debugLineNum = 83;BA.debugLine="a.RepeatCount=1";
Debug.ShouldStop(262144);
_a.runMethod(true,"setRepeatCount",BA.numberCast(int.class, 1));
 BA.debugLineNum = 84;BA.debugLine="a.Duration=250";
Debug.ShouldStop(524288);
_a.runMethod(true,"setDuration",BA.numberCast(long.class, 250));
 BA.debugLineNum = 85;BA.debugLine="a.Start(iv)";
Debug.ShouldStop(1048576);
_a.runVoidMethod ("Start",(Object)((_iv.getObject())));
 BA.debugLineNum = 86;BA.debugLine="Sleep(200)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 87;BA.debugLine="StartActivity(laundry)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((parent._laundry.getObject())));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _ulv_rowcontentfiller(RemoteObject __ref,RemoteObject _rowid,RemoteObject _layoutname,RemoteObject _cellpanel,RemoteObject _cellindex,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ulv_RowContentFiller (home_module) ","home_module",7,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("ulv_rowcontentfiller")) { return __ref.runUserSub(false, "home_module","ulv_rowcontentfiller", __ref, _rowid, _layoutname, _cellpanel, _cellindex, _position);}
RemoteObject _iv_body = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _iv_core = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("RowID", _rowid);
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("CellPanel", _cellpanel);
Debug.locals.put("CellIndex", _cellindex);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 39;BA.debugLine="Sub ulv_RowContentFiller(RowID As Long, LayoutName";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="Dim iv_body As ImageView=CellPanel.GetView(0)";
Debug.ShouldStop(256);
_iv_body = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv_body.setObject(_cellpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("iv_body", _iv_body);
 BA.debugLineNum = 42;BA.debugLine="Dim iv_core As ImageView=CellPanel.GetView(01)";
Debug.ShouldStop(512);
_iv_core = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv_core.setObject(_cellpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 01))).getObject());Debug.locals.put("iv_core", _iv_core);
 BA.debugLineNum = 43;BA.debugLine="Dim lbl As Label=CellPanel.GetView(02)";
Debug.ShouldStop(1024);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl.setObject(_cellpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 02))).getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 45;BA.debugLine="iv_body.Bitmap=body";
Debug.ShouldStop(4096);
_iv_body.runMethod(false,"setBitmap",(__ref.getField(false,"_body").getObject()));
 BA.debugLineNum = 46;BA.debugLine="iv_core.Bitmap=core";
Debug.ShouldStop(8192);
_iv_core.runMethod(false,"setBitmap",(__ref.getField(false,"_core").getObject()));
 BA.debugLineNum = 47;BA.debugLine="lbl.Typeface=tf";
Debug.ShouldStop(16384);
_lbl.runMethod(false,"setTypeface",(__ref.getField(false,"_tf").getObject()));
 BA.debugLineNum = 48;BA.debugLine="lbl.Text=\"تعمیرات لوازم خانگی\"";
Debug.ShouldStop(32768);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence("تعمیرات لوازم خانگی"));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("ulv_RowLayoutCreator (home_module) ","home_module",7,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("ulv_rowlayoutcreator")) { return __ref.runUserSub(false, "home_module","ulv_rowlayoutcreator", __ref, _layoutname, _cellpanel, _cellindex);}
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("CellPanel", _cellpanel);
Debug.locals.put("CellIndex", _cellindex);
 BA.debugLineNum = 34;BA.debugLine="Sub ulv_RowLayoutCreator(LayoutName As String, Cel";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="CellPanel.LoadLayout(\"home_items_grid\")";
Debug.ShouldStop(8);
_cellpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("home_items_grid")),__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _view_holder_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("view_holder_Click (home_module) ","home_module",7,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("view_holder_click")) { __ref.runUserSub(false, "home_module","view_holder_click", __ref); return;}
ResumableSub_view_holder_Click rsub = new ResumableSub_view_holder_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_view_holder_Click extends BA.ResumableSub {
public ResumableSub_view_holder_Click(ir.hiserv.home_module parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.hiserv.home_module parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("view_holder_Click (home_module) ","home_module",7,__ref.getField(false, "ba"),__ref,54);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 55;BA.debugLine="Dim p As Panel=Sender";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p.setObject(parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("p", _p);
 BA.debugLineNum = 56;BA.debugLine="Dim iv As ImageView=p.GetView(1)";
Debug.ShouldStop(8388608);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("iv", _iv);
 BA.debugLineNum = 57;BA.debugLine="Dim a As Animation";
Debug.ShouldStop(16777216);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 58;BA.debugLine="a.InitializeScaleCenter(\"ani\",1,01,1.1,1.1,iv)";
Debug.ShouldStop(33554432);
_a.runVoidMethod ("InitializeScaleCenter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ani")),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 01)),(Object)(BA.numberCast(float.class, 1.1)),(Object)(BA.numberCast(float.class, 1.1)),(Object)((_iv.getObject())));
 BA.debugLineNum = 59;BA.debugLine="a.RepeatMode = a.REPEAT_REVERSE";
Debug.ShouldStop(67108864);
_a.runMethod(true,"setRepeatMode",_a.getField(true,"REPEAT_REVERSE"));
 BA.debugLineNum = 60;BA.debugLine="a.RepeatCount=1";
Debug.ShouldStop(134217728);
_a.runMethod(true,"setRepeatCount",BA.numberCast(int.class, 1));
 BA.debugLineNum = 61;BA.debugLine="a.Duration=250";
Debug.ShouldStop(268435456);
_a.runMethod(true,"setDuration",BA.numberCast(long.class, 250));
 BA.debugLineNum = 62;BA.debugLine="a.Start(iv)";
Debug.ShouldStop(536870912);
_a.runVoidMethod ("Start",(Object)((_iv.getObject())));
 BA.debugLineNum = 63;BA.debugLine="Sleep(200)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 64;BA.debugLine="StartActivity(laundry)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((parent._laundry.getObject())));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static RemoteObject  _volley_onerror(RemoteObject __ref,RemoteObject _error) throws Exception{
try {
		Debug.PushSubsStack("volley_OnError (home_module) ","home_module",7,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("volley_onerror")) { return __ref.runUserSub(false, "home_module","volley_onerror", __ref, _error);}
Debug.locals.put("Error", _error);
 BA.debugLineNum = 67;BA.debugLine="Sub volley_OnError (Error As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _volley_onstringresponse(RemoteObject __ref,RemoteObject _response) throws Exception{
try {
		Debug.PushSubsStack("volley_OnStringResponse (home_module) ","home_module",7,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("volley_onstringresponse")) { return __ref.runUserSub(false, "home_module","volley_onstringresponse", __ref, _response);}
Debug.locals.put("response", _response);
 BA.debugLineNum = 70;BA.debugLine="Sub volley_OnStringResponse (response As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Log(\"rec1\")";
Debug.ShouldStop(64);
home_module.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("rec1")));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}