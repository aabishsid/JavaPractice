package com.function.functional.interf;

import java.util.function.Function;

public class FuncInterfaceEx1 {

	public static void main(String[] args) 
	{
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(2));
		System.out.println(f.apply(4));
		System.out.println(f.apply(6));
		System.out.println(f.apply(8));

	}

}
