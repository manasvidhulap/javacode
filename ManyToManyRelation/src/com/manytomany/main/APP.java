package com.manytomany.main;

import org.hibernate.Session;

import com.manytomany.model.student;
import com.manytomany.model.subject;

public class APP
{
	public static void main(String[] args) 
	{
		student student1=new student("sneha","s");	
		student student2=new student("chakuli","c");
		student student3=new student("anjali","a");
		student student4=new student("priyanka","p");
		
		subject subject1 = new subject("Spring");
        subject subject2 = new subject("Devops");
        subject subject3 = new subject("vew js");
        
        student1.getSubjects().add(subject3);
        student2.getSubjects().add(subject2);
        student3.getSubjects().add(subject1);
        student3.getSubjects().add(subject2);
        
        //Student2 have 2 subjects
        student4.getSubjects().add(subject1);
        student4.getSubjects().add(subject2);
        student4.getSubjects().add(subject3);
        Session session = HibernateUtil.getSessionFactory().openSession();
  
        
        session.persist(student1);
        session.persist(student2);
        session.persist(student3);
         
        session.persist(student4);
         
         
        session.getTransaction().commit();
        session.close();  
    }
 
	}

