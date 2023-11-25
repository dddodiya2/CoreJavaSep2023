package com.learning.abstractionAndInheritance;

public class LoanAccount extends BankAccount implements Intersetable,OffersInterface {

	
	public LoanAccount(String bankName, double balance) {
		super(bankName, balance);
	}
	
	@Override
	public void deposit(double amount) {
		if(balance >= amount) {
			this.balance = this.balance - amount ;
			System.out.println("Your updated balance is : " + this.balance);
		}else {
			amount = amount - this.balance ;
			this.balance = 0 ;
			System.out.println("Congratulations ! Your loan is cleared , and here is your remaining amount return to you : " + amount);
		}	
	}

	@Override
	public void withdraw(double amount) {
		this.balance += amount ;
		System.out.println("Your updated loan account balance is : " + this.balance);
	}

	@Override
	public void getOffers() {
		System.out.println("Here are your offers for your Loan Account : ");
		
	}

	@Override
	public void calculateInt() {
		if(balance > 0) {
			balance = balance + (balance * 0.09) ;
		}
		System.out.println("Updated balance after the interest is : " + this.balance);
	}
	

}
