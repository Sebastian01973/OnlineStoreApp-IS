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
	
	public Product searchProduct(int id) {
		for (Product product : listProducts) {
			if (product.getPro_id() == id) {
				return product;
			}
		}
		return null;
	}

	public void setListProducts(ArrayList<Product> listProducts) {
		this.listProducts = listProducts;
	}
	
	public void setUnitToCar(int id,int units) {
		for (Product product : listProducts) {
			if (product.getPro_id() == id) {
				product.setPro_units(product.getPro_units()+units);
			}
		}
	}
	
	public void setunitProduct(int id,int units) {
		for (Product product : listProducts) {
			if (product.getPro_id() == id) {
				product.setPro_units(product.getPro_units()-units);
			}
		}
	}
	
	
	public void updateProducts(ArrayList<Product> products) {
		int count = 0;
		for (Product product : listProducts) {
			if (count < products.size() && products.get(count).getPro_id() == product.getPro_id()) {
				count++;
				productDAO.update(product.getPro_units(),product.getPro_id());
			}
		}
	}
}
