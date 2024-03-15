package com.March1;

import java.util.Scanner;

public class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("STUDENTS GRADE:");
		System.out.println("Enter Students Name:");
		String name=sc.next();
		System.out.println("Enter Student Roll no:");
		int rollno = sc.nextInt();
;		System.out.println("Enter Student Physics marks1:");
        int marks1 = sc.nextInt();
		System.out.println("Enter Student Chemistry marks2:");
		int marks2 = sc.nextInt();
		System.out.println("Enter Student Biology marks3:");
		int marks3 = sc.nextInt();
		System.out.println("Total marks="+(marks1+marks2+marks3));
		int total = marks1+marks2+marks3;
		System.out.println("Avarage marks="+(total/3)+"%");
		int avg = total/3;
		if(avg>=90) {
			System.out.println("Grade:A");
		}
		else if(avg>=65)
		{
			System.out.println("Grade:B");
		}
		else if(avg>=45)
		{
			System.out.println("Grade:C");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
