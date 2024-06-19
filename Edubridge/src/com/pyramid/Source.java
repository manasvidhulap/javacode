package com.pyramid;

import java.util.Scanner;

public class Source 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Source s = new Source();
		s.printPattern(a);
		s.printPattern(b);
		s.printPattern(c);
	}

	void printPattern(int n) 
	{
		int i, j;
		for (i = 1; i <= n; i++) 
		{
			for (j = 1; j <= n - i; j++) 
			{
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) 
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
