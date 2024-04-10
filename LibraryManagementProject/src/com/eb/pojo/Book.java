package com.eb.pojo;

public class Book 
{
	private String bookname;
	private String bookauthor;
	private int bookprice;
	private String publication;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookname, String bookauthor, int bookprice, String publication) {
		super();
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
		this.publication = publication;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookprice=" + bookprice
				+ ", publication=" + publication + "]";
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
}
