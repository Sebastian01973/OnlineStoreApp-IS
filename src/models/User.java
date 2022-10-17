package models;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class User implements Serializable{

	/**
	 * @author sebastian
	 */
	private static final long serialVersionUID = 1L;
	private int us_id;
	private String us_name;
	private String us_nick;
	private String us_address;
	private String us_password;
	
	
	public User(int us_id) {
		this.us_id = us_id;
	}

	public User(String us_nick, String us_name, String us_address, String us_password) {
		this.us_nick = us_nick;
		this.us_password = us_password;
		this.us_name = us_name;
		this.us_address = us_address;
	}
	

	public User(String us_nick, String us_password) {
		super();
		this.us_nick = us_nick;
		this.us_password = us_password;
	}
	
	public User(int us_id,String us_nick, String us_password) {
		super();
		this.us_id = us_id;
		this.us_nick = us_nick;
		this.us_password = us_password;
	}


	
	public String getUs_nick() {
		return us_nick;
	}

	public void setUs_nick(String us_nick) {
		this.us_nick = us_nick;
	}

	public int getUs_id() {
		return us_id;
	}
	
	
	public String getUs_name() {
		return us_name;
	}
	public void setUs_name(String us_name) {
		this.us_name = us_name;
	}
	public String getUs_address() {
		return us_address;
	}
	public void setUs_address(String us_address) {
		this.us_address = us_address;
	}
	public String getUs_password() {
		return us_password;
	}
	public void setUs_password(String us_password) {
		this.us_password = us_password;
	}
	
	//Valida si la password y nick son los correctos
		public boolean isAuthentication(String us_nick, String us_password) {
			if (this.us_nick.equals(us_nick) && this.us_password.equals(us_password)) {
				return true;
			}else {
				return false;
			}
		}

}
