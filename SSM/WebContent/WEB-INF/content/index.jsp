<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生登录</title>
<script src="http://lib.sinaapp.com/js/jquery/1.4.2/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
</script>
<style type="text/css">

</style>
</head>
<body>
<div class="body">
<div class="login">
<form action="/SSM/login" method="post">
<table style="width:240px;height:100px;">
<tr>
<td><spring:message code="loginname"/></td>
<td><input type="text" id="username" name="username"/></td>
</tr>
<tr>
<td><spring:message code="password"/></td>
<td><input type="text" id="password" name="password"/><span><% %></span></td>
</tr>
<tr>
<td style="width:55px;">
<span>
<%
	if(request.getAttribute("error")!=null) {
		out.print(request.getAttribute("error"));
	}
%></span>

</td>
<td style="text-align:center;"><input type="reset" value="清除"/>&nbsp&nbsp<input type="submit" value="提交"/></td>
</tr>
</table>
</form>
</div>
</div>
</body>
</html>