package com.hdfc;

import com.hdfc.savings.Account;
import com.hdfc.loan.Account;

public class DemoMain {

	public static void main(String[] args) {
		
		
		Account a1 = new Account();
		
		DemoMain d1 = new DemoMain();
		
		//d1.generateString(1,2,3,4);
		d1.generateString("Rut", "Pri", 2, 10.0);

		//d1.generateString(10.0, "Rut", "Pri", 2);

		d1.generateString("Rut", "Pri", 2);

	}
	void generateString(String s1, String s2 , int i2, double d1){
		String s = s1 + s2 + i2 + d1;
		System.out.println(s);
		//return s;
	}

}
