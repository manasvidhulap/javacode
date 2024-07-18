package July18Practice;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=scanner.nextInt();
        int num1=num;
        
        int count=0;
        while(num>0)
        {
            int lastd=num%10;
            num=num/10;
            count++;
            
        }
        System.out.println("Number of digits : "+count);
        num=num1;
        int sum=0;
        while(num>0)
        {
            //System.out.println(Math.pow(num, count));
            int lastd=num%10;
            sum=(int) (sum+Math.pow(lastd, count));
            
            num=num/10;
        }
        if(num1==sum)
        {
            System.out.println("Given number is armstrong number.");
        }
        else
        {
            System.out.println("Given number is not armstrong number.");
        }
    }
}
