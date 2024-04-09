package com.eb.bankDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.eb.databse.CP;
import com.eb.pojo.bank;

public class bankDao 
{
	public static boolean createBank(bank b)
	{
		try
		{
			boolean f = false;
			Connection conn= CP.createc();
			String query="insert into bank(accno ,accholdername ,address, contactno , balance)values(?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setLong(1, b.getAccno());
			ps.setString(2, b.getAccholdername());
			ps.setString(3, b.getAddress());
			ps.setLong(4, b.getContactno());
			ps.setLong(5, b.getBalance());
			ps.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
	}
	public static boolean UpdateBank(int val , String toUpdate,bank m ,int id )
	{
		boolean f=false;
		try
		{
			Connection conn=CP.createc();
			if(val==1)
			{
				//update bank account  holder name
				String query="update bank set accholdername=? where id=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			else if(val==2)
			{
				String query="update bank set address=? where id=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			else if(val==3)
			{
				String query="update bank set contactno=? where id=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			else if(val==4)
			{
				String query="update bank set balance=? where id=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			else
			{
				System.out.println("No Updation is Occur.....");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static void readbank() 
	{
		boolean f=false;
		try
		{
			Connection con=CP.createc();
			String query="select * from bank";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next());
			{
				int id=rs.getInt(1);
				int accno=rs.getInt(2);
				String accholdername=rs.getString(3);
				String address=rs.getString(4);
				int contactno=rs.getInt(5);
				int balance=rs.getInt(6);
				System.out.println("Bank Account Id:"+id+"\n Bank Account Number:"+accno+"\n "
						+ "Bank Account Holder Name:"+accholdername+"\n Bank Account Holder Address:"+address+"\n"
						+"Bank Holder Contact Number:"+contactno+"\n Bank Balance:"+balance);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static boolean Deletebank(int id)
	{
		boolean f=false;
		try
		{
			Connection conn=CP.createc();
			String query="delete from bank where id=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, id);
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






















