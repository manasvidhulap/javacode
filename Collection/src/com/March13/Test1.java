package com.March13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args)
	{
	  List<Integer>l1= new ArrayList<Integer>();
	  
	  l1.add(10);
	  l1.add(80);
	  l1.add(40);
	  l1.add(90);
	  l1.add(20);
	  l1.add(60);
	  System.out.println(l1);
	  //get method used to display value from index number
	  System.out.println(l1.get(5));
	  //index method gives the index for particular value
	  System.out.println(l1.indexOf(40));
	  Collections.sort(l1);
	  System.out.println(l1);

	}

}
