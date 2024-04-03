import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TestJunitDemo5 
{
	@Test
	public void reject()
	{
		System.out.println("This Is reject Method");
	}
	@Before
	public void accept2()
	{
		//if value is not mentiond test case will not passed
		String s="Sneha";
		assertNotNull(s);
		System.out.println("The Condition is Null");
	}
	@After
	public void accept1()
	{
		assertFalse(75<9);
		System.out.println("The Condition is False");
	}
	@AfterClass
	public static void cleanup()
	{
		System.out.println("After All CleanUp() method called...");
	}
}
