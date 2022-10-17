package models;

import java.util.ArrayList;

public class Store {
	
	public UserManager userManager;
	public ProductManager productManager;
	public InvoiceManager invoiceManager;
	
	
	public Store() {
		super();
		this.userManager = new UserManager();
		this.productManager = new ProductManager();
		this.invoiceManager = new InvoiceManager();
	}
	
	public UserManager getUserManager() {
		return userManager;
	}
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	public ProductManager getProductManager() {
		return productManager;
	}
	public void setProductManager(ProductManager productManager) {
		this.productManager = productManager;
	}
	
	//Agrega el producto al carro y resta unidades a la lista de productos
	public void addProductToCar(Product product) {
		invoiceManager.getInvoiceTemp().addProductCar(product); //Agrega producto al carro
		productManager.setunitProduct(product); //Resta productos de la lista de productos	
		
	}
	
	public ArrayList<Product> getProductcar(){
		return invoiceManager.getInvoiceTemp().getProductsList();
	}
	
	public int userID() {
		return userManager.getId_User();
	}

	public InvoiceManager getInvoiceManager() {
		return invoiceManager;
	}

	public void setInvoiceManager(InvoiceManager invoiceManager) {
		this.invoiceManager = invoiceManager;
	}
	
}
