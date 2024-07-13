package com.eb;

import java.io.*; 

public class OneNumber 
{
	static int Single(int A[], int ar_size) 
	{ 
		for (int i = 0; i < ar_size; i++) { 

		int count = 0; 

		for (int j = 0; j < ar_size; j++) { 
 
			if (A[i] == A[j]) { 
			count++; 
			} 
		} 
		if (count == 1) { 
			return A[i]; 
		} 
		}  
		return -1; 
	} 

	public static void main (String[] args) { 
		int ar[] = { 2, 3, 5, 4, 5, 3, 4 }; 
		int n = ar.length; 

		System.out.println("Element occurring once is " + Single(ar, n)); 
	} 
} 


