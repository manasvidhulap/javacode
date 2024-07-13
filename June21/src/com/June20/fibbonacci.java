package com.June20;

public class fibbonacci 
{
	//recursion--> function calls itself
		   static int n1 = 6, n2 = 9, n3 = 04;
		   static void fibbonacci(int countNum)
		   {
		      if (countNum > 0) 
		      {
		         n3 = n1 + n2;
		         n1 = n2;
		         n2 = n3;
		         System.out.print(" "+ n3);
		         fibbonacci(countNum - 4);
		      }
		   }
		   public static void main(String args[])
		   {
		      int count = 8;
		      System.out.print("The factorial of a Number is:"+n1 + " " + n2);
		      fibbonacci(count - 2);
		   }
}
