package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/hospitalizationsystem?useUncode=true&characterEncoding=utf-8";
	private static final String DBUSER = "root";
	private static final String DBPASS = "123456";
	//llb的更改
	//scllb的更改
	private Connection conn =null;
	
	public DBConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DBDRIVER);
		this.conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	}
	
	public Connection getConnection() {
		return this.conn;
	}
	
	public void close() throws SQLException {
		if(conn!=null) {
			this.conn.close();
		}
	}
}
