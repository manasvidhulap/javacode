package com.maven.junitproject;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CheckString 
{
		String obj1="sneha";
	    String obj2="sneha";
	    int a[]= {1,2,3};
	    int b[]= {1,2,4};
	    String s=null;
	    String s1="EduBridge";
	    @Test
	    public void chkStrin() 
	    {
	        //assertEquals(obj1,obj2);
	        //assertSame(obj2, obj1);
	        //assertArrayEquals(a, b);
	        //assertNull(s);
	        assertNotNull(s1);
	}
}

