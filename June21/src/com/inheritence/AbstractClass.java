package com.inheritence;

abstract class Fruit {
	abstract void display();// method signature-->method without body

	void type() {// nonabstract-->concreate method
		System.out.println("Fruit Type");
	}

	static void seasonalFruit() {
		System.out.println(" Sesonal Fruit");
	}
}

class Mango extends Fruit {
	@Override
	void display() {
		System.out.println("Mango");

	}
}

class Banana extends Fruit {
	@Override
	void display() {
		System.out.println("Banana");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
Mango m=new Mango();
		
		Fruit fref;//abstract class-->can not create object but u provide refernce
		fref=m;
		fref.display();//Mango display method is called
		
		Banana b=new Banana();
		fref=b;
		b.display();
		
		Mango m1=new Mango();
		m1.display();
		//		Fruit m=new Mango();//upcasting
//		m.display();
//		m.type();
//		Fruit.seasonalFruit();
//		Fruit b=new Banana();
//		b.display();
//		Mango m1=new Mango();
//		m1.display();
//		
////		Fruit f=new Fruit(); we can not create object of abstract class
	}
}
