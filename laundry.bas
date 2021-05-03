B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim tf_yekan_light As Typeface=Typeface.LoadFromAssets("IRANYekanMobileLight.ttf")
	Dim tf_yekan_reg As Typeface=Typeface.LoadFromAssets("IRANYekanMobileRegular.ttf")
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Dim x As XmlLayoutBuilder
	Private AHViewPager1 As AHViewPager
	Private Label1 As Label
	Private Label2 As Label
	Dim main_map As Map
	Dim container As AHPageContainer
	Dim view_holder As Panel
	Private ImageView1 As ImageView
	Dim cs As CSBuilder
	Private stage_lbl As Label
End Sub
Public Sub start(s As String)
	
	main_map.Initialize
	main_map.Put("count",4)
End Sub
Sub Activity_Create(FirstTime As Boolean)
	
	start("")
	cs.Initialize
	container.Initialize
	Dim close As Object=x.GetDrawable("ic_close_white_24dp")
	For i=0 To 5
		view_holder.Initialize("view_holder")
		view_holder.Tag=i
	container.AddPage(view_holder,i)
Next
Activity.LoadLayout("step_two_laundry")

AHViewPager1.PageContainer=container
ImageView1.Background=close




'DisableScroolbar(ScrollView1)
End Sub
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub AHViewPager1_PageCreated (Position As Int, Page As Object)
	
	
	
End Sub

Sub cs_Click (Tag As Object)
	Log($"You have clicked on word: ${Tag}"$)
End Sub
Sub set_stage(stage As Int)As Object
cs.Color(Colors.Black).Typeface(tf_yekan_reg).Size(20).Append("Click on underine word: ")
	cs.Clickable("cs", 1).Append("One").Pop.PopAll
	
	cs.EnableClickEvents(stage_lbl)
	stage_lbl.Text = cs

End Sub
'Sub dialog_builder(title As String, arrays()As String ) 
'	
'	Dim Builder As MaterialDialogBuilder
'
'	Builder.Initialize("Dialog")
'	Builder.Title("انتخاب کنید")
'	Builder.Items(arrays)
'	Builder.ItemsCallback
'	Builder.Typeface(tf_sans_reg,tf_sans_reg)
'	Builder.ItemsGravity(Builder.GRAVITY_End)
'	Builder.TitleGravity(Builder.GRAVITY_End)
'	Builder.ItemsColor(0xFF222222)
'If arrays( 0 )="اتو" Then
'	Builder.Tag("ds")
'	End If
'	Builder.Show
'End Sub
'#Region Dialog
'Sub Dialog_ItemSelected (Dialog As MaterialDialog, Position As Int, Text As String)
'	Log($"Item Selected: ${Position} : ${Text}"$)
'	Log(Dialog.Tag)
'	ToastMessageShow(Text, False)
'End Sub
'#end Region


Sub ime_HeightChanged (NewHeight As Int, OldHeight As Int)

End Sub

'Sub cloth_type_price_Click
'	'	بلوز و شلوار - 4000 تومان
''	سایر لباس ها بچه گانه – 4000 تومان
''	عروسک – 3000 تومان
'
'End Sub
'
'Sub material_Click
'	
'End Sub
'
'Sub service_Click
'	
'End Sub

'Sub l3_Click
'	dialog_builder( "نوع لباس" ,Array As String _
'	("سایر لباس ها بچه گانه – 4000 تومان", _
'	"عروسک – 3000 تومان", _
'	"بلوز و شلوار - 4000 تومان"))
'	
'End Sub
'
'Sub l2_Click
'	dialog_builder( "جنس لباس" ,Array As String("زمستانی","کیف و کفش","لوازم منزل","کالای خواب و حمام","بچه گانه","مردانه","زنانه"))
'	
'End Sub
'
'Sub l1_Click
'	dialog_builder( "خدمات" ,Array As String	("اتو","شست و شو","اتو با شست وشو"))
'End Sub

Sub DisableScroolbar(sv1 As ScrollView)
	Dim r As Reflector
 
	r.Target = sv1
 
	r.RunMethod2("setVerticalScrollBarEnabled", False, "java.lang.boolean")
 
End Sub
Sub barcode_BarcodeFound (barCode As String, formatName As String)

	Dim lbl As Label
	lbl.Initialize("")
	Activity.AddView(lbl, 0, 20dip, 100%x, 50dip)
	Dim cs As CSBuilder
	cs.Initialize.Size(20).Append("Click on underine word: ")
	cs.color(Colors.Blue).Clickable("cs", 1).Underline.Pop.PopAll
	


	ToastMessageShow(cs,False)
End Sub

Sub shop_basket_iv_Click
'	main_codes.shop_basket(Rnd(0,10),shop_basket_iv)
End Sub