package models;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

import DAO.DetailDAO;

public class Invoice implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private int id_user;
	private Date date;
	private String numberInvoice;
	private ArrayList<Product> productsList;
	
	private DetailDAO detailDAO = new DetailDAO();
	
	private double totalPrice;
	
	private int countInvoice;
	
	
	public Invoice() {
		super();
		productsList = new ArrayList<>();
	}
	
	public Invoice(String numberInvoice) {
		super();
		productsList = new ArrayList<>();
		this.numberInvoice = numberInvoice;
	}
	
	public Invoice(int id_user,String numberInvoice, Date date) {
		super();
		this.id_user = id_user;
		this.countInvoice = 0;
		this.numberInvoice = numberInvoice;
		this.date = date;
	}
	

	public Invoice(int id,int id_user,String numberInvoice, Date date) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.countInvoice = 0;
		this.numberInvoice = numberInvoice;
		this.date = date;
	}
	
	public void addProductsDAO() {
		for (Product product : productsList) {
			detailDAO.insertInvoice(id,product);
		}
	}
	
	
	public Product getProductCar(int id) {
		for (Product product : productsList) {
			if (product.getPro_id() == id) {
				return product;
			}
		}
		return null;
	}
	
	public void deleteProductsCar() {
		productsList.clear();
	}
	
	
	public void addProductCar(Product product) {
		productsList.add(product);
	}
	
	public int getId_user() {
		return id_user;
	}
	
	public double calculateSubtotal() {
		double subtotalPrice = 0;
		for (Product product: productsList) {
			subtotalPrice += product.calculatePrice();
		}
		return subtotalPrice;
	}
	
	public double calculatetotal() {
		double subtotal = calculateSubtotal();
		double total = (subtotal * 0.19) + subtotal;
		return total;
	}
	
	public String getNumberInvoice() {
		return this.numberInvoice;
	}
	
	
	public Date getDate() {
		return this.date;
	}
	
	public double getPrice() {
		return totalPrice;
	}
	
	
	public int getId() {
		return id;
	}

	public ArrayList<Product> getProductsList() {
		return productsList;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public int getCountInvoice() {
		return countInvoice;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setNumberInvoice(String numberInvoice) {
		this.numberInvoice = numberInvoice;
	}

	public void setProductsList(ArrayList<Product> productsList) {
		this.productsList = productsList;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public void setCountInvoice(int countInvoice) {
		this.countInvoice = countInvoice;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
}
