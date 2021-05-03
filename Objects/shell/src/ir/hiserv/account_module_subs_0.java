package ir.hiserv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class account_module_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim p As Panel";
account_module._p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_p",account_module._p);
 //BA.debugLineNum = 8;BA.debugLine="Private ImageView1 As ImageView";
account_module._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imageview1",account_module._imageview1);
 //BA.debugLineNum = 9;BA.debugLine="Private Label1 As Label";
account_module._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",account_module._label1);
 //BA.debugLineNum = 10;BA.debugLine="Private Label2 As Label";
account_module._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label2",account_module._label2);
 //BA.debugLineNum = 11;BA.debugLine="Private orders_lbl As Label";
account_module._orders_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_orders_lbl",account_module._orders_lbl);
 //BA.debugLineNum = 12;BA.debugLine="Private pay_lbl As Label";
account_module._pay_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pay_lbl",account_module._pay_lbl);
 //BA.debugLineNum = 13;BA.debugLine="Private score_lbl As Label";
account_module._score_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_score_lbl",account_module._score_lbl);
 //BA.debugLineNum = 14;BA.debugLine="Dim X As XmlLayoutBuilder";
account_module._x = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");__ref.setField("_x",account_module._x);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _sv) throws Exception{
try {
		Debug.PushSubsStack("Initialize (account_module) ","account_module",4,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "account_module","initialize", __ref, _ba, _sv);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("sv", _sv);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize(sv As ScrollView)',ActionIV";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="p=sv.Panel";
Debug.ShouldStop(524288);
__ref.setField ("_p",_sv.runMethod(false,"getPanel"));
 BA.debugLineNum = 21;BA.debugLine="sv.Color=Colors.White";
Debug.ShouldStop(1048576);
_sv.runVoidMethod ("setColor",account_module.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 22;BA.debugLine="p.Height=sv.Height*.4";
Debug.ShouldStop(2097152);
__ref.getField(false,"_p").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_sv.runMethod(true,"getHeight"),RemoteObject.createImmutable(.4)}, "*",0, 0)));
 BA.debugLineNum = 23;BA.debugLine="p.LoadLayout(\"account_header\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_p").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("account_header")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="sv.Padding = Array As Int (0dip, 10dip, 0dip, 0di";
Debug.ShouldStop(16777216);
_sv.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {account_module.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),account_module.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),account_module.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),account_module.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 27;BA.debugLine="orders_lbl.Background=X.GetDrawable(\"ic_account_s";
Debug.ShouldStop(67108864);
__ref.getField(false,"_orders_lbl").runMethod(false,"setBackground",__ref.getField(false,"_x").runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_account_scores"))));
 BA.debugLineNum = 28;BA.debugLine="pay_lbl.Background=x.GetDrawable(\"ic_account_paid";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pay_lbl").runMethod(false,"setBackground",__ref.getField(false,"_x").runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_account_paid"))));
 BA.debugLineNum = 29;BA.debugLine="score_lbl.Background=X.GetDrawable(\"ic_account_or";
Debug.ShouldStop(268435456);
__ref.getField(false,"_score_lbl").runMethod(false,"setBackground",__ref.getField(false,"_x").runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("ic_account_orders"))));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}