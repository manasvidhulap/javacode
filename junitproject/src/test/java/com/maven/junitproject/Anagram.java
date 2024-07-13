package com.maven.junitproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Anagram 
{
	public String anagramChecker(String s , String s2)
	{
		if(s.length()!=s2.length())
		{
			return "Not Anagaram";
		}
		char[]charArray1=s.toCharArray();
		char[]charArray2=s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2)? "Anagram":"Not Anagram";
	}
	@Test
	public void testAnagram()
	{
		String s="dog";
		String s2="god";
		assertEquals("Anagram", anagramChecker(s,s2));
	}
}
