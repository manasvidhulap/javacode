package com.eb;

import java.util.Scanner;

public class ConsEmployee {
	String name;
    int id;
    public ConsEmployee(String s1,int i1)
    {
        name=s1;
        id=i1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    ConsEmployee e=new ConsEmployee(sc.next(),sc.nextInt());
	    System.out.println(e.name);
	    System.out.println(e.id);

	}

}
