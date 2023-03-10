package com.synchronization;

public class SynchronizedDemo1 {

	public static void main(String[] args) 
	{
		Displayy d = new Displayy();
		Demo1 t1 = new Demo1 (d,"Dhoni");
		Demo1 t2 = new Demo1 (d,"Kohli");
		t1.start();
		t2.start();
	
	}

}
