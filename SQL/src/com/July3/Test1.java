package com.July3;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add(1); // Line 1
		Object object = list.get(list.size()); // Line 2
		System.out.println(object);

	}

}
