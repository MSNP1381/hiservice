package ir.hiserv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_codes_subs_0 {


public static void  _create_progress_inter(RemoteObject _ba,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("create_progress_inter (main_codes) ","main_codes",8,_ba,main_codes.mostCurrent,110);
if (RapidSub.canDelegate("create_progress_inter")) { ir.hiserv.main_codes.remoteMe.runUserSub(false, "main_codes","create_progress_inter", _ba, _v); return;}
ResumableSub_create_progress_inter rsub = new ResumableSub_create_progress_inter(null,_ba,_v);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_create_progress_inter extends BA.ResumableSub {
public ResumableSub_create_progress_inter(ir.hiserv.main_codes parent,RemoteObject _ba,RemoteObject _v) {
this.parent = parent;
this._ba = _ba;
this._v = _v;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.hiserv.main_codes parent;
RemoteObject _ba;
RemoteObject _v;
RemoteObject _s = null;
int _i = 0;
int step2;
int limit2;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("create_progress_inter (main_codes) ","main_codes",8,_ba,main_codes.mostCurrent,110);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
Debug.locals.put("v", _v);
 BA.debugLineNum = 112;BA.debugLine="Dim s(8) As Bitmap";
Debug.ShouldStop(32768);
_s = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper", new int[] {8}, new Object[]{});Debug.locals.put("s", _s);
 BA.debugLineNum = 114;BA.debugLine="For i=1 To s.Length";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//for
this.state = 4;
step2 = 1;
limit2 = _s.getField(true,"length").<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 4;
if ((step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2)) this.state = 3;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step2)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 16;
 BA.debugLineNum = 116;BA.debugLine="s(i-1)=LoadBitmap(File.DirAssets,$\"apptheme_prog";
Debug.ShouldStop(524288);
_s.setArrayElement (parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("apptheme_progressbar_indeterminate_holo"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".png"))))),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 118;BA.debugLine="i=1";
Debug.ShouldStop(2097152);
_i = 1;Debug.locals.put("i", _i);
 BA.debugLineNum = 119;BA.debugLine="Do While True";
Debug.ShouldStop(4194304);
if (true) break;

case 5:
//do while
this.state = 14;
while (parent.mostCurrent.__c.getField(true,"True").<Boolean>get().booleanValue()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 121;BA.debugLine="v.Bitmap=s(i-1)";
Debug.ShouldStop(16777216);
_v.runMethod(false,"setBitmap",(_s.getArrayElement(false,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)).getObject()));
 BA.debugLineNum = 123;BA.debugLine="If i=8 Then i=1";
Debug.ShouldStop(67108864);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 8))) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_i = 1;Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 5;
;
 BA.debugLineNum = 124;BA.debugLine="Sleep(125)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 125));
this.state = 17;
return;
case 17:
//C
this.state = 5;
;
 BA.debugLineNum = 125;BA.debugLine="i=i+1";
