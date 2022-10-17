package models;

import java.util.ArrayList;

public class ProductManager {
	
	private ArrayList<Product> listProducts;
	
	

	public ProductManager() {
		super();
		listProducts = new ArrayList<>();
		listProducts.add(new Product(1, "producto1", "1 kg", 1500,10));
		listProducts.add(new Product(2, "producto2", "500 ml", 500,10));
		listProducts.add(new Product(3, "producto3", "10 kg", 100000,10));
		listProducts.add(new Product(4, "producto4", "200 ml", 50000,6));
		listProducts.add(new Product(5, "producto5", "40 kg", 10500,10));
	}

	public ArrayList<Product> getListProducts() {
		return listProducts;
	}

	public void setListProducts(ArrayList<Product> listProducts) {
		this.listProducts = listProducts;
	}
	
}
