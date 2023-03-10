package com.thread.sleep;

class Pink extends Thread
{
	public void run()
	{
		try {
			for(int i=0; i<10; i++)
			{
				System.out.println("I am Lazy Thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("I got interrupted");
		}
	}
}
 
public class ThreadSleepDemo {

	public static void main(String[] args) 
	{
		Pink t = new Pink();
		t.start();
		t.interrupt();
		System.out.println("End of main");
	}

}
