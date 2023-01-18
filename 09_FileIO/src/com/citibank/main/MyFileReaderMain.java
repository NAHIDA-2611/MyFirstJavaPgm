package com.citibank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;

public class MyFileReaderMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter File + extnsn");
		String path = scanner.next();
		
//		File file = new File(path);
//		FileReader fileReader = null;
//		MyFileReader myFileReader = null;
//		BufferedReader bufferedReader = null;
		
		FileWriter fileWriter = null;
		
		myFileWriter = new MyFileWriter(fileWriter);
	
	
//		try {
//			fileReader = new FileReader(file);
//			bufferedReader = new BufferedReader(fileReader);
//			myFileReader = new MyFileReader(bufferedReader);
//			
//			String data = myFileReader.readFileLineByLine();
//			System.out.println(data);
//		} catch (FileNotFoundException e) {
//			System.out.println("Error while opening file");
//		} finally {
//			try {
//				try {
//					fileReader.close();
//				} catch (IOException e) {
//					System.out.println("Close successfully");
//					e.printStackTrace();
//					System.out.println("Close Fail");
//				}
//				try {
//					bufferedReader.close();
//				} catch (IOException e) {
//					System.out.println("Close Successfully");
//					e.printStackTrace();
//				}		
//			
//			
			
		
		
// 	BufferedReader bufferedreader = new BufferedReader(fileReader);
		
		
//		try {
//			fileReader = new FileReader(file);
//			
//			myFileReader = new MyFileReader(file, fileReader);
//			String data = myFileReader.readFile();
//			if (data.equals(""))  {
//			System.out.println("Failed to Read File");
//			} else {
//				System.out.println(data);
//			}
//			} catch (FileNotFoundException e)	{
//				e.printStackTrace();
//			} finally {
//				try {
//				fileReader.close();
//			} catch (IOException e)  {
//						}
//					}
		
	}

