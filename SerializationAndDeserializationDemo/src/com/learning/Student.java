package com.learning;

import java.io.Serializable;

public class Student implements Serializable {

	public static String schoolName = "St. John's";
	private final int someValue = 100;
	private String name;
	private transient int age;
	private String address;
	private int std;
	
	
	public Student(String name, int age, String address, int std) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.std = std;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	
	
}
