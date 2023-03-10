package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Sunny");
		l.add("Kajal");
		l.add("Prabhas");
		l.add("Anushka");
		System.out.println(l);
		
		List<String> sortedList=l.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedList);
		
		List<String> sortedList1=l.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(sortedList);
		


}
}
