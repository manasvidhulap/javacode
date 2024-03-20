package com.March20;

import java.util.function.BiFunction;

class ArithmeticOp
{
	static int add(int i , int j)
	{
		return i+j;
	}
}
public class MethodReference2 {

	public static void main(String[] args) {
		
		BiFunction<Integer , Integer ,Integer>b1=ArithmeticOp::add;
		int x=b1.apply(12, 45);
		System.out.println(x);
	}

}
