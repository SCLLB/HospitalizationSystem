<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<style type="text/css">
	body{
		background:url(img/1.png);
	}
</style>
</head>
<body>
<center>
<h3>欢迎光临住院信息管理系统</h3><hr>
<form action="LoginServlet" method="post"><br>
用户名：<input type="text" name="UserId" ><br><br>
密码：<input type="password" name="UserPassword" ><br><br>
<input type="submit" name="login" value="登录">&nbsp;
<input type="reset" name="reset" value="重置">
</form>
</center>
<a href="Register.jsp">注册</a>
</body>
</html>