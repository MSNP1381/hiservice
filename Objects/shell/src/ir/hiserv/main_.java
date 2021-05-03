
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

public class main_ implements IRemote{
	public static main_ mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main_() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main_"), "ir.hiserv.main_");
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
		pcBA = new PCBA(this, main_.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tf_sans = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
public static RemoteObject _color_p = RemoteObject.createImmutable(0);
public static RemoteObject _score_ic = RemoteObject.declareNull("Object");
public static RemoteObject _paid_ic = RemoteObject.declareNull("Object");
public static RemoteObject _orders_ic = RemoteObject.declareNull("Object");
public static RemoteObject _notify_ic = RemoteObject.declareNull("Object");
public static RemoteObject _search_box = RemoteObject.declareNull("Object");
public static RemoteObject _account = RemoteObject.declareNull("Object");
public static RemoteObject _shopping_basket = RemoteObject.declareNull("Object");
public static RemoteObject _home1 = RemoteObject.declareNull("Object");
public static RemoteObject _menu = RemoteObject.declareNull("Object");
public static RemoteObject _notif_recived = RemoteObject.declareNull("Object");
public static RemoteObject _guide_frame = RemoteObject.declareNull("Object");
public static RemoteObject _place_holder = RemoteObject.declareNull("Object");
public static RemoteObject _color_s = RemoteObject.createImmutable(0);
public static RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _dsbottomnavigationview1 = RemoteObject.declareNull("de.amberhome.objects.BottomNavigationViewWrapper");
public static RemoteObject _items_card_view = RemoteObject.declareNull("com.maximussoft.mscardview.CardViewWrapper");
public static RemoteObject _laundry_pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _services_panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _x = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
public static RemoteObject _action_panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _menu_iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _bottom_nav_pos = RemoteObject.createImmutable(0);
public static RemoteObject _notify_iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static ir.hiserv.main _main = null;
public static ir.hiserv.laundry _laundry = null;
public static ir.hiserv.register_login _register_login = null;
public static ir.hiserv.firebasemessaging _firebasemessaging = null;
public static ir.hiserv.main_codes _main_codes = null;
public static ir.hiserv.starter _starter = null;
public static ir.hiserv.notify _notify = null;
  public Object[] GetGlobals() {
		return new Object[] {"ac",main_.mostCurrent._ac,"account",main_._account,"action_panel",main_.mostCurrent._action_panel,"Activity",main_.mostCurrent._activity,"bottom_nav_pos",main_._bottom_nav_pos,"color_p",main_._color_p,"color_s",main_._color_s,"DSBottomNavigationView1",main_.mostCurrent._dsbottomnavigationview1,"FirebaseMessaging",Debug.moduleToString(ir.hiserv.firebasemessaging.class),"guide_frame",main_._guide_frame,"home1",main_._home1,"items_card_view",main_.mostCurrent._items_card_view,"laundry",Debug.moduleToString(ir.hiserv.laundry.class),"laundry_pnl",main_.mostCurrent._laundry_pnl,"Main",Debug.moduleToString(ir.hiserv.main.class),"main_codes",Debug.moduleToString(ir.hiserv.main_codes.class),"menu",main_._menu,"menu_iv",main_.mostCurrent._menu_iv,"notif_recived",main_._notif_recived,"notify",Debug.moduleToString(ir.hiserv.notify.class),"notify_ic",main_._notify_ic,"notify_iv",main_.mostCurrent._notify_iv,"orders_ic",main_._orders_ic,"p",main_.mostCurrent._p,"paid_ic",main_._paid_ic,"Panel1",main_.mostCurrent._panel1,"place_holder",main_._place_holder,"register_login",Debug.moduleToString(ir.hiserv.register_login.class),"score_ic",main_._score_ic,"ScrollView1",main_.mostCurrent._scrollview1,"search_box",main_._search_box,"services_panel",main_.mostCurrent._services_panel,"shopping_basket",main_._shopping_basket,"Starter",Debug.moduleToString(ir.hiserv.starter.class),"tf_sans",main_._tf_sans,"x",main_.mostCurrent._x};
}
}