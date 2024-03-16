package com.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Test1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Menu>list=new ArrayList<Menu>();
		
		int ch=0;
		do
		{
			System.out.println("***Welcome to Sneha Hotel***");
			System.out.println("press1:Insert Menu");
			System.out.println("press2:Read Menu");
			System.out.println("press3:Update Menu");
			System.out.println("press4:Delete Menu");
			System.out.println("press5:CAlculate Total Bill");
			System.out.println("press6:Exit");
			System.out.println("Enter Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Mnu Id:");
				int MenuID=sc.nextInt();
				System.out.println("Enter Menu Name:");
				String MenuName=sc.next();
				System.out.println("Enter Menu Prize:");
				int MenuPrize=sc.nextInt();
				System.out.println("Enter Menu Category:");
				String MenuCategory=sc.next();
				System.out.println("Enter Menu Quantity:");
				int MenuQuantity=sc.nextInt();
				
				list.add((new Menu(MenuID,MenuPrize,MenuName,MenuCategory,MenuQuantity)));
				
				System.out.println("*************************");
				System.out.println("Record Store Successfully");
				break;
				
			case 2:
				System.out.println("Read Details: ");
				
				Iterator<Menu>m=list.iterator();
				while(m.hasNext())
				{
					Menu m1= m.next();
					System.out.println("MenuID:"+m1.getMenuID()+"\n MenuName:"+m1.getMenuName()+"\n MenuPrize:"+m1.getMenuPrize()+"\n MenuCategory:"+m1.getMenuCategory()+"\n MenuQuantity:"+m1.getMenuQuantity());
				}
				break;
				
			case 3:
				boolean found=false;
				
				System.out.println("Enter MenuId which u want to update:");
				MenuID =sc.nextInt();
				
				ListIterator<Menu>li=list.listIterator();
				while(li.hasNext())
				{
					Menu mm=li.next();
					if(mm.getMenuID()==MenuID)
					{
						System.out.println("Enter Menu Name:");
						MenuName= sc.next();
						System.out.println("Enter Menu Prize:");
						MenuPrize=sc.nextInt();
						System.out.println("Enter Menu Category :");
						MenuCategory = sc.next() ;
						System.out.println("Enter Menu Quantity: ");
						MenuQuantity = sc.nextInt();
						li.set(new Menu());
						found=true;
						
					}
				}
				if(!found)
					System.out.println("Record Not Found");
				else
					System.out.println("Record Updated");
				break;
				
			case 4:
				found=false;
				
				System.out.println("Enter MenuID which u want  to delete:");
				
				MenuID=sc.nextInt();
				ListIterator<Menu>li1=list.listIterator();
				while(li1.hasNext())
				{
					Menu mm=li1.next();
					if(mm.getMenuID()==MenuID)
					{
						li1.remove();
						found=true;
					}
				}
				if(!found)
					System.out.println("Record Nt Found");
				else
					System.out.println("Record Deleted");
				break;
				
			case 5:
				System.out.println("Calculated Bill");
				found=false;
				int TB=0;
				System.out.println("Enter MenuID to Calculate Bill:");
				MenuID=sc.nextInt();
				ListIterator<Menu>li2=list.listIterator();
				while(li2.hasNext())
				{
					Menu mm=li2.next();
					if(mm.getMenuID()==MenuID)
					{
						TB=mm.getMenuPrize()*mm.getMenuQuantity();
						found=true;
					}
				}
				if(!found)
					System.out.println("Record  not Found");
				else
					System.out.println("Total Bill:"+TB);
				break;
				
			case 6:
				System.out.println("Service Down");
				break;
			}
		}
		while(ch!=6);
	}

}
