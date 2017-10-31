<%@page import="per.wei.entity.LectureToUser"%>
<%@page import="per.wei.entity.Selectlecture"%>
<%@page import="per.wei.entity.Lecture"%>
<%@page import="java.util.List"%>
<%@page import="per.wei.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="/SSM/css/home.css" type="text/css" />
<link rel="icon" href="/SSM/images/heart.png">
<title>学生选课</title>
</head>
<body>
<%
	Student student=(Student)request.getAttribute("user");
	List<Lecture> lectures=(List<Lecture>)request.getAttribute("lectures");
	List<Lecture> selectlectures=(List<Lecture>)request.getAttribute("selectlectures");
%>
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
<div style="width:1090px;height:320px; overflow-y:scroll;overflow-x:hidden; border:1px solid;">

<table id="customers">
<tr>
<th>课程编号</th>
<th>课程名</th>
<th>学分</th>
<th>选课</th>
</tr>
<%
if(lectures!=null){
	for(Lecture l:lectures){
		String href="/SSM/lecture/select?lecture="+l.getId();
		out.append("<tr>");
		out.append("<td>"+l.getId()+"</td>");
		out.append("<td>"+l.getName()+"</td>");
		out.append("<td>"+l.getCredit()+"</td>");
		out.append("<td><a href="+href+">选择</a></td>");
		out.append("</tr>");
	}
}
%>
</table>
</div>
<div style="width:1090px;height:30px;background:#80ffff;text-align:center;">
	已选课程
</div>
<div style="width:1090px;height:145px; overflow-y:scroll;overflow-x:hidden; border:1px solid;">
<table id="customers">
<tr>
<th>课程编号</th>
<th>课程名</th>
<th>学分</th>
<th>选课</th>
</tr>
<%
if(selectlectures!=null){
	for(Lecture l:selectlectures){
		String href="/SSM/lecture/delete?lecture="+l.getId();
		out.append("<tr>");
		out.append("<td>"+l.getId()+"</td>");
		out.append("<td>"+l.getName()+"</td>");
		out.append("<td>"+l.getCredit()+"</td>");
		out.append("<td><a href="+href+">退选</a></td>");
		out.append("</tr>");
	}
}
%>
</table>
</div>
</div>
</th>
</tr>
</table>
</div>
</body>
</html>