package com.school;

public class SchoolMainApplication {

	
	//Constructor chaining , class and objects
	public static void main(String[] args) {


		
		Student s1 = new Student();
		
		s1.study();
		
		System.out.println("age : " + s1.age);
		System.out.println("stdId : " + s1.stdId);
		System.out.println("standard : " + s1.standard);
		System.out.println("marks : " + s1.marks);
		
		System.out.println("**********************************************************************");
		
		
		Student s2 = new Student("Ram", 6);
		
		s2.study();
		
		System.out.println("age : " + s2.age);
		System.out.println("stdId : " + s2.stdId);
		System.out.println("standard : " + s2.standard);
		System.out.println("marks : " + s2.marks);

		System.out.println("**********************************************************************");

		Student s3 = new Student("Shyam", 16, 8);
		
		s3.study();
		
		System.out.println("age : " + s3.age);
		System.out.println("stdId : " + s3.stdId);
		System.out.println("standard : " + s3.standard);
		System.out.println("marks : " + s3.marks);
		
	}

}