Debug.ShouldStop(268435456);
_i = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue();Debug.locals.put("i", _i);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _numtofa(RemoteObject _ba,RemoteObject _input) throws Exception{
try {
		Debug.PushSubsStack("numtofa (main_codes) ","main_codes",8,_ba,main_codes.mostCurrent,74);
if (RapidSub.canDelegate("numtofa")) { return ir.hiserv.main_codes.remoteMe.runUserSub(false, "main_codes","numtofa", _ba, _input);}
RemoteObject _out = RemoteObject.createImmutable("");
RemoteObject _ch = RemoteObject.createImmutable('\0');
int _i = 0;
;
Debug.locals.put("input", _input);
 BA.debugLineNum = 74;BA.debugLine="Sub numtofa(input As String)As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="Dim out As String=\"\"";
Debug.ShouldStop(2048);
_out = BA.ObjectToString("");Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 77;BA.debugLine="Dim ch As Char";
Debug.ShouldStop(4096);
_ch = RemoteObject.createImmutable('\0');Debug.locals.put("ch", _ch);
 BA.debugLineNum = 78;BA.debugLine="For i=0 To input.Length-1";
Debug.ShouldStop(8192);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_input.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="ch=input.CharAt(i)";
Debug.ShouldStop(16384);
_ch = _input.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("ch", _ch);
 BA.debugLineNum = 80;BA.debugLine="If IsNumber (ch) Then";
Debug.ShouldStop(32768);
if (main_codes.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(_ch))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 81;BA.debugLine="Select ch";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(_ch,BA.ObjectToChar(0),BA.ObjectToChar(1),BA.ObjectToChar(2),BA.ObjectToChar(3),BA.ObjectToChar(4),BA.ObjectToChar(5),BA.ObjectToChar(6),BA.ObjectToChar(7),BA.ObjectToChar(8),BA.ObjectToChar(9))) {
case 0: {
 BA.debugLineNum = 83;BA.debugLine="out=out&\"۰\"";
Debug.ShouldStop(262144);
_out = RemoteObject.concat(_out,RemoteObject.createImmutable("۰"));Debug.locals.put("out", _out);
 break; }
case 1: {
 BA.debugLineNum = 85;BA.debugLine="out=out&\"۱\"";
Debug.ShouldStop(1048576);
_out = RemoteObject.concat(_out,RemoteObject.createImmutable("۱"));Debug.locals.put("out", _out);
 break; }
case 2: {
 BA.debugLineNum = 87;BA.debugLine="out=out&\"۲\"";
Debug.ShouldStop(4194304);
_out = RemoteObject.concat(_out,RemoteObject.createImmutable("۲"));Debug.locals.put("out", _out);
 break; }
case 3: {
 BA.debugLineNum = 89;BA.debugLine="out=out&\"۳\"";
Debug.ShouldStop(16777216);
_out = RemoteObject.concat(_out,RemoteObject.createImmutable("۳"));Debug.locals.put("out", _out);
 break; }
case 4: {
 BA.debugLineNum = 92;BA.debugLine="out=out&\"۴\"";
Debug.ShouldStop(134217728);
_out = RemoteObject.concat(_out,RemoteObject.createImmutable("۴"));Debug.locals.put("out", _out);
 break; }
case 5: {
 BA.debugLineNum = 94;BA.debugLine="out=out&\"۵\"";
Debug.ShouldStop(536870912);
_out = RemoteObject.concat(_out,RemoteObject.createImmutable("۵"));Debug.locals.put("out", _out);
 break; }
case 6: {
 BA.debugLineNum = 96;BA.debugLine="out=out&\"۶\"";
Debug.ShouldStop(-2147483648);
_out = RemoteObject.concat(_out,RemoteObject.createImmutable("۶"));Debug.locals.put("out", _out);
 break; }
case 7: {
 BA.debugLineNum = 98;BA.debugLine="out=out&\"۷\"";
Debug.ShouldStop(2);
_out = RemoteObject.concat(_out,RemoteObject.createImmutable("۷"));Debug.locals.put("out", _out);
 break; }
case 8: {
 BA.debugLineNum = 100;BA.debugLine="out=out&\"۸\"";
Debug.ShouldStop(8);
_out = RemoteObject.concat(_out,RemoteObject.createImmutable("۸"));Debug.locals.put("out", _out);
 break; }
case 9: {
 BA.debugLineNum = 102;BA.debugLine="out=out&\"۹\"";
Debug.ShouldStop(32);
_out = RemoteObject.concat(_out,RemoteObject.createImmutable("۹"));Debug.locals.put("out", _out);
 break; }
}
;
 }else {
 BA.debugLineNum = 105;BA.debugLine="Exit";
Debug.ShouldStop(256);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 108;BA.debugLine="Return out";
Debug.ShouldStop(2048);
if (true) return _out;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub 	Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim tf As Typeface=Typeface.LoadFromAssets(\"IRANYe";
main_codes._tf = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
main_codes._tf.setObject(main_codes.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("IRANYekanMobileBold.ttf"))));
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _shop_basket(RemoteObject _ba,RemoteObject _count,RemoteObject _iv) throws Exception{
try {
		Debug.PushSubsStack("shop_basket (main_codes) ","main_codes",8,_ba,main_codes.mostCurrent,10);
if (RapidSub.canDelegate("shop_basket")) { return ir.hiserv.main_codes.remoteMe.runUserSub(false, "main_codes","shop_basket", _ba, _count, _iv);}
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _w_x = RemoteObject.createImmutable(0);
RemoteObject _w_y = RemoteObject.createImmutable(0);
RemoteObject _radius = RemoteObject.createImmutable(0);
;
Debug.locals.put("count", _count);
Debug.locals.put("iv", _iv);
 BA.debugLineNum = 10;BA.debugLine="Sub shop_basket(count As Int,iv As ImageView)";
Debug.ShouldStop(512);
 BA.debugLineNum = 13;BA.debugLine="Dim c As Canvas";
Debug.ShouldStop(4096);
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("C", _c);
 BA.debugLineNum = 15;BA.debugLine="Dim C As Canvas";
Debug.ShouldStop(16384);
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("C", _c);
 BA.debugLineNum = 16;BA.debugLine="C.Initialize(iv)";
Debug.ShouldStop(32768);
_c.runVoidMethod ("Initialize",(Object)((_iv.getObject())));
 BA.debugLineNum = 17;BA.debugLine="Dim w_x,w_y,radius As Int";
Debug.ShouldStop(65536);
_w_x = RemoteObject.createImmutable(0);Debug.locals.put("w_x", _w_x);
_w_y = RemoteObject.createImmutable(0);Debug.locals.put("w_y", _w_y);
_radius = RemoteObject.createImmutable(0);Debug.locals.put("radius", _radius);
 BA.debugLineNum = 18;BA.debugLine="radius=(iv.Width/3)";
Debug.ShouldStop(131072);
_radius = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {_iv.runMethod(true,"getWidth"),RemoteObject.createImmutable(3)}, "/",0, 0)));Debug.locals.put("radius", _radius);
 BA.debugLineNum = 19;BA.debugLine="w_x=iv.Width-radius";
