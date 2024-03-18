package com.pattern;
interface calci
{
	public void calsq(int x);
}
class A implements calci
{

	@Override
	public void calsq(int x) {
		System.out.println("This is calci square class");
		
	}
	
}
public class Test1 
{

	public static void main(String[] args)
	{
		A a1=new A();
		a1.calsq(10);
	}

}
