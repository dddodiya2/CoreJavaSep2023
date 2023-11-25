package com.learning.abstractionAndInheritance;

public class SavingAccount extends BankAccount implements Intersetable, OffersInterface {

	public SavingAccount(String bankName, double balance) {
		super(bankName, balance);
	}
	
	public void deposit(double amount) {
		 balance = this.balance + amount ;
		 System.out.println("Updated balance is : " + this.balance);
	}

	public void withdraw(double amount) {
		
		if(this.balance >= amount  ) {
			this.balance = this.balance - amount ;
		}else {
			System.out.println("Withdraw is not possible , please try with lesser amount !!!!!");
		}
		
		System.out.println("Updated balance is : " + super.balance);
	}

	@Override
	public void getOffers() {
		System.out.println("Here are your offers for your SB Account : ");
		
	}

	@Override
	public void calculateInt() {
		if(balance > 0) {
			balance = balance + (balance * 0.04) ;
		}
		System.out.println("Updated balance after the interest is : " + this.balance);
	}
	
	public void savingAccountInfo() {
		System.out.println("Bank name is : " + this.bankName + " and current balance is : " + this.balance );
	}
	
	
}
