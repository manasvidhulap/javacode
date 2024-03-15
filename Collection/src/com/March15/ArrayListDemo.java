package com.March15;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList<String>color=new ArrayList<String>();
		color.add("red");
		color.add("black");
		color.add("pink");
		color.add("yellow");
		color.add("brown");
		color.add("purple");
		System.out.println(color);
		
		for(String i:color)
		{
			System.out.println(i);
		}
	}

}
