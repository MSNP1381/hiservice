package ir.hiserv;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class main_codes {
private static main_codes mostCurrent = new main_codes();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tf = null;
public ir.hiserv.main _main = null;
public ir.hiserv.laundry _laundry = null;
public ir.hiserv.register_login _register_login = null;
public ir.hiserv.firebasemessaging _firebasemessaging = null;
public ir.hiserv.main_ _main_ = null;
public ir.hiserv.starter _starter = null;
public ir.hiserv.notify _notify = null;
public static void  _create_progress_inter(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ImageViewWrapper _v) throws Exception{
RDebugUtils.currentModule="main_codes";
if (Debug.shouldDelegate(null, "create_progress_inter"))
	 {Debug.delegate(null, "create_progress_inter", new Object[] {_ba,_v}); return;}
ResumableSub_create_progress_inter rsub = new ResumableSub_create_progress_inter(null,_ba,_v);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
}
public static class ResumableSub_create_progress_inter extends BA.ResumableSub {
public ResumableSub_create_progress_inter(ir.hiserv.main_codes parent,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ImageViewWrapper _v) {
this.parent = parent;
this._ba = _ba;
this._v = _v;
}
ir.hiserv.main_codes parent;
anywheresoftware.b4a.BA _ba;
anywheresoftware.b4a.objects.ImageViewWrapper _v;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper[] _s = null;
int _i = 0;
int step2;
int limit2;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main_codes";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim s(8) As Bitmap";
_s = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper[(int) (8)];
{
int d0 = _s.length;
for (int i0 = 0;i0 < d0;i0++) {
_s[i0] = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
}
}
;
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="For i=1 To s.Length";
if (true) break;

case 1:
//for
this.state = 4;
step2 = 1;
limit2 = _s.length;
_i = (int) (1) ;
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
if (true) break;

case 3:
//C
this.state = 16;
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="s(i-1)=LoadBitmap(File.DirAssets,$\"apptheme_prog";
_s[(int) (_i-1)] = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),("apptheme_progressbar_indeterminate_holo"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".png"));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="i=1";
_i = (int) (1);
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="Do While True";
if (true) break;

case 5:
//do while
this.state = 14;
while (anywheresoftware.b4a.keywords.Common.True) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="v.Bitmap=s(i-1)";
_v.setBitmap((android.graphics.Bitmap)(_s[(int) (_i-1)].getObject()));
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="If i=8 Then i=1";
if (true) break;

case 8:
//if
this.state = 13;
if (_i==8) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_i = (int) (1);
if (true) break;

case 13:
//C
this.state = 5;
;
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="Sleep(125)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main_codes", "create_progress_inter"),(int) (125));
this.state = 17;
return;
case 17:
//C
this.state = 5;
;
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="i=i+1";
_i = (int) (_i+1);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=4915218;
 //BA.debugLineNum = 4915218;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _numtofa(anywheresoftware.b4a.BA _ba,String _input) throws Exception{
RDebugUtils.currentModule="main_codes";
if (Debug.shouldDelegate(null, "numtofa"))
	 {return ((String) Debug.delegate(null, "numtofa", new Object[] {_ba,_input}));}
String _out = "";
char _ch = '\0';
int _i = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub numtofa(input As String)As String";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Dim out As String=\"\"";
_out = "";
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Dim ch As Char";
_ch = '\0';
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="For i=0 To input.Length-1";
{
final int step3 = 1;
final int limit3 = (int) (_input.length()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="ch=input.CharAt(i)";
_ch = _input.charAt(_i);
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="If IsNumber (ch) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.ObjectToString(_ch))) { 
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="Select ch";
switch (BA.switchObjectToInt(_ch,BA.ObjectToChar(0),BA.ObjectToChar(1),BA.ObjectToChar(2),BA.ObjectToChar(3),BA.ObjectToChar(4),BA.ObjectToChar(5),BA.ObjectToChar(6),BA.ObjectToChar(7),BA.ObjectToChar(8),BA.ObjectToChar(9))) {
case 0: {
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="out=out&\"۰\"";
_out = _out+"۰";
 break; }
case 1: {
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="out=out&\"۱\"";
_out = _out+"۱";
 break; }
case 2: {
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="out=out&\"۲\"";
_out = _out+"۲";
 break; }
case 3: {
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="out=out&\"۳\"";
_out = _out+"۳";
 break; }
case 4: {
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="out=out&\"۴\"";
_out = _out+"۴";
 break; }
case 5: {
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="out=out&\"۵\"";
_out = _out+"۵";
 break; }
case 6: {
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="out=out&\"۶\"";
_out = _out+"۶";
 break; }
case 7: {
RDebugUtils.currentLine=4849688;
 //BA.debugLineNum = 4849688;BA.debugLine="out=out&\"۷\"";
_out = _out+"۷";
 break; }
case 8: {
RDebugUtils.currentLine=4849690;
 //BA.debugLineNum = 4849690;BA.debugLine="out=out&\"۸\"";
_out = _out+"۸";
 break; }
case 9: {
RDebugUtils.currentLine=4849692;
 //BA.debugLineNum = 4849692;BA.debugLine="out=out&\"۹\"";
_out = _out+"۹";
 break; }
}
;
 }else {
RDebugUtils.currentLine=4849695;
 //BA.debugLineNum = 4849695;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=4849698;
 //BA.debugLineNum = 4849698;BA.debugLine="Return out";
if (true) return _out;
RDebugUtils.currentLine=4849699;
 //BA.debugLineNum = 4849699;BA.debugLine="End Sub";
return "";
}
public static String  _shop_basket(anywheresoftware.b4a.BA _ba,int _count,anywheresoftware.b4a.objects.ImageViewWrapper _iv) throws Exception{
RDebugUtils.currentModule="main_codes";
if (Debug.shouldDelegate(null, "shop_basket"))
	 {return ((String) Debug.delegate(null, "shop_basket", new Object[] {_ba,_count,_iv}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper _c = null;
int _w_x = 0;
int _w_y = 0;
int _radius = 0;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub shop_basket(count As Int,iv As ImageView)";
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Dim c As Canvas";
_c = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Dim C As Canvas";
_c = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="C.Initialize(iv)";
_c.Initialize((android.view.View)(_iv.getObject()));
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="Dim w_x,w_y,radius As Int";
_w_x = 0;
_w_y = 0;
_radius = 0;
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="radius=(iv.Width/3)";
_radius = (int) ((_iv.getWidth()/(double)3));
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="w_x=iv.Width-radius";
_w_x = (int) (_iv.getWidth()-_radius);
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="w_y=radius";
_w_y = _radius;
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="Log(radius)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_radius));
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="C.AntiAlias=True          ' Ghost White";
_c.setAntiAlias(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="C.DrawCircle(w_x,w_y,radius,0xFFF5F5F5,True,0)";
_c.DrawCircle((float) (_w_x),(float) (_w_y),(float) (_radius),(int) (0xfff5f5f5),anywheresoftware.b4a.keywords.Common.True,(float) (0));
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="C.DrawText(numtofa( count),w_x,w_y+radius/2,tf,ra";
_c.DrawText(_ba,_numtofa(_ba,BA.NumberToString(_count)),(float) (_w_x),(float) (_w_y+_radius/(double)2),(android.graphics.Typeface)(_tf.getObject()),(float) (_radius/(double)1.125),(int) (0xff2f2f2f),BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="iv.Invalidate";
_iv.Invalidate();
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="iv.Invalidate";
_iv.Invalidate();
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="End Sub";
return "";
}
}