package com.thread.priority;

class Red extends Thread
{	
	
}

public class ThreadPriority {

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(15);
		Thread.currentThread().setPriority(8);
		Red t = new Red();
		System.out.println(t.getPriority());
		
	
	}

}




