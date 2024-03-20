package com.streamMarch19;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilterDemo {

	public static void main(String[] args) 
	{
		List<String>l1=Arrays.asList("sneha","snehal","anjali","komal","sangita","shivani","aarti","kajal","karishma");
		List<String>l2=l1.stream().map(s->s).collect(Collectors.toList());
		System.out.println(l2);
		
		List<String>l3=l2.stream().filter(i->i.startsWith("s")).collect(Collectors.toList());
		System.out.println(l3);	
	}
}
