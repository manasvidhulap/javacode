package com.demo;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr the number of sides in polygon :");
		int n=sc.nextInt();
		
		System.out.println("Enter the length of sides in polygon :");
		double l=sc.nextDouble();
		
		double angle= Math.toRadians(180/n);
	    angle=Math.tan(angle);
	    
	    double area=((l*l*n)/(4*angle));
	    System.out.print("Area of polygon is:"+area);


	}

}
