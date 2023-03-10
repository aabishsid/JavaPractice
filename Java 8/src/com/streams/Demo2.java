package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 
{
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		List<Integer> updatedMarks;
		List<Integer> updatedMarks1=marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedMarks1);

		
//		ArrayList<Integer> marks = new ArrayList<Integer>();
//		marks.add(2);
//		marks.add(4);
//		marks.add(6);
//		marks.add(8);
//		System.out.println(marks);
//		List<Integer>updatedMarks;
//		List<Integer>updatedMarks1= marks.stream().map(i->i+2).collect(Collectors.toList());
//		System.out.println(updatedMarks1);
		
		
	}

}
