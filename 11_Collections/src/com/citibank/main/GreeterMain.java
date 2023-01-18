package com.citibank.main;

import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {
		
		Greeter greeter = new GoodMorningGreeter();		
		greeter.greet();
		System.out.println("----------------------------------------------");
		
		Greeter goodEveningGreeter = new Greeter()   {
			@Override
			public void greet() {
				System.out.println("Good Evening !!!!!!!!!");
			}			
		};		
		goodEveningGreeter.greet();
		System.out.println("-------------------------------------------");
		
		Greeter greeter2 = () -> {
			System.out.println("My Way !!!!!!");
		};
			
		greeter2.greet();
		
		Greeter goodNightGreeter = () -> System.out.println("GooodNight"); 
		goodNightGreeter.greet();		
		
		Runnable runnable = ()  -> System.out.println("We are in Thread");
		Thread thread = new Thread(runnable);
		thread.start();

	}
	
	

}

