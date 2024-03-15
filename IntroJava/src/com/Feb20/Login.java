package com.Feb20;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) 
	{
		String name="sneha";
		System.out.println(name);
		String s = new String("Good Morning");
		System.out.println(s);
		char ch[]= {'m','a','n','k','h','u','r','d'};
		String s1=new String(ch);
		System.out.println(s1);
		System.out.println("size of String:"+s1.length());
		String fname="Sneha";
		String lname="Dhulap";
		System.out.println(fname+" "+lname);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");
		String username=sc.next();
		System.out.println("Enter Passwpord:");
		String password = sc.next();
		if(username.equals("sneha") && password.equals("chakuli"))
		{
			System.out.println("you can Login");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}

}
