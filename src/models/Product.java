package models;

import java.io.Serializable;

public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int pro_id;
	private String pro_name;
	private String pro_measure;
	private double pro_price;
	private int pro_units;
	
	public Product(){
		super();
	}
	
	public Product(int pro_id) {
		super();
		this.pro_id = pro_id;
	}

	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_measure() {
		return pro_measure;
	}
	public void setPro_measure(String pro_measure) {
		this.pro_measure = pro_measure;
	}
	public double getPro_price() {
		return pro_price;
	}
	public void setPro_price(double pro_price) {
		this.pro_price = pro_price;
	}
	public int getPro_units() {
		return pro_units;
	}
	public void setPro_units(int pro_units) {
		this.pro_units = pro_units;
	}
	

	
}
