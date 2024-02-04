package com.learning.map;

import java.util.Objects;

public class Student {

	private String name;
	private int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo);
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
		return Objects.equals(name, other.name) && rollNo == other.rollNo;
	}



	public String toString() {
		return name + " : " + rollNo  ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
