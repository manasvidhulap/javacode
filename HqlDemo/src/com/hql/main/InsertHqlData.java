package com.hql.main;

import javax.persistence.RollbackException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;

import com.hql.model.school;

public class InsertHqlData 
{
	public static void main(String args[])throws SecurityException , RollbackException ,HeuristicMixedException , HeuristicRollbackException,SystemException
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		school school=new school();
		school.setId(102);
		school.setName("sneha");
		school.setRoll("120");
		school.setPhone("9967951623");
		school.setDegree("BscIT");
		
		session.save(school);
		tx.commit();
		session.close();
		
		
	}
	
		
	
}
