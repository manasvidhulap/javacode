package com.eb.Main;

import java.util.Scanner;

import com.eb.Dao.studentsDao;
import com.eb.pojo.students;

public class App 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String name=sc.next();
		System.out.println("Welcome Student:"+name);
		
		int ch=0;
		do
		{
			System.out.println("Press 1 for Add Student Name");
			System.out.println("Press 2 for Update Student Name");
			System.out.println("Press 3 for Delete Student Name");
			System.out.println("Press 4 for Read Student Name");
			System.out.println("Press 5 for Exit");
			System.out.println("Enter Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				
				System.out.println("Enter Student Name:");
				String sname=sc.next();
				
				System.out.println("Enter Stduent Phone Number:");
				String sphone=sc.next();
			    System.out.println("Enter Student City Name:");
			    String scity=sc.next();
			    students s=new students(sname , sphone , scity);
			    boolean ans = studentsDao.createstudents(s);
			    System.out.println("Student Data Inserted Successfully..........!!!");
			    break;
			    
			case 2:
			
				System.out.println("Press 1 to update student name:");
				System.out.println("Press 2 to update student phone number:");
				System.out.println("Press 3 for update student city name:");
				int val=sc.nextInt();
				
				if(val==1)
				{
					System.out.println("Enter student name which you want to update:");
					String sname1=sc.next();
					System.out.println("Enter sid:");
					int sid1=sc.nextInt();
					students s1=new students();
					s1.setSname(sname1);
					boolean f=studentsDao.createstudents(s1);
					System.out.println("Student NAme Updated is Successfully.....!!!");
				}
				else if(val==2)
				{
					System.out.println("Enter student phone number which you want to update:");
					String sphone1=sc.next();
					System.out.println("Enter sid:");
					int sid1=sc.nextInt();
					students s1=new students();
					s1.setSphone(sphone1);
					boolean f=studentsDao.createstudents(s1);
					System.out.println("Student Phone Number is Updated is Successfullt....!!!");
				}
				else if(val==3)
				{
					System.out.println("Enter Student City Name which you want to update:");
					String scity1=sc.next();
					System.out.println("Enter sid:");
					int sid1=sc.nextInt();
					students s1= new students();
					s1.setScity(scity1);
					boolean f=studentsDao.createstudents(s1);
					System.out.println("Student City Name is Updated Successfully...!!!");
				}
				else
				{
					System.out.println("Student Data is Not Updated.....!!!");
				}
				break;
				
				case 3:
				
					System.out.println("Enter Student id which you want to Deleted:");
				    int sid2=sc.nextInt();
				    studentsDao.studentdelete(sid2);
				    System.out.println("ID Deleted is Successfully...!!!");
				    break;
				    
				case 4:
				    studentsDao.ShowAllstudents();
				    break;
				    
				case 5:
					System.out.println("Bye Bye Guys....!!!!");
					break;
					default:
						System.out.println("Wrong Choice...");
				}
			}while(ch!=5);
			
					
		}
	}




















