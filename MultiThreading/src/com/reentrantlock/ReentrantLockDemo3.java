package com.reentrantlock;

public class ReentrantLockDemo3 {

	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		t1.start();
		t2.start();
		
		
		
//		MyyyThread t1 = new MyyyThread("First Thread");
//		MyyyThread t2 = new MyyyThread("Second Thread");
//		t1.start();
//		t2.start();
		
	}

}
