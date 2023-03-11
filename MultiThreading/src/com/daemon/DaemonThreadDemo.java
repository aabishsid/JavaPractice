package com.daemon;

public class DaemonThreadDemo 
{
	public static void main(String[]args) throws InterruptedException
	{
		MyThread t = new MyThread();
		//t.setdaemon(true);
		t.start();
		System.out.println("End of main thread");
		
		
		System.out.println("End of main Thread");
		
	}

}
