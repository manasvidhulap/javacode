package com.eb.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP 
{	
	static Connection conn;
	public static Connection createc()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud11221","root","root");
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		return conn;
	}
}
