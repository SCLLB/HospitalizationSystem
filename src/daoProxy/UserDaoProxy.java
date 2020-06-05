package daoProxy;

import java.sql.SQLException;
import bean.User;
import dao.DBConnection;
import dao.UserDao;
import daoImpl.UserDaoImpl;

public class UserDaoProxy implements UserDao {

	private DBConnection dbc = null;  //定义实现数据库连接
	private UserDao dao = null;    //定义实现类DAO接口
	
	public UserDaoProxy() throws ClassNotFoundException, SQLException {
		this.dbc = new DBConnection();   // 实例化数据库连接
		this.dao = new UserDaoImpl(this.dbc.getConnection());
	}
	
	@Override
	public boolean findLogin(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.dao.findLogin(user);    //调用真实主题
		this.dbc.close();
		return flag;
	}

	@Override
	public boolean findRegister(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.dao.findRegister(user);
		this.dbc.close();
		return flag;
	}

}
