package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpForCollection {

	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(24);
		l.add(20);
		l.add(56);
		l.add(17);
		l.add(5);
		l.add(76);
		System.out.println(l);
		Comparator<Integer> c = (I1,I2)-> (I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
		l.stream().forEach(System.out::println); //stream method for printing one by one
		List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(12); //stream method for printing even number
		
		
		
		}
	
}