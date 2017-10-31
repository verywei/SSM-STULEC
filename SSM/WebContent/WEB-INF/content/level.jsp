<%@page import="per.wei.entity.Levels"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/SSM/css/home.css" type="text/css" />
<link rel="icon" href="/SSM/images/heart.png">
<title>考级报名</title>
</head>
<body>
	<%List<Levels> levels =(List<Levels>)request.getAttribute("levels"); %>
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
<table id="customers">
<tr>
<th>报考项目</th>
<th>报名费</th>
<th>时间</th>
<th>报名</th>
</tr>
<%
if(levels!=null){
	for(Levels l:levels){
		String href="#";
		out.append("<tr>");
		out.append("<td>"+l.getName()+"</td>");
		out.append("<td>"+l.getMoney()+"</td>");
		out.append("<td>"+l.getDate()+"</td>");
		out.append("<td><a href="+href+">选择</a></td>");
		out.append("</tr>");
	}
}
%>
</table>
</div>
</th>
</tr>
</table>
</div>
</body>
</html>