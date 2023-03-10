package com.multitexamples;

class MyThread extends Thread
{
	
}

class Test 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		MyThread t = new MyThread();
		System.out.println(t.getName());
		Thread.currentThread().setName("Pawan Kalyan");
		System.out.println(Thread.currentThread().getName());
	}

}
