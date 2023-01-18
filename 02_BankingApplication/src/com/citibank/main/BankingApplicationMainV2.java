package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV2 {

	public static void main(String[] args) {
		System.out.println("Welcome to CITI Bank");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Number");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		String name = scanner.next();
		System.out.println("Enter Balance");
		double balance = scanner.nextDouble();
		
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);
		
		System.out.println("Your Acount is opened sucessfully");
		System.out.println("Account Number ::" + account.getAccountNumber());
		System.out.println("Name ::" + account.getName());
		System.out.println("Balance ::" + account.getBalance());
		// \n for new line output 
		System.out.println("Account Number ::" + account.getAccountNumber() + "\n" + 
				 "Balance ::" + account.getBalance() + "\n" +
				 "Name ::"+ account.getName());
			
	}

}
