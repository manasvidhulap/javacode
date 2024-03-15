package com.March15;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 
{
	public static void main(String[] args)
	{
		ArrayList<Student>list1=new ArrayList<Student>();
		
		list1.add(new Student(9.2,"sneha",23000));
		list1.add(new Student(4.5,"sakshi",27500));
		list1.add(new Student(3.7,"sagar",23400));
		list1.add(new Student(4.6,"roshan",86000));
		list1.add(new Student(8.3,"bhima",56398));
		
		StudentName sn = new StudentName();
         Collections.sort(list1,sn);
		
		for(Student ls:list1) 
		{
			
			System.out.println(ls.getAge()+" "+ls.getName()+" "+ls.getRating());
		}
	}

}
