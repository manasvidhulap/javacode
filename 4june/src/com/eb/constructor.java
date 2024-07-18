package com.eb;

import java.util.Scanner;

public class constructor {
	String name;
	int id;

	public constructor(String s1, int i1) {
		name = s1;
		id = i1;
	}

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			constructor e = new constructor(sc.next(), sc.nextInt());
			System.out.println(e.name);
			System.out.println(e.id);
		}
	}
}
