package com.pattern;

import java.util.Scanner;

public class pattern
{
	static void pattern(int num) 
	{
		for(int i=1;i<=num;i++)
		{
			for(int k=i+1;k<=num;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

    public static void main(String[] args) 
	{ 
    	 int num1, num2, num3;
	     Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter  row for first pattern:");
    	 num1=sc.nextInt();
    	 System.out.println("Enter  first num1:");
    	 num2=sc.nextInt();
    	 System.out.println("Enter  first num1:");
    	 num3=sc.nextInt();
    	
    	    pattern(num1);
	 		pattern(num2);
	 		pattern(num3);
	}

}
