package com.March21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapData 
{
	public static void main(String[] args) 
	{
		List<Integer>l2=Arrays.asList(3,7,2,9,4,6,2,9,7,5,10);
		System.out.println(l2);
		
		List<Integer>l3=l2.stream().map(x->x).limit(8).collect(Collectors.toList());
		System.out.println(l3);
		
		List<Integer>l4=l2.stream().map(x->x).distinct().collect(Collectors.toList());
		System.out.println(l4);
	}

}
