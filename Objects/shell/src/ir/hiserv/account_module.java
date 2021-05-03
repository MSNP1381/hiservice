
package ir.hiserv;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class account_module {
    public static RemoteObject myClass;
	public account_module() {
	}
    public static PCBA staticBA = new PCBA(null, account_module.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _orders_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pay_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _score_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _x = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static ir.hiserv.main _main = null;
public static ir.hiserv.laundry _laundry = null;
public static ir.hiserv.register_login _register_login = null;
public static ir.hiserv.firebasemessaging _firebasemessaging = null;
public static ir.hiserv.main_ _main_ = null;
public static ir.hiserv.main_codes _main_codes = null;
public static ir.hiserv.starter _starter = null;
public static ir.hiserv.notify _notify = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ImageView1",_ref.getField(false, "_imageview1"),"Label1",_ref.getField(false, "_label1"),"Label2",_ref.getField(false, "_label2"),"orders_lbl",_ref.getField(false, "_orders_lbl"),"p",_ref.getField(false, "_p"),"pay_lbl",_ref.getField(false, "_pay_lbl"),"score_lbl",_ref.getField(false, "_score_lbl"),"X",_ref.getField(false, "_x")};
}
}