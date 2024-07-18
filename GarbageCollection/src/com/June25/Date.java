package com.June25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Date 
{
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
	    
	    System.out.println("Current Date="+today);
	    
	    LocalDate firstDay_2023 = LocalDate.of(2022, 12, 1);
	    System.out.println("Specific Date="+firstDay_2023);
	    
	    LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
	    System.out.println("Current Date in IST="+todayKolkata);
	    
//	    //Time
	    LocalTime time = LocalTime.now();
	    System.out.println("Current Time="+time);
	    
	    LocalTime specificTime = LocalTime.of(12,20,25,40);
	    System.out.println("Specific Time of Day="+specificTime);
	    
	    LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
	    System.out.println("Current Time in IST="+timeKolkata);
	//
//	    //DateTime
	    LocalDateTime today1 = LocalDateTime.now();
	    System.out.println("Current DateTime="+today1);

	    
	    LocalDateTime specificDate = LocalDateTime.of(2023, Month.JANUARY, 1, 10, 10, 30);
	    System.out.println("Specific Date="+specificDate);
	    
	}

}
