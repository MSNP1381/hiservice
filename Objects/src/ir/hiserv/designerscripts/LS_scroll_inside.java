package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_scroll_inside{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel1").vw.setHeight((int)((views.get("panel1").vw.getWidth())*4d/8d));
if (((100d / 100 * width)<(100d / 100 * height))) { 
;
views.get("howdoesitwork_pnl").vw.setHeight((int)((27d / 100 * width)));
;}else{ 
;
views.get("howdoesitwork_pnl").vw.setHeight((int)((27d / 100 * height)));
;};
views.get("howdoesitwork_pnl").vw.setLeft((int)((1.5d / 100 * width)));
views.get("howdoesitwork_pnl").vw.setWidth((int)((98.5d / 100 * width) - ((1.5d / 100 * width))));
views.get("howdoesitwork_pnl").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(1.5d / 100 * height)));
views.get("items_card_view").vw.setLeft((int)((1.5d / 100 * width)));
views.get("items_card_view").vw.setWidth((int)((98.5d / 100 * width) - ((1.5d / 100 * width))));
views.get("items_card_view").vw.setTop((int)((views.get("howdoesitwork_pnl").vw.getTop() + views.get("howdoesitwork_pnl").vw.getHeight())+(1.2d / 100 * height)));
views.get("items_card_view").vw.setHeight((int)((43d / 100 * width)));

}
}