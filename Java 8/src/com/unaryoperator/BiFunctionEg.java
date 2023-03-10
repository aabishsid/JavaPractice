package com.unaryoperator;

import java.util.function.BiFunction;

public class BiFunctionEg {

	public static void main(String[] args) 
	{
		BiFunction<String,String,String> f=(s1,s2)->s1+s2;
		System.out.println(f.apply("durga","software"));
	

	}

}
