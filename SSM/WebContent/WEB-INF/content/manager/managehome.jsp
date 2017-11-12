<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>home</title>
<style type="text/css">

body{
width:1000px;
height:800px;
margin:0 auto;
}
.title{
border-style:solid;
width:1000px;
height:100px;
}
.leftcontent{
text-align:center;
width:100px;
height:550px;
border-style:solid;
}
.rightcontent{
width:900px;
height:550px;
border-style:solid;
position:relative;
left:100px;
top:-555px;
}
table tr {
height:30px;
}
table tr td a{text-decoration:none;}
table tr td a:link  {color:#0080ff;}
table tr td a:visited {color:#0080ff;}
table tr td  a:hover {color:#ffcc00;}
</style>
</head>
<body>
<div class="title">
	<img alt="head" src="/SSM/images/head.jpg" style="height:100px;width:1000px;">
</div>
<div class="content">
<div class="leftcontent">

<table style="width:90px;">
<tr><td><a href="/SSM/lecture/home">课程管理</a></td></tr>
<tr><td><a href="/SSM/lecture/selectpage">学生管理</a></td></tr>
<tr><td><a href="/SSM/level/levelpage">考级管理</a></td></tr>
<tr><td><a href="/SSM/exit">退出系统</a></td></tr>
</table>


	
</div><!-- end left -->
<div class="rightcontent">
	
</div><!-- end right -->
</div><!-- end content -->
</body>
</html>