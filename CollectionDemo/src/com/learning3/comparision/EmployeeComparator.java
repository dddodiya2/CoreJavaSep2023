package com.learning3.comparision;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		/*
		e1.getEname()  > e2.getEname() -- 1
		e1.getEname()  < e2.getEname() -- -1
		e1.getEname()  == e2.getEname() -- 0
		*/
		
		String s1 =e1.getEname();
		String s2 =e2.getEname();
		
		return s1.compareTo(s2);
		
	}

}
