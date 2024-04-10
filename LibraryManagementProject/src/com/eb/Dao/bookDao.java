package com.eb.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.eb.database.CP;
import com.eb.pojo.Book;

public class bookDao 
{
	public static boolean createbook(Book b)
	{
		try
		{
			boolean f=false;
			Connection con=CP.createc();
			String query="insert into book(bookname,bookauthor,bookprice,publication)values(?,?,?,?)";
			PreparedStatement p=con.prepareStatement(query);
			p.setString(1,b.getBookname());
			p.setString(2,b.getBookauthor());
			p.setInt(3,b.getBookprice());
			p.setString(4,b.getPublication());
			p.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static boolean updatebook(Book b , String toUpdate , int bookid , int val)
	{
		boolean f= false;
		try
		{
			Connection conn=CP.createc();
			if(val==1)
			{
				String query="update book set bookprice=? where bookid=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setInt(1, bookid);
				ps.setString(2, toUpdate);
				ps.executeUpdate();
				f=true;	
			}
			else if(val==2)
			{
				String query="update book set bookname=? where bookid=?";
				PreparedStatement ps= conn.prepareStatement(query);
				ps.setInt(1, bookid);
				ps.setString(2, toUpdate);
				ps.executeUpdate();
				f=true;
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		    return false;
		}
	public static boolean deletebook(int bookid)
	{
		boolean f=false;
		try
		{
			Connection conn=CP.createc();
			String query="delete from book where bookid=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, bookid);
			ps.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static void showAllBook() 
	{
		boolean f=false;
		try
		{
			Connection conn=CP.createc();
			String query="select * from Book";
			Statement s= conn.createStatement();
			ResultSet rs=s.executeQuery(query);
			while(rs.next())
			{
				int bookid=rs.getInt(1);
				String bookname=rs.getString(2);
				String bookauthor=rs.getString(3);
				int bookprice=rs.getInt(4);
				String publication=rs.getString(5);
				System.out.println("Book ID:"+bookid+"\n Book Name:"+bookname+"\n Book Author:"+bookauthor+"\n "
						+ "Book Price:"+bookprice+"\n Book Publication:"+publication);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}




















