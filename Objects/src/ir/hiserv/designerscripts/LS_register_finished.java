package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_register_finished{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imageview1").vw.setHeight((int)((15.5d / 100 * height)));
views.get("imageview1").vw.setWidth((int)((views.get("imageview1").vw.getHeight())*(390d/120d)));
views.get("imageview1").vw.setTop((int)((40d / 100 * height) - (views.get("imageview1").vw.getHeight() / 2)));
views.get("imageview1").vw.setLeft((int)((50d / 100 * width) - (views.get("imageview1").vw.getWidth() / 2)));
views.get("progress_iv").vw.setTop((int)((90d / 100 * height) - (views.get("progress_iv").vw.getHeight())));
views.get("progress_iv").vw.setLeft((int)((20d / 100 * width)));
views.get("progress_iv").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
views.get("progress_iv").vw.setHeight((int)(Math.min((18d * scale),(views.get("progress_iv").vw.getWidth())/17d)));

}
}