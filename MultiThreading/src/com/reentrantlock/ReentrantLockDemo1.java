package com.reentrantlock;

public class ReentrantLockDemo1 
{
	public static void main(String[] args) 
	{
		Display d = new Display();
		MyThread t1 = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d,"Virat");
		MyThread t3 = new MyThread(d,"Yuvraj");
		t1.start();
		t2.start();
		t3.start();

	}

}
