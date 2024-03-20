package com.streamMarch19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Product>a1=new ArrayList<Product>();
		
		Product p1=new Product(101,"TV",20000,3);
		Product p2=new Product(102,"WM",25000,1);
		Product p3=new Product(103,"Fridge",15000,2);
		Product p4=new Product(104,"AC",12000,5);
		Product p5=new Product(105,"PC",58000,4);
		
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		a1.add(p4);
		a1.add(p5);
		
		List<Product>l2=a1.stream().map(x->x).collect(Collectors.toList());
		System.out.println(l2);
		
		List<Product>l3=a1.stream().filter(x->x.getPprize()>19000).collect(Collectors.toList());
		System.out.println(l3);
	}
}
