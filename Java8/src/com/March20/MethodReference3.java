package com.March20;
interface add
{
	void a();
}
class add2
{
	public void b()
	{
		System.out.println("This is c method");
	}
}
public class MethodReference3 
{
	public static void main(String[]args)
	{
		add2 a1= new add2();
		add aa = a1::b;
		aa.a();
	}
}