package com.March6;

import java.util.Scanner;

public class voting2 {
	void show() throws voting{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age :");
		int age = sc.nextInt();
		if(age<18) {
			throw new voting("You are not eligible for voting");
		}
		else {
			System.out.println("You are eligible for voting");
		}
	}

	public static void main(String[] args) 
	{
		voting2 v = new voting2();
		try
		{
			v.show();
		}
		catch(voting e)
		{
		   e.printStackTrace();
	    }

}
}
