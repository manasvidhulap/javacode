package com.March15;

import java.util.Hashtable;
import java.util.Map;

public class HashTableBook {

	public static void main(String[] args)
	{
		Hashtable<Integer,Book>ht2=new Hashtable<Integer,Book>();
		
		Book b1=new Book(101,"c++","Bjarne Stroustrup",500);
		Book b2=new Book(102,"java","James Gosling",400);
		Book b3=new Book(103,"python","Guido Van Rossum",300);
		Book b4=new Book(104,"angular","Misko Havery",700);
		Book b5=new Book(105,"c","Denis M",600);
		
		ht2.put(101, b1);
		ht2.put(102, b2);
		ht2.put(103, b3);
		ht2.put(104, b4);
		ht2.put(105, b5);
		
		for(Map.Entry<Integer, Book>book:ht2.entrySet())
		{
			int key=book.getKey();
			Book b= book.getValue();
			System.out.println("Book Details are:");
			System.out.println("********************");
			System.out.println("Book Id: "+b.getBId());
			System.out.println("Book Author: "+b.getBAuthor());
			System.out.println("Book Price: "+b.getBPrice());
			System.out.println("Book Name: "+b.getBName());
		}
	}

}
