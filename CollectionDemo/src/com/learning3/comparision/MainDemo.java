package com.learning3.comparision;

import java.util.TreeSet;

public class MainDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Bob", 100000.0, 45);
		Employee e2 = new Employee("John", 50000.0, 23);
		Employee e3 = new Employee("Karan", 100000.0, 48);
		Employee e4 = new Employee("Rahul", 700000.0,100);

		System.out.println("Default Sorting based on salary");

		if (e1.compareTo(e2) == 0) {
			System.out.println("e1 is equal to e2");
		} else if (e1.compareTo(e2) > 0) {
			System.out.println("e1 is higher than e2");
		} else if (e1.compareTo(e2) < 0) {
			System.out.println("e1 is lower than e2");
		}

		System.out.println("Customised Sorting based on name");

		EmployeeComparator ec = new EmployeeComparator();

		if (ec.compare(e1, e2) == 0) {
			System.out.println("e1 is equal to e2");
		} else if (ec.compare(e1, e2) > 0) {
			System.out.println("e1 is higher than e2");
		} else if (ec.compare(e1, e2) < 0) {
			System.out.println("e1 is lower than e2");
		}

		System.out.println("Khatam, tata , Good bye ");

		TreeSet<Employee> employeeSet = new TreeSet<Employee>();

		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);
		employeeSet.add(e4);

		System.out.println(employeeSet);

		TreeSet<Employee> employeeSet1 = new TreeSet<Employee>(new EmployeeComparator());

		employeeSet1.add(e1);
		employeeSet1.add(e2);
		employeeSet1.add(e3);
		employeeSet1.add(e4);

		System.out.println(employeeSet1);
		
		
		TreeSet<Employee> employeeSet3 = new TreeSet<Employee>(new EmployeeAgeComparator());

		employeeSet3.add(e1);
		employeeSet3.add(e2);
		employeeSet3.add(e3);
		employeeSet3.add(e4);

		System.out.println(employeeSet3);
		
	}

}
