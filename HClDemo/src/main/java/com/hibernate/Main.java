package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main 
{
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s= sf.openSession();
		Transaction t=s.beginTransaction();
		
		person p= new person(101,"Sneha","Mankhurd");
		s.save(p);
		person p1=new person(102, "Shreya", "Mumbai");
		s.save(p1);
		
		person p2=new person(0, null, null);
		p2.setAdd("Thane");
		p2.setName("Chakuli");
		s.save(p2);
		t.commit();
		
	}
}
