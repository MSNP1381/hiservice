package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_notify_lay{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("back_iv").vw.setWidth((int)((views.get("back_iv").vw.getHeight())));
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("logo_iv").vw.setWidth((int)(512d/171d*(views.get("logo_iv").vw.getHeight())));
views.get("logo_iv").vw.setLeft((int)((50d / 100 * width) - (views.get("logo_iv").vw.getWidth() / 2)));

}
}