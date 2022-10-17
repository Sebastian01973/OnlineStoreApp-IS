package models;

import java.util.ArrayList;

import DAO.DAOUser;

public class UserManager {

	DAOUser dao = new DAOUser();
	
	
	public UserManager() {
		super();
	}

	
	//Valida si la password y nick son los correctos
	public boolean isAuthentication(String us_nick, String us_password) {
		User user = dao.selectUser(us_nick);
		if (user.getUs_nick().equals(us_nick) && user.getUs_password().equals(us_password)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void adduser(String us_nick, String us_name, String us_address, String us_password) {
		dao.insert(new User(us_nick, us_name, us_address, us_password));
	}
	
	public User searchUser(String us_nick) {
		return dao.selectUser(us_nick);
	}
	
	
	public void modifyUser(String us_nick, String us_name, String us_address, String us_password) {
		dao.update(new User(us_nick, us_name, us_address, us_password));
	}
	
}