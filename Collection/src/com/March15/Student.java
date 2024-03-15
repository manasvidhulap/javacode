package com.March15;

public class Student 
{
	private double rating;
	private String name;
	private int age;
	public Student(double rating, String name, int age) {
		super();
		this.rating = rating;
		this.name = name;
		this.age = age;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	

}
