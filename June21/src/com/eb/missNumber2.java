package com.eb;

public class missNumber2 
{
	
	    public static void main(String[] args)
	    {
	        int a[]= {2,3,4,5,1,6,8,9,10};
	        int sum=0;
	        int totalnum=a.length+1;
	        int totalsum=totalnum*(totalnum+1)/2;
	        System.out.println(totalsum);
	        
	        for(int i=0;i<a.length;i++)
	        {
	            sum=sum+a[i];
	            
	        }
	        System.out.println("Missing number is : "+(totalsum-sum));
	    }
	
}
