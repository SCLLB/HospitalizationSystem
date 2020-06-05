package daoImpl;

import java.sql.*;
import bean.User;
import dao.UserDao;

public class UserDaoImpl implements UserDao {
	
	private PreparedStatement pstmt = null;
	private Connection conn = null;
	private ResultSet rs = null;
	
	public UserDaoImpl(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public boolean findLogin(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			String sql = "select * from user where UserId=? and UserPassword=?";  
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, user.getUserId());
			this.pstmt.setString(2, user.getUserPassword());
			this.rs = this.pstmt.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}finally {
			if(this.pstmt!=null) {
				this.pstmt.close();
			}
		}
		return flag;
	}

	@Override
	public boolean findRegister(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "insert into user values(?,?,?)";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, user.getUserId());
		this.pstmt.setString(2, user.getUserPassword());
		this.pstmt.setString(3, user.getUserName());
		this.pstmt.executeUpdate();
		flag = true;
		this.pstmt.close();
		return flag;
	}

}
