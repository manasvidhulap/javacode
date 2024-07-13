package com.July3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class checkConnection 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // registering driver
//        Statement stmt;
        String url = "jdbc:mysql://localhost:3306/Employee";
        Connection con = DriverManager.getConnection(url, "root", "root");// establish connection
        //System.out.println(con);
        System.out.println("Database dbemp connection suceesfully establish");
        int e_id;String ename,edes;
        Scanner sc=new Scanner(System.in);
        Statement stmt=con.createStatement();
        while(true)
        {
        	System.out.println("Click the 1- Add details:");
        	System.out.println("Click the 2- Displyaing of Employee details by ID:");
        	System.out.println("Click the 3- update of Employee details:");
        	System.out.println("Click the 4- Delete of Employee details:");
        	System.out.println("Click the 5- Displaying of Employee details:");
        	System.out.println("Click the 6- Exit:");
        	System.out.println("Enter the Choice:");
        	int choice=sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        	{
        		System.out.println("Enter the Employee ID:");
        		e_id=sc.nextInt();
        		System.out.println("Enter the Employee Name:");
        		ename=sc.next();
        		System.out.println("Enter the Employee Designation:");
        		edes=sc.next();
        		stmt.executeUpdate("insert into values("+e_id+","+"'"+ename+"','"+edes+"')");
        		System.out.println("Record inserted Successfully....");
        		break;
        	}
        	case 2:
        	{
        		System.out.println("Enter the Employee ID:");
        		e_id=sc.nextInt();
        		ResultSet rs=stmt.executeQuery("select*from Employee where e_id="+e_id);
        		
        		System.out.println("Get Employee Records:");
        		while(rs.next())
        		{
        			System.out.println("e_id:"+rs.getInt(1));
        			System.out.println("ename:"+rs.getString(2));
        			System.out.println("edes:"+rs.getString(3));
        		}
        		break;
        	}
        	case 3:
        	{
        		System.out.println("Enter the Employee ID:");
        		e_id=sc.nextInt();
        		System.out.println("Enter the Employee Name:");
        		ename=sc.next();
        		System.out.println("Enter the Employee Designation:");
        		edes=sc.next();
        		stmt.executeUpdate("Update Student set Employee Name="+"'"+ename+"',Designation='"+edes+"' where e_id="+e_id);
        		System.out.println("update inserted Successfully......");
        		break;
        	}
        	case 4:
        	{
        		System.out.println("Enter the Employee ID:");
        		e_id=sc.nextInt();
        		stmt.executeUpdate("delete from Employee where s_no="+e_id);
        		System.out.println("Delete Employee Records.........");
        		break;
        	}
        	case 5:
        	{
        		ResultSet rs=stmt.executeQuery("select * from Employee");
        		System.out.println("Get Employee Record");
        		while(rs.next())
        		{
        			System.out.println("e_id:"+rs.getInt(1));
        			System.out.println("ename:"+rs.getString(2));
        			System.out.println("edes:"+rs.getString(3));
        		}
        		break;
        	}
        	case 6:
        	{
        		System.out.println("Exiting......");
        		System.exit(0);
        		break;
        	}
        	default:
        		throw new IllegalArgumentException("Unexpected value:"+choice);
        	}
        }
	}

}
