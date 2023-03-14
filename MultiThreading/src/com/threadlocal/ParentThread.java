package com.threadlocal;

class ParentThread extends Thread
{
	public static InheritableThreadLocal tl = new InheritableThreadLocal() 	 	
			{
		public Object childValue(Object p)
		{
			return"CC";
		}
	};
	
	public void run()
	{
		tl.set("pp");
		System.out.println("Parents Thread Value--"+tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread
{
	public void run()
	{
		System.out.println("Child Thread Value--"+ParentThread.tl.get());
	}
}
