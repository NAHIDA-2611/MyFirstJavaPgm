package com.citibank.main;

 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 

import com.citibank.main.domain.Customer;

 

public class CustomerMain {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Customer c1 = new Customer(1,"Nahida","Pune");
        Customer c2 = new Customer(2,"Quaser","Ranchi");
        Customer c3 = new Customer(3,"Aadloo","Banglore");
        Customer c4 = new Customer(4,"Beauty","Delhi");
        Customer c5 = new Customer(5,"Zeeniya","Kashmir");

        List <Customer> customers = new ArrayList<>();

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);

        printAllCustomers(customers);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter customerID : ");
//        int customerID = scanner.nextInt();
//        printCustomerByCustomerID(customers,customerID);
//            

        System.out.print("Enter customerID : ");
        int customerID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter City : ");
        String city = scanner.next();
        Customer c = new Customer(customerID,name,city);
        updateCustomerDetails(customers,c); 
        printCustomerByCustomerID(customers,customerID);

        System.out.print("Enter customerID to Delete : ");
        customerID = scanner.nextInt();
        deleteCustomerByCustomerID(customers,customerID);
        printAllCustomers(customers);

    }

    public static void printAllCustomers(List <Customer> customerList)
    {
        System.out.println("All customers");
        for (Customer customer : customerList)
        {
            System.out.println(customer);
        }

    }
    public static void printCustomerByCustomerID(List <Customer> customerList, int customerID)
    {
        boolean flag=false;
        for(Customer c: customerList)
        {
            if (c.getCutomerID() == customerID)
            {
                System.out.println("Employee found");
                System.out.println(c);
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println("Employee not found");

 

    }
    public static void updateCustomerDetails(List<Customer> customerList,Customer c)
    {
        boolean flag = false;
        for(Customer cl:customerList)
        {
            if(cl.getCutomerID() == c.getCutomerID())
            {
                cl.setName(c.getName());
                cl.setCity(c.getCity());
                flag=true;
                System.out.println("Update successful - "+cl);
                break;
            }
        }
        if (flag == false)
        {
            System.out.println("Update failed, Customer ID "+c.getCutomerID()+" not found...!");
        }
    }
    public static void deleteCustomerByCustomerID(List <Customer> customerList, int customerID)
    {
        boolean flag = false;
        for(Customer cl:customerList)
        {
            if(cl.getCutomerID() == customerID)
            {
                customerList.remove(cl);
                flag=true;
                System.out.println("Customer Found & delete successful ");
                break;
            }
        }
        if (flag == false)
        {
            System.out.println("Delete failed, Customer ID "+customerID+" not found...!");
        }

 

    }
}