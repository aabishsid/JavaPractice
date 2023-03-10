package com.function.functional.interf;

import java.util.function.Function;

public class FuncInterfaceEx2 {

	public static void main(String[] args) 
	{
//		Function<String,Integer> f=s->s.length();
//		System.out.println(f.apply("Asia"));
//		System.out.println(f.apply("Europe"));
//		System.out.println(f.apply("Antarctica"));
		
		Function<String,String> f=s->s.toUpperCase();
		System.out.println(f.apply("Asia"));
		System.out.println(f.apply("Europe"));
		System.out.println(f.apply("Antarctica"));
	}
}
