B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=8.3
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: FALSE
	
	
#End Region
Sub Process_Globals
	Private fm As FirebaseMessaging
Dim v As AriaVolley
End Sub

Sub Service_Create
	fm.Initialize("fm")
v.Initialize("volley")

End Sub

Public Sub SubscribeToTopics
	fm.SubscribeToTopic("general") 'you can subscribe to more topics
End Sub

Sub Service_Start (StartingIntent As Intent)
	If StartingIntent.IsInitialized Then fm.HandleIntent(StartingIntent)
	
	Sleep(0)
'	Service.StopAutomaticForeground 'remove if not using B4A v8+.
End Sub

Sub fm_MessageArrived (Message As RemoteMessage)
	Log("Message arrived")
	Log($"Message data: ${Message.GetData}"$)
	Dim n As Notification
	n.Initialize
	n.Icon = "icon"
	n.SetInfo(Message.GetData.Get("title"), Message.GetData.Get("body"), Main)
	n.Notify(1)
End Sub


'Private Sub SendMsg(FCMToken As String, datamap As Map)
'  
'	Dim Job As HttpJob
'	Job.Initialize("SendMessageDev", Me)
'   LastData = datamap
'	StLast=datamap.Get("st")
' 
'	Dim m As Map = CreateMap("to": $"${FCMToken}"$)
'	Dim data As Map = CreateMap("data": datamap)
'	data.Put("st",StLast)
'	m.Put("data", data)
'	m.Put("content_available": True)
'	m.Put("st",StLast)
'	Dim jg As JSONGenerator
'	jg.Initialize(m)
'	Job.Tag=jg
'	Log(jg.ToString)
'	Job.PostString("https://fcm.googleapis.com/fcm/send", jg.ToString)
'	Job.GetRequest.SetContentType("application/json;charset=UTF-8")
'	Job.GetRequest.SetHeader("Authorization", "key=" & FCM_KEY)
'   
'End Sub
Sub post_id
	

	'hj.PostString("http://hiserv.ir/wp-content/test.php",$"id=${fm.Token}"$)
'	hj.PostString("http://hiserv.ir/wp-content/test.php",$"user_login=msnp&id=${fm.Token}"$)
	v.CreateStringRequest2("http://hiserv.ir/wp-content/test.php",$"user_login=msnp&id=${fm.Token}"$,v.POST)
	
End Sub
Sub Service_Destroy

End Sub