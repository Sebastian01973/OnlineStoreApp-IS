package models;

import java.util.ArrayList;

import DAO.InvoiceDAO;

public class InvoiceManager {
	
	public Invoice invoiceTemp;
	public InvoiceDAO invoiceDAO;
	
	
	public InvoiceManager() {
		super();
		invoiceTemp = new Invoice();
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
	

}
