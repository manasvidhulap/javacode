package com.maven.junitproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ReverseNumberTest
{
	@Test
	public void reverseset()
	{
		ReverseNumber r = new ReverseNumber();
		assertEquals(54321, r.ReverseNumber(12345));
	}
}
