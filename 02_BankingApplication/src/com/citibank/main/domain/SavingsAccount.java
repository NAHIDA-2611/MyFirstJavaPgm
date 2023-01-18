/**
 * 
 */
package com.citibank.main.domain;

public class SavingsAccount extends Account {
	boolean isSalary;

	public SavingsAccount() {
		System.out.println("Default Constructor of Savings Account");
	}

	public SavingsAccount(int accountNumber, String name, double balance, boolean isSalary) {
		// Super is written by default with no arguments that's why this was not called
		super(accountNumber, name, balance);
		this.isSalary=isSalary;
		System.out.println("Param Constructor Of Savings Account");
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

@Override
public boolean withdraw(double amount) {
	//write your business logic
	if (amount >0 && amount <= getBalance() ) {
		if (isSalary)  {
			setBalance(getBalance() - amount);
			return true;
		}
		if (isSalary == false && amount - getBalance() >= 1500) {
			setBalance(getBalance() - amount);
		return true;
        }
	}
	return false;
	}

@Override
public boolean deposite(double amount) {
	// TODO Auto-generated method stub
	return false;
}
}



