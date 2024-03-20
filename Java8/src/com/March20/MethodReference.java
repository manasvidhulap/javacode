package com.March20;
interface Hello
{
	void hii();
}
class HelloInfo
{
	static void dispsomething()
	{
		System.out.println("This is static Method");
	}
}
public class MethodReference {

	public static void main(String[] args)
	{
		Hello h1=HelloInfo::dispsomething;
		h1.hii();

	}

}
