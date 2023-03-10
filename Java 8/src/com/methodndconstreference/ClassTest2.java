package com.methodndconstreference;

public class ClassTest2 
{
	public static void sum(int x,int y)
	{
		System.out.println("The Sum:"+(x+y));
	}

	public static void main(String[] args) 
	{
		Interf i=(a,b)->System.out.println("The Sum:"+(a+b));
		i.add(10,20);
		
		Interf i1=ClassTest2::sum;
		i.add(100,200);
		
	}

}
