// Write a predicate to check whether length of String is > 5 or not  
package com.predicate;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		String[] s = {"Nag", "Chiranjeevi", "Venkatesh", "Balaiah", "Sunny", "Katrina"};
		Predicate<String> p=s1-> s1.length()>5;
		Predicate<String> p1=s1-> s1.length()%2==0;  // To check length of the string is even or not
		
		for(String s1 : s) {
			if(p.test(s1)) {
				System.out.println(s1);
			}
		}
		
		
	}
}
