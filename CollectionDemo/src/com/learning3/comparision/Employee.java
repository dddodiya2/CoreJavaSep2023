package com.learning3.comparision;

public class Employee implements Comparable<Employee> {

	private String ename;
	private double salary;
	private int age;

	public Employee(String ename, double salary, int age) {
		this.ename = ename;
		this.salary = salary;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp) {

		if (this.salary == emp.salary) {
			return 0;
		} else if (this.salary > emp.salary) {
			return 1;
		} else {
			return -1;
		}

	}

	public String toString() {
		return this.ename + " : " + this.salary;
	}

}
