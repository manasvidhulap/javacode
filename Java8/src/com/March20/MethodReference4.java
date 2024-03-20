package com.March20;

import java.util.function.BiFunction;

class OP
{
	public int add(int a , int b)
	{
		return a+b;
	}
	
	public int sub(int a , int b)
	{
		return a-b;
	}
	
	public int mul(int a , int b)
	{
		return a*b;
	}
	
	public int div(int a , int b)
	{
		return a/b;
	}
	
	public int mod(int a , int b)
	{
		return a%b;
	}
}
public class MethodReference4 
{
	public static void main(String[] args) 
	{
		BiFunction<Integer , Integer , Integer>bb=new OP()::add;
		int result=bb.apply(10, 20);
		System.out.println("The Addition of this two number is:"+result);
		
		BiFunction<Integer , Integer , Integer>bb1=new OP()::sub;
		int result1=bb.apply(60, 20);
		System.out.println("The Subtraction of this two number is:"+result1);
		
		BiFunction<Integer , Integer , Integer>bb2=new OP()::mul;
		int result2=bb.apply(90, 22);
		System.out.println("The Multiplication of this two number is:"+result2);
		
		BiFunction<Integer , Integer , Integer>bb3=new OP()::div;
		int result3=bb.apply(30, 23);
		System.out.println("The Division of this two number is:"+result3);
		
		BiFunction<Integer , Integer , Integer>bb4=new OP()::mod;
		int result4=bb.apply(50, 46);
		System.out.println("The Module of this two number is:"+result4);
	}

}
