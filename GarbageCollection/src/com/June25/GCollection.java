package com.June25;

public class GCollection {
	public void finalize() {
		System.out.println("Garbage Collection performed by JVM");
	}

	public static void main(String args[]) {
		GCollection s1 = new GCollection();
		GCollection s2 = new GCollection();
        s1 = null;
        s2 = null;
		System.gc();
	}
}
