package com.tcs.examples;
import java.util.*;

public class program3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Order> orders = new ArrayList<>();
		
		while(true)
		{
			showMenu();
			int choice = scan.nextInt();
			
			if(choice == 1)
			{
				addOrder(scan, orders);
			}
			else if (choice == 2)
			{
				editOrder(scan, orders);
			}
			else if (choice == 3)
			{
				listOrders(orders);
			}
			else if (choice == 0) 
			{
				exitProgram();
				break;
			}
		}
		scan.close();
	}
	
	public static void showMenu() 
	{
		System.out.println("1. To Add Menu");
		System.out.println("2. To Edit Menu");
		System.out.println("3. To List the Menu");
		System.out.println("0. To Exit the Program");
	}
	
	public static void addOrder(Scanner scan, ArrayList<Order> orders) {
	    scan.nextLine(); // Consume leftover newline
	    System.out.println("Enter Product Name:");
	    String productname = scan.nextLine();

	    System.out.println("Enter Product Price:");
	    double productprice = scan.nextDouble();

	    System.out.println("Enter Product Quantity:");
	    int productquantity = scan.nextInt();

	    Order neworder = new Order(productname, productprice, productquantity);
	    orders.add(neworder);

//	    System.out.println("Order added successfully!\n");
	}
	
	public static void editOrder(Scanner scan, ArrayList<Order> orders) {
	    scan.nextLine(); // consume leftover newline
	    if (orders.isEmpty()) {
	        System.out.println("Order list is empty.");
	        return;
	    }

	    System.out.print("Enter product name to search: ");
	    String productname = scan.nextLine();
	    boolean found = false;

	    for (Order order : orders) {
	        if (productname.equals(order.getProductName())) {
	            found = true;
	            System.out.print("Product found. Enter new product name: ");
	            String newproductname = scan.nextLine();
	            order.setProductName(newproductname);
	            System.out.println("Product name updated.");
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Product not found.");
	    }
	}
	
	public static void listOrders(ArrayList<Order> orders)
	{
		//list and also total it
		//error handling -- check if empty
		if(orders.isEmpty())
		{
			System.out.println("Order List is empty");
		}
		else
		{
			double totalSales = 0.0;

			for(Order o:orders)
			{
				System.out.println(o.getOrderID());
				System.out.println(o.getProductName());
				System.out.println(o.getPrice());
				System.out.println(o.getQuantity());
				double sales = o.getPrice() * o.getQuantity();
				totalSales += sales;
				System.out.println(totalSales);
			}
		}
		
	}
	public static void exitProgram()
	{
		System.out.println("Thank you");
	}
}
