package com.learning.equalsDemo;

public class Student {
	
	private String name;
	private String courseName;
	
	
	public boolean equals(Object o) {
		
		if(this == o) {
			return true;
		}
		
		Student sTemp; 
		if(o instanceof Student) {
			sTemp = (Student) o;
		}else {
			return false;
		}
		
		return (this.name == sTemp.name && this.courseName == sTemp.courseName) ;
		//return (this.name.equals(sTemp.name) && this.courseName.equals(sTemp.courseName)) ;
		
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
