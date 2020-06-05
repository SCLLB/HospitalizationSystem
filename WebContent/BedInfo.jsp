<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>病床信息</title>
<style type="text/css">
	body{
		background:url(img/1.png);
	}
</style>
</head>
<body>
<h3>病床信息</h3><hr><br>
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
	String sql = "select * from bed";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
%>
<center>
<table border="2">
	<tr>
		<td>ID</td><td>病人</td><td>状态</td>
	</tr>
<%while(rs.next()){ %>
	<tr>
		<td><%= rs.getInt("BedId")%></td><td><%= rs.getString("PatientName") %></td><td><%= rs.getString("Condition") %></td>
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