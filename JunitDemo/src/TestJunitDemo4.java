import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Test;

public class TestJunitDemo4 
{
	@Test
	public void reject()
	{
		System.out.println("This Is reject Method");
	}
	@After
	public void accept1()
	{
		assertFalse(75<9);
		System.out.println("The Condition is False");
	}
}
