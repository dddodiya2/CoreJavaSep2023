package com.learning;

public class DemoProgram2 {
	
	
	public static void main(String[] args) {
		
		/*
		Boolean b = Boolean.valueOf(true);
		
		//checkMethod(b.booleanValue());
		checkMethod(b);
		*/
		
		char var = 'a' ;

		if( (var >= '0' && var <= '9') || ( var >= 'a' && var <= 'z' ) || (var >= 'A' && var <= 'Z') ) {
					System.out.println("Its valid character");
		}else {
			System.out.println("Its special character");
		}
		
		
	}
	
	public static void checkMethod(boolean b1) {
		
		if(b1) {
			System.out.println("b1 is true");
		}else {
			System.out.println("b1 is false");
		}
		
		
	}

}
