package com.July3;

public class  RemoveOccurrences {

	public static void main(String[] args) 
	{
		String str="javajava";
		char characterToRemove='a';
		
		String result=removeOccurrences(str,characterToRemove);
		
		System.out.println("Original String:"+str);
		System.out.println("Character to remove:"+characterToRemove);
		System.out.println("Modified String:"+result);
	}

	public static String removeOccurrences(String str, char characterToRemove) {
		int FirstIndex=str.indexOf(characterToRemove);
		int LastIndex=str.lastIndexOf(characterToRemove);
		
		if(FirstIndex == -1 || FirstIndex == LastIndex)
		{
			return str;
		}
		StringBuilder sb=new StringBuilder(str);
		sb.deleteCharAt(FirstIndex);
		sb.deleteCharAt(LastIndex -1);
		return sb.toString();
	}

}
