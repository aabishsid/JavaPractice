package com.unaryoperator;

import java.util.function.UnaryOperator;

public class ClassTest {

	public static void main(String[] args) 
	{
		UnaryOperator<Integer> f=i->i*i;
		System.out.println(f.apply(6));
		

	}

}
