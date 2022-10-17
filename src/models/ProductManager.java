package models;

import java.util.ArrayList;

import DAO.ProductDAO;

public class ProductManager {
	
	private ArrayList<Product> listProducts;
	private ProductDAO productDAO;
	

	public ProductManager() {
		super();
		listProducts = new ArrayList<>();
		this.productDAO = new ProductDAO();
	}

	public ArrayList<Product> getListProducts() {
		return productDAO.getProducts();
	}

	public void setListProducts(ArrayList<Product> listProducts) {
		this.listProducts = listProducts;
	}
	
}
