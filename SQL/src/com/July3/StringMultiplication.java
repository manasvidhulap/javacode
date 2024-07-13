package com.July3;

import java.math.BigInteger;

public class StringMultiplication {

	public static void main(String[] args)
	{
		String A="3";
		String B="3";
		
		String result=string_multiply(A,B);
		
		System.out.println("String A:"+A);
		System.out.println("String B:"+B);
		System.out.println("Multiplication Result:"+result);
	}

	public static String string_multiply(String a, String b) 
	{	
		//convert String A and b to Bigintegers
		BigInteger numA=new BigInteger(a);
		BigInteger numB=new BigInteger(b);
		
		//Multiply numA and numB
		BigInteger multiplicationResult=numA.multiply(numB);
		
		//convert result back to String
		String result=multiplicationResult.toString();
		return result;
	}

}
