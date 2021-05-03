package ir.hiserv.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_account_header{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="ImageView1.Width=30%y"[account_header/General script]
views.get("imageview1").vw.setWidth((int)((30d / 100 * height)));
//BA.debugLineNum = 3;BA.debugLine="ImageView1.Height=ImageView1.Width"[account_header/General script]
views.get("imageview1").vw.setHeight((int)((views.get("imageview1").vw.getWidth())));
//BA.debugLineNum = 5;BA.debugLine="AutoScaleAll"[account_header/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 6;BA.debugLine="ImageView1.Top=15%y"[account_header/General script]
views.get("imageview1").vw.setTop((int)((15d / 100 * height)));
//BA.debugLineNum = 9;BA.debugLine="Label1.Bottom=ImageView1.VerticalCenter"[account_header/General script]
views.get("label1").vw.setTop((int)((views.get("imageview1").vw.getTop() + views.get("imageview1").vw.getHeight()/2) - (views.get("label1").vw.getHeight())));
//BA.debugLineNum = 10;BA.debugLine="Label2.Top=Label1.Bottom"[account_header/General script]
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())));
//BA.debugLineNum = 12;BA.debugLine="Label1.Right=ImageView1.Left-5%x"[account_header/General script]
views.get("label1").vw.setLeft((int)((views.get("imageview1").vw.getLeft())-(5d / 100 * width) - (views.get("label1").vw.getWidth())));
//BA.debugLineNum = 13;BA.debugLine="Label1.SetLeftAndRight(3%x,ImageView1.Left-2%x)"[account_header/General script]
views.get("label1").vw.setLeft((int)((3d / 100 * width)));
views.get("label1").vw.setWidth((int)((views.get("imageview1").vw.getLeft())-(2d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 14;BA.debugLine="Label2.SetLeftAndRight(Label1.Left,Label1.Right)"[account_header/General script]
views.get("label2").vw.setLeft((int)((views.get("label1").vw.getLeft())));
views.get("label2").vw.setWidth((int)((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth()) - ((views.get("label1").vw.getLeft()))));
//BA.debugLineNum = 16;BA.debugLine="pay_lbl.HorizontalCenter=50%x"[account_header/General script]
views.get("pay_lbl").vw.setLeft((int)((50d / 100 * width) - (views.get("pay_lbl").vw.getWidth() / 2)));
//BA.debugLineNum = 17;BA.debugLine="pay_lbl.Width=30%y"[account_header/General script]
views.get("pay_lbl").vw.setWidth((int)((30d / 100 * height)));
//BA.debugLineNum = 18;BA.debugLine="pay_lbl.Height=pay_lbl.Width"[account_header/General script]
views.get("pay_lbl").vw.setHeight((int)((views.get("pay_lbl").vw.getWidth())));
//BA.debugLineNum = 20;BA.debugLine="orders_lbl.Width=pay_lbl.Width"[account_header/General script]
views.get("orders_lbl").vw.setWidth((int)((views.get("pay_lbl").vw.getWidth())));
//BA.debugLineNum = 21;BA.debugLine="orders_lbl.Height=orders_lbl.Width"[account_header/General script]
views.get("orders_lbl").vw.setHeight((int)((views.get("orders_lbl").vw.getWidth())));
//BA.debugLineNum = 24;BA.debugLine="pay_lbl.Bottom=94%y"[account_header/General script]
views.get("pay_lbl").vw.setTop((int)((94d / 100 * height) - (views.get("pay_lbl").vw.getHeight())));
//BA.debugLineNum = 25;BA.debugLine="orders_lbl.Bottom=pay_lbl.Bottom"[account_header/General script]
views.get("orders_lbl").vw.setTop((int)((views.get("pay_lbl").vw.getTop() + views.get("pay_lbl").vw.getHeight()) - (views.get("orders_lbl").vw.getHeight())));
//BA.debugLineNum = 28;BA.debugLine="orders_lbl.Right=pay_lbl.Left-3%x"[account_header/General script]
views.get("orders_lbl").vw.setLeft((int)((views.get("pay_lbl").vw.getLeft())-(3d / 100 * width) - (views.get("orders_lbl").vw.getWidth())));
//BA.debugLineNum = 30;BA.debugLine="score_lbl.Height=pay_lbl.Height"[account_header/General script]
views.get("score_lbl").vw.setHeight((int)((views.get("pay_lbl").vw.getHeight())));
//BA.debugLineNum = 31;BA.debugLine="score_lbl.Width=score_lbl.Height"[account_header/General script]
views.get("score_lbl").vw.setWidth((int)((views.get("score_lbl").vw.getHeight())));
//BA.debugLineNum = 32;BA.debugLine="score_lbl.Bottom=pay_lbl.Bottom"[account_header/General script]
views.get("score_lbl").vw.setTop((int)((views.get("pay_lbl").vw.getTop() + views.get("pay_lbl").vw.getHeight()) - (views.get("score_lbl").vw.getHeight())));
//BA.debugLineNum = 33;BA.debugLine="score_lbl.Left=pay_lbl.Right+3%x"[account_header/General script]
views.get("score_lbl").vw.setLeft((int)((views.get("pay_lbl").vw.getLeft() + views.get("pay_lbl").vw.getWidth())+(3d / 100 * width)));

}
}