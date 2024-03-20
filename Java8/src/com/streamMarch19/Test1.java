package com.streamMarch19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1
{

	public static void main(String[] args) 
	{
		//map using for collecting all the data
		ArrayList<Integer>l1=new ArrayList<Integer>();
		List<Integer>l2=Arrays.asList(10,20,30,40,50);
		System.out.println(l2);
		List<Integer>l3=l2.stream().map(x->x*x*x).collect(Collectors.toList());
		System.out.println(l3);

	}

}
