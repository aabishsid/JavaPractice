package com.synchronization;

class Demo2 
{
	public synchronized void displayn()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}
	public synchronized void displayc()
	{
		for (int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
		}
	}
class MyThread1 extends Thread
{
	Demo2 d;
	MyThread1(Demo2 d)
	{
		this.d = d;
	}
	public void run()
	{
		d.displayn();
	}
}

class MyThread2 extends Thread
{
	Demo2 d;
	MyThread2(Demo2 d)
	{
		this.d = d;
	}
	public void run()
	{
		d.displayc();
	}

}
