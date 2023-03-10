package com.lambdaexpression;

import java.util.function.Function;

public class Square {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println("The square root of 40:"+f.apply(40));
		System.out.println("The square root of 99:"+f.apply(99));
		
		System.out.println("the square root of 77:" +f.apply(77));

	}

}
