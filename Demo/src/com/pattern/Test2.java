package com.pattern;
interface Shape
{
	public void show();
}
class Cube implements Shape
{

	@Override
	public void show() {
		System.out.println("This is cube Shape Class");
		
	}
	
}
public class Test2 {

	public static void main(String[] args) 
	{
		Cube c1 = new Cube();
		c1.show();

	}

}
