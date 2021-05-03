package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_orders_inside{

public static void LS_100x114_1(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("order_num_lbl").vw.setHeight((int)((100d / 100 * width)));
views.get("date_lbl").vw.setTop((int)((views.get("order_num_lbl").vw.getTop() + views.get("order_num_lbl").vw.getHeight())));
views.get("date_lbl").vw.setHeight((int)((10d / 100 * width)));
views.get("imageview1").vw.setTop((int)((views.get("price_lbl").vw.getTop())));
views.get("imageview1").vw.setTop((int)((views.get("date_lbl").vw.getTop() + views.get("date_lbl").vw.getHeight())));
views.get("imageview1").vw.setHeight((int)((100d / 100 * height) - ((views.get("date_lbl").vw.getTop() + views.get("date_lbl").vw.getHeight()))));
views.get("imageview1").vw.setWidth((int)((25d / 100 * width)));
views.get("imageview1").vw.setLeft((int)(0d));
views.get("price_lbl").vw.setTop((int)((views.get("date_lbl").vw.getTop() + views.get("date_lbl").vw.getHeight())));
views.get("price_lbl").vw.setTop((int)((views.get("imageview1").vw.getTop())));
views.get("price_lbl").vw.setHeight((int)((100d / 100 * height) - ((views.get("imageview1").vw.getTop()))));
views.get("price_lbl").vw.setLeft((int)((views.get("imageview1").vw.getLeft() + views.get("imageview1").vw.getWidth())));
views.get("price_lbl").vw.setWidth((int)((100d / 100 * width) - ((views.get("imageview1").vw.getLeft() + views.get("imageview1").vw.getWidth()))));

}
public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("order_num_lbl").vw.setHeight((int)((80d / 100 * width)));
views.get("date_lbl").vw.setTop((int)((views.get("order_num_lbl").vw.getTop() + views.get("order_num_lbl").vw.getHeight())));
views.get("date_lbl").vw.setHeight((int)((15d / 100 * width)));
views.get("imageview1").vw.setTop((int)((views.get("price_lbl").vw.getTop())));
views.get("imageview1").vw.setTop((int)((views.get("date_lbl").vw.getTop() + views.get("date_lbl").vw.getHeight())));
views.get("imageview1").vw.setHeight((int)((100d / 100 * height) - ((views.get("date_lbl").vw.getTop() + views.get("date_lbl").vw.getHeight()))));
views.get("imageview1").vw.setWidth((int)((views.get("imageview1").vw.getHeight())));
views.get("imageview1").vw.setLeft((int)(0d));
views.get("price_lbl").vw.setTop((int)((views.get("date_lbl").vw.getTop() + views.get("date_lbl").vw.getHeight())));
views.get("price_lbl").vw.setTop((int)((views.get("imageview1").vw.getTop())));
views.get("price_lbl").vw.setHeight((int)((100d / 100 * height) - ((views.get("imageview1").vw.getTop()))));
views.get("price_lbl").vw.setLeft((int)((views.get("imageview1").vw.getLeft() + views.get("imageview1").vw.getWidth())));
views.get("price_lbl").vw.setWidth((int)((100d / 100 * width) - ((views.get("imageview1").vw.getLeft() + views.get("imageview1").vw.getWidth()))));

}
}