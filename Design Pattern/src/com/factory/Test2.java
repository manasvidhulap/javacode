package com.factory;
class circle implements shape
{

	@Override
	public void getshape(String shape) 
	{
		System.out.println("I am Circle:"+shape);
	}
	
}
class rectangle implements shape
{

	@Override
	public void getshape(String shape) 
	{
	System.out.println("I am Rectangle:"+shape);
		
	}
	
}
class square implements shape
{

	@Override
	public void getshape(String shape)
	{
		System.out.println("I am Square:"+shape);
	}
	
}
public class Test2 {

	public static void main(String[] args) 
	{	
		circle c1=new circle();
		c1.getshape("circle");
		
		rectangle c2=new rectangle();
		c2.getshape("rectangle");
		
		square c3=new square();
		c3.getshape("square");

	}

}
