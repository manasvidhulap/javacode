package com.post.database;

import java.sql.Connection;

public class CP 
{
	static Connection conn;
	public static Connection createc()
	{
		try
		{
			Class.forName("com.mysql.jdbc.cj.DriverManager");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
}
