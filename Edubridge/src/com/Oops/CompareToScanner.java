package com.Oops;

import java.util.Scanner;

public class CompareToScanner {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1="hello";
		String s2="hii";
		String s3="hemlo";
		String s4="hii";
		String s5="bye";
		
		System.out.println("Enter the String s1:");
		String S1=sc.next();
		System.out.println("Enter the String s2:");
		String S2=sc.next();
		System.out.println("Enter the String s3:");
		String S3=sc.next();
		System.out.println("Enter the String s3:");
		String S4=sc.next();
		System.out.println("Enter the String s4:");
		String S5=sc.next();
		
		
		System.out.println(s1.compareTo(s4));
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s5));
		System.out.println(s4.compareTo(s5));
		System.out.println(s5.compareTo(s1));
	}

}
