import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJunitDemo1
{
	@Test
	public void disp()
	{
		String name="Sneha";
		assertEquals("Sneha",name);
		System.out.println("The Name is:"+name);
	}
	@Before
	public void add()
	{
		int a=10, b=20;
		System.out.println("The Addition is:"+(a+b));
	}
	@After
	public void div()
	{
		int a=10, b=20;
		System.out.println("The Division is:"+(a/b));
	}
	@Ignore
	public void sub()
	{
		int a=60, b=20;
		System.out.println("The Substraction is:"+(a-b));
	}
}

