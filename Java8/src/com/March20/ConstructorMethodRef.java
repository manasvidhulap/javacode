package com.March20;

import java.util.function.Function;

interface info
{
	CourseInfo get(String info);
}
class CourseInfo
{
	CourseInfo(String info)
	{
		System.out.println(info);
	}
}
class Company
{
	Company(String name)
	{
		System.out.println("Company name:"+name);
	}
}
public class ConstructorMethodRef {

	public static void main(String[] args)
	{
		info f=CourseInfo::new;
		f.get("Java Full stack Devdeloper");
		Function<String,Company>bb=Company::new;
		bb.apply("CAPGEMINI");
	}

}
