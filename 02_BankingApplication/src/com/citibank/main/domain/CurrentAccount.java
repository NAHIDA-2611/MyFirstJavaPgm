package com.citibank.main.domain;

public class CurrentAccount extends Account {
	private double overdraftLimit;
	double initialOverdraftBalance;
	CurrentAccount currentaccount;

	public CurrentAccount(int accountNumber, String name, double balance, double overdraftLimit) {
		super(accountNumber, name, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

			
	@Override
	public boolean withdraw(double amount) {
		if (amount >0) {
			if(amount <= getBalance())   {
				setBalance(getBalance() - amount);
				return true;
			}	
				
		if (amount > getBalance() && amount <= getBalance() + overdraftLimit) {
			amount = amount - getBalance();
			setBalance(0);
			overdraftLimit = overdraftLimit - amount;
			return true;
		}
			}
		return false;
			}

	@Override
	public boolean deposite(double amount) {
		if (amount >0) {
			if(initialOverdraftBalance > overdraftLimit)  {
				if(amount < initialOverdraftBalance - overdraftLimit) {
					overdraftLimit =overdraftLimit + amount;
					return true;
				}
				else {
					amount = amount - (initialOverdraftBalance - overdraftLimit);
					overdraftLimit =initialOverdraftBalance;
					setBalance(getBalance() + amount);
					return true;
				}
			} else {
				setBalance(getBalance() + amount);
				return true;
			}
		}
		return false;
	}
}
   
