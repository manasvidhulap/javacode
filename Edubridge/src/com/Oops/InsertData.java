package com.Oops;

public class InsertData {

	public static void main(String[] args) 
	{
		StringBuilder s = new StringBuilder();
		s.append("Sneha");
		s.append("santosh");
		s.append("dhulap");
		s.append("mankhurd");
		System.out.println(s);
		
		s.replace(3, 7, "chakuli");
		System.out.println(s);
		
		s.indexOf("mona");
		System.out.println(s);
		
		s.delete(9, 10);
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
	}

}
