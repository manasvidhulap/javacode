package com.March14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test2Set 
{
	public static void main(String[] args) 
	{
		HashSet<String>h1=new HashSet<String>();//order not maintain
		h1.add("black");
		h1.add("red");
		h1.add("yellow");
		h1.add("blue");
		h1.add("orange");
		h1.add("pink");
		System.out.println(h1);
		
		LinkedHashSet<String>h2=new LinkedHashSet<String>();//ordered maintain
		h2.add("black");
		h2.add("red");
		h2.add("yellow");
		h2.add("blue");
		h2.add("orange");
		h2.add("pink");
		System.out.println(h2);
		
		TreeSet<String>h3=new TreeSet<String>();//it followed by alphabetical order
		h3.add("black");
		h3.add("red");
		h3.add("yellow");
		h3.add("blue");
		h3.add("orange");
		h3.add("pink");
		System.out.println(h3);
		
	}

}
