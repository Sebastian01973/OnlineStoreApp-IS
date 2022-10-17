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
		//Agregan todos los productos 
		listProducts.addAll(productDAO.getProducts());
	}

	public ArrayList<Product> getListProductsDAO() {
		return productDAO.getProducts();
	}	
	
	public ArrayList<Product> getListProducts() {
		return this.listProducts;
	}

	public void setListProducts(ArrayList<Product> listProducts) {
		this.listProducts = listProducts;
	}
	
	public void setunitProduct(Product p) {
		for (Product product : listProducts) {
			if (product.getPro_id() == p.getPro_id()) {
				product.setPro_units(product.getPro_units()-p.getPro_units());
			}
		}
	}
	
	public void updateProducts() {
		for (Product product : listProducts) {
			productDAO.update(product.getPro_units(),product.getPro_units());
		}
	}
	
}
