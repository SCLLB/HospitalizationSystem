<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>处方信息</title>
<style type="text/css">
	body{
		background:url(img/1.png);
	}
</style>
</head>
<body>
<h3>处方信息</h3><hr><br>
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
	String sql = "select * from prescription";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
%>
<center>
<table border="2">
	<tr>
		<td>ID</td><td>内容</td><td>医生</td><td>病人</td><td>检查号</td><td>修改</td><td>删除</td>
	</tr>
<%while(rs.next()){ %>
	<tr>
		<td><%= rs.getInt("PrescriptionId")%></td><td><%= rs.getString("PrescriptionText") %></td><td><%= rs.getInt("DoctorId") %></td>
		<td><%= rs.getInt("PatientId") %></td><td><%= rs.getInt("CheckId") %></td>
		<td><a href="PrescriptionUpdate.jsp?PrescriptionId=<%= rs.getInt("PrescriptionId")%>">修改</a></td>
		<td><a href="DeletePrescriptionServlet?PrescriptionId=<%= rs.getInt("PrescriptionId")%>">删除</a></td>
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