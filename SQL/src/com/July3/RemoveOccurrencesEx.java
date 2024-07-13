package com.July3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveOccurrencesEx 
{		public static void main(String[] args) throws IOException 
		{
//			String str="javajava";
//			char characterToRemove='a';
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			char characterToRemove=br.readLine().charAt(0);
			String result=removeOccurrences(str,characterToRemove);
			System.out.println("Modified String:"+result);
		}
		public static String removeOccurrences(String str, char characterToRemove)
		{
			for (int i=0;i<str.length();i++)
			{
				 if(str.charAt(i)==characterToRemove)
				 {
				 str=str.substring(0,i)+str.substring(i+1);
				 break;
				 }
	        }
			for (int i=str.length()-1;i>=0;i--)
			{
				 if(str.charAt(i)==characterToRemove)
				 {
				 str=str.substring(0,i)+str.substring(i+1);
				 break;
				 }
		    }
			return str;
		}
}


