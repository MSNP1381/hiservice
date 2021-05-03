B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private item_width As Float=50%x
	Private right As Float=5%x
	Private top As Float=3%y
	Private div As Float=1%y
	Dim count As Int
	Dim tf As Typeface=Typeface.LoadFromAssets("IRANYekanMobileLight.ttf")
	
	Dim ulv As UltimateListView
	Dim body,core As Bitmap
	Dim holder As Label
		Dim s As SmartString
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(p As Panel,c As Int)
	
	count=c
	s.Initialize
	ulv.Initialize(0,0,0,"ulv")
	right=7%X
	p.AddView(ulv,0,0,100%x,p.Height)
	Dim a(6) As Int=Array As Int (50%x,50%x,50%x,50%x,50%x,50%x)
	
	ulv.AddRowLayout("lay1","ulv_RowLayoutCreator","ulv_RowContentFiller",50%x,2,a,5%x,Colors.Transparent,True)
	ulv.DividerHeight=0
	For i=0 To (count-1)/2
		ulv.AddItem("lay1",i)
	Next

	body=LoadBitmap(File.DirAssets,"body.png")
	core=LoadBitmap(File.DirAssets,"core.png")
End Sub
Sub ulv_RowLayoutCreator(LayoutName As String, CellPanel As Panel, CellIndex As Byte)
	
	CellPanel.LoadLayout("home_items_grid")
	
End Sub
Sub ulv_RowContentFiller(RowID As Long, LayoutName As String, CellPanel As Panel, CellIndex As Byte, Position As Int)
	
		Dim iv_body As ImageView=CellPanel.GetView(0)
		Dim iv_core As ImageView=CellPanel.GetView(01)
		Dim lbl As Label=CellPanel.GetView(02)
	
		iv_body.Bitmap=body
		iv_core.Bitmap=core
		lbl.Typeface=tf
		lbl.Text="تعمیرات لوازم خانگی"

End Sub



Sub view_holder_Click
	Dim p As Panel=Sender
	Dim iv As ImageView=p.GetView(1)
	Dim a As Animation
	a.InitializeScaleCenter("ani",1,01,1.1,1.1,iv)
	a.RepeatMode = a.REPEAT_REVERSE
	a.RepeatCount=1
	a.Duration=250
	a.Start(iv)
	Sleep(200)
	StartActivity(laundry)
End Sub

Sub volley_OnError (Error As String)
	
End Sub
Sub volley_OnStringResponse (response As String)
	Log("rec1")
	
End Sub



Sub iv_body_Click
	Dim iv As View=Sender

	Dim a As Animation
	a.InitializeScaleCenter("ani",1,01,1.1,1.1,iv)
	a.RepeatMode = a.REPEAT_REVERSE
	a.RepeatCount=1
	a.Duration=250
	a.Start(iv)
	Sleep(200)
	StartActivity(laundry)
End Sub