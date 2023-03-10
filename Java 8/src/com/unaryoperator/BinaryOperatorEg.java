package com.unaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorEg {

	public static void main(String[] args)
	{
		BinaryOperator<String> b=(s1,s2)->s1+s2;
		System.out.println(b.apply("durga","software"));
	
	}

}
