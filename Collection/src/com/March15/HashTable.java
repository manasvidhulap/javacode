package com.March15;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) 
	{
		Hashtable<Integer,String>ht1=new Hashtable<Integer,String>();
		ht1.put(23,"sneha");
		ht1.put(24,"monalisa");
		ht1.put(22,"ajay");
		ht1.put(23,"vikas");
		ht1.put(26,"amit");
		System.out.println(ht1);
		for(Map.Entry m:ht1.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
