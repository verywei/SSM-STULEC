<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<script src="http://lib.sinaapp.com/js/jquery/1.4.2/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
    jQuery.navlevel2 = function(level1,dytime) {
        
      $(level1).mouseenter(function(){
          varthis = $(this);
          delytime=setTimeout(function(){
            varthis.find('ul').slideDown();
        },dytime);
        
      });
      $(level1).mouseleave(function(){
         clearTimeout(delytime);
         $(this).find('ul').slideUp();
      });
      
    };
  $.navlevel2("li.mainlevel",300);
});
</script>
<style type="text/css">
.header{
height:30px;
background:#FFF0F5;

}
.body{
width:1200px;
height:650px;
margin:0 auto;
background:#ff9999;
}
.login{
border-style: outset;
text-align:center;
padding:10px;
background:#FF8247;
width:240px;
height:100px;
position:relative;
top:40%;
left:40%;

}

</style>
</head>
<body>
<div class="body">
<div class="login">
<form action="/SSM/login" method="post">
<table style="width:240px;height:100px;">
<tr>
<td>用户名:</td>
<td><input type="text" id="username" name="username"/></td>
</tr>
<tr>
<td>密码:</td>
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