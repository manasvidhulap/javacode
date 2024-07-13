package com.July3;

import java.util.Arrays;
import java.util.List;

public class Test2 
{

	public static void main(String[] args) 
	{
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
		listOfNumbers
		.stream().
		forEach
		(number -> System.out.println(number + " " + Thread.currentThread().getName()));
	}	


}


