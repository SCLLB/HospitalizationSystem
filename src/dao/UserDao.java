package dao;

import bean.User;

public interface UserDao {
	public boolean findLogin(User user)throws Exception;
	public boolean findRegister(User user)throws Exception;
}
