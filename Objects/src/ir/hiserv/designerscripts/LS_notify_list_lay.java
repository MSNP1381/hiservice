package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_notify_list_lay{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("acbutton1").vw.setHeight((int)(Math.max((6d / 100 * width),(40d * scale))));
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("label1").vw.setHeight((int)((8d / 100 * width)));
views.get("imageview1").vw.setHeight((int)((40d / 100 * width)));
views.get("imageview1").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(2d / 100 * height)));
views.get("label2").vw.setTop((int)((views.get("imageview1").vw.getTop() + views.get("imageview1").vw.getHeight())));
views.get("label2").vw.setHeight((int)((views.get("acbutton1").vw.getTop())-(2d / 100 * height) - ((views.get("imageview1").vw.getTop() + views.get("imageview1").vw.getHeight()))));
views.get("imageview1").vw.setLeft((int)((4d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((100d / 100 * width)-(4d / 100 * width) - ((4d / 100 * width))));

}
}