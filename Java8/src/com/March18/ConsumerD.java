package com.March18;
import java.util.function.Consumer;
public class ConsumerD{

	public static void main(String[] args) 
	{
		Consumer<String>c1=x->System.out.println(x);
		c1.accept("sneha Dhulap");
		c1.accept("hii");	
	}

}
