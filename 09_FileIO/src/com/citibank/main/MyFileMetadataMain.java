package com.citibank.main;

import java.util.InputMismatchException;

import com.citibank.main.domain.MyFileMetadata;
import com.citibank.main.domain.ReadMyFile;

public class MyFileMetadataMain {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		MyFileMetadata myfilemetadata = new MyFileMetadata();
				
		myfilemetadata.printFileMetadata();
		
		System.out.println("Main Ends");
		
		System.out.println("------------------------------");
		
		ReadMyFile readmyfile = new ReadMyFile();	// calling	
		readmyfile.readFile();                      // method
		
		
	}

	}

