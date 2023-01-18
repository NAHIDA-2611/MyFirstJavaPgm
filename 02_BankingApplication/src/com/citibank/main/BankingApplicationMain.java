/**
 * 
 */
package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApplicationMain {

		public static void main(String[] args) {
		System.out.println("main start");
		
		//object creation	
		Account account = new Account();
		
	//	account.accountNumber = 101;
	//	account.name = "Nahida Quaser";
	//	account.balance = 1000;
			
		account.setAccountNumber(101);
		System.out.println(account.getAccountNumber());
		
		//function calling
		account.withdraw(20);
			
		System.out.println("main ends");
	
	}

}
