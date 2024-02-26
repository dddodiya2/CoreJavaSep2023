package com.learning.feb24;

public class SampleRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0 ; i < 200000 ; i++) {
 			System.out.println("Doing task from SampleRunnable " + i);
 			try {
 				System.out.println("Sleeping now for 2 sec");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("SampleRunnable name of thread is : " + Thread.currentThread().getName());
	}
	
}
