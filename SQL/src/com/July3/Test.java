package com.July3;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) 
	{
		boolean b = Stream.of("Alice", "Bob").anyMatch(s-> 
		{
			System.out.println(s);
			return s.startsWith("A");
			});
			if(b) {
			System.out.println("Alice");
			} else {
			System.out.println("Bob");
			}

	}

}
