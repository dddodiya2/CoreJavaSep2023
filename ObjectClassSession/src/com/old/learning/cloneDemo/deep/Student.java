package com.old.learning.cloneDemo.deep;

public class Student implements Cloneable {

	String studentName;
	int rollNo;
	School school;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student clonnedObj = new Student();
		clonnedObj.rollNo = this.rollNo ;
		clonnedObj.studentName = new String(studentName);
		
		School schoolObj = new School();
		schoolObj.principalName = this.school.principalName ;
		schoolObj.schoolName = this.school.schoolName ;
		
		clonnedObj.school = schoolObj ;
		
		return clonnedObj ;
	}

	@Override
	public String toString() {
		return "Student information :- " + " name = " + studentName + "\nrollNo = " + rollNo + "\nschool = "
				+ school.schoolName + " ; " + school.principalName;
	}

}
