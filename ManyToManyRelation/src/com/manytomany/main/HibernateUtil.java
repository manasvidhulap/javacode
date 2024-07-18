package com.manytomany.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static final SessionFactory sessionfactory;
	static
	{
		try
		{
			sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		catch(Throwable x)
		{
			System.out.println("Initial SessionFactory creation failed." + x);
			throw new ExceptionInInitializerError(x);
		}
	}
	public static SessionFactory getSessionFactory() {
        return sessionfactory;
    }
}
