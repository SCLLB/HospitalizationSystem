package bean;

public class User {
	private String UserId;
	private String UserPassword;
	private String UserName;
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	
	public User() {
		this.UserId = "";
		this.UserName = "";
		this.UserPassword = "";
	}
	public User(String UserId,String UserName,String UserPwd) {
		super();
		this.UserId = UserId;
		this.UserName = UserName;
		this.UserPassword = UserPwd;
	}
}
