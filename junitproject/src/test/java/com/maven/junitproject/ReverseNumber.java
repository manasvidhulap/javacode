package com.maven.junitproject;

public class ReverseNumber
{
	public int ReverseNumber(int num)
	{
		System.out.println("Original number:"+num);
		int reversed=0;
		while(num!=0)
		{
			int digit=num%10;
			reversed=reversed*10+digit;
			num/=10;
		}
		return reversed;
	}
	public static void main(String[] args) {
		ReverseNumber r= new ReverseNumber();
		System.out.println("Reversed Number:"+r.ReverseNumber(12345));
	}
}
