package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV3 {

	public static void main(String[] args) {

		// ALL THE OBJECTS FIRST
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();

		// ALL THE VARIABLES
		int accountNumber;
		String name;
		double balance;
	//	int choice;
		char choice;
		double amount;
		String continueChoice;

		// SYSOUT
		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		// To wait for enter else it won't wait - to store extra enter
		scanner.nextLine();
		System.out.println("Enter Name");
		// nextLine is to solve the space issue
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

		System.out.println("Your Acount is opened sucessfully");
		System.out.println("Account Number ::" + account.getAccountNumber());
		System.out.println("Name ::" + account.getName());
		System.out.println("Balance ::" + account.getBalance());

		System.out.println();
		do {

			showTransactionMenu(scanner, account);
			System.out.println("Do you want to continue ?");
			continueChoice = scanner.next();
	//	} while (continueChoice.equals("yes"));
	    } while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("y"));
		
		System.out.println("Thank You");

	}

	private static void showTransactionMenu(Scanner scanner, Account account) {
		char choice;
		double amount;
		System.out.println("Transaction Menu");
		System.out.println("Press 1 For Deposit");
		System.out.println("Press 2 For Withdrawl");
		System.out.println("Press 3 For Check Balance");
		System.out.println("Press 4 To EXIT");
		System.out.println("Enter YOur Choice");
//	choice = scanner.nextInt();
		choice = scanner.next().charAt(0);
//charAt(x) where x is the index where we want to pick any string 	

		switch (choice) {
//	case 1:
		case '1':
			System.out.println("Enter Amount To Withdraw");
			amount = scanner.nextDouble();
			if (account.withdraw(amount))
				System.out.println("Withdraw Successfull");
			else
				System.out.println("Withdraw Failed");
			break;

//	case 2:
		case '2':	
			System.out.println("Enter Amount To Deposit");
			amount = scanner.nextDouble();
			if (account.deposite(amount))
				System.out.println("Deposit Successfull");
			else
				System.out.println("Deposit Failed");
			break;

//	case 3:
		case '3':
			System.out.println("Balance ::" + account.getBalance());
			break;

//	case 4:
		case '4':
			// System.exit(0);

		default:
			System.out.println("Invalid Choice");
			break;

		}
	}

}
