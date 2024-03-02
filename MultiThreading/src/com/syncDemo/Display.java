package com.syncDemo;

public class Display {
	
	
	public synchronized static void doSomeClassLevelTask() {
		//Class level lock
	}
	
	int someCommonVar = 0; 

	public synchronized void otherNOnStaticSynchronizedMethod(String name) {
		//not allowed to be executed when one of the other synchronized non-static method is executing
	}
	
	public synchronized void wish(String name)
	{
		//object level lock
		for(int i=0;i<5;i++)
		{
			//synchronized (this) {
				someCommonVar++;
			//}
			
			System.out.println("good morning: " + Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{}
			System.out.println(name + " "+ Thread.currentThread().getName());
			System.out.println(someCommonVar + " "+ Thread.currentThread().getName());
		}
	}
	
}
