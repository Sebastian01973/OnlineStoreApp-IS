package models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String numberInvoice;
	private User user;
	private ArrayList<Product> productsList;
	private LocalDate date;
	private double totalPrice;
	
	public Invoice() {
		super();
	}
	
	
	
}
