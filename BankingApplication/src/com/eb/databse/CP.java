package com.eb.databse;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP 
{
	static Connection con;
	public static Connection createc()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc.mysql://localhost:3306/transaction","root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
