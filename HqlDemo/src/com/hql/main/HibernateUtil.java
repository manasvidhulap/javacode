package com.hql.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static SessionFactory sessionFactory = null;
	static {
		try
		{
			sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
		}
		catch(Throwable ex)
		{
			System.err.println("Initial Sessionfactory creation failed."+ex);
		}
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
