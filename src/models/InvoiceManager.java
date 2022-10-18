package models;

import java.util.ArrayList;

import DAO.InvoiceDAO;

public class InvoiceManager {
	
	public Invoice invoiceTemp;
	
	public InvoiceDAO invoiceDAO = new InvoiceDAO();
	
	private int countInvoice;
	
	
	public InvoiceManager() {
		super();
		invoiceTemp = new Invoice(generateNumberInvoice());
		countInvoice = 0;
	}
	
	public Invoice getInvoiceDAO(String number_invoice) {
		return invoiceDAO.getInvoice(number_invoice);
	}
	
	
	public void SaveInvoice(Invoice invoice) {
		invoiceDAO.insertInvoice(invoice);
	}

	public Invoice getInvoiceTemp() {
		return invoiceTemp;
	}

	public void setInvoiceTemp(Invoice invoiceTemp) {
		this.invoiceTemp = invoiceTemp;
	}
	
	
	
	public String generateNumberInvoice() {
		countInvoice++;
		return "AVA"+3;
	}
	
	

}
