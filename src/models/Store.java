package models;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
	public void addProductToCar(int id, int units) {
		Product p = productManager.searchProduct(id);
		
		Product productAdd = new Product(id,p.getPro_name(),p.getPro_measure(),p.getPro_price(),units);
		
		invoiceManager.getInvoiceTemp().addProductCar(productAdd); //Agrega producto al carro
		productManager.setunitProduct(id,units); //Resta productos de la lista de productos	
	}
	
	//Reiniciar La invoice
	public void resetInvoice() {
		String generateNumber = invoiceManager.generateNumberInvoice();
		Invoice invoice = new Invoice(generateNumber);
		invoiceManager.setInvoiceTemp(invoice);
	}
	
	//Elimina los productos del carrito
	public void deleteProductsInCar() {
		invoiceManager.getInvoiceTemp().deleteProductsCar();
	}
	
	//Reinicia las unidades de la tienda si el cliente no los Compras
	public void resetProductsInStore() {
		ArrayList<Product> productsCar = invoiceManager.getInvoiceTemp().getProductsList();
		for (Product product : productsCar) {
			productManager.setUnitToCar(product.getPro_id(),product.getPro_units());
		}
	}
	
	//Crear Factura 
	public void createInvoice() {
		Invoice invoice = invoiceManager.getInvoiceTemp();
		
		Date datetime = Date.valueOf(LocalDate.now());	
		invoice.setId_user(userID());
		invoice.setDate(datetime);
		invoiceManager.SaveInvoice(invoice); //Guarda la Factura del Invoice		
		System.out.println("Factura Creada");
	}
	
	//Buscar factura y Guardar los productos
	public void saveDetailProducts() {
		String number_invoice = invoiceManager.invoiceTemp.getNumberInvoice();
		System.out.println(number_invoice);
		
		int id_invoice = invoiceManager.getInvoiceDAO(number_invoice).getId();
		
		System.out.println(id_invoice);
		invoiceManager.getInvoiceTemp().setId(id_invoice);
		
		//Agrega los productos a los detalles
		invoiceManager.getInvoiceTemp().addProductsDAO();
		
		//Actualiza los productos de la DB
		productManager.updateProducts(getProductcar());
	}
	
	//Obtiene los productos del carrito 
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
