package com.hql.main;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;


import com.hql.model.school;

public class ReadHqlData 
{
	public static void main(String args[])
	{
		
	Session session=HibernateUtil.getSessionFactory().openSession();
	org.hibernate.Transaction tx=session.beginTransaction();
	
	Query query=session.createQuery("from school");
	List<school> list = (List<school>) query.list();
	for(school sc:list)
	{
		System.out.println("List of Student::"+sc.getId()+"," +sc.getName()+","+sc.getDegree());
	}
	query=session.createQuery("from school where id=:id");
	query.setLong("id",101);
	school sch=(school)query.uniqueResult();
	System.out.println("school name="+sch.getName()+",Degree="+sch.getDegree());
	tx.commit();
	session.close();

    }
}


