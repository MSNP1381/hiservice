
package ir.hiserv;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class main_builder {
    public static RemoteObject myClass;
	public main_builder() {
	}
    public static PCBA staticBA = new PCBA(null, main_builder.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pager = RemoteObject.declareNull("com.porya.pagerbullet.PagerBulletWrapper");
public static RemoteObject _b = null;
public static RemoteObject _num = RemoteObject.createImmutable(0);
public static ir.hiserv.main _main = null;
public static ir.hiserv.laundry _laundry = null;
public static ir.hiserv.register_login _register_login = null;
public static ir.hiserv.firebasemessaging _firebasemessaging = null;
public static ir.hiserv.main_ _main_ = null;
public static ir.hiserv.main_codes _main_codes = null;
public static ir.hiserv.starter _starter = null;
public static ir.hiserv.notify _notify = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"b",_ref.getField(false, "_b"),"num",_ref.getField(false, "_num"),"pager",_ref.getField(false, "_pager")};
}
}