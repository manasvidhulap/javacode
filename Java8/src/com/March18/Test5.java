package com.March18;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) 
	{
		ArrayList<Book> a1=new ArrayList<Book>();
		
		Book b1=new Book(101,"c",200,"Dennis");
		Book b2=new Book(102,"c#",150,"microsoft");
		Book b3=new Book(103,"pyhton",500,"guido van rossum");
		Book b4=new Book(104,"angular",600,"google");
		Book b5=new Book(105,"java",300,"james gosling");
		
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		a1.add(b5);
		
		a1.forEach(i->{System.out.println(i);});
	}

}
