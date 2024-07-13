package JunitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SquareTest
{
	public int sqrt(int s)
	{
		return s*s;
	}
	@Test
public void testSquare()
{
	assertEquals(4, sqrt(2));
}

}