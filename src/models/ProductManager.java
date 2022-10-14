package models;

import java.util.ArrayList;

public class ProductManager {
	
	private ArrayList<Product> listProducts;
	
	

	public ProductManager() {
		super();
		listProducts = new ArrayList<>();
	}

	public ArrayList<Product> getListProducts() {
		return listProducts;
	}

	public void setListProducts(ArrayList<Product> listProducts) {
		this.listProducts = listProducts;
	}
	
}
