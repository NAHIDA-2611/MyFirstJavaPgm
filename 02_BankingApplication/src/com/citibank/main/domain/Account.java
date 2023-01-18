package com.citibank.main.domain;

public abstract class Account {
	private int accountNumber;
	private String name;
	private double balance;
	
	// Constructor added for V4
	public Account() {
		System.out.println("Default Constructor of Account");
			}
			
	public Account(int accountNumber, String name, double balance) {
		System.out.println("3 Parms Constructor of Account");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	// Constructor added for V4
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

//	public boolean withdraw(double amount) {
//		System.out.println("withdraw() called");
//		if (amount > 0 && amount <= balance) {
//			balance = balance - amount;
//			return true;
//		}
//		return false;
//	}
	
	abstract public boolean withdraw(double amount);
	
//	public boolean deposite(double amount){
//		System.out.println("deposite() called");
//		if (amount > 0) {
//			balance = balance + amount;
//			return true;
//		}
	abstract public boolean deposite(double amount);
}



