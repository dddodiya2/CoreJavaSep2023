package com.learning2;

import com.learning2.ACollege.Department;

public class BUniversity {

	public static void main(String[] args) {
		
		ACollege pccoe = new ACollege();
		
		Department chem_Dep = pccoe.new Department();
		
	}
	
	public void doSome() {
		Department chem_Dep = new ACollege().new Department();
	}

}
