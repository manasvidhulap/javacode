package com.March6;
class GrandFather{
	void show() {
		System.out.println("This is method of GrandFather");
	}
}
class Father extends GrandFather{
	void show() {
		super.show();
		System.out.println("This is method of father");
	}
	
}
class Mother extends Father{
	void show() {
		super.show();
		System.out.println("This is method of Mother");
	}
}
class MM1 extends Mother{
	void show() {
		super.show();
		System.out.println("This is method od MM1");
	}
}
public class hybridinheritance {

	public static void main(String[] args) 
	{
		MM1 Mother = new MM1();
		Mother.show();
		
	}

}
