package com.streamMarch19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) 
	{
		// filter work based on condition
		ArrayList<Integer>l1=new ArrayList<Integer>();
		List<Integer>l2=Arrays.asList(1,3,5,7,4,6,9,10);
		System.out.println(l2);
		List<Integer>l3=l2.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(l3);
	}

}
