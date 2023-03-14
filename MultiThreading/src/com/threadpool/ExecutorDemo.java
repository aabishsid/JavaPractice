package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo 
{
	public static void main(String[]args)
	{
		PrintJob[]jobs= { new PrintJob("Akash"),
				          new PrintJob("Ankit"),
				          new PrintJob("Riddhi"),
				          new PrintJob("Neil"),
				          new PrintJob("Durga"),
				          new PrintJob("Pavan")};
		ExecutorService service= Executors.newFixedThreadPool(3);
		for(PrintJob job:jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}

}
