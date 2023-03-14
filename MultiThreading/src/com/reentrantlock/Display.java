package com.reentrantlock;

// How to Reentrant in place of synchronized keyword

import java.util.concurrent.locks.ReentrantLock;

public class Display 
{
	ReentrantLock l = new ReentrantLock();
	public void wish(String name)
	{
		l.lock();   // ----> Line 1
		for(int i = 0; i<10; i++)
		{
			System.out.println("Good Morning");
		}
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e) 
		{
		}
		System.out.println(name);
	
	l.unlock();  // ---> Line 2
	}
}


class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d = d;
		this.name = name;
	}
	
	public void run()
	{
		d.wish(name);
	}

}
	

// If we comment line 1 nd 2 then the threads will be executed simultaneously and we will get irregular output. 
// If we are not commenting lines 1 and 2 then the threads will be executed one by one and we will get regular output 