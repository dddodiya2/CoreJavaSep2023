package com.learning.abstractionAndInheritance;

public class MainApp {

	public static void main(String[] args) {
		
		SavingAccount sb1 = new SavingAccount("SBI", 10000.0);
		
		sb1.displayBalance();
		sb1.deposit(1000.0);
		sb1.withdraw(5000.0);
		sb1.withdraw(15000.0);
		sb1.displayBalance();
		
		
		LoanAccount la1 = new LoanAccount("SBI", 50000.0);
		
		la1.displayBalance();
		la1.deposit(52000.0);
		la1.withdraw(20000.0);
		la1.displayBalance();
		
		BankAccount b1 = new SavingAccount("YES BANK", 10000.0);
		b1.deposit(100.0);
		b1.displayBalance();
		//b1.savingAccountInfo();
		
	}

}
