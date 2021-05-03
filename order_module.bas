B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Dim tf As Typeface=Typeface.LoadFromAssets("IRANYekanMobileLight.ttf")
	Dim ulv As UltimateListView
	Dim ulv_pan As UltimateLVPanel
	Dim stat_land=1,state_por=2,state As Int 
	Dim widths_land(100),widths_por(100)As Int
	Dim ms As MSCardView
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(content As Panel)
	ulv.Initialize(0,0,0,"ulv")

	content.AddView(ulv,1%x,0,98%x,content.Height)
	For i=0 To 10
		widths_por(i)=32%x
	Next
	If 100%x>100%y Then
		state=stat_land
		ulv.AddRowLayout("lay1","ulv_RowLayoutCreator","ulv_RowContentFiller",1.2*widths_land(0),3,widths_land,4/3%x,Colors.White,False)
		
	Else
		state=state_por
		ulv.AddRowLayout("lay1","ulv_RowLayoutCreator","ulv_RowContentFiller",1.2*widths_por(0),2,widths_por,4%x,Colors.White,False)
	End If

	ulv.AddLayout("lay header","ulv_LayoutCreator","ulv_ContentFiller",1.6*widths_por(0),False)
	ulv.AddItem("lay header",0)
	For i= 01 To 11
ulv.AddItem("lay1",i)
	Next
	ulv.FadingEdges(False)
	ulv.SetStyle(ulv.STYLE_HOLO_LIGHT)
ulv.SetScrollbarStyle(ulv.SCROLLBAR_INVISIBLE)

End Sub 

Sub ulv_ContentFiller(ItemID As Long, LayoutName As String, LayoutPanel As Panel, Position As Int)
	Dim iv As ImageView=LayoutPanel.GetView(0)
	Dim et As EditText=LayoutPanel.GetView(01)
	iv.Bitmap=LoadBitmap(File.DirAssets,"pager1.jpg")
'	et.Background=main_.search_box
et.Hint="جستوجو کنید ..."
et.Gravity=Gravity.RIGHT
	et.Typeface=tf
End Sub

Sub ulv_LayoutCreator(LayoutName As String, LayoutPanel As Panel)
	LayoutPanel.LoadLayout("orders_list_inside_num1")
	Dim et As EditText=LayoutPanel.GetView(01)
	LayoutPanel.Height=et.Top+et.Height+5dip
	End Sub

Sub ulv_RowLayoutCreator(LayoutName As String, CellPanel As Panel, CellIndex As Byte)
'	Dim q As MSCardView=
'	q.Panel.LoadLayout("orders_list_inside_num1")
'	ulv.SetStyle(ulv.STYLE_HOLO_LIGHT_DIV2)

'	ulv.SetStyle(ulv.STYLE_HOLO_LIGHT_DIV2)
	ms.Initialize("ms_card")
	ms.Tag=CellIndex
	CellPanel.AddView(ms,0,0,CellPanel.Width,CellPanel.Height)
	ms.Panel.Height=ms.Height-ms.Radius-ms.MaxElevation
	ms.Panel.Width=ms.Width
End Sub

Sub ulv_RowContentFiller(RowID As Long, LayoutName As String, CellPanel As Panel, CellIndex As Byte, Position As Int)
	'#100
'	97/5/14	15:40
'	10.000 تومان
	Dim q As MSCardView=CellPanel.GetView(0)
	q.Panel.LoadLayout("orders_inside")
	Dim p As Panel=q.Panel
	Dim l1 As Label=p.GetView(0)
	Dim l2 As Label=p.GetView(01)
	Dim l3 As Label=p.GetView(02)
	l1.Typeface=tf
	l2.Typeface=tf
	l3.Typeface=tf
	l1.Text="#100"
	l2.Text="97/5/14	15:40"
	l3.Text="10.000 تومان"
	
	
	Log(GetType(CellPanel.GetView(0)))
End Sub