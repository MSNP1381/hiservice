package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_home_items_grid{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("iv_core").vw.setLeft((int)((10.9d / 100 * width)));
views.get("iv_core").vw.setWidth((int)((83.2d / 100 * width) - ((10.9d / 100 * width))));
views.get("iv_core").vw.setTop((int)((6.1d / 100 * width)));
views.get("iv_core").vw.setHeight((int)((71.5d / 100 * height) - ((6.1d / 100 * width))));
views.get("title").vw.setLeft((int)((10.9d / 100 * width)));
views.get("title").vw.setWidth((int)((88.2d / 100 * width) - ((10.9d / 100 * width))));
views.get("title").vw.setTop((int)((72.9d / 100 * height)));
views.get("title").vw.setHeight((int)((85.5d / 100 * height) - ((72.9d / 100 * height))));

}
}