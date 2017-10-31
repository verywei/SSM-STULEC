<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/SSM/css/home.css" type="text/css" />
<link rel="icon" href="/SSM/images/heart.png">
<title>学生成绩</title>
</head>
<body>

<div class="titlehead">
<img alt="head" src="/SSM/images/head.jpg" style="height:90px;width:1200px;">
</div>
<div class="content">
<table>
<tr>
<th><div class="leftcontent">
<table style="width:90px;">
<tr><td><a href="/SSM/lecture/home">学分成绩</a></td></tr>
<tr><td><a href="/SSM/lecture/selectpage">学生选课</a></td></tr>
<tr><td><a href="/SSM/level/levelpage">考级报名</a></td></tr>
<tr><td><a href="/SSM/exit">退出系统</a></td></tr>
</table>


</div></th>
<th>
<div class="rightcontent">
<div style="width:1090px;height:460px; overflow-y:scroll;overflow-x:hidden; border:1px solid;">
<jsp:include page="/WEB-INF/content/score.jsp"></jsp:include>
</div>
<div style="width:1090px;height:35px;border:1px solid;back-ground:#000000;">

</div>
</div>
</th>
</tr>
</table>
</div>
</body>
</html>