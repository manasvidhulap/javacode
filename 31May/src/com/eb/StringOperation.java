package com.eb;

import java.util.Arrays;

public class StringOperation 
{

	public static void main(String[] args) 
	{
		String str = "Black Bunny Balck Bunny";
	    String str1 = "black Bunny Balck Bunny";
		String str2 = "   Pink   ";
		
		String stn=new String("welcome");
		System.out.println("Length : "+stn.length());
		System.out.println("UpperCase :" + str.toUpperCase());
		System.out.println("LowerCase :" + str.toLowerCase());
	    System.out.println("Is both strings are equal: " + str.equals(str1));
		System.out.println("Is both strings are equal: " + str.equalsIgnoreCase(str1));
		System.out.println("Concate string: " + str.concat(" Cloud"));
	
		System.out.println("Index of c: " + str.indexOf("Bunny"));
		System.out.println("Index of Bunny: " + str.lastIndexOf("Bunny"));
		System.out.println("replace string: " + str.replace("Black", "Pink"));
	    System.out.println("contains of Z: " + str.contains("z"));
	    System.out.println("contains of B: " + str.contains("B"));
		System.out.println("Substring: " + str.substring(6, 11));
		System.out.println("length of str :" + str2.length());
		System.out.println("trim :" + str2.trim());
		System.out.println("length of str after trim :" +str2.trim().length());
		String str4 = "How , are , you?";
		String arrStr[] = str4.split(",", 3);
		System.out.println("Splited Elements:");
		
		for (int i = 0; i < arrStr.length; i++) 
		{
			System.out.println(arrStr[i] + " ");
		}
		
		System.out.println();
		System.out.println("Splited Elements using for each loop:");
		for (String str5 : arrStr) 
		{
			System.out.print(str5 + " ");
		}
		
		String str6 = "";
		System.out.println("Length:" + str6.length());
		System.out.println("is String is empty: " + str6.isEmpty());
		System.out.println("is String is blank: " + str6.isBlank());
		String str7 = "   ";
		System.out.println("Str 7 Length:" + str7.length());
		System.out.println("is String is empty: " + str7.isEmpty());
		System.out.println("is String is blank: " + str7.isBlank());
		System.out.println("java".compareToIgnoreCase("PYTHON"));
		System.out.println("a".compareTo("A"));
		System.out.println("Cooking".endsWith("king"));
		System.out.println("Cooking".startsWith("Co"));
		System.out.println("repeat: " + str2.repeat(2));
		String s1 = "JAVA Program";
		char str3[] = new char[12];
		s1.getChars(0, 11, str3, 0);
		System.out.println("**getChars method: " + Arrays.toString(str3));
		System.out.println(s1.toCharArray());

	}

}
