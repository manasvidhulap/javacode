package July18Practice;

public class ArmstrongNumber2 {
	 public static void main(String[] args) {
	        int num,num1,digit,sum=0,count=0;
	        
	        System.out.println("Armstrong number between 1 to 100");
	        
	        for(int i=1;i<=1000;i++) {  
	            count = 0;
	            sum=0;
	            num=i;
	            
	            //find the number of digits
	            //convert number to string
	            String s=String.valueOf(i);
	            count=s.length();
	                   while(num>0) {
	                digit = num%10; 
	                sum += Math.pow(digit, count); //1*1*1+5*5*5+3*3*3
	                num=num/10;
	            }
	            
	            if(i==sum) {
	                System.out.println(i);
	            }
	        }
	     }
}
