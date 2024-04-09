package com.eb.main;

import java.util.Scanner;

import com.eb.dao.menuuDao;
import com.eb.pojo.menuu;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		
		String name=sc.next();
		
		System.out.println("Welcome to VahiniSaheb"+ name);
		
		int ch=0;
		do
		{
			System.out.println("Press 1 for Add Menu");
			System.out.println("Press 2 for update Menu");
			System.out.println("Press 3 for Delete Menu");
			System.out.println("Press 4 for Read Menu");
			System.out.println("Press 5 for Exit Menu");
			System.out.println("Enter Choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					 System.out.println("Enter Menu Name:");
					String menuname=sc.next();
					 System.out.println("Enter Menu Type:");
					String menutype=sc.next();
					 System.out.println("Enter Menu Prise:");
				    int prise=sc.nextInt();
				     System.out.println("Enter Menu Quantity");
				    int quantity=sc.nextInt();
				     menuu m=new menuu(menuname,menutype,prise,quantity);
				     boolean ans=menuuDao.createMenu(m);
				     System.out.println("Menu Inserted Successfully");
				     break;
				     
				case 2:
					System.out.println("Press 1 to update menu name:");
					System.out.println("Prees 2 to update menu type:");
					int val=sc.nextInt();
					
					if(val==1)
					{
						System.out.println("Enter menu name which u want to update:");
						String menuname1=sc.next();
						System.out.println("Enter Id:");
						int id=sc.nextInt();
						menuu m1=new menuu();
						m1.setMenuName(menuname1);
						boolean f=menuuDao.createMenu(m1);
						System.out.println("Menu Name is updates successfully");
					}
						else if(val==2)
						{
							System.out.println("Enter Menu type which u want to update:");
							String menutype1=sc.next();
							System.out.println("Enter Id:");
							int id=sc.nextInt();
							menuu m1=new menuu();
							m1.setMenuType(menutype1);
							boolean f=menuuDao.createMenu(m1);				
							System.out.println("menu type is updated successfully");
						}
						
						else
						{
							System.out.println("Data is not updated");
						}
						
						break;
					case 3:
						System.out.println("Enter Id which u want delete:");
						int id=sc.nextInt();
						menuuDao.DeleteMenu(id);
						System.out.println("Id is deleted");
						break;
						
					case 4:
						menuuDao.showAllMenu();
						break;
					
					case 5:
						System.out.println("Bye Bye:");
						break;
						default:
							System.out.println("Wrong choice");
					}
				
				}while(ch!=5);
					
	}
					
}


























