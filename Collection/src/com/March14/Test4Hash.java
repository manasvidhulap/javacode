package com.March14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test4Hash 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String>h1= new HashMap<Integer,String>();
		h1.put(101,"sneha");
		h1.put(101,"chakuli");
		h1.put(103,"sneha");
		h1.put(105,"mona");
		h1.put(107,"akka");
		System.out.println(h1);
		
		LinkedHashMap<Integer,String>h2= new LinkedHashMap<Integer,String>();
		h2.put(101,"sneha");
		h2.put(101,"chakuli");
		h2.put(103,"sneha");
		h2.put(105,"mona");
		h2.put(107,"akka");
		System.out.println(h2);
		
		TreeMap<Integer,String>h3= new TreeMap<Integer,String>();
		h3.put(101,"sneha");
		h3.put(101,"chakuli");
		h3.put(103,"sneha");
		h3.put(105,"mona");
		h3.put(107,"akka");
		h3.put(107,"manu");
		System.out.println(h3);
		
			
	}

}
