package com.learning2;

import java.util.Objects;

public class Student {
	
	private String name;
	private String courseName;
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(courseName, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(courseName, other.courseName) && Objects.equals(name, other.name);
	}


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

}
