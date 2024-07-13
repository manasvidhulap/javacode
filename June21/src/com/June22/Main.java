package com.June22;
@FunctionalInterface
interface Validate 
{
    boolean isValid(String firstName, String lastName);
}
public class Main 
{
	boolean Validate(String username, String password) 
	{
        Validate v=(s1,s2)->
        {
            return (s1.equals("pkm")&&s2.equals("mkk"))?true:false;
        };
        return v.isValid(username,password);
	}
	public static void main(String[] args)
	{
	    Main m = new Main();
	    String firstName = "pkm";
	    String lastName = "mkk";
	    boolean result = m.Validate(firstName, lastName);
	    System.out.println( result);
	}

}
