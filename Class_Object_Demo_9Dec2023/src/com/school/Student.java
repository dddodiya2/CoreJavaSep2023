package com.school;

public class Student {
	
	
	static {
		System.out.println("Kch likh rrahe hai");
		System.out.println("static block hu me !!!!, class loading ke waqt execute honewala");
	}
	
	String name;
	int age;
	int stdId;
	int standard;
	double marks;
	
	static String schoolName;
	
	public void study() {
		if(this.name == null) {
			System.out.println( "Student is not initilised yet");
		} else {
			System.out.println( name +   " Studying seriously");
		}
	}
	
	public static void doSometask() {
		System.out.println("doing some task");
	}
	
	public Student() {
		System.out.println("Constructor 0 called ");
		this.name = null;
		this.age = 0;
		this.stdId = 0;
		this.standard = 1;
		this.marks = 100.00;
	}
	
	public Student(String name, int age) {
		this(name, age, 1);
		System.out.println("Constructor 2 called ");
	}
	
	
	public Student(String name, int age, int standard) {
		this();
		this.name = name;
		this.age = age;
		this.standard = standard;
		System.out.println("Constructor 3 called ");
	}

}
