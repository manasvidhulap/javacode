package com.March15;

import java.util.Comparator;

public class StudentRating  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		if(o1.getAge()<o2.getAge()) {
			return -1;
			
		}
		else if(o1.getAge()>o2.getAge()) {
			return 1;
		}
		else {
		return  0;
	}

}}
