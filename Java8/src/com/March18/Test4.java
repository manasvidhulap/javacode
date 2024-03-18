package com.March18;
interface Arithmetic
{
	public void show(int a,int b);
}
public class Test4 {

	public static void main(String[] args)
	{
		Arithmetic a1=(int a, int b)-> System.out.println("The Addition of two number is :"+(a+b));
		Arithmetic a2=(int a, int b)-> System.out.println("The Subtraction of two number is :"+(a-b));
		Arithmetic a3=(int a, int b)-> System.out.println("The Multiplication of two number is :"+(a*b));
		Arithmetic a4=(int a, int b)-> System.out.println("The Division of two number is :"+(a/b));
		Arithmetic a5=(int a, int b)-> System.out.println("The Module of two number is :"+(a%b));
		
		a1.show(10, 2);
		a2.show(3, 22);
		a3.show(5, 78);
		a4.show(60, 23);
		a5.show(8, 29);
	}
}
