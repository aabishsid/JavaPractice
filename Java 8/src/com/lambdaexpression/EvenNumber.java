package com.lambdaexpression;

import java.util.function.Predicate;

public class EvenNumber {

	public static void main(String[] args) {
		Predicate<Integer> p=i ->i%2==0;
		System.out.println(p.test(5));
		System.out.println(p.test(8));
		System.out.println(p.test(88));
		System.out.println(p.test(78882));
	
	}
	

}
