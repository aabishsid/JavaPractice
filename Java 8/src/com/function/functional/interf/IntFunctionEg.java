package com.function.functional.interf;

import java.util.function.IntFunction;

public class IntFunctionEg {

	public static void main(String[] args) 
	{
		IntFunction<Integer> f=i->i*i;
		System.out.println(f.apply(2));
		System.out.println(f.apply(4));
        System.out.println(f.apply(6));
        System.out.println(f.apply(8));
		
	}

}
