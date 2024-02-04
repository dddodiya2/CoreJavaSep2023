package com.learning2;

public class ACollege {

	
	//case 1:- Case 1:- Accessing inner class code from static area of outer class:
	// static  and instance
	
	
	int j = 0;
	
	class Department {
		
		public void methodOne() {
			System.out.println("method One of Inner class");
			System.out.println(this);
			System.out.println(ACollege.this);
		}
	}
	
	public void instanceMethodOuterClass() {
		System.out.println("Hello from instance method of Outer class");
		
		Department i1 =  new Department();
		i1.methodOne();
	}
	
	public static void main(String[] args) {
		
		ACollege rcoem = new ACollege();
		System.out.println(rcoem.j);
		
		//case 1:- Case 1:- Accessing inner class code from static area of outer class:
		Department i = rcoem.new Department();
		i.methodOne();

		
		//Case 2:- Accessing inner class code from instance area of outer class:
		ACollege ycce = new ACollege();
		ycce.instanceMethodOuterClass();
	}

	
	
	
	
	
	
}
