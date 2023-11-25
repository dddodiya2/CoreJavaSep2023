package com.learning.equalsDemo;

public class DemoMain {

	public static void main(String[] args) {
		
		Student s1 = new Student("Rahul", "Java");
		Student s2 = new Student("Rahul", "Java");
		
		
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 are equal");
		}else {
			System.out.println("s1 and s2 are NOT equal");
		}

		
		Student s3 = s1 ;
		if(s1.equals(s3)) {
			System.out.println("s1 and s3 are equal");
		}else {
			System.out.println("s1 and s3 are NOT equal");
		}
	
		
		String s = "Divyesh";
		s1.equals(s);
		
		if(s1==s2) {
			System.out.println("s1 and s2 are =");
		}else {
			System.out.println("s1 and s2 are NOT =");
		}
		
		s1.equals(null);
		
		
		
	}

}
