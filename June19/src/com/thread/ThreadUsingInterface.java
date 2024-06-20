package com.thread;

class Thread11 implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=5;i<=10;i++) {
            System.out.println(i);
        }	
	}
	
}
		
public class ThreadUsingInterface 
{

	public static void main(String[] args)
	{
		Thread11 t1=new Thread11();
	    Thread t=new Thread(t1);
	    t.start();
	}

}
