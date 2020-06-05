<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加处方</title>
<style type="text/css">
	body{
		background:url(img/1.png);
	}
</style>
</head>
<body>
<%request.setCharacterEncoding("utf-8"); %>
<h3>添加处方</h3><hr><br>
<center>
<form action="PrescriptionServlet" method="post">
医生ID：<input type="hidden" name="DoctorId" value="<%=request.getParameter("DoctorId")%>"><%=request.getParameter("DoctorId")%><br><br>
病人ID：<input type="hidden" name="PatientId" value="<%=request.getParameter("PatientId")%>"><%=request.getParameter("PatientId")%><br><br>
检查号：<input type="hidden" name="CheckId" value="<%=request.getParameter("CheckId")%>"><%=request.getParameter("CheckId")%><br><br>
处方内容：<input type="text" name="PrescriptionText" ><br><br>
<input type="submit" name="submit" value="添加">
</form>
</center>
</body>
</html>