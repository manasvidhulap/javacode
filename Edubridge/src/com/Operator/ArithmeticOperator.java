package com.Operator;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x*y);
		System.out.println(x%y);
	}

}
