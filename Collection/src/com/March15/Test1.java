package com.March15;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {

	public static void main(String[] args) 
	{
		ArrayList<Student>list=new ArrayList<Student>();
		
		list.add(new Student(3.2,"aasha",23));
		list.add(new Student(1.2,"usha",20));
		list.add(new Student(5.2,"sneha",19));
		list.add(new Student(5.4,"pranav",25));
		list.add(new Student(6.4,"arti",15));
		StudentRating r=new StudentRating();
		Collections.sort(list,r);
		System.out.println("Data after Sorting");
		for(Student student:list)
		{
			System.out.println(student.getAge()+" "+student.getName()+" "+student.getRating());
			
		}

	}

}
