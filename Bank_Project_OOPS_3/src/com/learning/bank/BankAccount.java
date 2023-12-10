package com.learning.bank;

public class BankAccount {

	String name;
	int accountNumber;
	double balance;
	
	
	//deposit
	public void deposit(double amount) {
		balance = balance + amount; 
	}
	
	//withdraw
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
}
