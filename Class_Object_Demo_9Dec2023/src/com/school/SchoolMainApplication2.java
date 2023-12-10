package com.school;

public class SchoolMainApplication2 {
	
	static {
		System.out.println("SchoolMainApplication2  class loading");
	}

	public static void main(String[] args) {
		
		/*99999999
		Student s1 = new Student();
		s1.name = "Raju";
		s1.age = 21;
		s1.schoolName = "DPS";
		System.out.println("s1 name : " + s1.name);
		System.out.println("s1 age : " + s1.age);
		System.out.println("s1 schoolName : " + s1.schoolName);
		
		
		Student s2 = new Student();
		System.out.println("s2 name : " + s2.name);
		System.out.println("s2 age : " + s2.age);
		
		System.out.println("s2 schoolName : " + s2.schoolName);
		s2.schoolName = "MPS";
		
		System.out.println("s1 schoolName : " + s1.schoolName);
		System.out.println("s2 schoolName : " + s2.schoolName);
		*/
		
		
		System.out.println("Hello");
		Student.schoolName = "DPS";
		Student.doSometask();
		
		
		Student s1 = new Student();
		s1.name = "Raju";
		s1.age = 21;

		System.out.println("s1 name : " + s1.name);
		System.out.println("s1 age : " + s1.age);
		System.out.println("s1 schoolName : " + s1.schoolName);
		

	}

}
