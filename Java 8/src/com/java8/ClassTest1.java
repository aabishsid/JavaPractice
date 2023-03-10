package com.java8;

import java.util.function.Function;

public class ClassTest1 {

	public static int squareIt(int n)
	{
		return n * n;
	}
	public static void main(String[] args) 
	{
//		System.out.println("The square of 4:"+squareIt(4));
//		System.out.println("The square of 5:"+squareIt(5));
		
		Function<Integer,Integer> f=i ->i*i;
		System.out.println("The square of 40:"+f.apply(40));
		System.out.println("The square of 50:"+f.apply(50));
		
		}
}

