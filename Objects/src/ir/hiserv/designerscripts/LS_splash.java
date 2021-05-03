package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_splash{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("background_iv").vw.setHeight((int)((100d / 100 * height)));
views.get("background_iv").vw.setWidth((int)((200d / 100 * height)));
views.get("background_iv").vw.setLeft((int)(0d));
views.get("hiserv_logo_iv").vw.setHeight((int)((50d / 100 * height)));
views.get("hiserv_logo_iv").vw.setWidth((int)(800d/1354d*(views.get("hiserv_logo_iv").vw.getHeight())));
views.get("hiserv_logo_iv").vw.setTop((int)((20d / 100 * height)));
views.get("hiserv_logo_iv").vw.setLeft((int)((50d / 100 * width) - (views.get("hiserv_logo_iv").vw.getWidth() / 2)));
views.get("materialcircleprogress1").vw.setHeight((int)(Math.max((50d * scale),(10d / 100 * height))));
views.get("materialcircleprogress1").vw.setWidth((int)((views.get("materialcircleprogress1").vw.getHeight())));
views.get("materialcircleprogress1").vw.setTop((int)((96d / 100 * height) - (views.get("materialcircleprogress1").vw.getHeight())));
views.get("materialcircleprogress1").vw.setLeft((int)((50d / 100 * width) - (views.get("materialcircleprogress1").vw.getWidth() / 2)));

}
}