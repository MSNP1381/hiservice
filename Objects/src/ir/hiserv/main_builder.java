package ir.hiserv;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class main_builder extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.hiserv.main_builder");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.hiserv.main_builder.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public com.porya.pagerbullet.PagerBulletWrapper _pager = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper[] _b = null;
public int _num = 0;
public ir.hiserv.main _main = null;
public ir.hiserv.laundry _laundry = null;
public ir.hiserv.register_login _register_login = null;
public ir.hiserv.firebasemessaging _firebasemessaging = null;
public ir.hiserv.main_ _main_ = null;
public ir.hiserv.main_codes _main_codes = null;
public ir.hiserv.starter _starter = null;
public ir.hiserv.notify _notify = null;
public com.porya.pagerbullet.PagerBulletAdapter  _adapter_builder(ir.hiserv.main_builder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="main_builder";
if (Debug.shouldDelegate(ba, "adapter_builder"))
	 {return ((com.porya.pagerbullet.PagerBulletAdapter) Debug.delegate(ba, "adapter_builder", null));}
com.porya.pagerbullet.PagerBulletAdapter _pa = null;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub adapter_builder As PagerBulletAdapter";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Dim pa As PagerBulletAdapter";
_pa = new com.porya.pagerbullet.PagerBulletAdapter();
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="pa.Initialize";
_pa.Initialize(ba);
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Log(num)";
__c.Log(BA.NumberToString(__ref._num));
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="For i=0 To num-1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._num-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="p.Initialize(\"p\"&i)";
_p.Initialize(ba,"p"+BA.NumberToString(_i));
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="p.SetBackgroundImage(b(i))";
_p.SetBackgroundImageNew((android.graphics.Bitmap)(__ref._b[_i].getObject()));
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="p.Tag=i";
_p.setTag((Object)(_i));
RDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="pa.AddPage(p)";
_pa.AddPage((android.view.View)(_p.getObject()));
 }
};
RDebugUtils.currentLine=6225931;
 //BA.debugLineNum = 6225931;BA.debugLine="Return pa";
if (true) return _pa;
RDebugUtils.currentLine=6225932;
 //BA.debugLineNum = 6225932;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.hiserv.main_builder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="main_builder";
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Dim pager As PagerBullet";
_pager = new com.porya.pagerbullet.PagerBulletWrapper();
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Dim b() As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper[(int) (0)];
{
int d0 = _b.length;
for (int i0 = 0;i0 < d0;i0++) {
_b[i0] = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
}
}
;
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Dim num As Int";
_num = 0;
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="End Sub";
return "";
}
public String  _initialize(ir.hiserv.main_builder __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _panel1,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper[] _img,int _count,int _height) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="main_builder";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_panel1,_img,_count,_height}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub Initialize(panel1 As Panel,img()As Bitm";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="b=img";
__ref._b = _img;
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="num=count";
__ref._num = _count;
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="pager.Initialize(adapter_builder,\"pager1\")";
__ref._pager.Initialize(ba,__ref._adapter_builder(null),"pager1");
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="pager.setDotsColor(Colors.White,Colors.LightGray)";
__ref._pager.setDotsColor(__c.Colors.White,__c.Colors.LightGray);
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="pager.Transition = pager.PARALLAX_PAGE";
__ref._pager.setTransition(__ref._pager.PARALLAX_PAGE);
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="pager.Enabled = True";
__ref._pager.setEnabled(__c.True);
RDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="panel1.AddView(pager,0,0,100%x,height)";
_panel1.AddView((android.view.View)(__ref._pager.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_height);
RDebugUtils.currentLine=6160395;
 //BA.debugLineNum = 6160395;BA.debugLine="End Sub";
return "";
}
}