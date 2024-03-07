package com.March6;

import java.util.Scanner;

public class Main 
{
	void pn() throws PositiveException , NegativeException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int no = sc.nextInt();
		
		if(no>0)
		{
			throw new PositiveException("The no is greater than zero");
		}
		else if(no<0)
		{
			throw new NegativeException("The no is less than zero");
		}
		else
		{
			System.out.println("The number is zero");
		}
	}

	public static void main(String[] args) 
	{
		Main m1 =new Main();
		
		try
		{
			m1.pn();
			
		}
		catch(PositiveException e)
		{
			e.printStackTrace();
		}
		catch(NegativeException e)
		{
			e.printStackTrace();
		}

	}

}
