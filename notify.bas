B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

Dim ms As MSCardView
Dim v As AriaVolley
	Private UltimateListView1 As UltimateListView
	Dim parser As JSONParser
	Dim picasso As Picasso
	Dim maps(10) As Map
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
v.Initialize("v")
picasso.Initialize
	v.AddQueue( v.CreateStringRequest	("http://hiserv.ir/wp-content/msnp/request.php",v.GET))
	v.Start

	Activity.LoadLayout("notify_lay")
	UltimateListView1.AddLayout("lay1","UltimateListView1_LayoutCreator","UltimateListView1_ContentFiller",82%x,True)
End Sub
Sub   v_OnError (Error As String)
	LogColor(Error,Colors.Red)
End Sub
Sub v_OnStringResponse (response As String)
	
	Dim parser As JSONParser
	Dim i As Int=0
	parser.Initialize(response)
	Dim root As List = parser.NextArray
	For Each colroot As Map In root
		maps(i).Initialize
		maps(i).Put("image_url",colroot.Get("image_url"))
		maps(i).Put("ID",colroot.Get("ID"))
		maps(i).Put("news_url",colroot.Get("news_url"))
		maps(i).Put("title", colroot.Get("title"))
		maps(i).Put("body",colroot.Get("body"))		
		UltimateListView1.AddItem("lay1",i)
		i=i+1
	Next

'	LogColor($"array: ${parser.NextArray}"$,Colors.Blue)

End Sub
'Sub v_OnJsonResponse (JSON As JSONParser)
'	LogColor($"array: ${JSON.NextObject}"$,Colors.Blue)
'	parser=JSON
'	
'	For i=0 To  parser.NextObject.Size-1
'	UltimateListView1.AddItem("lay1",i)
'	Next
'End Sub
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub



Sub UltimateListView1_LayoutCreator(LayoutName As String, LayoutPanel As Panel)
	ms.Initialize("ms_card")
	LayoutPanel.AddView(ms,2%x,0,96%x,LayoutPanel.Height)
	ms.Elevation=4dip
	ms.MaxElevation=4dip
	ms.Radius=5dip
	ms.Panel.Height=ms.Height
	ms.Panel.Width=ms.Width-(2*(ms.Radius+ms.Elevation+2dip))
	Log(ms.Radius+ms.Elevation)
	ms.Panel.LoadLayout("notify_list_lay")
	ms.Panel.Color=0x00FF0000
	
End Sub

Sub UltimateListView1_ContentFiller(ItemID As Long, LayoutName As String, LayoutPanel As Panel, Position As Int)
	
	


	Dim colroot As Map=maps(ItemID)
		Dim image_url As String = colroot.Get("image_url")

		Dim title As String = colroot.Get("title")
		Dim body As String = colroot.Get("body")
	
	Dim m As MSCardView=LayoutPanel.GetView(0)
	Dim p As Panel=m.Panel
	Dim lbl1 As Label=p.GetView(0)
	Dim iv1 As ImageView=p.GetView(01)
	Dim lbl2 As Label=p.GetView(02)
	Dim btn1 As ACButton=p.GetView(03)
	lbl1.Text=title
	lbl2.Text=body
	btn1.Tag=ItemID
	picasso.LoadUrl(image_url).PlaceholderDrawable(main_.place_holder).IntoImageView(iv1)
	
	
	
End Sub

Sub back_iv_Click
	Activity.Finish
End Sub

Sub ACButton1_Click
	Dim ac_btn As ACButton
	ac_btn=Sender

	Dim item As Map = maps(ac_btn.Tag)
	Dim news_url As String = item.Get("news_url")
	ToastMessageShow(news_url,False)
	
	 
End Sub