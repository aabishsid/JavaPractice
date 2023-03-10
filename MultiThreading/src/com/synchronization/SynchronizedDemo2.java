package com.synchronization;

public class SynchronizedDemo2 {

	public static void main(String[] args) 
	{
		Demo2 d = new Demo2();
		MyThread1 t1 = new MyThread1(d);
		MyThread2 t2 = new MyThread2(d);
		t1.start();
		t2.start();
		
	
	}

}
