package com.inheritence;
class Shape{
    void display(){
        System.out.println("Inside display");
    }
}
class Rectangle extends Shape{
    public void area() {
        System.out.println("Inside of area");
    }
}
class triangle extends Rectangle{
    public void volume() {
        System.out.println("Inside of Triangle");
    }
}
public class MultiLevelInheritanceEx {

	public static void main(String[] args) {
		  triangle tri=new triangle();
	        tri.area();
	        tri.display();
	        tri.volume();
	}

}
