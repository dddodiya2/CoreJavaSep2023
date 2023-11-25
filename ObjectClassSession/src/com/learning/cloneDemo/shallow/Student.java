package com.learning.cloneDemo.shallow;

public class Student implements Cloneable {

	String studentName;
	int rollNo;
	School school;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student information :- " + " name = " + studentName + "\nrollNo = " + rollNo + "\nschool = "
				+ school.schoolName + " ; " + school.principalName;
	}

}
