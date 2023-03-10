package com.thread.priority;

class Yellow extends Thread
{	
	
}

public class ThreadPriorityDemo {

	public static void main(String[] args) 
	{
		Yellow t = new Yellow();
		t.setPriority(10);
		t.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread");
		}
		
	}

}



