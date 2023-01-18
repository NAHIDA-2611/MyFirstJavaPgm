package com.citibank.main.domain;

public class Resource {
	public synchronized void message(String textMessage)  {
	System.out.print("[");
	System.out.print(textMessage);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		System.out.println("Sleep of Resource");
		e.printStackTrace();
	}
	System.out.println("]");
	}
}
