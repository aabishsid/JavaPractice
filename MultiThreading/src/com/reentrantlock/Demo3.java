package com.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3 
{
static ReentrantLock l = new ReentrantLock();
	
Demo3(String name)
{
	super(name);
}

	public void run()
	{
		do
		{
			try {
				if(l.tryLock(5000,TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName()+"got lock");
					Thread.sleep(30000);
					l.unlock();
					
					System.out.println(Thread.currentThread().getName()+"...releases lock");
					break;
				}
				else
				{
					System.out.println(Thread.currentThread().getName()+"...unable to get lock and will try again");
				}
			}
			catch(InterruptedException e) {}
		}
		while(true);

	}

}
		
