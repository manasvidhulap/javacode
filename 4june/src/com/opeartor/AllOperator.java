package com.opeartor;

public class AllOperator {

	public static void main(String[] args)
	{
		
		//arithmetic operator 
		
		System.out.println("The Arithmetic  opeartor result is below");
		int one=100;
		int two =50;
	
		int add, sub,mul , div, mod ;
		
		add=one+two;
		sub=one-two;
		mul=one*two;
		div=one/two;
		mod=one%two;
		
		System.out.println("Addition:"+add);
		System.out.println("Substraction:"+sub);
		System.out.println("Multiplication:"+mul);
		System.out.println("Division:"+div);
		System.out.println("Module:"+mod);
		
		System.out.println("End of the Arithmetic Operator\n");
		
		
		//relational operaator
		
		System.out.println("The relational  opeartor result is below");

		
		boolean result;
		
		result=(one==two);
		System.out.println("Equal to:"+result);
		
		result=(one!=two);
		System.out.println("Not Equal to:"+result);
		
		result=(one>two);
		System.out.println("Greater than :"+result);
		
		result=(one<two);
		System.out.println("Less than:"+result);
		
		result=(one>=two);
		System.out.println("Greater than Equal to:"+result);
		
		result=(one<=two);
		System.out.println("Less than Equal to:"+result);
		System.out.println("End of the relational Operator\n");

		
		//Logical opeartor
		
		System.out.println("The Logical  opeartor result is below");

		
		double percent = 80.00;
		double science= 60.00;
		
		boolean admission = (percent >= 70.00)|| (science >= 70.00);
		System.out.println("Admitted:"+admission);
		
	    admission=(percent >= 70.00)&& (science >= 70.00);
		System.out.println("Admitted:"+admission);
		
		boolean demo=true;
		System.out.println("Negation:"+!demo);

		System.out.println("End of the logical Operator\n");
		
		
		//Assignment Operator
		
		System.out.println("The Assignment  opeartor result is below");

		
		char demo2 = '@';
		System.out.println("Character:"+demo2);

		System.out.println("End of the Assignment Operator\n");

		
		//ternery operator
		
		System.out.println("The ternery  operator result is below");

		
		double salary=60000.00;
		double increment=5000.00;
		double decrement=3000.00;
		
		double result1=(salary>=45000.00)? decrement: increment;
		System.out.println("Salary decrement by:"+result1);
		System.out.println("End of the ternery Operator\n");
		
		
		//increment and decrement operator
		
		
		System.out.println("The Increment and Dercdement opeartor result is below");

		int counter1=10;
		int counter=10;
		
		System.out.println("counter:"+counter);  //10
		
		System.out.println("Increment:"+(++counter)); //11
		System.out.println("Decrement:"+(--counter));  //10
		
		counter1++;
		counter1++;
		
		System.out.println("counter:"+counter1);

		System.out.println("End of Increment and Dercdement Operator\n");
		
		
		
		// shift operator 
		int a=8;
		//left shift
		int x=a<<2;
		int y=a<<3;
		
		System.out.println(x);
		System.out.println(y);
		
		//right shift
		int s=a>>3;
		int s1=a>>2;
		
		System.out.println(s);
		System.out.println(s1);
	}

}




















