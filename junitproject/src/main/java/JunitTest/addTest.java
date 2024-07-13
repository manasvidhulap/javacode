package JunitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class addTest 
{
	int add(int a , int b)
	{
		return a+b;
	}
	@Test
	public void test()
	{
		assertEquals(4, add(2,2));
	}

}
