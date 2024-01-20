package com.currrent.learning;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Raju",45, 50, "HR");
		
		System.out.println(e1.toString());
		System.out.println(e1.hashCode());
		
		Employee e2 = new Employee("Mohan",42, 47, "IT"); 

		Employee e3 = new HREmployee("Rohan",38, 90, "Manager");
		
		System.out.println("e1 : " + e1.getClass().getName());
		System.out.println("e2 : " + e2.getClass().getName());
		System.out.println("e3 : " + e3.getClass().getName());
		
	}

}
