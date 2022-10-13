package models;

import java.util.ArrayList;

public class UserManager {

	public ArrayList<User> userList;
	
	
	public UserManager() {
		super();
		userList = new ArrayList<>();
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
	
	public void deleteUser(int us_id) {
		userList.remove(new User(us_id));
	}
	
	public void modifyUser(int us_id) {
		
	}
	
}