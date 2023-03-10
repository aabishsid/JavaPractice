package com.datendtimeapi;

import java.time.LocalDateTime;
import java.time.Month;

public class Test5 {

	public static void main(String[] args) 
	{
		LocalDateTime dt=LocalDateTime.of(1995,Month.MAY,28,12,45);
		System.out.println(dt);
		
		System.out.println("After Six Months:"+dt.plusMonths(6));
		System.out.println("Before Six Months:"+dt.minusMonths(6));
		
	}

}
