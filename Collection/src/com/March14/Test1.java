package com.March14;

import java.util.LinkedList;

public class Test1 
{
	public static void main(String[] args) 
	{
		LinkedList<String>l1=new LinkedList<String>();
		l1.add("sneha");
		l1.add("chakuli");
		l1.add("mona");
		l1.add("akka");
		System.out.println(l1);
		
		LinkedList<String>l2=new LinkedList<String>();
		l2.add("sneha");
		l2.add("chakuli");
		l2.add("mona");
		l2.add("akka");
		l2.addAll(l2);
		System.out.println(l1);
		
		l1.addFirst("sumit");
		System.out.println(l1);
		
		l1.addLast("sagar");
		System.out.println(l1);
		
	}

}
