package com.Oops;
class college
{
	String name;
	int code;
	void disp(String n , int c)
	{
		name = n;
		code = c;
		System.out.println("College name:"+name+"\n college code:"+code);
	}
}
public class Student
{

	public static void main(String[] args)
	{
		college c1 = new college();
		c1.disp("PVG", 11221);
		c1.disp("KBP", 14577);
		c1.disp("RJ", 876776);
	}

}
