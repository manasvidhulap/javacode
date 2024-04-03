import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestJunitDemo3 
{
	@Test
	public void reject()
	{
		System.out.println("This Is reject Method");
	}
	@Before
	public void accept()
	{
	// assertTrue mhnje bracket madhe takleli condition true ch havi
		assertTrue(23>7);
		System.out.println("The Condition is True");
	}
}
