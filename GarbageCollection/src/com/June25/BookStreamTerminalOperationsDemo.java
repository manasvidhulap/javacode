package com.June25;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookStreamTerminalOperationsDemo {

	public static void main(String[] args)
	{
		List<Book>books=List.of(
				new Book("The Great Gatsby","F.Scott Fitzgerald",12.99,180,true),
				new Book("To kill a Mockingbird","Harper Lee",10.50,281,true),
				new Book("1984","George Orwell",9.99,328,true),
				new Book("Pride and Prejuidice","Jane Austan",7.95,279,false),
				new Book("The Hobbit","J.R.R.Tolkein",14.95,310,true)
				);
		
		System.out.println("Available Books:");
		books.stream().filter(Book::isAvailable).forEach(book->System.out.println("Title:"+book.getTitle()+"Author:"+book.getAuthor()+"Price:"+book.getPrice()));
		
		long bookcount=books.stream().count();
		System.out.println("\nTotal Books:"+bookcount);
		
		List<String>tolkeinBooks=books.stream().filter(book->book.getAuthor().equals("J.R.R.Tolkein")).map(Book::getTitle).collect(Collectors.toList());
		System.out.println("\nTolkien Books:"+tolkeinBooks);
		
		Optional<Double>cheapestPrice=books.stream().map(Book::getPrice).min(Double::compare);
		System.out.println("\nCheapest Book Price:$"+cheapestPrice.orElse(-1.0));
		
		Optional<Integer>highestPageCount=books.stream().map(Book::getPageCount).max(Integer::compare);
		System.out.println("\nHighest Page Count:"+highestPageCount.orElse(-1));
		
		Book firstBook=books.stream().findFirst().orElse(null);
		System.out.println("\nFirst Book:"+(firstBook!=null?firstBook.getTitle():"None"));
		
		Book anyAvailableBook=books.stream().filter(Book::isAvailable).findAny().orElse(null);
		System.out.println("\nAny Available Book:"+(anyAvailableBook!=null?anyAvailableBook.getTitle():"None"));
		
		boolean allAvailable=books.stream().allMatch(Book::isAvailable);
		System.out.println("\nAll Books Available:"+allAvailable);
		
		boolean anyLongBook=books.stream().anyMatch(book->book.getPageCount()>300);
		System.out.println("\nAny Book with More than 300 Pages:"+anyLongBook);
		
		boolean noneOutOfStock=books.stream().noneMatch(book->!book.isAvailable());
		System.out.println("\nNo Books Out Of Stock:"+noneOutOfStock);
		
		double totalPrice=books.stream().map(Book::getPrice).reduce(0.0, Double::sum);
		System.out.println("\nTotal Price of Books:$"+totalPrice);
		
		String[]bookTitlesArray=books.stream().map(Book::getTitle).toArray(String[]::new);
		System.out.println("\nBook Titles:"+java.util.Arrays.toString(bookTitlesArray));
	}

}


















