package com.multitexamples;

class MyyThread extends Thread
{
	public void run()
	{
		System.out.println("run method executed by Thread:"+Thread.currentThread().getName());
	}
}

class Test2 {

	public static void main(String[] args)
	{
		MyyThread t = new MyyThread();
		t.start();
		System.out.println("main method executed by Thread:"+Thread.currentThread().getName());
	

	}

}
