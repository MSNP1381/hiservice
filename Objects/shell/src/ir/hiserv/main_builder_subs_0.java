package ir.hiserv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_builder_subs_0 {


public static RemoteObject  _adapter_builder(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("adapter_builder (main_builder) ","main_builder",11,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("adapter_builder")) { return __ref.runUserSub(false, "main_builder","adapter_builder", __ref);}
RemoteObject _pa = RemoteObject.declareNull("com.porya.pagerbullet.PagerBulletAdapter");
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 21;BA.debugLine="Sub adapter_builder As PagerBulletAdapter";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Dim pa As PagerBulletAdapter";
Debug.ShouldStop(2097152);
_pa = RemoteObject.createNew ("com.porya.pagerbullet.PagerBulletAdapter");Debug.locals.put("pa", _pa);
 BA.debugLineNum = 23;BA.debugLine="pa.Initialize";
Debug.ShouldStop(4194304);
_pa.runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="Log(num)";
Debug.ShouldStop(8388608);
main_builder.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.getField(true,"_num"))));
 BA.debugLineNum = 25;BA.debugLine="For i=0 To num-1";
Debug.ShouldStop(16777216);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_num"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 26;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 27;BA.debugLine="p.Initialize(\"p\"&i)";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("p"),RemoteObject.createImmutable(_i))));
 BA.debugLineNum = 28;BA.debugLine="p.SetBackgroundImage(b(i))";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_b").getArrayElement(false,BA.numberCast(int.class, _i)).getObject())));
 BA.debugLineNum = 29;BA.debugLine="p.Tag=i";
Debug.ShouldStop(268435456);
_p.runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 30;BA.debugLine="pa.AddPage(p)";
Debug.ShouldStop(536870912);
_pa.runVoidMethod ("AddPage",(Object)((_p.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 32;BA.debugLine="Return pa";
Debug.ShouldStop(-2147483648);
if (true) return _pa;
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim pager As PagerBullet";
main_builder._pager = RemoteObject.createNew ("com.porya.pagerbullet.PagerBulletWrapper");__ref.setField("_pager",main_builder._pager);
 //BA.debugLineNum = 3;BA.debugLine="Dim b() As Bitmap";
main_builder._b = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper", new int[] {0}, new Object[]{});__ref.setField("_b",main_builder._b);
 //BA.debugLineNum = 4;BA.debugLine="Dim num As Int";
main_builder._num = RemoteObject.createImmutable(0);__ref.setField("_num",main_builder._num);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _panel1,RemoteObject _img,RemoteObject _count,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Initialize (main_builder) ","main_builder",11,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "main_builder","initialize", __ref, _ba, _panel1, _img, _count, _height);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("panel1", _panel1);
Debug.locals.put("img", _img);
Debug.locals.put("count", _count);
Debug.locals.put("height", _height);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(panel1 As Panel,img()As Bitm";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="b=img";
Debug.ShouldStop(256);
__ref.setField ("_b",_img);
 BA.debugLineNum = 10;BA.debugLine="num=count";
Debug.ShouldStop(512);
__ref.setField ("_num",_count);
 BA.debugLineNum = 12;BA.debugLine="pager.Initialize(adapter_builder,\"pager1\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_pager").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.runClassMethod (ir.hiserv.main_builder.class, "_adapter_builder")),(Object)(RemoteObject.createImmutable("pager1")));
 BA.debugLineNum = 14;BA.debugLine="pager.setDotsColor(Colors.White,Colors.LightGray)";
Debug.ShouldStop(8192);
__ref.getField(false,"_pager").runVoidMethod ("setDotsColor",(Object)(main_builder.__c.getField(false,"Colors").getField(true,"White")),(Object)(main_builder.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 15;BA.debugLine="pager.Transition = pager.PARALLAX_PAGE";
Debug.ShouldStop(16384);
__ref.getField(false,"_pager").runVoidMethod ("setTransition",__ref.getField(false,"_pager").getField(true,"PARALLAX_PAGE"));
 BA.debugLineNum = 16;BA.debugLine="pager.Enabled = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_pager").runMethod(true,"setEnabled",main_builder.__c.getField(true,"True"));
 BA.debugLineNum = 18;BA.debugLine="panel1.AddView(pager,0,0,100%x,height)";
Debug.ShouldStop(131072);
_panel1.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pager").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main_builder.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(_height));
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