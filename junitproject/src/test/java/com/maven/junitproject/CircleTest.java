package com.maven.junitproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class CircleTest 
{
	@BeforeAll
	  public static void setUpBeforeClass() throws Exception {
	       System.out.println("Before only once");
	   }
	   @AfterAll
	   public static void tearDownAfterClass() throws Exception {
	       System.out.println("after only once");
	   }
	   @BeforeEach
	   public void setUp() throws Exception {
	       System.out.println("Before every test case");
	   }
	   @AfterEach
	   public void tearDown() throws Exception {
	       System.out.println("after every test case");
	   }
	   @Test
	   @DisplayName("Test Get Area")
	  public void testGetArea() {
	       System.out.println("Area test");
	      Circle c1 = new Circle(1.2);
	      assertEquals(4.5239, c1.getArea(), 0.01);}
}
