package com.thread.join;

class Blue extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Seeta Thread");
			try {Thread.sleep(2000);
		}
			catch(InterruptedException e) {}
	}
}
}


public class ThreadJoin {
	
	public static void main(String[] args) throws InterruptedException
	{
		Blue t = new Blue();
		t.start();
		t.join();
		for(int i=0;i<10;i++)
		{
			System.out.println("Rama Thread");
		}
	}
		

	}