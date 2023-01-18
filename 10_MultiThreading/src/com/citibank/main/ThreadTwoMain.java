package com.citibank.main;

import com.citibank.main.domain.ThreadTwo;

public class ThreadTwoMain {

	public static void main(String[] args) {
		ThreadTwo threadtwo = new ThreadTwo();
		Thread thread = new Thread(threadtwo);
		
		thread.start();
		
		for (int i =0; i < 1000; i++) {
			System.out.println("main2 ::"  + i);
			try {
				Thread.sleep(100);  // wait if there will be logic to process
			} catch (InterruptedException e) {
				System.out.println("MainThread Two.......");
				e.printStackTrace();
			}
		}
		System.out.println("Main End");

		
	}

}
