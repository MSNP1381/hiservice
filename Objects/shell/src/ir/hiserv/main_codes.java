
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

public class main_codes implements IRemote{
	public static main_codes mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main_codes() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, main_codes.class);
    static {
		mostCurrent = new main_codes();
        remoteMe = RemoteObject.declareNull("ir.hiserv.main_codes");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main_codes"), "ir.hiserv.main_codes");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("ir.hiserv.main_codes"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
public static ir.hiserv.main _main = null;
public static ir.hiserv.laundry _laundry = null;
public static ir.hiserv.register_login _register_login = null;
public static ir.hiserv.firebasemessaging _firebasemessaging = null;
public static ir.hiserv.main_ _main_ = null;
public static ir.hiserv.starter _starter = null;
public static ir.hiserv.notify _notify = null;
  public Object[] GetGlobals() {
		return new Object[] {"FirebaseMessaging",Debug.moduleToString(ir.hiserv.firebasemessaging.class),"laundry",Debug.moduleToString(ir.hiserv.laundry.class),"Main",Debug.moduleToString(ir.hiserv.main.class),"main_",Debug.moduleToString(ir.hiserv.main_.class),"notify",Debug.moduleToString(ir.hiserv.notify.class),"register_login",Debug.moduleToString(ir.hiserv.register_login.class),"Starter",Debug.moduleToString(ir.hiserv.starter.class),"tf",main_codes._tf};
}
}