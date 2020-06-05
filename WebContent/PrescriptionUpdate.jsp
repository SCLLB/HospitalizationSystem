<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>处方更新</title>
<style type="text/css">
	body{
		background:url(img/1.png);
	}
</style>
</head>
<body>
<h3>处方更新</h3><hr><br>
<%request.setCharacterEncoding("utf-8"); %>

<form action="UpdatePrescriptionServlet" method="post">
处方ID:<input type="hidden" name="PrescriptionId" value="<%=request.getParameter("PrescriptionId") %>"><%=request.getParameter("PrescriptionId") %><br><br>
处方内容：<input type="text" name="PrescriptionText"><br><br>
<input type="submit" name="submit" value="更新">
</form>
</body>
</html>