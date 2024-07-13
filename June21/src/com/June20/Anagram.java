package com.June20;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) {

        String s1 = "noim";
           String s2 = "moni";
//		String s1="sneha";
//		String s2="snehka";
           s1 = s1.toLowerCase();
           s2 = s2.toLowerCase();
           if(s1.length()==s2.length())
           {
              char arr1[]=s1.toCharArray();  
               char arr2[]=s2.toCharArray(); 
               Arrays.sort(arr1);
               Arrays.sort(arr2);
               boolean check=Arrays.equals(arr1,arr2);
               if(check)
               {
                    System.out.println("anagram");
               }
               else
               {
                    System.out.println("Not anagram");
                }    
            }
            else
            {
               System.out.println("not anagram");
               }
}
}
