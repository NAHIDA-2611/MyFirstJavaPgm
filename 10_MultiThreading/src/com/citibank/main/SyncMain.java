package com.citibank.main;

import com.citibank.main.domain.MyThread;
import com.citibank.main.domain.Resource;

public class SyncMain {

	public static void main(String[] args) {
		
//		Thread thread = Thread.currentThread();
//		System.out.println(thread);
//		thread.setName("Main Thread");
//		thread.setPriority(9);
//		System.out.println(thread);
//		
//		Resource resource = new Resource();
//		resource.message("Hi");
//		resource.message("Hello");
//		resource.message("How are you doing !!!!");
		
		Resource resource = new Resource();
		
		MyThread MyThreadOne = new MyThread(resource, "Hi");		
		Thread thread1 = new Thread(MyThreadOne);
		thread1.start();
		
		MyThread MyThreadTwo = new MyThread(resource, "Helloooo");		
		Thread thread2 = new Thread(MyThreadTwo);
		thread2.start();
		
		MyThread MyThreadThree = new MyThread(resource, "How are you !!");		
		Thread thread3 = new Thread(MyThreadThree);
		thread3.start();
	}

}
