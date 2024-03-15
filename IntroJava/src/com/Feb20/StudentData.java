package com.Feb20;

import java.util.Scanner;

public class StudentData 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Data:");
		int ch=0;
		do
		{
			System.out.println("1.Enter Student information :");
			System.out.println("2.Enter Student course Rating:");
			System.out.println("3.Enter Student Eligibility:");
			System.out.println("4.Exit:");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter Student Name:");
					String name= sc.next();
					System.out.println("Entr Student Age:");
					int age=sc.nextInt();
					System.out.println("Enter Student Address:");
					String add=sc.next();
					System.out.println("Name:"+name+"\n Age:"+age+"\n Address:"+add);
					break;
					
				case 2:
					System.out.println("Enter Student Course Rating:");
					int Rating=sc.nextInt();
					if(Rating>=10)
					{
						System.out.println("Good");
					}
					else
					{
						System.out.println("Need to Improve");
					}
				
					break;
					
					case 3:
						System.out.println("Enter Student Eligibility:");
						int Eligibility=sc.nextInt();
						if(Eligibility>=50)
						{
							System.out.println("Student is Eligibile for Enroll the Course");
						}
						else
						{
							System.out.println("Student is not Eligible for Enroll the Course");
						}
						break;
						
						case 4:
							System.out.println("Exit");
							break;
							default:
								System.out.println("Wrong Input");
					}
					}while(ch!=4);
	}
		
}

