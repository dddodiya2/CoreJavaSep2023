package com.school.abstraction;

public abstract class Student {
	
	private String name;
	private int age;
	
	public void study() {
			System.out.println( name +   " Studying seriously");
	}
	
	public Student() {
		this.name = null;
		this.age = 0;
	}
	
	//getter method
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//setter methods 
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public abstract String playSport();
	
	
}
