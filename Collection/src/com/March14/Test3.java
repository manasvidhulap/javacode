package com.March14;

import java.util.LinkedList;

public class Test3 
{
	public static void main(String[] args) 
	{
		LinkedList<String>l1=new LinkedList<String>();
		l1.add("mango");
		l1.add("chiku");
		l1.add("orange");
		l1.add("cherry");
		System.out.println(l1);
		
		l1.remove();
//		bydefalut is works for rwmove the first index 
		System.out.println(l1);
		
		l1.removeLast();
		System.out.println(l1);
		
		l1.add("pineapple");
		l1.add("watermelon");
		l1.add("melon");
		System.out.println(l1);
		
		l1.removeFirstOccurrence(1);
		System.out.println(l1);
	}

}


