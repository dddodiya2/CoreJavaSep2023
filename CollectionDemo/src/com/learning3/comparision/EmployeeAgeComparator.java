package com.learning3.comparision;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.getAge() > o2.getAge()) {
			return 1;
		}else if(o1.getAge() < o2.getAge()) {
			return -1;
		}else {
			return o1.getEname().compareTo(o1.getEname()) ;
		}
	}

	
}
