package com.March18;
import java.util.function.BiConsumer;
public class BiConsumerD 
{

	public static void main(String[] args) 
	{
		BiConsumer<String,Integer>bc1=(a,b)->System.out.println(a+" "+b);
		bc1.accept("sneha", 120);
	}

}
