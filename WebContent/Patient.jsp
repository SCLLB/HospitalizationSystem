<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登记</title>
<style type="text/css">
	body{
		background:url(img/1.png);
	}
</style>
</head>
<body>
<h3>患者入院信息登记</h3><hr><br>
<form action="PatientServlet" method="post">
姓名：<input type="text" name="PatientName"><br><br>
性别：<input type="radio" name="PatientSex" value="男">男<input type="radio" name="PatientSex" value="女">女<br><br>
年龄：<input type="text" name="PatientAge"><br><br>
住址：<input type="text" name="PatientAddress"><br><br>
电话：<input type="text" name="PatientPhone"><br><br>
医生：<input type="text" name="DoctorId"><br><br>
病床：<input type="text" name="BedId"><br><br>
入院日期：<input type="text" name="InHospitalTime"><br><br>
<input type="submit" name="inhospital" value="入院">&nbsp;
<input type="reset" name="reset" value="重置">
</form>
</body>
</html>