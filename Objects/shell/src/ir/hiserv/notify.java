
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

public class notify implements IRemote{
	public static notify mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public notify() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("notify"), "ir.hiserv.notify");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, notify.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ms = RemoteObject.declareNull("com.maximussoft.mscardview.CardViewWrapper");
public static RemoteObject _v = RemoteObject.declareNull("amin.shahedi.ariagp.AriaVolley");
public static RemoteObject _ultimatelistview1 = RemoteObject.declareNull("flm.b4a.ultimatelistview.UltimateListViewWrapper");
public static RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
public static RemoteObject _picasso = RemoteObject.declareNull("uk.co.martinpearman.b4a.squareup.picasso.Picasso");
public static RemoteObject _maps = null;
public static ir.hiserv.main _main = null;
public static ir.hiserv.laundry _laundry = null;
public static ir.hiserv.register_login _register_login = null;
public static ir.hiserv.firebasemessaging _firebasemessaging = null;
public static ir.hiserv.main_ _main_ = null;
public static ir.hiserv.main_codes _main_codes = null;
public static ir.hiserv.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",notify.mostCurrent._activity,"FirebaseMessaging",Debug.moduleToString(ir.hiserv.firebasemessaging.class),"laundry",Debug.moduleToString(ir.hiserv.laundry.class),"Main",Debug.moduleToString(ir.hiserv.main.class),"main_",Debug.moduleToString(ir.hiserv.main_.class),"main_codes",Debug.moduleToString(ir.hiserv.main_codes.class),"maps",notify.mostCurrent._maps,"ms",notify.mostCurrent._ms,"parser",notify.mostCurrent._parser,"picasso",notify.mostCurrent._picasso,"register_login",Debug.moduleToString(ir.hiserv.register_login.class),"Starter",Debug.moduleToString(ir.hiserv.starter.class),"UltimateListView1",notify.mostCurrent._ultimatelistview1,"v",notify.mostCurrent._v};
}
}