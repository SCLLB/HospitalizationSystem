<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册</title>
<style type="text/css">
	body{
		background:url(img/1.png);
	}
</style>
</head>
<body>
<center>
<h3>注册</h3><hr>
<form action="RegisterServlet" method="post">
ID：<input type="text" name="UserId" ><br><br>
姓名：<input type="text" name="UserName" ><br><br>
密码：<input type="text" name="UserPassword" ><br><br>
<input type="submit" value="注册">
<input type="reset" value="重置">&nbsp;
</form>
</center>
<a href="Login.jsp">返回</a><br><br>
</body>
</html>