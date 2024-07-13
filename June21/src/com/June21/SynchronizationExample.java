package com.June21;

public class SynchronizationExample 
{
	public static void main(String[] args)
	{
		Account account = new Account();
		Thread thread1 = new Transaction(account, 3000);
		Thread thread2 = new Transaction(account, 1000);
		thread1.start();
		thread2.start();
		}
	}

		class Transaction extends Thread 
		{
		private int timeToWait;
		private Account account;

		public Transaction(Account account,int timeToWait) 
		{
		this.timeToWait = timeToWait;
		this.account = account;
		}

		public void run() 
		{
		try 
		{
		account.performTransaction(timeToWait);
		}
		catch (InterruptedException e) 
		{
		e.printStackTrace();
		}
		}
		}

		class Account
		{
		public void performTransaction(int timeToWait) throws InterruptedException
		{
			synchronized (this) 
			{
				
			
		System.out.println("Before transaction " + Thread.currentThread().getId());
		Thread.sleep(timeToWait);
		System.out.println("After transaction " + Thread.currentThread().getId());
			}
		}
}
