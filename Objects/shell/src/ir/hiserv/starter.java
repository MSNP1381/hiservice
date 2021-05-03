
package ir.hiserv;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "ir.hiserv.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("ir.hiserv.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static ir.hiserv.main _main = null;
public static ir.hiserv.laundry _laundry = null;
public static ir.hiserv.register_login _register_login = null;
public static ir.hiserv.firebasemessaging _firebasemessaging = null;
public static ir.hiserv.main_ _main_ = null;
public static ir.hiserv.main_codes _main_codes = null;
public static ir.hiserv.notify _notify = null;
  public Object[] GetGlobals() {
		return new Object[] {"FirebaseMessaging",Debug.moduleToString(ir.hiserv.firebasemessaging.class),"laundry",Debug.moduleToString(ir.hiserv.laundry.class),"Main",Debug.moduleToString(ir.hiserv.main.class),"main_",Debug.moduleToString(ir.hiserv.main_.class),"main_codes",Debug.moduleToString(ir.hiserv.main_codes.class),"notify",Debug.moduleToString(ir.hiserv.notify.class),"register_login",Debug.moduleToString(ir.hiserv.register_login.class),"Service",starter.mostCurrent._service};
}
}