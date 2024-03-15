package com.March13;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test2 {

	public static void main(String[] args) 
	{
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("Sneha");
		a1.add("chakuli");
		a1.add("mona");
		a1.add("akka");
		a1.add("golu");
		System.out.println(a1.indexOf("chakuli"));
		System.out.println(a1.lastIndexOf("golu"));
		
		java.util.Iterator<String> itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
