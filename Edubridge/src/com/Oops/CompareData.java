package com.Oops;

public class CompareData {

	public static void main(String[] args)
	{
		String s1="hello";
		String s2="hii";
		String s3="hemlo";
		String s4="hii";
		String s5="bye";
		System.out.println(s1.compareTo(s4));
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s5));
		System.out.println(s4.compareTo(s5));
		System.out.println(s5.compareTo(s1));
	}

}
