package com.threadlocal;

public class ThreadLocalDemo1A 
{
	public static void main(String[] args) 
	{
		ThreadLocal tl = new ThreadLocal()
		{
			public Object initialValue()   // Overriding of initial value method
			{
				return"abc";
			}
     	};
     	
     	System.out.println(tl.get());
		tl.set("durga");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
    	
	}

}
