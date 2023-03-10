package com.unaryoperator;

import java.util.function.IntUnaryOperator;

public class ClassTest2 {

	public static void main(String[] args) 
	{
		IntUnaryOperator f=i->i*i;
		System.out.println(f.applyAsInt(6));
		

	}

}
