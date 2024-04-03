package com.March20;

import java.util.function.BiFunction;

public class StudenMethodRef {

	public static void main(String[] args) 
	{
		BiFunction<Integer , String , Student>b=Student::new;
		b.apply(101,"SNEHA");
		System.out.println(	b.apply(101,"SNEHA"));
		
	}

}
