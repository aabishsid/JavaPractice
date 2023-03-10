package com.thread.sleep;

class Orange extends Thread
{
	public void run()
	{
		for(int i=0; i<=10000; i++)
		{
			System.out.println("I am Lazy Thread-"+i);
		}
		System.out.println("I am entering into sleeping state");
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("I got interrupted");
		}
	}
}

public class ThreadSleepDemo2 {

	public static void main(String[] args) 
	{
		Orange t = new Orange();
		t.start();
//		t.interrupt();
		System.out.println("End of main thread");
		
	}
}
