package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionTest {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		Connection connection = null;
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("1. Driver loaded successfully");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root", "root");
			System.out.println("Connection successfull");
			
			String sql = "insert into customer_details(name,address) values(?,?)";
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			
			int i = 0;
			do {
			Scanner scanner = new Scanner(System.in);			
			System.out.println("Enter Name");
			preparedstatement.setString(1,scanner.nextLine());
			System.out.println("Enter address");
			preparedstatement.setString(2, scanner.nextLine());
					
			
	//		preparedstatement.setString(1, "Nahida Quaser");
	//		preparedstatement.setString(2, "Pune");
			
			int rowCount = preparedstatement.executeUpdate();
			System.out.println(rowCount);
			if(rowCount > 0)  {
				System.out.println("Record updated successfully");
			} else {
				System.out.println("No Rows Inserted");
			}
			i++;
			} while (i < 5);
				
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Driver not found");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection .close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main Ends");

	}

}
