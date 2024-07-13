package com.June21;

interface NoParameterSingleLine1
{
	String display();
}

@FunctionalInterface
interface NoParameterSingleLine2
{
	int display();
}

@FunctionalInterface
interface NoParameterMultiLine
{
	String displayName();
}

@FunctionalInterface
interface TwoParameterSingleLine
{
	int add(int a , int b);
}

@FunctionalInterface
interface TwoParameterMultiLine
{
	int add(int a , int b , int c);
}


public class LambdaWithZeroPara
{

	public static void main(String[] args)
	{
		NoParameterSingleLine1 np=()->"welcome to Lambda Class";
		System.out.println("NoParameterSingleLine1:"+np.display());

		NoParameterSingleLine2 np1=()->1;
		System.out.println("NoParameterSingleLine2:"+np1.display());

		NoParameterMultiLine np3=()->
		{
			String name ="sneha";
			return name;
		};
		System.out.println("NoParameterMultiLine:"+np3.displayName());
		
		
		TwoParameterSingleLine tp=(a,b)-> a+b;
		System.out.println("Two Parameter With Single Line:"+tp.add(36, 78));
	
		TwoParameterMultiLine tpm=(a,b,c)->
		{
			int mul=a*b;
			return mul*c;
		};
		System.out.println("Two Parameter with Multi Line:"+tpm.add(2, 2, 3));
	}
		
	
}

	


