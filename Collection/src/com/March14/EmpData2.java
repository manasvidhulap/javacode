package com.March14;

import java.util.LinkedList;
import java.util.Scanner;

public class EmpData2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ch =0;
		LinkedList<EmpData>l1=new LinkedList<EmpData>();
		do
		{
			System.out.println("LinkedList Implementation");
			
			System.out.println("Press1:Add data into List");
			System.out.println("Press2:Display List");
			System.out.println("Press3:Update List");
			System.out.println("Press4:Delete List");
			System.out.println("Press5:Exit");
			System.out.println("Wrong Choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Emp Name :");
				String name = sc.next();
				System.out.println("Enter the Emp Id :");
				int id = sc.nextInt();
				System.out.println("Enter the Emp Age :");
				int age = sc.nextInt();
				System.out.println("Enter the Emp Salary :");
				int salary = sc.nextInt();
				l1.add(new EmpData(id,name,age,salary));
				System.out.println("Data addes successfully");
				break;
				
			case 2:
				System.out.println("LinkedeList elemnts are:");
				for(int i=0;i<l1.size();i++)
				{
					System.out.println(l1.get(i));
				}
				break;
				
			case 3:
			    System.out.println("Enter index number which you want to change");
			    int n = sc.nextInt();
			    System.out.println("Enter name which you want to add on index");
			    String name1=sc.next();
			    EmpData e = new EmpData();
			    e.setEmpName(name1);
			    l1.set(n, e);
			    System.out.println("Emp Name Updated");
			    break;
			    
			case 4:
				System.out.println("Enter index number which you want to delete");
				int i = sc.nextInt();
				l1.remove();
				System.out.println("Index deleted successfully");
				break;
				
			case 5:
				System.out.println("Exit");
				break;
				default:
					System.out.println("Wrong choice");
		
			}
			
		}
		while(ch!=5);
	}

}
