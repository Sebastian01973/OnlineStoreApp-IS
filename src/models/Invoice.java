package models;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class Invoice implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numberInvoice;
	private User user;
	private ArrayList<Product> productsList;
	private Date date;
	private double totalPrice;
	
	public Invoice(String numberInvoice, ArrayList<Product> list, Date date) {
		super();
		this.numberInvoice = numberInvoice;
		this.productsList = list;
		this.date = date;
		for(Product product: list) {
			this.totalPrice += product.getPro_price();
		}
	}
	
	public String getNumberInvoice() {
		return this.numberInvoice;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public double getPrice() {
		return totalPrice;
	}
	
	public ArrayList<Product> getProducts(){
		return productsList;
	}
}
