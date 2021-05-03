
package ir.hiserv;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class home_module {
    public static RemoteObject myClass;
	public home_module() {
	}
    public static PCBA staticBA = new PCBA(null, home_module.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _item_width = RemoteObject.createImmutable(0f);
public static RemoteObject _right = RemoteObject.createImmutable(0f);
public static RemoteObject _top = RemoteObject.createImmutable(0f);
public static RemoteObject _div = RemoteObject.createImmutable(0f);
public static RemoteObject _count = RemoteObject.createImmutable(0);
public static RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
public static RemoteObject _ulv = RemoteObject.declareNull("flm.b4a.ultimatelistview.UltimateListViewWrapper");
public static RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _core = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _holder = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _s = RemoteObject.declareNull("com.smartstring.arminkh.smartstring");
public static ir.hiserv.main _main = null;
public static ir.hiserv.laundry _laundry = null;
public static ir.hiserv.register_login _register_login = null;
public static ir.hiserv.firebasemessaging _firebasemessaging = null;
public static ir.hiserv.main_ _main_ = null;
public static ir.hiserv.main_codes _main_codes = null;
public static ir.hiserv.starter _starter = null;
public static ir.hiserv.notify _notify = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"body",_ref.getField(false, "_body"),"core",_ref.getField(false, "_core"),"count",_ref.getField(false, "_count"),"div",_ref.getField(false, "_div"),"holder",_ref.getField(false, "_holder"),"item_width",_ref.getField(false, "_item_width"),"right",_ref.getField(false, "_right"),"s",_ref.getField(false, "_s"),"tf",_ref.getField(false, "_tf"),"top",_ref.getField(false, "_top"),"ulv",_ref.getField(false, "_ulv")};
}
}