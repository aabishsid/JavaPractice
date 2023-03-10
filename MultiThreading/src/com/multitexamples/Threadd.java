package com.multitexamples;

public class Threadd 
{
	public static void main(String[]args)
	{
	MyThreadd t = new MyThreadd();
	t.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("Main Thread");
	}

}
	
}
