package com.learning;

public class AnonymousInnerDemo {

	public static void main(String[] args) {
		
		
		Sample s = new Sample();
		
		s.sampleMethod();
		
		System.out.println(s);
		
		
		///Anonymous Inner class
		//Type one child of an existing class
		
		Sample s2 = new Sample() {
			
			public void sampleMethod() {
				System.out.println("sampleMethod of inner class");
			}
			
		};
		
		
		s2.sampleMethod();
		System.out.println(s2);
		
		
		SampleAbstract s4 = new SampleAbstract() {
			
		};
		
		////Type 2 by implementing an interfce
		DemoInterface d = new DemoInterface() {
			
			public void demoIntrMethod() {
				System.out.println("demoIntrMethod ");
			}
			
		};
		
		

		d.demoIntrMethod();
		System.out.println(d);
		
		
		
		
		
	}

}
