package com.synchronizeblock;

public class Display 
{
	public void wish (String name)
	{
		;;;;; //1 lakh lines of code
		synchronized(this)
		{
		for(int i=0;i<10;i++)
		{
			System.out.println("Good Morning");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			System.out.println(name);
		}
	}
		;;;;;; //1lakh lines of code 
} 
}

class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}

