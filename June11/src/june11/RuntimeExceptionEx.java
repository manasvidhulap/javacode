package june11;

public class RuntimeExceptionEx {

	public static void main(String[] args) 
	{
		  try {
		        int a=6;
		        int b=3;
		        int c=a/b;
		        System.out.println("C : "+c);
		        int arr[]= {1,2,3};
		        System.out.println("array :"+arr[1]);
		        String s="Edubridge";
		        System.out.println("Length of string :"+s.length());
		        String s1="abc";
		        int i=Integer.parseInt(s1);
		        System.out.println("i :"+i);
		        }
		        catch(ArithmeticException e) {
		            System.out.println(e.getMessage());
		            System.out.println(e);
		            System.out.println("Exception :"+e);
		        }
		        catch(ArrayIndexOutOfBoundsException e1) {
		            System.out.println("Exception :"+e1);
		        }
		        catch(NullPointerException e2) {
		            System.out.println("Exception :"+e2);
		        }
		        catch(NumberFormatException e3) {
		            System.out.println("Exception :"+e3);
		        }
		        finally {
		            System.out.println("Finally block");
		        }
		    }
}
