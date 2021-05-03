package ir.hiserv;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class account_module extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.hiserv.account_module");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.hiserv.account_module.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _p = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _orders_lbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _pay_lbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _score_lbl = null;
public anywheresoftware.b4a.object.XmlLayoutBuilder _x = null;
public ir.hiserv.main _main = null;
public ir.hiserv.laundry _laundry = null;
public ir.hiserv.register_login _register_login = null;
public ir.hiserv.firebasemessaging _firebasemessaging = null;
public ir.hiserv.main_ _main_ = null;
public ir.hiserv.main_codes _main_codes = null;
public ir.hiserv.starter _starter = null;
public ir.hiserv.notify _notify = null;
public String  _class_globals(ir.hiserv.account_module __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="account_module";
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Private orders_lbl As Label";
_orders_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Private pay_lbl As Label";
_pay_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="Private score_lbl As Label";
_score_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="Dim X As XmlLayoutBuilder";
_x = new anywheresoftware.b4a.object.XmlLayoutBuilder();
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="End Sub";
return "";
}
public String  _initialize(ir.hiserv.account_module __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ScrollViewWrapper _sv) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="account_module";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_sv}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub Initialize(sv As ScrollView)',ActionIV";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="p=sv.Panel";
__ref._p = _sv.getPanel();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="sv.Color=Colors.White";
_sv.setColor(__c.Colors.White);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="p.Height=sv.Height*.4";
__ref._p.setHeight((int) (_sv.getHeight()*.4));
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="p.LoadLayout(\"account_header\")";
__ref._p.LoadLayout("account_header",ba);
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="sv.Padding = Array As Int (0dip, 10dip, 0dip, 0di";
_sv.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="orders_lbl.Background=X.GetDrawable(\"ic_account_s";
__ref._orders_lbl.setBackground(__ref._x.GetDrawable("ic_account_scores"));
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="pay_lbl.Background=x.GetDrawable(\"ic_account_paid";
__ref._pay_lbl.setBackground(__ref._x.GetDrawable("ic_account_paid"));
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="score_lbl.Background=X.GetDrawable(\"ic_account_or";
__ref._score_lbl.setBackground(__ref._x.GetDrawable("ic_account_orders"));
RDebugUtils.currentLine=2818068;
 //BA.debugLineNum = 2818068;BA.debugLine="End Sub";
return "";
}
}