<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
<style type="text/css">
.body{
width:900px;
height:600px;
margin:0 auto;
border-style: solid;}

.form{
position:relative;
left:350px;
top:300px;
}
}
</style>
</head>
<body class="body">
	<spring:form modelAttribute="admin" methor="post" action="/SSM/manage/login">
	<table class="form">
	<tr>
		<td>账号</td>
		<td><spring:input path="name"/> </td>
	</tr>
	<tr>
		<td>密码</td>
		<td><spring:input path="password"/></td>
	</tr>
	<tr>
		<td><input type="submit"></td>
	</tr>
		
		
	</table>
	</spring:form>
</body>
</html>