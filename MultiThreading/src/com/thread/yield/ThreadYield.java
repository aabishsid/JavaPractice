package com.thread.yield;

class Green extends Thread
{
	public void run ()
	{
		System.out.println("Child Thread");
		Thread.yield();
	}
}

public class ThreadYield {

	public static void main(String[] args) 
	{
		Green t = new  Green();
				t.start();
				for(int i=0;i<10;i++)
				{
					System.out.println("Main Thread");
				}
	}

}