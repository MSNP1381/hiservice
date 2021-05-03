B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
'	Dim ulv As UltimateListView

	

	Dim p As Panel
	
	Private ImageView1 As ImageView
	Private Label1 As Label
	Private Label2 As Label
	Private orders_lbl As Label
	Private pay_lbl As Label
	Private score_lbl As Label
Dim X As XmlLayoutBuilder
'	ic_account_orders
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sv As ScrollView)',ActionIV As ImageView,drawables As Map)
	p=sv.Panel
	sv.Color=Colors.White
	p.Height=sv.Height*.4
	p.LoadLayout("account_header")
	
	sv.Padding = Array As Int (0dip, 10dip, 0dip, 0dip)
	
	orders_lbl.Background=X.GetDrawable("ic_account_scores")
	pay_lbl.Background=x.GetDrawable("ic_account_paid")
	score_lbl.Background=X.GetDrawable("ic_account_orders")
	
'	orders_lbl.Background=drawables.Get("orders")
'	pay_lbl.Background=drawables.Get("paid")
'	score_lbl.Background=drawables.Get("score")
'	score_lbl.TextSize=5
	

'	orders_lbl.Text="4"

End Sub