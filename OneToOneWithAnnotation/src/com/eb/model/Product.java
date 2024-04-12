package com.eb.model;

public class Product
{
	private int productId;
	private String productName;
	private int prise;
	private String Qty;
	private Customer c1;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	public String getQty() {
		return Qty;
	}
	public void setQty(String qty) {
		Qty = qty;
	}
	public Customer getC1() {
		return c1;
	}
	public void setC1(Customer c1) {
		this.c1 = c1;
	}
	
}
