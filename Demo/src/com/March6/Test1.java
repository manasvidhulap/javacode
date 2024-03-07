package com.March6;
class course
{
	int id;
	String name;
	int prise;
	int duration;
	
	public course()
	{
		System.out.println("This is defualt constructor");
	}
	public course(int id , String name, int prise, int duration)
	{
		id=id;
		name=name;
		prise=prise;
		duration=duration;
		System.out.println(id+" "+name+" "+prise+" "+duration);
	}
}
public class Test1 
{

	public static void main(String[] args) 
	{
		course c1 = new course();
		course c2 = new course(101,"sneha",2000,7);
		
	}

}
