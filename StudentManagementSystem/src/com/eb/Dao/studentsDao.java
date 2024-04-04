package com.eb.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.eb.databse.CP;
import com.eb.pojo.students;

public class studentsDao 
{
	public static boolean createstudents(students s)
	{
		try
		{
			boolean f=false;
			Connection conn=CP.createc();
			
			String query="insert into students(sname ,sphone ,scity)values(?,?,?)";
			PreparedStatement p=conn.prepareStatement(query);
			p.setString(1, s.getSname());
			p.setString(2, s.getSphone());
			p.setString(3, s.getScity());
			p.executeUpdate();
			f=true;	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static boolean updatestudentsdata(students s , int val , String toUpdate ,int sid )
	{
		boolean f=false;
		try
		{
			Connection conn=CP.createc();
			if(val==1)
			{
				//update student name
				String query="update students set sname=? where sid=?";
				PreparedStatement p= conn.prepareStatement(query);
				p.setString(1, toUpdate);
				p.setInt(2, sid);
				p.executeUpdate();
				f=true;
			}
			else if(val==2)
			{
				//update student phone number
				String query="update students set sphone=? where sid=?";
				PreparedStatement p= conn.prepareStatement(query);
				p.setString(1, toUpdate);
				p.setInt(2, sid);
				p.executeUpdate();
				f=true;
			}
			else if(val==3)
			{
				//update student city name
				String query="update students set scity=? where sid=?";
				PreparedStatement p=conn.prepareStatement(query);
				p.setString(1, toUpdate);
				p.setInt(2, sid);
				p.executeUpdate();
				f=true;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
	}
	public static boolean studentdelete(int sid)
	{
		boolean f=false;
		try
		{
			Connection conn=CP.createc();
			String query="delete from students where sid=?";
			PreparedStatement p=conn.prepareStatement(query);
			p.setInt(1, sid);
			p.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static void ShowAllstudents()
	{
		boolean f=false;
		try
		{
			Connection conn=CP.createc();
			String query="select * from students";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
			{
				int sid=rs.getInt(1);
				String sname=rs.getString(2);
				String sphone=rs.getString(3);
				String scity=rs.getString(4);
				System.out.println("Student ID is:"+sid+"\n Student Name is:"+sname+"\n Student Phone Number is:"+sphone+"\n Student City Name is:"+scity);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}























