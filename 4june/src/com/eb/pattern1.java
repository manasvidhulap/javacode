package com.eb;

public class pattern1 
{
	static void printPattern(int n) {
        int rowCount = 1;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");//space
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
