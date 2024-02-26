package com.learning.feb24;

public class MainDemo {

	public static void main(String[] args) {
		
		SampleThread1 thread1 = new SampleThread1();
		thread1.setName("Palak thread");
		
		//thread1.run(); Do not call run() method explicitly, it called by start() method internally
		thread1.start();  ///we need to call only start method

		Thread t2 = new Thread(new SampleRunnable());
		t2.setName("Paneer thread");
		t2.start();

		
		for(int j = 0; j < 20 ; j++) {
			System.out.println("From MainDemo main thread : " + j);
		}
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MainDemo name of thread is : " + Thread.currentThread().getName());
	
	}

}
