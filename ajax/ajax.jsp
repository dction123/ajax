<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script>
var xmlhttp;
function loadXMLDoc(url,cfunc){
	if (window.XMLHttpRequest){
		// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
		xmlhttp=new XMLHttpRequest();
	}
	else
	{
		// IE6, IE5 浏览器执行代码
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange = cfunc;
	xmlhttp.open("GET",url,true);
	xmlhttp.send();
}
function myfunction(){
	loadXMLDoc("/ajax/get?name=张三",function(){
		if (xmlhttp.readyState==4 && xmlhttp.status==200)
		{
			document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
		}
	});
}

</script>
</head>
<body>
	<h2>AJAX</h2>
<button type="button" onclick="myfunction()">请求数据</button>
<div id="myDiv"></div>

</body>
</html>