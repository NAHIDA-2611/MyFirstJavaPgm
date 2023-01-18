package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.WriteMyFile;

public class MyFileWriteMyFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Path & FileName with extension");
		String path = scanner.next();
		System.out.println("Enter Data");
		String data = scanner.next();
		
		File file = new File(path);
		OutputStream outputStream = null;
		WriteMyFile writeMyFile = null;
		try {
// true will make my next write to append ... also we can pass file 
			outputStream = new FileOutputStream(path,true);
			
//			writeMyFile = new WriteMyFile(file, outputStream, data); 
			writeMyFile = new WriteMyFile(outputStream, data);
			
			if (writeMyFile.writeFile())  {
				System.out.println("Plz check your file");
			} else {
				System.out.println("Failed To Write File");
			}
		} catch (FileNotFoundException e)	{
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
			} catch (IOException e)  {
				e.printStackTrace();
			}
		}
	}

}
