package ir.hiserv;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class order_module extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.hiserv.order_module");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.hiserv.order_module.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tf = null;
public flm.b4a.ultimatelistview.UltimateListViewWrapper _ulv = null;
public flm.b4a.ultimatelistview.UltimateListViewWrapper.ULVPanel _ulv_pan = null;
public int _stat_land = 0;
public int _state_por = 0;
public int _state = 0;
public int[] _widths_land = null;
public int[] _widths_por = null;
public com.maximussoft.mscardview.CardViewWrapper _ms = null;
public ir.hiserv.main _main = null;
public ir.hiserv.laundry _laundry = null;
public ir.hiserv.register_login _register_login = null;
public ir.hiserv.firebasemessaging _firebasemessaging = null;
public ir.hiserv.main_ _main_ = null;
public ir.hiserv.main_codes _main_codes = null;
public ir.hiserv.starter _starter = null;
public ir.hiserv.notify _notify = null;
public String  _class_globals(ir.hiserv.order_module __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="order_module";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim tf As Typeface=Typeface.LoadFromAssets(\"IRANY";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_tf.setObject((android.graphics.Typeface)(__c.Typeface.LoadFromAssets("IRANYekanMobileLight.ttf")));
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Dim ulv As UltimateListView";
_ulv = new flm.b4a.ultimatelistview.UltimateListViewWrapper();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Dim ulv_pan As UltimateLVPanel";
_ulv_pan = new flm.b4a.ultimatelistview.UltimateListViewWrapper.ULVPanel();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Dim stat_land=1,state_por=2,state As Int";
_stat_land = (int) (1);
_state_por = (int) (2);
_state = 0;
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Dim widths_land(100),widths_por(100)As Int";
_widths_land = new int[(int) (100)];
;
_widths_por = new int[(int) (100)];
;
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="Dim ms As MSCardView";
_ms = new com.maximussoft.mscardview.CardViewWrapper();
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="End Sub";
return "";
}
public String  _initialize(ir.hiserv.order_module __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _content) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="order_module";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_content}));}
int _i = 0;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub Initialize(content As Panel)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="ulv.Initialize(0,0,0,\"ulv\")";
__ref._ulv.Initialize(ba,(byte) (0),(int) (0),BA.NumberToString(0),"ulv");
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="content.AddView(ulv,1%x,0,98%x,content.Height)";
_content.AddView((android.view.View)(__ref._ulv.getObject()),__c.PerXToCurrent((float) (1),ba),(int) (0),__c.PerXToCurrent((float) (98),ba),_content.getHeight());
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="For i=0 To 10";
{
final int step3 = 1;
final int limit3 = (int) (10);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="widths_por(i)=32%x";
__ref._widths_por[_i] = __c.PerXToCurrent((float) (32),ba);
 }
};
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="If 100%x>100%y Then";
if (__c.PerXToCurrent((float) (100),ba)>__c.PerYToCurrent((float) (100),ba)) { 
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="state=stat_land";
__ref._state = __ref._stat_land;
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="ulv.AddRowLayout(\"lay1\",\"ulv_RowLayoutCreator\",\"";
__ref._ulv.AddRowLayout("lay1","ulv_RowLayoutCreator","ulv_RowContentFiller",(int) (1.2*__ref._widths_land[(int) (0)]),(byte) (3),__ref._widths_land,(int) (4/(double)__c.PerXToCurrent((float) (3),ba)),__c.Colors.White,__c.False);
 }else {
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="state=state_por";
__ref._state = __ref._state_por;
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="ulv.AddRowLayout(\"lay1\",\"ulv_RowLayoutCreator\",\"";
__ref._ulv.AddRowLayout("lay1","ulv_RowLayoutCreator","ulv_RowContentFiller",(int) (1.2*__ref._widths_por[(int) (0)]),(byte) (2),__ref._widths_por,__c.PerXToCurrent((float) (4),ba),__c.Colors.White,__c.False);
 };
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="ulv.AddLayout(\"lay header\",\"ulv_LayoutCreator\",\"u";
__ref._ulv.AddLayout("lay header","ulv_LayoutCreator","ulv_ContentFiller",(int) (1.6*__ref._widths_por[(int) (0)]),__c.False);
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="ulv.AddItem(\"lay header\",0)";
__ref._ulv.AddItem("lay header",(long) (0));
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="For i= 01 To 11";
{
final int step15 = 1;
final int limit15 = (int) (11);
_i = (int) (01) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="ulv.AddItem(\"lay1\",i)";
__ref._ulv.AddItem("lay1",(long) (_i));
 }
};
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="ulv.FadingEdges(False)";
__ref._ulv.FadingEdges(__c.False);
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="ulv.SetStyle(ulv.STYLE_HOLO_LIGHT)";
__ref._ulv.SetStyle(ba,__ref._ulv.STYLE_HOLO_LIGHT);
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="ulv.SetScrollbarStyle(ulv.SCROLLBAR_INVISIBLE)";
__ref._ulv.SetScrollbarStyle(__ref._ulv.SCROLLBAR_INVISIBLE);
RDebugUtils.currentLine=2293785;
 //BA.debugLineNum = 2293785;BA.debugLine="End Sub";
