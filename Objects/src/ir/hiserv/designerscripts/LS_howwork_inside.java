package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_howwork_inside{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imageview1").vw.setTop((int)((15d / 100 * height)));
views.get("imageview1").vw.setHeight((int)((85d / 100 * height) - ((15d / 100 * height))));
views.get("imageview1").vw.setWidth((int)((views.get("imageview1").vw.getHeight())*73d/119d));
views.get("imageview1").vw.setLeft((int)((95d / 100 * width) - (views.get("imageview1").vw.getWidth())));
views.get("label1").vw.setLeft((int)((8d / 100 * width)));
views.get("label1").vw.setWidth((int)((views.get("imageview1").vw.getLeft())-(5d / 100 * width) - ((8d / 100 * width))));
views.get("label2").vw.setWidth((int)((views.get("label1").vw.getWidth())));
views.get("label2").vw.setLeft((int)((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth()) - (views.get("label2").vw.getWidth())));
views.get("label1").vw.setTop((int)((views.get("imageview1").vw.getTop())));
views.get("label1").vw.setHeight((int)((48d / 100 * height) - ((views.get("imageview1").vw.getTop()))));
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(0d / 100 * height)));
views.get("label2").vw.setHeight((int)((34d / 100 * height)));
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("label1").vw).setTextSize((float)((views.get("label1").vw.getHeight())/4d));
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("label2").vw).setTextSize((float)((views.get("label2").vw.getHeight())/7d));

}
}