package com.eb.data;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserManagement 
{
	
	public static void main(String[] args) throws ClassNotFoundException , SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/music1","root","root");
		String query="insert into song(songname,typeofsong,duration)values(?,?,?)";
		CallableStatement cs=conn.prepareCall(query);
		cs.setString(1, "Tera Fitoor");
		cs.setString(2,"Romantic");
		cs.setInt(3, 5);
		cs.execute();
		System.out.println("Data of Song is Inserted Successfully....!!!!");
	}

}
