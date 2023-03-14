package com.threadlocal;

public class ThreadLocalDemo2 {

	public static void main(String[] args) 
	{
		CustomerThread c1= new CustomerThread("CustomerThread-1");
		CustomerThread c2 = new CustomerThread("CustomerThread-2");
		CustomerThread c3 = new CustomerThread("CustomerThread-3");
		CustomerThread c4 = new CustomerThread("CustomerThread-4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
	
	}

}   
// For every thread a seperate customer id will be maintained by thread-local object 

