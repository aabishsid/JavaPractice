package com.reentrantlock;

import java.util.concurrent.locks.ReentrantLock; //Demo program for trylock

public class MyyThread  extends Thread
{
	static ReentrantLock l = new ReentrantLock();
	
	MyyThread(String name)
	{
		super(name);
	}
	
	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+"... got lock and performing safe opeerations");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			l.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+".... unable to get lock and hence performing alternative operations");
		}
	}

}
