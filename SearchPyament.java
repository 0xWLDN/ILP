package com.tcs.examples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchPyament 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer Number");
		int customernumber=scanner.nextInt();
		String sql="select checknumber, paymentdate, amount from payments where customernumber=?";
		try
		{
			Connection connection=DBConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, customernumber);
			ResultSet rs = ps.executeQuery();
			boolean found = false;
			while(rs.next())
			{
				found=true;
				System.out.println("Check number:" +rs.getString("checknumber"));
				System.out.println("Payment Date:" +rs.getString("paymentdate"));
				System.out.println("Amount:" +rs.getString("amount"));
			}
			if(found==false)
			{
				System.out.println("NO payments found for customer number:" + customernumber);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		scanner.close();
	}
}
