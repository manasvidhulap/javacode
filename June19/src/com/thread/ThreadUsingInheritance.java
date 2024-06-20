package com.thread;

class Thread1 extends Thread
{
	public void run()//running
	
	{
		for(int i=0;i<5;i++)
		{
			try 
			{
				Thread.sleep(2000); //2000 in milisec
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Thread 1:"+i);
		}
	}
	
}
//class Evenno extends Thread
//{
//	public void run()//running
//	{
//		for(int i=0;i<=50;i++) 
//		{
//			if(i%2==0)	
//			{
//				System.out.println("Even Number:"+i);
//			}
//		}
//	}
//}
class Even extends Thread{
    int num;
    public Even(int num) {
        this.num=num;
    }
    public void run() {
        if(num%2==0) {
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
    }
}
public class ThreadUsingInheritance 
{
	public static void main(String[] args) 
	{
	Thread1 t1 = new Thread1();
	t1.setName("My Thread");
	System.out.println("thread name:"+t1.getName());
	System.out.println("Thread name:"+t1.getPriority());
	t1.start();//runnable
	
//	Evenno e=new Evenno();
//	e.start();//runnable
	
	Even e=new Even(25);
	e.start();
	
	System.out.println("Min Priority:"+Thread.MIN_PRIORITY);
	System.out.println("Max Priority:"+Thread.MAX_PRIORITY);
	System.out.println("Normal(default) Priority:"+Thread1.NORM_PRIORITY);
	}
}
