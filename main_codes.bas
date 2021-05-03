B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub 	Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
Dim tf As Typeface=Typeface.LoadFromAssets("IRANYekanMobileBold.ttf")

End Sub

Sub shop_basket(count As Int,iv As ImageView)
'	Dim ac As AppCompat
'	ac.SetDrawableTint(iv.Background,Colors.White)
Dim c As Canvas

	Dim C As Canvas
	C.Initialize(iv)
	Dim w_x,w_y,radius As Int
	radius=(iv.Width/3)
	w_x=iv.Width-radius
	w_y=radius
	Log(radius)
	C.AntiAlias=True          ' Ghost White
	C.DrawCircle(w_x,w_y,radius,0xFFF5F5F5,True,0)
	C.DrawText(numtofa( count),w_x,w_y+radius/2,tf,radius/1.125,0xFF2F2F2F,"CENTER")
	iv.Invalidate
	iv.Invalidate
End Sub

'Sub bullet_pager(img() As Bitmap) As View
'	Dim pba As PagerBulletAdapter
'	pba.Initialize
'
'	Dim p As ImageView
'	Dim pic As Picasso
'	pic.Initialize
'	For i=0 To img.Length-1
'		p.Initialize("p")
'		p.Tag=i
'		p.Bitmap=img(i)
'		p.Gravity=Gravity.FILL
'		
'			pic.LoadUrl("http://hiserv.ir/wp-content/uploads/2018/07/546.jpg").PlaceholderDrawable(main_.place_holder).IntoImageView(p)
''		If i=0 Then
''		Else 	If i=1 Then
''				pic.LoadUrl("http://hiserv.ir/wp-content/uploads/2018/06/546.jpg").PlaceholderDrawable(main_.place_holder).IntoImageView(p)
''		Else 	If i=2 Then
''			pic.LoadUrl("http://hiserv.ir/wp-content/uploads/2018/06/546.jpg").PlaceholderDrawable(main_.place_holder).IntoImageView(p)
''		Else 	If i=3 Then
''			pic.LoadUrl("http://hiserv.ir/wp-content/uploads/2018/06/546.jpg").PlaceholderDrawable(main_.place_holder).IntoImageView(p)
''		End If
'		pba.AddPage(p)
'	Next
'
'	Dim pb As PagerBullet
'	pb.Initialize(pba,"pb")
''	pb.setDotsColor(Colors.white,0x78FFFFFF)
'	pb.setDotsColor(0x00724949,0x00FF0000)
'
'	pb.Transition=pb.PARALLAX_PAGE
'	
'	Return pb
'	
'End Sub	
	'۰
	'۱
	'۲
	'۳
	'۴
	'۵
	'۶
	'۷
	'۸
	'۹
Sub numtofa(input As String)As String
	
	Dim out As String=""
	Dim ch As Char
	For i=0 To input.Length-1
		ch=input.CharAt(i)
		If IsNumber (ch) Then
			Select ch
				Case 0
					out=out&"۰"
				Case 1
					out=out&"۱"
				Case 2
					out=out&"۲"
				Case 3
					out=out&"۳"
				Case 4
					
					out=out&"۴"
				Case 5
					out=out&"۵"
				Case 6
					out=out&"۶"
				Case 7
					out=out&"۷"
				Case 8
					out=out&"۸"
				Case 9
					out=out&"۹"
			End Select
		Else
			Exit
		End If
	Next
	Return out
End Sub
Sub create_progress_inter(v As ImageView)

	Dim s(8) As Bitmap

	For i=1 To s.Length

		s(i-1)=LoadBitmap(File.DirAssets,$"apptheme_progressbar_indeterminate_holo${i}.png"$)
	Next
	i=1
	Do While True
		
		v.Bitmap=s(i-1)
		
		If i=8 Then i=1
		Sleep(125)
		i=i+1
	Loop
	
End Sub