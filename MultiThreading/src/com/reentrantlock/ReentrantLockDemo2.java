package com.reentrantlock;

public class ReentrantLockDemo2 {

	public static void main(String[] args) 
	{
		MyyThread t1 = new MyyThread("First Thread");
		MyyThread t2 = new MyyThread("Second Thread");
		t1.start();
		t2.start();
		
		
	}

}
