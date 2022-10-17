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

	private int id_user;
	private int id;
	private Date date;
	private String numberInvoice;
	private ArrayList<Product> productsList;
	
	private DetailDAO detailDAO;
	
	private double totalPrice,subtotalPrice;
	
	private int countInvoice;
	
	
	public Invoice() {
		super();
		productsList = new ArrayList<>();
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
	
	public void addProductCar(Product product) {
		productsList.add(product);
	}
	
	public int getId_user() {
		return id_user;
	}


	public String generateNumberInvoice() {
		countInvoice++;
		return "AVA"+countInvoice;
	}
	
	public void calculateSubtotal() {
		for (Product product: productsList) {
			subtotalPrice += product.calculatePrice();
		}
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

	public double getSubtotalPrice() {
		return subtotalPrice;
	}

	public int getCountInvoice() {
		return countInvoice;
	}

	
}
