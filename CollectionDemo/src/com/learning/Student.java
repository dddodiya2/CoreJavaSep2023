package com.learning;

public class Student implements Comparable {

	int stdid;
	String name;
	
	public Student(int stdid, String name) {
		this.stdid = stdid;
		this.name = name;
	}
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		if(! (o instanceof Student) ) {
			throw new IllegalArgumentException("Studnet object is needed !!!!!!");
		}
		
		Student anotherStudent = (Student) o;
		
		if(-this.name.compareTo(anotherStudent.name) != 0 ) {
			return -this.name.compareTo(anotherStudent.name);
		}
		
		return this.stdid - anotherStudent.stdid ;
		
	}
	
	
	
}
