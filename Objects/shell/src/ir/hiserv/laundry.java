
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

public class laundry implements IRemote{
	public static laundry mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public laundry() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("laundry"), "ir.hiserv.laundry");
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
		pcBA = new PCBA(this, laundry.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tf_yekan_light = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
public static RemoteObject _tf_yekan_reg = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
public static RemoteObject _x = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static RemoteObject _ahviewpager1 = RemoteObject.declareNull("de.amberhome.viewpager.AHViewPager");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _main_map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _container = RemoteObject.declareNull("de.amberhome.viewpager.AHPageContainer");
public static RemoteObject _view_holder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
public static RemoteObject _stage_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static ir.hiserv.main _main = null;
public static ir.hiserv.register_login _register_login = null;
public static ir.hiserv.firebasemessaging _firebasemessaging = null;
public static ir.hiserv.main_ _main_ = null;
public static ir.hiserv.main_codes _main_codes = null;
public static ir.hiserv.starter _starter = null;
public static ir.hiserv.notify _notify = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",laundry.mostCurrent._activity,"AHViewPager1",laundry.mostCurrent._ahviewpager1,"container",laundry.mostCurrent._container,"cs",laundry.mostCurrent._cs,"FirebaseMessaging",Debug.moduleToString(ir.hiserv.firebasemessaging.class),"ImageView1",laundry.mostCurrent._imageview1,"Label1",laundry.mostCurrent._label1,"Label2",laundry.mostCurrent._label2,"Main",Debug.moduleToString(ir.hiserv.main.class),"main_",Debug.moduleToString(ir.hiserv.main_.class),"main_codes",Debug.moduleToString(ir.hiserv.main_codes.class),"main_map",laundry.mostCurrent._main_map,"notify",Debug.moduleToString(ir.hiserv.notify.class),"register_login",Debug.moduleToString(ir.hiserv.register_login.class),"stage_lbl",laundry.mostCurrent._stage_lbl,"Starter",Debug.moduleToString(ir.hiserv.starter.class),"tf_yekan_light",laundry._tf_yekan_light,"tf_yekan_reg",laundry._tf_yekan_reg,"view_holder",laundry.mostCurrent._view_holder,"x",laundry.mostCurrent._x};
}
}