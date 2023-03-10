package com.synchronization;

class Displayy
{
	public synchronized void wish (String name)
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
}

public class Demo1 extends Thread 
{
	Displayy d;
	String name;
	Demo1(Displayy d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}


