package controllers;

import models.Store;

public class Controller {
	
	public static Store store = new Store();
	
	public static Store getStore() {
		return store;
	}
	
}
