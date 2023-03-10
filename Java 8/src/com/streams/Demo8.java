package com.streams;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Demo8 {

	public static void main(String[] args) 
		{
			ArrayList<Integer> l = new ArrayList();
			l.add(10);
			l.add(0);
			l.add(15);
			l.add(5);
			l.add(20);
		System.out.println(l); // It's just going to print the elements
		
		Consumer<Integer> c=i->{
			System.out.println("The Square of "+i+" is:"+(i*i));
		};
		l.stream().forEach(c); //But if we use forEach soo for every element we are calling 
		
	}

}
