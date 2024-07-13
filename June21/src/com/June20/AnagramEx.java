package com.June20;

import java.util.Arrays;

public class AnagramEx
{
	 public static void main(String[] args) {
	        String str1="dog";
	        String str2="god";
	        
	        str1=str1.toLowerCase();
	        str2=str2.toLowerCase();
	        if(str1.length() == str2.length())
	        {
	            char[] charArray1=str1.toCharArray();
	            char[] charArray2=str2.toCharArray();
	            Arrays.sort(charArray1);
	            Arrays.sort(charArray2);
	          Boolean result=Arrays.equals(charArray1,charArray2);
	          if(result) {
	              System.out.println("The given string is Anagram :" +str1+" And "+str2);
	          }
	          else
	          {
	              System.out.println("The given string is not an Anagram:" +str1+" And "+str2);
	          }
	        }
	    }
}
