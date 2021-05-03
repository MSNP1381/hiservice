B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim pager As PagerBullet
	Dim b() As Bitmap
	Dim num As Int
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(panel1 As Panel,img()As Bitmap,count As Int,height As Int)
	b=img
	num=count

	pager.Initialize(adapter_builder,"pager1")

	pager.setDotsColor(Colors.White,Colors.LightGray)
	pager.Transition = pager.PARALLAX_PAGE
	pager.Enabled = True

panel1.AddView(pager,0,0,100%x,height)
End Sub

Sub adapter_builder As PagerBulletAdapter
	Dim pa As PagerBulletAdapter
	pa.Initialize
	Log(num)
	For i=0 To num-1
	Dim p As Panel
		p.Initialize("p"&i)
		p.SetBackgroundImage(b(i))
		p.Tag=i
		pa.AddPage(p)
	Next
	Return pa
End Sub
