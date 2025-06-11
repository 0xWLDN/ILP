package com.tcs.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
	private static final String URL="jdbc:mysql://localhost:3306/classicmodels";
	private static final String USER="root";
	private static final String PASSWORD="";
	
	public static Connection getConnection()throws SQLException
	{
		Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
		return connection;
		//return DriverManager.getConnection(URL,USER,PASSWORD);
	}
}
