package com.citibank.main;

import com.citibank.main.domain.CurrentAccount;

public class BankingApplicationMainV6 {
	
	String tempvar2;

	public static void main(String[] args) {
		CurrentAccount currentaccount = new CurrentAccount(101, "Vivek Gohil", 10000, 50000);
		
		if(currentaccount.withdraw(5000)) {
			//5000
			System.out.println("Balance :: " + currentaccount.getBalance());
			//50000
			System.out.println("Overdraft Limit :: " + currentaccount.getOverdraftLimit());
		}
		
		if(currentaccount.withdraw(20000)) {
			//0
			System.out.println("Balance :: " + currentaccount.getBalance());
			//35000
			System.out.println("Overdraft Limit :: " + currentaccount.getOverdraftLimit());
		}
		
		if(currentaccount.deposite(10000)) {
			//0
			System.out.println("Balance :: " + currentaccount.getBalance());
			//45000
			System.out.println("Overdraft Limit :: " + currentaccount.getOverdraftLimit());
	
		}
		
		if(currentaccount.deposite(15000)) {
			//10000
			System.out.println("Balance :: " + currentaccount.getBalance());
			//50000
			System.out.println("Overdraft Limit :: " + currentaccount.getOverdraftLimit());
	
		}
	}

}

