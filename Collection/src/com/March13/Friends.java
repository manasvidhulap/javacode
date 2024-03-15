package com.March13;

public class Friends 
{
	private String age;
	private String name;
	@Override
	public String toString() {
		return "Friends [age=" + age + ", name=" + name + "]";
	}

	public Friends(String age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