return "";
}
public String  _ulv_contentfiller(ir.hiserv.order_module __ref,long _itemid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="order_module";
if (Debug.shouldDelegate(ba, "ulv_contentfiller"))
	 {return ((String) Debug.delegate(ba, "ulv_contentfiller", new Object[] {_itemid,_layoutname,_layoutpanel,_position}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub ulv_ContentFiller(ItemID As Long, LayoutName A";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim iv As ImageView=LayoutPanel.GetView(0)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv.setObject((android.widget.ImageView)(_layoutpanel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim et As EditText=LayoutPanel.GetView(01)";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et.setObject((android.widget.EditText)(_layoutpanel.GetView((int) (01)).getObject()));
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="iv.Bitmap=LoadBitmap(File.DirAssets,\"pager1.jpg\")";
_iv.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"pager1.jpg").getObject()));
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="et.Hint=\"جستوجو کنید ...\"";
_et.setHint("جستوجو کنید ...");
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="et.Gravity=Gravity.RIGHT";
_et.setGravity(__c.Gravity.RIGHT);
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="et.Typeface=tf";
_et.setTypeface((android.graphics.Typeface)(__ref._tf.getObject()));
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="End Sub";
return "";
}
public String  _ulv_layoutcreator(ir.hiserv.order_module __ref,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="order_module";
if (Debug.shouldDelegate(ba, "ulv_layoutcreator"))
	 {return ((String) Debug.delegate(ba, "ulv_layoutcreator", new Object[] {_layoutname,_layoutpanel}));}
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub ulv_LayoutCreator(LayoutName As String, Layout";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="LayoutPanel.LoadLayout(\"orders_list_inside_num1\")";
_layoutpanel.LoadLayout("orders_list_inside_num1",ba);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Dim et As EditText=LayoutPanel.GetView(01)";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et.setObject((android.widget.EditText)(_layoutpanel.GetView((int) (01)).getObject()));
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="LayoutPanel.Height=et.Top+et.Height+5dip";
_layoutpanel.setHeight((int) (_et.getTop()+_et.getHeight()+__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="End Sub";
return "";
}
public String  _ulv_rowcontentfiller(ir.hiserv.order_module __ref,long _rowid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _cellpanel,byte _cellindex,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="order_module";
if (Debug.shouldDelegate(ba, "ulv_rowcontentfiller"))
	 {return ((String) Debug.delegate(ba, "ulv_rowcontentfiller", new Object[] {_rowid,_layoutname,_cellpanel,_cellindex,_position}));}
com.maximussoft.mscardview.CardViewWrapper _q = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _l1 = null;
anywheresoftware.b4a.objects.LabelWrapper _l2 = null;
anywheresoftware.b4a.objects.LabelWrapper _l3 = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub ulv_RowContentFiller(RowID As Long, LayoutName";
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Dim q As MSCardView=CellPanel.GetView(0)";
_q = new com.maximussoft.mscardview.CardViewWrapper();
_q.setObject((android.support.v7.widget.CardView)(_cellpanel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="q.Panel.LoadLayout(\"orders_inside\")";
_q.getPanel().LoadLayout("orders_inside",ba);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Dim p As Panel=q.Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = _q.getPanel();
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="Dim l1 As Label=p.GetView(0)";
_l1 = new anywheresoftware.b4a.objects.LabelWrapper();
_l1.setObject((android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="Dim l2 As Label=p.GetView(01)";
_l2 = new anywheresoftware.b4a.objects.LabelWrapper();
_l2.setObject((android.widget.TextView)(_p.GetView((int) (01)).getObject()));
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="Dim l3 As Label=p.GetView(02)";
_l3 = new anywheresoftware.b4a.objects.LabelWrapper();
_l3.setObject((android.widget.TextView)(_p.GetView((int) (02)).getObject()));
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="l1.Typeface=tf";
_l1.setTypeface((android.graphics.Typeface)(__ref._tf.getObject()));
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="l2.Typeface=tf";
_l2.setTypeface((android.graphics.Typeface)(__ref._tf.getObject()));
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="l3.Typeface=tf";
_l3.setTypeface((android.graphics.Typeface)(__ref._tf.getObject()));
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="l1.Text=\"#100\"";
_l1.setText(BA.ObjectToCharSequence("#100"));
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="l2.Text=\"97/5/14	15:40\"";
_l2.setText(BA.ObjectToCharSequence("97/5/14	15:40"));
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="l3.Text=\"10.000 تومان\"";
_l3.setText(BA.ObjectToCharSequence("10.000 تومان"));
RDebugUtils.currentLine=2555922;
 //BA.debugLineNum = 2555922;BA.debugLine="Log(GetType(CellPanel.GetView(0)))";
__c.Log(__c.GetType((Object)(_cellpanel.GetView((int) (0)).getObject())));
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="End Sub";
return "";
}
public String  _ulv_rowlayoutcreator(ir.hiserv.order_module __ref,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _cellpanel,byte _cellindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="order_module";
if (Debug.shouldDelegate(ba, "ulv_rowlayoutcreator"))
	 {return ((String) Debug.delegate(ba, "ulv_rowlayoutcreator", new Object[] {_layoutname,_cellpanel,_cellindex}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub ulv_RowLayoutCreator(LayoutName As String, Cel";
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="ms.Initialize(\"ms_card\")";
__ref._ms.Initialize(ba,"ms_card");
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="ms.Tag=CellIndex";
__ref._ms.setTag((Object)(_cellindex));
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="CellPanel.AddView(ms,0,0,CellPanel.Width,CellPane";
_cellpanel.AddView((android.view.View)(__ref._ms.getObject()),(int) (0),(int) (0),_cellpanel.getWidth(),_cellpanel.getHeight());
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="ms.Panel.Height=ms.Height-ms.Radius-ms.MaxElevati";
__ref._ms.getPanel().setHeight((int) (__ref._ms.getHeight()-__ref._ms.getRadius()-__ref._ms.getMaxElevation()));
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="ms.Panel.Width=ms.Width";
__ref._ms.getPanel().setWidth(__ref._ms.getWidth());
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="End Sub";
return "";
}
}