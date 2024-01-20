package com.old.learning.finaliseDemo;

public class Student {
	
	private String name;
	private String courseName;
	
	
	public Student(String name, String courseName) {
		this.name= name;
		this.courseName = courseName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	protected void finalize() throws Throwable{
		System.out.println("\nfinalize() : I am not in use, getting grabage collected");
		System.out.println("My name was : " + name + ", course was  " + courseName + "\n");
	}
	

}
