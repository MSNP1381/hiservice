
package ir.hiserv;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class order_module {
    public static RemoteObject myClass;
	public order_module() {
	}
    public static PCBA staticBA = new PCBA(null, order_module.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
public static RemoteObject _ulv = RemoteObject.declareNull("flm.b4a.ultimatelistview.UltimateListViewWrapper");
public static RemoteObject _ulv_pan = RemoteObject.declareNull("flm.b4a.ultimatelistview.UltimateListViewWrapper.ULVPanel");
public static RemoteObject _stat_land = RemoteObject.createImmutable(0);
public static RemoteObject _state_por = RemoteObject.createImmutable(0);
public static RemoteObject _state = RemoteObject.createImmutable(0);
public static RemoteObject _widths_land = null;
public static RemoteObject _widths_por = null;
public static RemoteObject _ms = RemoteObject.declareNull("com.maximussoft.mscardview.CardViewWrapper");
public static ir.hiserv.main _main = null;
public static ir.hiserv.laundry _laundry = null;
public static ir.hiserv.register_login _register_login = null;
public static ir.hiserv.firebasemessaging _firebasemessaging = null;
public static ir.hiserv.main_ _main_ = null;
public static ir.hiserv.main_codes _main_codes = null;
public static ir.hiserv.starter _starter = null;
public static ir.hiserv.notify _notify = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ms",_ref.getField(false, "_ms"),"stat_land",_ref.getField(false, "_stat_land"),"state",_ref.getField(false, "_state"),"state_por",_ref.getField(false, "_state_por"),"tf",_ref.getField(false, "_tf"),"ulv",_ref.getField(false, "_ulv"),"ulv_pan",_ref.getField(false, "_ulv_pan"),"widths_land",_ref.getField(false, "_widths_land"),"widths_por",_ref.getField(false, "_widths_por")};
}
}