package com.March1;
abstract class Student
{
	abstract void attendance (int pd);
	void showName(String bc)
	{
		System.out.println("Batch code:"+bc);
	}
}
abstract class LBY
{
	abstract void showModule(String modulename);
}
class Elites extends Student
{
	void attendance (int pd)
	{
		System.out.println("Total Days:"+pd);
	}
}
class Elites1 extends LBY
{
	@Override
	void showModule(String modulename)
	{
		System.out.println("Module Running:"+modulename);
	}
}
public class Test1 {

	public static void main(String[] args)
	{
		Elites e1 = new Elites();
		
		e1.attendance(30);
		e1.showName("2023-11221");
		
		Elites1 e2 = new Elites1();
		e2.showModule("Developers");

	}

}
