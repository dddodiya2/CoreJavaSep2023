package com.old.learning.cloneDemo.shallow;

public class ShallowCloneDemo  {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student();
		
		s1.studentName = "Rohit" ;
		s1.rollNo = 78 ;
		
		School school1 = new School();
		school1.schoolName = "Delhi Public School" ;
		school1.principalName = "Mr. Johny Lever" ;
		
		s1.school = school1 ;
		
		/////// I need to create clone of s1 
		
		Student s2 =(Student) s1.clone();
		
		
		s2.rollNo = 80 ;
		s2.studentName = "Raju";
		s2.school.schoolName = "Hindi Medium School";
		
		
		System.out.println("S1 : " + s1 );
		
		System.out.println("\nS2 : " + s2 );
		
		
	
	
	}

}
