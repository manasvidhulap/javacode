package com.eb;

public class Explicit {

	public static void main(String[] args) 
	{
		for(int i=97;i<=101;i++) {//row
            for(int j=97;j<=i;j++) {//col
                char k=(char)j;//Typecasting-->Explicit 
                System.out.print(k+" ");
                //System.out.print(j+" ");
            }
            System.out.println();
            
        }	

	}

}
