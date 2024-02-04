package com.learning;

public class SampleInnerClassDemo {

	int i ;
	double d;
	
	static String name ; 
	
	public void displayInfo() {
		System.out.println("display INfo method");
	}
	
	
	class SampleInner{
		
		int innerVar ;
		
		public void methodOneInner() {
			System.out.println("methodOneInner");
		}
		
		
	}
	
	static class SampleInnerStatic {
		
		int innerVarStat ;
		
		public void methodOneInnerStat() {
			System.out.println("methodOneInner");
		}
		
	}
	


}
