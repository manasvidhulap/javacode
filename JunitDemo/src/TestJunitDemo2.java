
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class TestJunitDemo2 
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
	@Test
	public void accept3()
	{
		//if value is null then test case will passed
		String b=null;
		assertNull(b);
		System.out.println("value for b:"+b);
	}
}
