package com.March07;

public class Test extends Thread
{
	public void run()
	{
		System.out.println("This is thread class run method");
	}

	public void disp()
	{
		System.out.println("This is disp method");
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		
//		t.run();
		t.start();

	}

}
