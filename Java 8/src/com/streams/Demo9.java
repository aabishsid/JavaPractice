package com.streams;

import java.util.ArrayList;

public class Demo9 {

	public static void main(String[] args) 
	{
		{
			ArrayList<Integer> l = new ArrayList();
			l.add(10);
			l.add(0);
			l.add(15);
			l.add(5);
			l.add(20);
			Integer[] i=l.stream().toArray(Integer[]::new);
//			for(Integer i1 : i)
//			{
//				System.out.println(i1);
//			}
			
		
	}

}
}