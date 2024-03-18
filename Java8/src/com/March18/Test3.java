package com.March18;
interface maths1 
{
	public void add(int a, int b);
}
interface maths2
{
	
	public void sub(int a, int b);
}
interface maths3
{
	public void mul(int a, int b);
}
interface maths4
{
	public void div(int a, int b);

}
interface maths5
{
	public void mod(int a, int b);
}
public class Test3 
{
	public static void main(String[] args)
	{
		maths1 m1=(int a,int b) -> System.out.println(a+b);
		m1.add(10, 20);
		
		maths2 m2=(int a,int b) -> System.out.println(a-b);
		m2.sub(60, 20);
		
		maths3 m3=(int a,int b) -> System.out.println(a*b);
		m3.mul(5, 8);
		
		maths4 m4=(int a,int b) -> System.out.println(a/b);
		m4.div(40, 7);
		
		maths5 m5=(int a,int b) -> System.out.println(a%b);
		m5.mod(20, 6);
	}

}
