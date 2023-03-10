package com.methodndconstreference;

public interface Interff 
{
	public Sample get();
}

class Test
{
	public static void main(String[]args)
	{
		Interff i=Sample::new;
		Sample s1=i.get();
		Sample s2=i.get();
		Sample s3=i.get();
		Sample s4=i.get();
		
		//Interface get() refers Sample class constructor
		
	}
}
