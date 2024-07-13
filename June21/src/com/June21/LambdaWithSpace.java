package com.June21;
@FunctionalInterface
interface StringSpace {
	String addspace(String s);
}

public class LambdaWithSpace {
	String insertSpace(String s)
	{
		StringSpace sp=(s1)->{
//	         return s1.join(" ",s.split(""));
	         return s1.replace("", " ").trim();
	         };
	        return sp.addspace(s);

	}

	public static void main(String[] args) {
		LambdaWithSpace lm = new LambdaWithSpace();
		System.out.println(lm.insertSpace("HelloWorld"));
	}
}
