package com.consumer;

import java.util.function.Consumer;

public class Movie {
	
	private String name;

	public Movie(String string) {
		
	}
 
	public static void main(String[] args) 
	{
		Consumer<Movie> c1= m->System.out.println(m.name+" ready to release");
		Consumer<Movie> c2= m->System.out.println(m.name+" released but it is bigger flop!!!");
		Consumer<Movie> c3= m->System.out.println(m.name+" storing information in database");
		Consumer<Movie> cc= c1.andThen(c2).andThen(c3);
		
		Movie m= new Movie("Spider-Man");
		cc.accept(m);
		
		
		

	}

}
