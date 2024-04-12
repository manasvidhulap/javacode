package com.onetomany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ITEM")
public class Item1 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="item_id")
	private String itemId;
	
	@Column(name="item_total")
	private double itemTotal;
	
	@Column(name="guantity")
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart1 cart1;
	
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id=id;
	}
	public Item1()
	{
		super();
	}
	 
	public Item1(String itemId , double itemTotal , int quantity,Cart1 cart1)
	{
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.quantity = quantity;
		this.cart1 = cart1;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public double getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Cart1 getcart1()
	{
		return cart1;
	}
	public void setCart1(Cart1 cart1)
	{
		this.cart1=cart1;
	}
}









