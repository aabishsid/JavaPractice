package com.datendtimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test8 {

	public static void main(String[] args) 
	{
//		ZoneId la=ZoneId.of("America/Los_Angeles");
//		ZonedDateTime zt=ZonedDateTime.now(la);
//		System.out.println(zt);
		
		ZoneId la =ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt1 = ZonedDateTime.now(la);
		System.out.println(zt1);
	}

}
