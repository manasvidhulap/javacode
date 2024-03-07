package com.March6;

import java.util.Scanner;

public class positiveornegative2 {
		  void show() throws positiveornegative
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number :");
			int number = sc.nextInt();
			if(number>0)
			{
				throw new positiveornegative("The given number is positive"); 
			}
			else if(number<0)  
			{
				System.out.println("The given number is negative");
			}
			else
			{
				System.out.println("The given number is zero");
			}
		}

		public static void main(String[] args) 
		{
			positiveornegative2 v = new positiveornegative2();
			try
			{
				v.show();
			}
			catch(positiveornegative e)
			{
			   e.getMessage();
		    }

}
}
