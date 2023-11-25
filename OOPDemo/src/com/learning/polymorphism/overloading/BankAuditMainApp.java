package com.learning.polymorphism.overloading;

import com.learning.abstractionAndInheritance.BankAccount;
import com.learning.abstractionAndInheritance.LoanAccount;
import com.learning.abstractionAndInheritance.SavingAccount;
import com.learning.abstractionAndInheritance.ZeroBalanceSavingAccount;

public class BankAuditMainApp {

	public static void main(String[] args) {
		
		ZeroBalanceSavingAccount z1 = new ZeroBalanceSavingAccount(null, 0);
		
		SavingAccount s1 = new SavingAccount(null, 0);
		
		LoanAccount l1 = new LoanAccount(null, 0);
		
		BankAudit.doAudit(z1);     //   doAudit(ZeroBalanceSavingAccount z1)
		
		BankAudit.doAudit(s1);     //   doAudit(SavingAccount s1)
		
		BankAudit.doAudit(l1);     //   doAudit(BankAccount b1)  -- up-conversion  --> parent class ref can hold child class object
		
		

	}

}
