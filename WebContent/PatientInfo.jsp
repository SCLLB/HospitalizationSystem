<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>病人信息</title>
<style type="text/css">
	body{
		background:url(img/1.png);
	}
</style>
</head>
<body>
<h3>病人信息</h3><hr><br>
<%!
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/hospitalizationsystem?useUncode=true&characterEncoding=utf-8";
	private static final String DBUSER = "root";
	private static final String DBPASS = "123456";
%>
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	Class.forName(DBDRIVER);
	conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
	String sql = "select * from patient";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
%>
<center>
<table border="2">
	<tr>
		<td>ID</td><td>姓名</td><td>性别</td><td>年龄</td><td>地址</td><td>电话</td><td>病床</td><td>医生</td><td>检查项</td><td>处方</td><td>操作</td>
	</tr>
<%while(rs.next()){ %>
	<tr>
		<td><%= rs.getInt("PatientId") %></td><td><%= rs.getString("PatientName") %></td><td><%= rs.getString("PatientSex") %></td><td><%= rs.getInt("PatientAge") %></td>
		<td><%= rs.getString("PatientAddress") %></td><td><%= rs.getString("PatientPhone") %></td><td><%= rs.getInt("BedId") %></td><td><%= rs.getInt("DoctorId") %></td>
		<td><%= rs.getInt("CheckId") %><td><%= rs.getString("PrescriptionText") %></td>
		<td><a href="Prescription.jsp?DoctorId=<%=rs.getInt("DoctorId")%>&&PatientId=<%=rs.getInt("PatientId")%>&&CheckId=<%=rs.getInt("CheckId")%>">添加处方</a></td>
	</tr>
<%} %>
</table>
</center>
<%
	rs.close();
	pstmt.close();
	conn.close();
%>
</body>
</html>