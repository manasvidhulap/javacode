package com.March15;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {

	public static void main(String[] args)
	{
		ConcurrentHashMap<String,Integer>map=new ConcurrentHashMap<String,Integer>();
		map.put("colorcode", 101);
		map.put("A", 105);
		map.put("B", 102);
		map.put("C", 103);
		System.out.println(map);
		
		map.putIfAbsent("D", 107);
		System.out.println(map);
		
		map.remove("colorcode");
	    System.out.println(map);
	    
	    map.replace("B", 235);
	    System.out.println(map);
	}

}
