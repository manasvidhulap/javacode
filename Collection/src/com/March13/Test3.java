package com.March13;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		 int ch = 0;
		 
		 ArrayList<Friends>a1= new ArrayList<Friends>();
		 
		 do
		 {
			 System.out.println("Press1.Enter Friend Details:");
			 System.out.println("Press2.Display Details:");
			 System.out.println("Press3.Exit:");
			 System.out.println("Press4.Enter Choice:");
			 ch= sc.nextInt();
			 switch(ch)
			 {
			 case 1:
				 System.out.println("Enter Friend Name:");
				 String name = sc.next();
				 System.out.println("Enter Friend Age:");
				 String age = sc.next();
				 
				 a1.add(new Friends(age, name));
				 System.out.println(a1);
				 
				 break;
				 
			 case 2:
				 System.out.println("Details:");
				 for(int i =0;i<a1.size();i++)
				 {
					 System.out.println(a1.get(i));
				 }
				 break;
				 
			 case 4:
				 System.out.println("Exit");
				 break;
				 
				 default:
				 System.out.println("Wrong Input");
				
			 }
		 
		 }
		 while(ch!=4);
		 
	}
}


