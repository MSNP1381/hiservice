package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_phone_numer_loign_lay{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("phone_et").vw.setTop((int)((45d / 100 * height) - (views.get("phone_et").vw.getHeight() / 2)));
views.get("phone_iv").vw.setHeight((int)((views.get("phone_et").vw.getHeight())/1.7d));
views.get("phone_iv").vw.setWidth((int)((views.get("phone_iv").vw.getHeight())));
views.get("phone_et").vw.setWidth((int)((53d / 100 * width)));
views.get("phone_et").vw.setLeft((int)((50d / 100 * width)-(views.get("phone_iv").vw.getWidth())/2d - (views.get("phone_et").vw.getWidth() / 2)));
views.get("phone_iv").vw.setLeft((int)((views.get("phone_et").vw.getLeft() + views.get("phone_et").vw.getWidth())));
views.get("phone_iv").vw.setTop((int)((views.get("phone_et").vw.getTop() + views.get("phone_et").vw.getHeight()/2) - (views.get("phone_iv").vw.getHeight() / 2)));
views.get("panel1").vw.setWidth((int)((views.get("phone_iv").vw.getLeft() + views.get("phone_iv").vw.getWidth())-(views.get("phone_et").vw.getLeft())+(17d * scale)));
views.get("panel1").vw.setLeft((int)((50d / 100 * width) - (views.get("panel1").vw.getWidth() / 2)));
views.get("panel1").vw.setTop((int)((views.get("phone_et").vw.getTop() + views.get("phone_et").vw.getHeight()/2) - (views.get("panel1").vw.getHeight() / 2)));
views.get("phone_register").vw.setLeft((int)((50d / 100 * width) - (views.get("phone_register").vw.getWidth() / 2)));
views.get("phone_register").vw.setTop((int)((65.0d / 100 * height) - (views.get("phone_register").vw.getHeight() / 2)));
views.get("panel2").vw.setLeft((int)((views.get("panel1").vw.getLeft())-(7d / 100 * width)));
views.get("panel2").vw.setWidth((int)((views.get("panel1").vw.getLeft() + views.get("panel1").vw.getWidth())+(7d / 100 * width) - ((views.get("panel1").vw.getLeft())-(7d / 100 * width))));
views.get("panel2").vw.setHeight((int)(2d*((views.get("phone_register").vw.getTop() + views.get("phone_register").vw.getHeight())-(views.get("phone_et").vw.getTop() + views.get("phone_et").vw.getHeight()/2))));
views.get("panel2").vw.setTop((int)((50d / 100 * height) - (views.get("panel2").vw.getHeight() / 2)));
anywheresoftware.b4a.keywords.LayoutBuilder.scaleView(views.get("action_panel"));
views.get("logo_iv").vw.setWidth((int)(512d/171d*(views.get("logo_iv").vw.getHeight())));
views.get("logo_iv").vw.setTop((int)((views.get("action_panel").vw.getTop() + views.get("action_panel").vw.getHeight()/2) - (views.get("logo_iv").vw.getHeight() / 2)));
views.get("logo_iv").vw.setLeft((int)((views.get("action_panel").vw.getLeft() + views.get("action_panel").vw.getWidth()/2) - (views.get("logo_iv").vw.getWidth() / 2)));

}
}