Debug.ShouldStop(262144);
_w_x = RemoteObject.solve(new RemoteObject[] {_iv.runMethod(true,"getWidth"),_radius}, "-",1, 1);Debug.locals.put("w_x", _w_x);
 BA.debugLineNum = 20;BA.debugLine="w_y=radius";
Debug.ShouldStop(524288);
_w_y = _radius;Debug.locals.put("w_y", _w_y);
 BA.debugLineNum = 21;BA.debugLine="Log(radius)";
Debug.ShouldStop(1048576);
main_codes.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_radius)));
 BA.debugLineNum = 22;BA.debugLine="C.AntiAlias=True          ' Ghost White";
Debug.ShouldStop(2097152);
_c.runMethod(true,"setAntiAlias",main_codes.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 23;BA.debugLine="C.DrawCircle(w_x,w_y,radius,0xFFF5F5F5,True,0)";
Debug.ShouldStop(4194304);
_c.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _w_x)),(Object)(BA.numberCast(float.class, _w_y)),(Object)(BA.numberCast(float.class, _radius)),(Object)(BA.numberCast(int.class, 0xfff5f5f5)),(Object)(main_codes.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 24;BA.debugLine="C.DrawText(numtofa( count),w_x,w_y+radius/2,tf,ra";
Debug.ShouldStop(8388608);
_c.runVoidMethod ("DrawText",_ba,(Object)(_numtofa(_ba,BA.NumberToString(_count))),(Object)(BA.numberCast(float.class, _w_x)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_w_y,_radius,RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)((main_codes._tf.getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_radius,RemoteObject.createImmutable(1.125)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0xff2f2f2f)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 25;BA.debugLine="iv.Invalidate";
Debug.ShouldStop(16777216);
_iv.runVoidMethod ("Invalidate");
 BA.debugLineNum = 26;BA.debugLine="iv.Invalidate";
Debug.ShouldStop(33554432);
_iv.runVoidMethod ("Invalidate");
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}