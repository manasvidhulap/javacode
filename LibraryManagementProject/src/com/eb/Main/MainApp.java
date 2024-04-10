package com.eb.Main;

import java.util.Scanner;

import com.eb.Dao.bookDao;
import com.eb.pojo.Book;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Book Name:");
		String name=sc.next();
		
		System.out.println("Welcome to SNC Library....!!!");
		int ch=0;
		do
		{
			System.out.println("Press 1 for Add new Book");
			System.out.println("Press 2 for Update the Book");
			System.out.println("Press 3 for Delete the Book");
			System.out.println("Press 4 for Search the Book");
			System.out.println("Press 5 for Show the Book");
			System.out.println("Press 6 for Exit the Library");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Book Name");;
				String bookname=sc.next();
				System.out.println("Enter Book Author Name");
				String bookauthor=sc.next();
				System.out.println("Enter Book Price");
				int bookprice=sc.nextInt();
				System.out.println("Enter Book Publication");
				String publication=sc.next();
				Book b= new Book(bookname , bookauthor, bookprice,publication);//getting book object with constructor variable
				boolean ans=bookDao.createbook(b);
				System.out.println("Book is added Successfully...!!!");
				break;
				
			case 2:
				
				System.out.println("press 1 to update book price");
				System.out.println("press 2 to update book name");
				int val=sc.nextInt();
				
				if(val==1)
				{
					System.out.println("Enter book price which you want to update");
					int bookprice1=sc.nextInt();
					System.out.println("Enter id");
					int id1=sc.nextInt();
					Book b1=new Book();
					b1.setBookprice(bookprice1);
					boolean f=bookDao.createbook(b1);
					System.out.println("Book updated Successfully...!!!");
				}
				else if(val==2)
				{
					System.out.println("Enter book name which you want to update");
					String bookname1=sc.next();
					System.out.println("Enter id");
					int id1=sc.nextInt();
					Book b2=new Book();
					b2.setBookname(bookname1);
					boolean f=bookDao.createbook(b2);
					System.out.println("Book updated Successfully...!!!");
				}
				else
				{
					System.out.println("Book is not Updated...!!!");
				}
				break;
				
			case 3:
				
				System.out.println("Enter Book id which you want to Deleted");
				int bookid=sc.nextInt();
				bookDao.deletebook(bookid);
				System.out.println("Book is Deleted Successfully..!!!");
				break;
				
			case 5:
				 bookDao.showAllBook();
				 break;
				 
			case 6:
				System.out.println("Bye Bye...Visit Again...!!!");
				break;
				default:
					System.out.println("Wrong Choice...");
			}
			
		}while(ch!=6);
		
	}
	}

