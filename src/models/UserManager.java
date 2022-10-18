package models;

import java.util.ArrayList;

import DAO.DAOUser;

public class UserManager {

	DAOUser dao = new DAOUser();
	
	private int id_User;
	
	public UserManager() {
		super();
		this.id_User = 0;
	}
	
	public int getId_User() {
		return id_User;
	}



	public void setId_User(int id_User) {
		this.id_User = id_User;
	}


	//Valida si la password y nick son los correctos
	public boolean isAuthentication(String us_nick, String us_password) {
		User user = dao.selectUser(us_nick);
		if (user == null) {
			return false;
		}else {
			this.id_User = user.getUs_id();
			return user.isAuthentication(us_nick, us_password);
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