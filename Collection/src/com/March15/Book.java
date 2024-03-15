package com.March15;

public class Book 
{
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int BId;
	private String BName;
	private String BAuthor;
	private int BPrice;
	public int getBId() {
		return BId;
	}
	public void setBId(int bId) {
		BId = bId;
	}
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	public String getBAuthor() {
		return BAuthor;
	}
	public void setBAuthor(String bAuthor) {
		BAuthor = bAuthor;
	}
	public int getBPrice() {
		return BPrice;
	}
	public void setBPrice(int bPrice) {
		BPrice = bPrice;
	}
	public Book(int bId, String bName, String bAuthor, int bPrice) {
		super();
		BId = bId;
		BName = bName;
		BAuthor = bAuthor;
		BPrice = bPrice;
	}
	
}
