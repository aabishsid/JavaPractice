package com.function.functional.interf;

import java.util.function.IntToDoubleFunction;

public class PrimitiveFuncEg {

	public static void main(String[] args) 
	{
		IntToDoubleFunction f=i->Math.sqrt(i);
		System.out.println(f.applyAsDouble(9));
//	    System.out.println(f.applyAsDouble());

	}

}
 