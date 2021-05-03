
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

public class firebasemessaging implements IRemote{
	public static firebasemessaging mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public firebasemessaging() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("firebasemessaging"), "ir.hiserv.firebasemessaging");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("ir.hiserv.firebasemessaging");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, firebasemessaging.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fm = RemoteObject.declareNull("anywheresoftware.b4a.objects.FirebaseNotificationsService.FirebaseMessageWrapper");
public static RemoteObject _v = RemoteObject.declareNull("amin.shahedi.ariagp.AriaVolley");
public static ir.hiserv.main _main = null;
public static ir.hiserv.laundry _laundry = null;
public static ir.hiserv.register_login _register_login = null;
public static ir.hiserv.main_ _main_ = null;
public static ir.hiserv.main_codes _main_codes = null;
public static ir.hiserv.starter _starter = null;
public static ir.hiserv.notify _notify = null;
  public Object[] GetGlobals() {
		return new Object[] {"fm",firebasemessaging._fm,"laundry",Debug.moduleToString(ir.hiserv.laundry.class),"Main",Debug.moduleToString(ir.hiserv.main.class),"main_",Debug.moduleToString(ir.hiserv.main_.class),"main_codes",Debug.moduleToString(ir.hiserv.main_codes.class),"notify",Debug.moduleToString(ir.hiserv.notify.class),"register_login",Debug.moduleToString(ir.hiserv.register_login.class),"Service",firebasemessaging.mostCurrent._service,"Starter",Debug.moduleToString(ir.hiserv.starter.class),"v",firebasemessaging._v};
}
}