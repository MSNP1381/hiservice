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
	Dim s(16),person,lock As Object
	Dim x As XmlLayoutBuilder
	Dim ahv As AHViewPager
	Dim ahc As AHPageContainer
	

	Private Panel1 As Panel

	Private Panel2 As Panel
	Private action_panel As Panel
	Private logo_iv As ImageView
	
	Dim p(3) As Panel
	Private create_accout_btn As ACButton

	Private enter_btn As ACButton

	Private phone_register As ACButton
	Private progress_iv As ImageView
	Private phone_et As EditText
	Private phone_iv As ImageView
	Private ph_test As ImageView
	Private pass_iv As ImageView
	Private user_et As EditText
	Private user_iv As ImageView
	Dim pic As Picasso
	Dim phone_incorrect=False As Boolean 
	Dim ime As IME
	Private pass_et As EditText
End Sub
Sub load_drawable
	For i=0 To 15
	
		s(i)=x.GetDrawable($"state${i}"$)
	Next
	person=x.GetDrawable("baseline_person_black_24")
	lock=x.GetDrawable("baseline_lock_black_24")
End Sub
Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	load_drawable
	pic.Initialize
	ime.Initialize("ime")

	ahc.Initialize
	For i=0 To p.Length-1
		p(i).Initialize(i)
		ahc.AddPage(p(i),i)
	Next
	
	ahv.Initialize2(ahc,"ahv")

	ahv.PageMargin=0
	ahv.OffscreenPageLimit=0
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
			ime.ShowKeyboard(phone_et)
		Case 1
			pnl.LoadLayout("register_login_lay")
			user_iv.Background=person
			pass_iv.Background=lock
		Case 2
			pnl.LoadLayout("REGISTER_FINISHED")
			
	End Select
End Sub


Sub enter_btn_Click
	user_iv.Background=Null
	pass_iv.Background=Null
	Dim test_string1 As String =user_et.Text
	Dim test_string2 As String =pass_et.Text
	
	If test_string1.Length>0 And test_string2.Length>0 Then
		pic.LoadResource("baseline_check_black_36").IntoImageView(pass_iv)
		pic.LoadResource("baseline_check_black_36").IntoImageView(user_iv)
		Sleep(150)
		gotopage(2)
		ime.HideKeyboard
	
		phone_incorrect=False
	
		Dim p1 As Panel= ahc.GetPageObject(2)
		Dim v As View=p1.GetView(1)
		v.SetVisibleAnimated(1600,True)
		Sleep(1800)
		progress_iv.Visible=True
		main_codes.create_progress_inter( progress_iv)
		
	Else
		phone_et.SelectAll
		phone_incorrect=True
		
		pic.LoadResource("baseline_close_black_36").IntoImageView(pass_iv)
		pic.LoadResource("baseline_close_black_36").IntoImageView(user_iv)
	End If
	

Sleep(4000)
Activity.Finish
StartActivity(main_)
End Sub

Sub EditText2_EnterPressed
	
End Sub

Sub EditText1_EnterPressed
	
End Sub

Sub create_accout_btn_Click
	
End Sub

Sub phone_register_Click
'	ahv.GotoPage(1,True)

	phone_iv.Background=Null
	Dim test_string As String =phone_et.Text
	Log(test_string.Length)
	If test_string.StartsWith("09") And test_string.Length=11 Then
		pic.LoadResource("baseline_check_black_36").IntoImageView(phone_iv)
		Sleep(150)
		gotopage(1)
		phone_incorrect=True
	Else
		phone_incorrect=False
		phone_et.SelectAll
		pic.LoadResource("baseline_close_black_36").IntoImageView(phone_iv)
	End If
End Sub
Sub gotopage(i As Int)
	ahv.GotoPage(i,True)
End Sub
Sub user_et_EnterPressed
	
End Sub

Sub pass_et_EnterPressed
	
End Sub

Sub phone_et_FocusChanged (HasFocus As Boolean)
	If HasFocus And phone_incorrect Then
		phone_et.SelectAll
	End If
	
End Sub