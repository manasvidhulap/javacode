package com.inheritence;
class Book
{
    String title;
    String author;

    Book(String title, String auth) {
        this.title = title;
        author = auth;
    }

    void displayBookDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class Technical extends Book{

	Technical(String title, String auth) {
		super(title, auth);
		// TODO Auto-generated constructor stub
	}
	
}
public class Library {

	public static void main(String[] args) 
	{
		Book book = new Book("GOD OF WAR", "LOGESH");
        
        book.displayBookDetails();
        Technical t=new Technical("Hitler","rajan");
        t.displayBookDetails();
	}

}
