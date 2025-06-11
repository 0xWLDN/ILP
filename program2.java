package com.tcs.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class program2 
{
	public static void main(String[] args)
	{
		/*
		 * To prompt user, First name, Last name, age and credit limit
		 * then create object and take the input
		 * pass the object into our array list
		 * go through the ArrayList
		 * gives an option to user to edit
		 * */
		
		ArrayList<Customer> customers = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while(true) 
		{
			showMenu();
			int choice = scan.nextInt();
			scan.nextLine();
			
			if(choice == 1)
			{
				customers.add(addUser(scan));
			}
			else if(choice == 2)
			{
				printUser(customers);
			}
			else if(choice == 3)
			{
				editUser(customers, scan);
			}
			else if(choice == 0)
			{
				System.out.println("You have exited the program.");
				break;
			}
			else
			{
				System.out.println("Invalid choice");
			}
			
		}
		scan.close();
	}
	public static void showMenu()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Press 1 to register user");
		System.out.println("Press 2 to print user");
		System.out.println("Press 3 to edit user");
		System.out.println("Press 0 to exit");
	}
	public static Customer addUser(Scanner scan)
	{
		System.out.println("Enter Your First Name");
		String input1 = scan.nextLine();
		System.out.println("Enter Your Last Name");
		String input2 = scan.nextLine();
		System.out.println("Enter Your Age");
		int input3 = scan.nextInt();
		System.out.println("Enter Your Credit Limit");
		double input4 = scan.nextDouble();
		Customer customer1 = new Customer(input1, input2, input3, input4);
		return customer1;
	}
	public static void printUser(ArrayList<Customer> customers)
	{
		//error handling -- check if empty
		if(customers.isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			for(Customer c:customers)
			{
				System.out.println(c.getFirstName());
				System.out.println(c.getLastName());
				System.out.println(c.getAge());
				System.out.println(c.getCreditLimit());
			}
		}

	}
	public static void editUser(ArrayList<Customer> customers, Scanner scan)
	{
    	System.out.println("write to search a name:");
    	String input = scan.nextLine();
    	boolean found = false;
    	

    	for(int k=0;k<customers.size(); k++) 
    	{
    		if(input.equals(customers.get(k).getFirstName()))
    		{
    			found = true;
    			System.out.println("Name found, enter a new name");
    			String newname = scan.nextLine();
    			customers.get(k).setFirstName(newname);;
    			break;
    		}
    	}
    	if(!found)
    		System.out.println("Name not found");
    	if(customers.isEmpty())
    	{
    		System.out.println("List is empty");
    	}
	}
}





//		Customer customer1 = new Customer("Wildan", "Rizqullah", 23, 100000);
//		Customer customer2 = new Customer("Arif", "Haziq", 29, 100000);
//		customers.add(customer1);
//		customers.add(customer2);
		
//		for(Customer c:customers)
//		{
//			System.out.println(c.getFirstName());
//			System.out.println(c.getLastName());
//			System.out.println(c.getAge());
//			System.out.println(c.getCreditLimit());
//		}