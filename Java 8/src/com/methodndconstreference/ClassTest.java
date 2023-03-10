package com.methodndconstreference;

import com.function.functional.interf.Test;

public class ClassTest 
{
	public static void m1()
	{
		for(int i =0; i<10;i++)
		{
			System.out.println("Child Thread-1");
		}
	}
	

	public static void main(String[] args) 
	{
		Runnable r = ClassTest::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread-1");
		}
		
	
	}

}
