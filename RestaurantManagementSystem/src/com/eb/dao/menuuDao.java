package com.eb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.eb.database.CP;
import com.eb.pojo.menuu;

public class menuuDao 
{
	public static boolean createMenu(menuu m)
	{
		try
		{
			boolean f = false;
			Connection conn=CP.createc();
			String query="insert into menuu(menuname, menutype , prise , quantity)values(?,?,?,?)";
			PreparedStatement p=conn.prepareStatement(query);
			p.setString(1,m.getMenuName());
			p.setString(2,m.getMenuType());
			p.setInt(3, m.getPrise());
			p.setInt(4, m.getQuantity());
			p.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
	}
	 	public static boolean updateMenuData(menuu m , int val , String toUpdate , int id)
	 	{
	 		boolean f=false;
	 		try
	 		{
	 			Connection conn=CP.createc();
	 			if(val==1)
	 			{
	 				//update menu name
	 				String query="update menuu set menuname=? where menuid=?";
	 				PreparedStatement ps=conn.prepareStatement(query);
	 				ps.setString(1, toUpdate);
	 				ps.setInt(2, id);
	 				ps.executeUpdate();
	 				f=true;
	 			}
	 			else if(val==2)
	 			{
	 			 	//update menu type
	 				String query="update menuu set menutype=? where menuid=?";
	 				PreparedStatement ps=conn.prepareStatement(query);
	 				ps.setString(1, toUpdate);
	 				ps.setInt(2, id);
	 				ps.executeUpdate();
	 				f=true;
	 			}
	 			else 
	 			{
					System.out.println("No updation");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return false;
		}
	 	public static void showAllMenu()
	 	{
	 		boolean f=false;
	 		try
	 		{
	 			Connection conn=CP.createc();
	 			String query="select * from menuu";
	 		    Statement st=conn.createStatement();
	 		    ResultSet rs=st.executeQuery(query);
	 		    while(rs.next())
	 		    {
	 		    	int  id=rs.getInt(1);
	 		    	String menuname=rs.getString(2);
	 		    	String menutype=rs.getString(3);
	 		    	int prise =rs.getInt(4);
	 		    	int quantity=rs.getInt(5);
	 		    	System.out.println("Menu Id:"+id+"\nMenu Name:+"+menuname+"\nMenu Type:"+menutype+"\nMenu Prise:"+prise+"\nMenu Quantity:"+quantity);
	 		    	
	 		    }
	 		    
	 		}
	 		catch(Exception e)
	 		{
	 			e.printStackTrace();
	 		}
	 	}
	 	public static boolean DeleteMenu(int menuid)
	 	{
	 		boolean f=false;
	 		try
	 		{
	 			Connection conn=CP.createc();
	 			String query="delete from menuu where id=?";
	 			PreparedStatement ps = conn.prepareStatement(query);
	 			ps.setInt(1, menuid);
	 			ps.executeUpdate();
	 			f=false;
	 			
	 		}
	 		catch(Exception e)
	 		{
	 			e.printStackTrace();
	 		}
	 		return false;
	 	}
	 	
}














