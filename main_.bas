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
'primary 0xFF4DCCB7 #4dccb7
'secondary 0xFFEEE7DD #eee7dd  e3ce70
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
Dim tf_sans As Typeface=Typeface.LoadFromAssets("IRANYekanMobileLight.ttf")
Dim color_p As Int
	Dim score_ic,paid_ic,orders_ic,notify_ic,search_box, account,shopping_basket,home1,menu,notif_recived,guide_frame,place_holder As Object
	Public color_p As Int=0xFF4DCCB7
	Public color_s As Int=0xFFEEE7DD
End Sub



Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim p As Panel
	Private ScrollView1 As ScrollView
	
'	Private MSCardView1 As MSCardView
'	Private MSCardView2 As MSCardView
	Private DSBottomNavigationView1 As DSBottomNavigationView


	Dim x As XmlLayoutBuilder
	Dim ac As AppCompat
	Private action_panel As Panel
	Private menu_iv As ImageView
	Dim bottom_nav_pos As Int
	Private notify_iv As ImageView

End Sub

Sub Activity_Create(FirstTime As Boolean)
	setup_drawables
	color_p=ac.GetThemeAttribute("colorPrimary")
	Activity.LoadLayout("main_lay")
	p=ScrollView1.Panel
	pan_create
	menu_iv.Background=menu
	notify_iv.Background=notif_recived
	action_panel.Color=color_p
	Sleep(200)
	bottom_nav
End Sub

Sub OpenFile_Click
	Activity.Finish
	StartActivity(Me)
End Sub
Sub setup_drawables
	account=x.GetDrawable("baseline_account_circle_white_36dp")
	shopping_basket=x.GetDrawable("baseline_shopping_cart_white_36dp")
	home1=x.GetDrawable("baseline_home_white_36dp")
	menu=x.GetDrawable("baseline_menu_white_36dp")
'	notify_ic=x.GetDrawable("baseline_notifications_white_36dp")
	notif_recived=x.GetDrawable("baseline_notifications_white_36dp_recived")
	place_holder=x.GetDrawable("placeholder")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
End Sub

Sub pan_create
	Dim home As home_module
	home.Initialize(ScrollView1.Panel,8)
End Sub
Sub  bottom_nav
	DSBottomNavigationView1.Color=color_p
	Dim m As ACMenu=DSBottomNavigationView1.Menu
	m.Add2(0,0,"سفارشات",shopping_basket)
	m.Add2(1,0,"خانه",home1).Checked=True
	m.Add2(2,0,"حساب کاربری",account)
	DSBottomNavigationView1.SetItemIconColors(Colors.ARGB(140,255,255,255) ,Colors.ARGB(255,255,255,255),0xFFE7CFCF)
	DSBottomNavigationView1.SetItemTextColors(Colors.ARGB(140,255,255,255),Colors.ARGB(255,255,255,255),0xFFE7CFCF)
End Sub


Sub DSBottomNavigationView1_NavigationItemSelected(MenuItem As ACMenuItem)
	If bottom_nav_pos = MenuItem.Id Then
	Else
		ScrollView1.Panel.RemoveAllViews
		ScrollView1.Panel.Height=ScrollView1.Height
		ScrollView1.Padding = Array As Int (0dip, 0dip, 0dip, 0dip)
		Select MenuItem.Id
	
			Case 0'سفارشات

				order
		
			Case 1'خانه
				pan_create
'				Panel1.AddView(main_codes.bullet_pager(pager_img),0,0,-1,-1)
			Case 2'حساب کاربری
				Dim accounts As account_module
		accounts.Initialize(ScrollView1)
		End Select
	End If
	bottom_nav_pos=MenuItem.Id
	Log(MenuItem.Title)
End Sub

Sub order
	Dim orders As order_module
	orders.Initialize(p)
End Sub

Sub notify_iv_Click
	StartActivity(notify)
End Sub