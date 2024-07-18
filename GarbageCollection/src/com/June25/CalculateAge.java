package com.June25;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter your birth date (yyyy-mm-dd format only) ");
	        String st = sc.nextLine();
	        
	        LocalDate Dob;
	        Dob = LocalDate.parse(st);    
	        
	        System.out.println("Age is :- "+calcAge(Dob));
	    }
	    
	    static int calcAge(LocalDate st)
	    {
	        LocalDate currentDate = LocalDate.now();
	        int age = Period.between(st,currentDate).getYears();
	        return age;
	    }
}
