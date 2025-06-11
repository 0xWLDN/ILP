package com.tcs.examples;

public class Order 
{
    private static int nextOrderID = 1;
    private int orderID;
    private String productName;
    private double price;
    private int quantity;

    public Order(String productName, double price, int quantity)
    {
        this.orderID = nextOrderID++;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    //getter setter
	public static int getNextOrderID() {
		return nextOrderID;
	}

	public static void setNextOrderID(int nextOrderID) {
		Order.nextOrderID = nextOrderID;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	


	
	
}
