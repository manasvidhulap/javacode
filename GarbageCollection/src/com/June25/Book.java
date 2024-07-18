package com.June25;

public class Book
{
	private String title;
	private String author;
	private double price;
	private int pageCount;
	private boolean available;
	
	public Book(String title, String author, double price, int pageCount, boolean available) {
		
		this.title = title;
		this.author = author;
		this.price = price;
		this.pageCount = pageCount;
		this.available = available;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", pageCount=" + pageCount
				+ ", available=" + available + "]";
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getPageCount() {
		return pageCount;
	}
	public boolean isAvailable() {
		return available;
	}
	
}
