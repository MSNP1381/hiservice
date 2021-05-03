package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_register_login_lay{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("user_et").vw.setTop((int)((45d / 100 * height) - (views.get("user_et").vw.getHeight() / 2)));
views.get("pass_et").vw.setTop((int)((45d / 100 * height)+(views.get("user_et").vw.getHeight())+(3d / 100 * height) - (views.get("pass_et").vw.getHeight() / 2)));
views.get("user_iv").vw.setHeight((int)((views.get("user_et").vw.getHeight())/1.7d));
views.get("pass_iv").vw.setHeight((int)((views.get("pass_et").vw.getHeight())/1.7d));
views.get("user_iv").vw.setWidth((int)((views.get("user_iv").vw.getHeight())));
views.get("user_et").vw.setWidth((int)((53d / 100 * width)));
views.get("user_et").vw.setLeft((int)((50d / 100 * width)-(views.get("user_iv").vw.getWidth())/2d - (views.get("user_et").vw.getWidth() / 2)));
views.get("pass_iv").vw.setWidth((int)((views.get("pass_iv").vw.getHeight())));
views.get("pass_et").vw.setWidth((int)((53d / 100 * width)));
views.get("pass_et").vw.setLeft((int)((50d / 100 * width)-(views.get("pass_iv").vw.getWidth())/2d - (views.get("pass_et").vw.getWidth() / 2)));
views.get("user_iv").vw.setLeft((int)((views.get("user_et").vw.getLeft() + views.get("user_et").vw.getWidth())));
views.get("user_iv").vw.setTop((int)((views.get("user_et").vw.getTop() + views.get("user_et").vw.getHeight()/2) - (views.get("user_iv").vw.getHeight() / 2)));
views.get("pass_iv").vw.setLeft((int)((views.get("pass_et").vw.getLeft() + views.get("pass_et").vw.getWidth())));
views.get("pass_iv").vw.setTop((int)((views.get("pass_et").vw.getTop() + views.get("pass_et").vw.getHeight()/2) - (views.get("pass_iv").vw.getHeight() / 2)));
views.get("panel1").vw.setWidth((int)((views.get("user_iv").vw.getLeft() + views.get("user_iv").vw.getWidth())-(views.get("user_et").vw.getLeft())+(17d * scale)));
views.get("panel1").vw.setLeft((int)((50d / 100 * width) - (views.get("panel1").vw.getWidth() / 2)));
views.get("panel1").vw.setTop((int)((views.get("user_et").vw.getTop() + views.get("user_et").vw.getHeight()/2) - (views.get("panel1").vw.getHeight() / 2)));
views.get("enter_btn").vw.setTop((int)((views.get("pass_et").vw.getTop() + views.get("pass_et").vw.getHeight())+(6d / 100 * height)));
views.get("panel2").vw.setLeft((int)((views.get("panel1").vw.getLeft())-(5d / 100 * width)));
views.get("panel2").vw.setWidth((int)((views.get("panel1").vw.getLeft() + views.get("panel1").vw.getWidth())+(5d / 100 * width) - ((views.get("panel1").vw.getLeft())-(5d / 100 * width))));
//BA.debugLineNum = 40;BA.debugLine="Panel2.Height=2*(enter_btn.Bottom-user_et.VerticalCenter)"[register_login_lay/General script]
views.get("panel2").vw.setHeight((int)(2d*((views.get("enter_btn").vw.getTop() + views.get("enter_btn").vw.getHeight())-(views.get("user_et").vw.getTop() + views.get("user_et").vw.getHeight()/2))));
//BA.debugLineNum = 41;BA.debugLine="Panel2.VerticalCenter=50%Y"[register_login_lay/General script]
views.get("panel2").vw.setTop((int)((50d / 100 * height) - (views.get("panel2").vw.getHeight() / 2)));
//BA.debugLineNum = 43;BA.debugLine="AutoScale(action_panel)"[register_login_lay/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleView(views.get("action_panel"));
//BA.debugLineNum = 46;BA.debugLine="logo_iv.Width= 512/171*logo_iv.Height"[register_login_lay/General script]
views.get("logo_iv").vw.setWidth((int)(512d/171d*(views.get("logo_iv").vw.getHeight())));
//BA.debugLineNum = 47;BA.debugLine="logo_iv.VerticalCenter=action_panel.VerticalCenter"[register_login_lay/General script]
views.get("logo_iv").vw.setTop((int)((views.get("action_panel").vw.getTop() + views.get("action_panel").vw.getHeight()/2) - (views.get("logo_iv").vw.getHeight() / 2)));
//BA.debugLineNum = 48;BA.debugLine="logo_iv.HorizontalCenter=action_panel.HorizontalCenter"[register_login_lay/General script]
views.get("logo_iv").vw.setLeft((int)((views.get("action_panel").vw.getLeft() + views.get("action_panel").vw.getWidth()/2) - (views.get("logo_iv").vw.getWidth() / 2)));
//BA.debugLineNum = 50;BA.debugLine="create_accout_btn.VerticalCenter=enter_btn.VerticalCenter"[register_login_lay/General script]
views.get("create_accout_btn").vw.setTop((int)((views.get("enter_btn").vw.getTop() + views.get("enter_btn").vw.getHeight()/2) - (views.get("create_accout_btn").vw.getHeight() / 2)));
//BA.debugLineNum = 53;BA.debugLine="enter_btn.Right=Panel2.Right-7%x"[register_login_lay/General script]
views.get("enter_btn").vw.setLeft((int)((views.get("panel2").vw.getLeft() + views.get("panel2").vw.getWidth())-(7d / 100 * width) - (views.get("enter_btn").vw.getWidth())));
//BA.debugLineNum = 54;BA.debugLine="create_accout_btn.Left=Panel2.Left+7%x"[register_login_lay/General script]
views.get("create_accout_btn").vw.setLeft((int)((views.get("panel2").vw.getLeft())+(7d / 100 * width)));

}
}