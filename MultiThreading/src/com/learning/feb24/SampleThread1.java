package com.learning.feb24;

public class SampleThread1 extends Thread {

	@Override
	public void run() {
		for(int i=0 ; i < 20 ; i++) {
			yield();
 			System.out.println("Doing task from SampleThread1 " + i);
		}
		System.out.println("SampleThread1 name of thread is : " + Thread.currentThread().getName());
	}
	
}
