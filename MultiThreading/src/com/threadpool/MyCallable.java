package com.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable
{
	int num;
	public MyCallable(int num)
	{
		this.num = num;
	}
	public Object call() throws Exception 
	{
		System.out.println(Thread.currentThread().getName()+"is responsible to find sum of first" + num+"numbers");
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum = sum +i;
		}
		return sum;
	}

}
