package com.function.functional.interf;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class ClassTest {

	public static void main(String[] args) 
	{
		ArrayList<Employee> l = new ArrayList<Employee>();
		BiFunction<Integer,String,Employee> f=(eno,name)->new Employee(eno,name);
		l.add(f.apply(100,"Durga"));
		l.add(f.apply(200,"Zaid"));
		l.add(f.apply(300,"Sana"));
		l.add(f.apply(400,"Hera"));
		for(Employee e : l)
		{
			System.out.println("Employee Number:"+e.eno);
			System.out.println("Employee Name:"+e.name);
			System.out.println(); 
			
		}

	}

}
