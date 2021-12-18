package Model;

public class LoginBean {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean LoginCheck() {

		if (userName.equals("user1") && password.equals("pass1")
				|| userName.equals("user2") && password.equals("pass2")) {
			return true;
		}
		return false;
	}

}