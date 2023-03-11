package com.daemon;

class Demo extends Thread
{
	public void run()
	{
		for (int i = 0;i<10; i++)
		{
			System.out.println("Child Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}
}

//class Demo 
//{
//	public static void main(String[]args) throws InterruptedException
//	{
//		MyThreadd = new MyThreadd();
//		//t.setdaemon(true);
//		t.start();
//		System.out.println("End of main thread");
//	}
//
//}
