package com.tcs.examples;

public class Customer 
{

	
	//properties -> variable
	private String firstName;
	private String lastName;
	private int age;
	private double creditLimit;
	
	//class constructor
	public Customer(String firstName, String lastName, int age, double creditLimit)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.creditLimit = creditLimit;
	}
	
	//getter and setter method
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
}
