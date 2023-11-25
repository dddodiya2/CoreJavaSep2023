package com.learning.polymorphism.overloading;

import com.learning.abstractionAndInheritance.BankAccount;
import com.learning.abstractionAndInheritance.SavingAccount;
import com.learning.abstractionAndInheritance.ZeroBalanceSavingAccount;


public class BankAudit {

	public static void doAudit(ZeroBalanceSavingAccount z1) {
		System.out.println("ZeroBalanceSavingAccount audit done");
	}
	
	public static void doAudit(SavingAccount s1) {
		System.out.println("Savingaccount audit done");
	}
	
	public static void doAudit(BankAccount b1) {
		System.out.println("BankAccount audit done");
	}
	
}
