package com.learning;

public class AnonyousInnerDemo2 {

	public static void main(String[] args) {
		
		SomeRandomClass src = new SomeRandomClass();
		
		src.doSomeRandomStuff( 
				new DemoInterface() {
			
			@Override
			public void demoIntrMethod() {
				// TODO Auto-generated method stub
				
			}
		}
				);
		
		
		
		DemoInterface d2 = new DemoInterface() {
			
			@Override
			public void demoIntrMethod() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		src.doSomeRandomStuff(d2);

	}

}
