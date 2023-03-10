package com.thread.join;

public class JoinDemo2 {

	public static void main(String[] args) throws InterruptedException
	{
		Thread.currentThread().join();
	
	}

}


// When a thread calls join()on the same thread itself