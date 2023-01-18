package com.citibank.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadMyFile {
	private String path = "c:/JavaTraining/test.txt";
	private InputStream inputStream;
//	private byte[] data = new byte[100];
	private byte[] data;
	private int arrayLenght;
	
	public void readFile() {
		try {
//			inputStream = new FileInputStream(path);  //opened the file
//   we have added this to take the length of the file and remove the 
//     extra BOXES at the end.. commented above line 
			
			File file = new File(path);         
			arrayLenght = (int) file.length(); 
			data = new byte[arrayLenght];
			inputStream = new FileInputStream(path);
			
//     ****************			
			inputStream.read(data);
			for (byte b : data)  {
				System.out.print((char)b); //this prints file 
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("Error in reading file");
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("Failed To Close File");
			}
		}
	}
}
