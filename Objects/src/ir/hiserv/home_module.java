package ir.hiserv;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class home_module extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.hiserv.home_module");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.hiserv.home_module.class).invoke(this, new Object[] {null});
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
public float _item_width = 0f;
public float _right = 0f;
public float _top = 0f;
public float _div = 0f;
public int _count = 0;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _tf = null;
public flm.b4a.ultimatelistview.UltimateListViewWrapper _ulv = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _body = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _core = null;
public anywheresoftware.b4a.objects.LabelWrapper _holder = null;
public com.smartstring.arminkh.smartstring _s = null;
public ir.hiserv.main _main = null;
public ir.hiserv.laundry _laundry = null;
public ir.hiserv.register_login _register_login = null;
public ir.hiserv.firebasemessaging _firebasemessaging = null;
public ir.hiserv.main_ _main_ = null;
public ir.hiserv.main_codes _main_codes = null;
public ir.hiserv.starter _starter = null;
public ir.hiserv.notify _notify = null;
public String  _initialize(ir.hiserv.home_module __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _p,int _c) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="home_module";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_p,_c}));}
int[] _a = null;
int _i = 0;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub Initialize(p As Panel,c As Int)";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="count=c";
__ref._count = _c;
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="s.Initialize";
__ref._s._initialize(ba);
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="ulv.Initialize(0,0,0,\"ulv\")";
__ref._ulv.Initialize(ba,(byte) (0),(int) (0),BA.NumberToString(0),"ulv");
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="right=7%X";
__ref._right = (float) (__c.PerXToCurrent((float) (7),ba));
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="p.AddView(ulv,0,0,100%x,p.Height)";
_p.AddView((android.view.View)(__ref._ulv.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),_p.getHeight());
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="Dim a(6) As Int=Array As Int (50%x,50%x,50%x,50%x";
_a = new int[]{__c.PerXToCurrent((float) (50),ba),__c.PerXToCurrent((float) (50),ba),__c.PerXToCurrent((float) (50),ba),__c.PerXToCurrent((float) (50),ba),__c.PerXToCurrent((float) (50),ba),__c.PerXToCurrent((float) (50),ba)};
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="ulv.AddRowLayout(\"lay1\",\"ulv_RowLayoutCreator\",\"u";
__ref._ulv.AddRowLayout("lay1","ulv_RowLayoutCreator","ulv_RowContentFiller",__c.PerXToCurrent((float) (50),ba),(byte) (2),_a,__c.PerXToCurrent((float) (5),ba),__c.Colors.Transparent,__c.True);
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="ulv.DividerHeight=0";
__ref._ulv.setDividerHeight((int) (0));
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="For i=0 To (count-1)/2";
{
final int step9 = 1;
final int limit9 = (int) ((__ref._count-1)/(double)2);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="ulv.AddItem(\"lay1\",i)";
__ref._ulv.AddItem("lay1",(long) (_i));
 }
};
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="body=LoadBitmap(File.DirAssets,\"body.png\")";
__ref._body = __c.LoadBitmap(__c.File.getDirAssets(),"body.png");
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="core=LoadBitmap(File.DirAssets,\"core.png\")";
__ref._core = __c.LoadBitmap(__c.File.getDirAssets(),"core.png");
RDebugUtils.currentLine=4259857;
 //BA.debugLineNum = 4259857;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.hiserv.home_module __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="home_module";
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Private item_width As Float=50%x";
_item_width = (float) (__c.PerXToCurrent((float) (50),ba));
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Private right As Float=5%x";
_right = (float) (__c.PerXToCurrent((float) (5),ba));
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="Private top As Float=3%y";
_top = (float) (__c.PerYToCurrent((float) (3),ba));
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Private div As Float=1%y";
_div = (float) (__c.PerYToCurrent((float) (1),ba));
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="Dim count As Int";
_count = 0;
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="Dim tf As Typeface=Typeface.LoadFromAssets(\"IRANY";
_tf = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_tf.setObject((android.graphics.Typeface)(__c.Typeface.LoadFromAssets("IRANYekanMobileLight.ttf")));
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="Dim ulv As UltimateListView";
_ulv = new flm.b4a.ultimatelistview.UltimateListViewWrapper();
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="Dim body,core As Bitmap";
_body = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_core = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="Dim holder As Label";
_holder = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="Dim s As SmartString";
_s = new com.smartstring.arminkh.smartstring();
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="End Sub";
return "";
}
public void  _iv_body_click(ir.hiserv.home_module __ref) throws Exception{
RDebugUtils.currentModule="home_module";
if (Debug.shouldDelegate(ba, "iv_body_click"))
	 {Debug.delegate(ba, "iv_body_click", null); return;}
ResumableSub_iv_body_Click rsub = new ResumableSub_iv_body_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_iv_body_Click extends BA.ResumableSub {
public ResumableSub_iv_body_Click(ir.hiserv.home_module parent,ir.hiserv.home_module __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.hiserv.home_module __ref;
ir.hiserv.home_module parent;
anywheresoftware.b4a.objects.ConcreteViewWrapper _iv = null;
anywheresoftware.b4a.objects.AnimationWrapper _a = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="home_module";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim iv As View=Sender";
_iv = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
_iv.setObject((android.view.View)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Dim a As Animation";
_a = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="a.InitializeScaleCenter(\"ani\",1,01,1.1,1.1,iv)";
_a.InitializeScaleCenter(ba,"ani",(float) (1),(float) (01),(float) (1.1),(float) (1.1),(android.view.View)(_iv.getObject()));
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="a.RepeatMode = a.REPEAT_REVERSE";
_a.setRepeatMode(_a.REPEAT_REVERSE);
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="a.RepeatCount=1";
_a.setRepeatCount((int) (1));
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="a.Duration=250";
_a.setDuration((long) (250));
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="a.Start(iv)";
_a.Start((android.view.View)(_iv.getObject()));
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "home_module", "iv_body_click"),(int) (200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="StartActivity(laundry)";
parent.__c.StartActivity(ba,(Object)(parent._laundry.getObject()));
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _ulv_rowcontentfiller(ir.hiserv.home_module __ref,long _rowid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _cellpanel,byte _cellindex,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="home_module";
if (Debug.shouldDelegate(ba, "ulv_rowcontentfiller"))
	 {return ((String) Debug.delegate(ba, "ulv_rowcontentfiller", new Object[] {_rowid,_layoutname,_cellpanel,_cellindex,_position}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv_body = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv_core = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub ulv_RowContentFiller(RowID As Long, LayoutName";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim iv_body As ImageView=CellPanel.GetView(0)";
_iv_body = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv_body.setObject((android.widget.ImageView)(_cellpanel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Dim iv_core As ImageView=CellPanel.GetView(01)";
_iv_core = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv_core.setObject((android.widget.ImageView)(_cellpanel.GetView((int) (01)).getObject()));
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Dim lbl As Label=CellPanel.GetView(02)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl.setObject((android.widget.TextView)(_cellpanel.GetView((int) (02)).getObject()));
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="iv_body.Bitmap=body";
_iv_body.setBitmap((android.graphics.Bitmap)(__ref._body.getObject()));
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="iv_core.Bitmap=core";
_iv_core.setBitmap((android.graphics.Bitmap)(__ref._core.getObject()));
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="lbl.Typeface=tf";
_lbl.setTypeface((android.graphics.Typeface)(__ref._tf.getObject()));
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="lbl.Text=\"تعمیرات لوازم خانگی\"";
_lbl.setText(BA.ObjectToCharSequence("تعمیرات لوازم خانگی"));
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="End Sub";
return "";
}
public String  _ulv_rowlayoutcreator(ir.hiserv.home_module __ref,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _cellpanel,byte _cellindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="home_module";
if (Debug.shouldDelegate(ba, "ulv_rowlayoutcreator"))
	 {return ((String) Debug.delegate(ba, "ulv_rowlayoutcreator", new Object[] {_layoutname,_cellpanel,_cellindex}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub ulv_RowLayoutCreator(LayoutName As String, Cel";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="CellPanel.LoadLayout(\"home_items_grid\")";
_cellpanel.LoadLayout("home_items_grid",ba);
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="End Sub";
return "";
}
public void  _view_holder_click(ir.hiserv.home_module __ref) throws Exception{
RDebugUtils.currentModule="home_module";
if (Debug.shouldDelegate(ba, "view_holder_click"))
	 {Debug.delegate(ba, "view_holder_click", null); return;}
ResumableSub_view_holder_Click rsub = new ResumableSub_view_holder_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_view_holder_Click extends BA.ResumableSub {
public ResumableSub_view_holder_Click(ir.hiserv.home_module parent,ir.hiserv.home_module __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.hiserv.home_module __ref;
ir.hiserv.home_module parent;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.AnimationWrapper _a = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="home_module";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Dim p As Panel=Sender";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p.setObject((android.view.ViewGroup)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Dim iv As ImageView=p.GetView(1)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv.setObject((android.widget.ImageView)(_p.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Dim a As Animation";
_a = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="a.InitializeScaleCenter(\"ani\",1,01,1.1,1.1,iv)";
_a.InitializeScaleCenter(ba,"ani",(float) (1),(float) (01),(float) (1.1),(float) (1.1),(android.view.View)(_iv.getObject()));
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="a.RepeatMode = a.REPEAT_REVERSE";
_a.setRepeatMode(_a.REPEAT_REVERSE);
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="a.RepeatCount=1";
_a.setRepeatCount((int) (1));
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="a.Duration=250";
_a.setDuration((long) (250));
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="a.Start(iv)";
_a.Start((android.view.View)(_iv.getObject()));
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "home_module", "view_holder_click"),(int) (200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="StartActivity(laundry)";
parent.__c.StartActivity(ba,(Object)(parent._laundry.getObject()));
RDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _volley_onerror(ir.hiserv.home_module __ref,String _error) throws Exception{
__ref = this;
RDebugUtils.currentModule="home_module";
if (Debug.shouldDelegate(ba, "volley_onerror"))
	 {return ((String) Debug.delegate(ba, "volley_onerror", new Object[] {_error}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub volley_OnError (Error As String)";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return "";
}
public String  _volley_onstringresponse(ir.hiserv.home_module __ref,String _response) throws Exception{
__ref = this;
RDebugUtils.currentModule="home_module";
if (Debug.shouldDelegate(ba, "volley_onstringresponse"))
	 {return ((String) Debug.delegate(ba, "volley_onstringresponse", new Object[] {_response}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub volley_OnStringResponse (response As String)";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Log(\"rec1\")";
__c.Log("rec1");
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="End Sub";
return "";
}
}