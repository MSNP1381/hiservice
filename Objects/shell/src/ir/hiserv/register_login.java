
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

public class register_login implements IRemote{
	public static register_login mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public register_login() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("register_login"), "ir.hiserv.register_login");
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
		pcBA = new PCBA(this, register_login.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _s = null;
public static RemoteObject _person = RemoteObject.declareNull("Object");
public static RemoteObject _lock = RemoteObject.declareNull("Object");
public static RemoteObject _x = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static RemoteObject _ahv = RemoteObject.declareNull("de.amberhome.viewpager.AHViewPager");
public static RemoteObject _ahc = RemoteObject.declareNull("de.amberhome.viewpager.AHPageContainer");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _action_panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _logo_iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _p = null;
public static RemoteObject _create_accout_btn = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACButtonWrapper");
public static RemoteObject _enter_btn = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACButtonWrapper");
public static RemoteObject _phone_register = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACButtonWrapper");
public static RemoteObject _progress_iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _phone_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _phone_iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _ph_test = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _pass_iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _user_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _user_iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _pic = RemoteObject.declareNull("uk.co.martinpearman.b4a.squareup.picasso.Picasso");
public static RemoteObject _phone_incorrect = RemoteObject.createImmutable(false);
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _pass_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static ir.hiserv.main _main = null;
public static ir.hiserv.laundry _laundry = null;
public static ir.hiserv.firebasemessaging _firebasemessaging = null;
public static ir.hiserv.main_ _main_ = null;
public static ir.hiserv.main_codes _main_codes = null;
public static ir.hiserv.starter _starter = null;
public static ir.hiserv.notify _notify = null;
  public Object[] GetGlobals() {
		return new Object[] {"action_panel",register_login.mostCurrent._action_panel,"Activity",register_login.mostCurrent._activity,"ahc",register_login.mostCurrent._ahc,"ahv",register_login.mostCurrent._ahv,"create_accout_btn",register_login.mostCurrent._create_accout_btn,"enter_btn",register_login.mostCurrent._enter_btn,"FirebaseMessaging",Debug.moduleToString(ir.hiserv.firebasemessaging.class),"ime",register_login.mostCurrent._ime,"laundry",Debug.moduleToString(ir.hiserv.laundry.class),"lock",register_login.mostCurrent._lock,"logo_iv",register_login.mostCurrent._logo_iv,"Main",Debug.moduleToString(ir.hiserv.main.class),"main_",Debug.moduleToString(ir.hiserv.main_.class),"main_codes",Debug.moduleToString(ir.hiserv.main_codes.class),"notify",Debug.moduleToString(ir.hiserv.notify.class),"p",register_login.mostCurrent._p,"Panel1",register_login.mostCurrent._panel1,"Panel2",register_login.mostCurrent._panel2,"pass_et",register_login.mostCurrent._pass_et,"pass_iv",register_login.mostCurrent._pass_iv,"person",register_login.mostCurrent._person,"ph_test",register_login.mostCurrent._ph_test,"phone_et",register_login.mostCurrent._phone_et,"phone_incorrect",register_login._phone_incorrect,"phone_iv",register_login.mostCurrent._phone_iv,"phone_register",register_login.mostCurrent._phone_register,"pic",register_login.mostCurrent._pic,"progress_iv",register_login.mostCurrent._progress_iv,"s",register_login.mostCurrent._s,"Starter",Debug.moduleToString(ir.hiserv.starter.class),"user_et",register_login.mostCurrent._user_et,"user_iv",register_login.mostCurrent._user_iv,"x",register_login.mostCurrent._x};
}
}