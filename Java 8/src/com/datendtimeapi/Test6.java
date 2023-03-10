package com.datendtimeapi;

import java.time.LocalDate;
import java.time.Period;

public class Test6 {

	public static void main(String[] args) 
	{
		LocalDate birthday=LocalDate.of(1988,3,28);
		LocalDate today=LocalDate.now();
		Period p=Period.between(birthday,today);
		System.out.printf("Age is %d Years %d Month %d Days",p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate deathday=LocalDate.of(2004+60,06,15);
		Period p1=Period.between(today,deathday);
		int d=p1.getYears()*365+p1.getMonths()*30+p1.getDays();
		System.out.printf("\n You will be on the earthonly %d Days...Hurry up to doo more important things",d);
		

	}
}
