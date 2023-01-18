package com.citibank.main.domain;

public class Account implements Runnable {
		private Account account;
		private int transactionChoice;		
		private double amount;
		
			
		public Account(Account account, int transactionChoice, double Amount)  {
				super();
				this.account = account;
				this.transactionChoice = transactionChoice;
				this.amount =amount;
			}

			@Override
			public void run() {
				if (transactionChoice == 1)  {
					if (account.Withdraw (amount))  {
						System.out.println("Balance after withdraw::"  account.getBalance);
					}
					else if (transactionChoice == 2)  {
						if (account.Deposit (amount)) {
							System.out.println("Balance after deposit::"  account.getBalance);
						}
					}
					
					
				}
				
			}	

}
