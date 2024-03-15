package ArrayConcept;

import java.util.Scanner;

public class SumOfArrayScanner {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int arr[]=new int[size];
		for(int i = 0; i<size; i++)
		{
			System.out.println("Enter elemts"+(i+1)+" :");
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i<arr.length ; i++)
		{
			sum+=arr[i];
		}
		System.out.println("The total size of array elements:"+sum);
	}

}
