package com.June20;
class PowerNum1
{
	synchronized void displayPower(int num) 
	{
		int temp = 1;
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(num + "^" + i + "=" + num * temp);
			temp = temp * num;
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

//Thread subclass to calculate powers of 2
class Power1 extends Thread
{
	PowerNum1 p;

	Power1(PowerNum1 p) 
	{
		this.p = p;
	}

	// Overriding the run() method to execute the task
	public void run() 
	{
		p.displayPower(2); // Calling displayPower() to calculate and display powers of 2
	}
}

//Thread subclass to calculate powers of 3
class Power2 extends Thread 
{
	PowerNum1 p;

	Power2(PowerNum1 p)
	{
		this.p = p;
	}

	// Overriding the run() method to execute the task
	public void run() 
	{
		p.displayPower(3); // Calling displayPower() to calculate and display powers of 3
	}
}
public class PowerThread {

	public static void main(String[] args)
	{
		PowerNum1 p1 = new PowerNum1(); // Creating an instance of PowerNum
		Power1 power1 = new Power1(p1); // Creating an instance of Power1 thread
		power1.start(); // Starting the Power1 thread to calculate powers of 2
		Power2 power2 = new Power2(p1); // Creating an instance of Power2 thread
		power2.start(); // Starting the Power2 thread to calculate powers of 3
	}


}
