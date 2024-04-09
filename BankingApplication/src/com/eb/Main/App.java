package com.eb.Main;

import java.util.Scanner;

import com.eb.bankDao.bankDao;
import com.eb.pojo.bank;

public class App 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Bank Name: ");
		String name=sc.next();
		
		System.out.println("Welcome to Bank "+name);
		int ch=0;
		do
		{
			System.out.println("Press 1 for Open Bank Account");
			System.out.println("Press 2 for Update Bank Account Details");
			System.out.println("Press 3 for Read Bank Account Details");
			System.out.println("Press 4 for Delete the Bank Account");
			System.out.println("Press 5 for Exit from Bank");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					
					System.out.println("Enter Account Number:");
					int accno=sc.nextInt();
					System.out.println("Enter Account Holder Name:");
					String accholdername=sc.next();
					System.out.println("Enetr Address:");
					String address=sc.next();
					System.out.println("Enter Contact Number:");
					int contactno=sc.nextInt();
					System.out.println("Enter Account Balance:");
					int balance=sc.nextInt();
					
					bank b= new bank(accno,accholdername,address,contactno,balance);
					boolean ans=bankDao.createBank(b);
					
					System.out.println("Bank Account Detail Inserted Successfully....!!!");
					break;
					
				case 2:
					
					System.out.println("Press 1 to update the Account Holder Name");
					System.out.println("Press 2 to update the Address");
					System.out.println("press 3 to update the Contact Number");
					System.out.println("Press 4 to update the Bank Balance");
					int val=sc.nextInt();
					
					if(val==1)
					{
						System.out.println("Enter Account Holder Name which you want to Update");
						String accholdername1=sc.next();
						
						System.out.println("Enter id");
						int id=sc.nextInt();
						
						bank b1=new bank();
						b1.setAccholdername(accholdername1);
						boolean f=bankDao.createBank(b1);
						
						System.out.println("Account Holder Name is Updated Successfully....!!!");
					}
					else if(val==2)
					{
						System.out.println("Enter Address which you want to Update");
						String address1=sc.next();
						
						System.out.println("Enter id:");
						int id=sc.nextInt();
						
						bank b1=new bank();
						b1.setAddress(address1);
						boolean f=bankDao.createBank(b1);
						
						System.out.println("Address is Updated Successfully...!!!");
					}
					else if(val==3)
					{
						System.out.println("Enter Contact Number which you want to Update");
						int contactno1=sc.nextInt();
						
						System.out.println("Enter id:");
						int id=sc.nextInt();
						
						bank b1=new bank();
						b1.setContactno(contactno1);
						boolean f=bankDao.createBank(b1);
						
						System.out.println("Contact Number is Updated Successfully...!!!");	
					}
					else if(val==4)
					{
						System.out.println("Enter Bank Balance which you want to update");
						int balance1=sc.nextInt();
						
						System.out.println("Enter id:");
						int id=sc.nextInt();
						
						bank b1=new bank();
						b1.setBalance(balance1);
						boolean f=bankDao.createBank(b1);
						
						System.out.println("Bank Balance is Updated Successfully...!!!");
					}
					else
					{
						System.out.println("Data is not Updated....");
					}
					break;
					
				case 3:
					 bankDao.readbank();
					 break;
					 
				 case 4:
					 {
						System.out.println("Enter Id which you want to Delete");
						int id=sc.nextInt();
						
						bankDao.Deletebank(id);
						System.out.println("Id is Deleted Successfully...!!!");
						break;
					 }
			 
				 case 5:
					 System.out.println("Bye Bye...");
					 break;
					 default:
						 System.out.println("Wrong Choice...");
			}
				
		}while(ch!=5);
		

	}

}
