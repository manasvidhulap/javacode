package com.March15;

import java.util.HashSet;

public class HashEx 
{

	public static void main(String[] args)
	{
		HashSet<Integer> even = new HashSet<>();
		even.add(null);
		even.add(2);
		even.add(4);
		even.add(2);
		even.add(12);
		even.add(8);
		even.add(6);
		even.add(10);
		even.add(null);
		System.out.println("HashSet1: " + even.hashCode());
		System.out.println("HashSet1: " + even);
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		System.out.println("HashSet2: " + numbers);
		
        // Union of two set
		
        numbers.addAll(even);
        System.out.println("Union is: " + numbers);
        numbers.retainAll(even);
        System.out.println("Intersection is: " + numbers);
		numbers.removeAll(even);
		System.out.println("Diffrence : " + numbers);

	}

}
