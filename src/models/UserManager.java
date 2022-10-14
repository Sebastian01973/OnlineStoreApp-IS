package models;

import java.util.ArrayList;

public class UserManager {

	public ArrayList<User> userList;
	
	
	public UserManager() {
		super();
		userList = new ArrayList<>();
		userList.add(new User("sebas","1234"));
	}

	public  ArrayList<User> getUserList() {
		return userList;
	}

	public  void  setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
	
	//Valida si la password y nick son los correctos
	public boolean isAuthentication(String us_nick, String us_password) {
		for (User user : userList) {
			if (user.getUs_nick().equals(us_nick) && user.getUs_password().equals(us_password)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public void adduser(int us_id,String us_nick, String us_name, String us_address, String us_password) {
		User user = new User();
		user.setUs_id(us_id);
		user.setUs_name(us_name);
		user.setUs_address(us_address);
		user.setUs_password(us_password);
		user.setUs_nick(us_nick);
		userList.add(user);
	}
	
	public User searchUser(String us_nick) {
		for (User user : userList) {
			if (user.getUs_nick().equals(us_nick)) {
				return user;
			}
		}
		return null;
	}
	
	
	public User searchUser(int us_id) {
		for (User user : userList) {
			if (user.getUs_id() == us_id) {
				return user;
			}
		}
		return null;
	}
	
	public void deleteUser(int us_id) {
		userList.remove(new User(us_id));
	}
	
	
	public boolean modifyUser(int us_id,String us_nick, String us_name, String us_address, String us_password) {
		for (User user : userList) {
			if (user.getUs_id() == us_id) {
				user.setUs_name(us_name);
				user.setUs_address(us_address);
				user.setUs_password(us_password);
				user.setUs_nick(us_nick);
				return true;
			}
		}
		return false;
	}
	
}