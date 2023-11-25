package com.learning.abstractionAndInheritance;

public abstract class BankAccount {

	
	String bankName ;
	double balance;
	
	public BankAccount() {
	}
	
	public BankAccount(String bankName, double balance) {
		this.bankName = bankName;
		this.balance = balance;
	}
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
	
	public void displayBalance() {
		System.out.println("Current Balance is : " + balance);
	}
	
}
