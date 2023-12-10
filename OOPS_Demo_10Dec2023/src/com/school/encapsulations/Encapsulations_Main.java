package com.school.encapsulations;

public class Encapsulations_Main {

	// Encapsulation
	public static void main(String[] args) {

		Student s1 = new Student();
		
		//s1.name = "Ram";
		//s1.age = 10;
		
		s1.setName("Ram");
		s1.setAge(12);
		
		//System.out.println("age : " + s1.age);
		//System.out.println("name : " + s1.name);
		System.out.println("age : " + s1.getAge());
		System.out.println("name : " + s1.getName());
		System.out.println("**********************************************************************");
	}

}
