package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_item_cv_inside{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("laundry_pnl").vw.setTop((int)((2d / 100 * width)));
views.get("services_panel").vw.setTop((int)((2d / 100 * width)));
views.get("laundry_pnl").vw.setHeight((int)((37d / 100 * width)));
views.get("services_panel").vw.setHeight((int)((views.get("laundry_pnl").vw.getHeight())));
views.get("laundry_pnl").vw.setWidth((int)((32.5d / 100 * width)));
views.get("services_panel").vw.setWidth((int)((32.5d / 100 * width)));
views.get("laundry_pnl").vw.setLeft((int)((50d / 100 * width)+(1.25d / 100 * width)/2d));
views.get("services_panel").vw.setLeft((int)((50d / 100 * width)-(1.25d / 100 * width)/2d - (views.get("services_panel").vw.getWidth())));

}
}