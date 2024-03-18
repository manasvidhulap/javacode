package com.March18;
interface Calculation
{
	public void FindSquare(int no);
}
public class Test1 
{
	public static void main(String[] args) 
	{
		Calculation c1 = (int no)-> System.out.println(no*no);
		c1.FindSquare(50);
	}

}
