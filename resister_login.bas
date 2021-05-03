B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: true

	#IncludeTitle: false
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim s(16),help,top_frame As Object
	
	Dim x As XmlLayoutBuilder
	dim ac as AppCompat
	Private google_login As ImageView
	Private ImageView1 As ImageView
	Private Ive_forgot_lbl As Label
	Private login_btn As ACButton
	Private pass_et As ACEditText
	Private user_name_ed As ACEditText
	Private help_iv As ImageView
	
		Dim ahv As AHViewPager
	Dim ahc As AHPageContainer
	
	Private ACButton1 As ACButton
	Private EditText1 As EditText
	Private Panel1 As Panel

	Private Panel2 As Panel
	Private action_panel As Panel
	Private logo_iv As ImageView
	
	Dim p(3) As Panel
	Private create_accout_btn As ACButton
	Private EditText2 As EditText
	Private enter_btn As ACButton
	Private ImageView2 As ImageView
	Private phone_register As ACButton
	Private progress_iv As ImageView
	Private phone_et As EditText
	Private phone_iv As ImageView
	Private ph_test As ImageView
End Sub
Sub load_drawable
For i=0 To 15
	
		s(i)=x.GetDrawable($"state${i}"$)
Next
	help=x.GetDrawable("ic_help_outline_white_36dp")
	top_frame=x.GetDrawable("top_frame")
End Sub
Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	load_drawable

	
	ahc.Initialize
	For i=0 To p.Length-1
		p(i).Initialize(i)
		ahc.AddPage(p(i),i)
	Next
	
	ahv.Initialize2(ahc,"ahv")
ahv.OffscreenPageLimit=3
	ahv.PageMargin=0
	ahv.PagingEnabled=False
	Activity.AddView(ahv,0,0,100%X,100%Y)


End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ahv_PageCreated (Position As Int, Page As Object)
	Dim pnl As Panel=Page
	Select Position
		Case 0
			pnl.LoadLayout("phone_numer_loign_lay")
		Case 1
			pnl.LoadLayout("register_login_lay")
		Case 2
			pnl.LoadLayout("REGISTER_FINISHED")
			
	End Select
End Sub
Sub help_iv_Click
	
End Sub

Sub enter_btn_Click
	
	ahv.GotoPage(2,True)
	Dim p1 As Panel= ahc.GetPageObject(2)
Dim v As View=p1.GetView(1)
v.SetVisibleAnimated(1600,True)
Sleep(2000)
progress_iv.Visible=True
	main_codes.create_progress_inter( progress_iv)

End Sub

Sub EditText2_EnterPressed
	
End Sub

Sub EditText1_EnterPressed
	
End Sub

Sub create_accout_btn_Click
	
End Sub

Sub phone_register_Click
'	ahv.GotoPage(1,True)
	
	
	
	Dim pic As Picasso
	pic.Initialize
	phone_iv.Background=Null
	Dim test_string As String =phone_et.Text
		Log(test_string.Length)
	If test_string.StartsWith("09") And test_string.Length=11 Then

pic.LoadResource("baseline_check_black_36").IntoImageView(phone_iv)
	Else
		pic.LoadResource("baseline_close_black_36").IntoImageView(phone_iv)
	End If
End Sub