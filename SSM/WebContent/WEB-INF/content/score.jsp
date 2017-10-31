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
<title>Insert title here</title>
</head>
<body>
<%
	Student student=(Student)request.getAttribute("user");
	List<LectureToUser> selectlectures=(List<LectureToUser>)request.getAttribute("selectlectures");
%>
<div class="table">
<table id="customers">
<tr class="tablehead">
<th>学号</th>
<th>课程编号</th>
<th>课程名称</th>
<th>学分</th>
<th>成绩</th>
</tr>
<%
if(selectlectures!=null)
for(LectureToUser l:selectlectures){
	out.append("<tr><td>");
	out.append(l.getStu());
	out.append("</td>");
	out.append("<td>");
	out.append(l.getLec());
	out.append("</td>");
	out.append("<td>");
	out.append(l.getName());
	out.append("</td>");
	out.append("<td>");
	out.append(l.getCredit());
	out.append("</td>");
	out.append("<td>");
	out.append(l.getScore());
	out.append("</td></tr>");
}
%>
</table>
</div>

</body>
</html>