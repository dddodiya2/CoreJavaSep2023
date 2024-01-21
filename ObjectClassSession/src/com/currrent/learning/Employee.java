package com.currrent.learning;

public class Employee implements Cloneable {

	private String name;
	private int age;
	private double salary;
	private String dept;
	
	
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		
		if(!(o instanceof Employee) ) {
			return false;
		}
		
		Employee that = (Employee) o;
		if (this.name == that.name && this.age == that.age 
				&& this.salary == that.salary && this.dept == that.dept) {
			return true;
		}
		return false;			
	}
	
	
	public Employee(String name, int age, double salary, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	public Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
	
}
