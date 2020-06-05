package daoProxy;

import java.sql.SQLException;
import bean.User;
import dao.DBConnection;
import dao.UserDao;
import daoImpl.UserDaoImpl;

public class UserDaoProxy implements UserDao {

	private DBConnection dbc = null;  //����ʵ�����ݿ�����
	private UserDao dao = null;    //����ʵ����DAO�ӿ�
	
	public UserDaoProxy() throws ClassNotFoundException, SQLException {
		this.dbc = new DBConnection();   // ʵ�������ݿ�����
		this.dao = new UserDaoImpl(this.dbc.getConnection());
	}
	
	@Override
	public boolean findLogin(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.dao.findLogin(user);    //������ʵ����
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
