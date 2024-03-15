package DataTypes;

import java.util.Scanner;

public class ScannerClause 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name:");
		String name= sc.nextLine();
		System.out.println("Enter product Quality:");
		int quality = sc.nextInt();
		System.out.println("Enter price:");
		int price = sc.nextInt();
		System.out.println("product name"+name+" \nQuality"+quality+"\n price"+price);
	}

}
