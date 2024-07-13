package com.eb;
class Subject
{
    // instanceVariavle
    int English;
    int Maths;
    int Gk;
    float total;
    float avg;
    String gd;
    public void dispaly()
    {
        //local Variable
        int avg=60;
        System.out.println(avg);
        
    }
    //System.out.println(avg);Local variable only accesible inside the block itself
}
public class LocalDeclar {

	public static void main(String[] args) {
		 //Mark of Student 1
        Subject s1=new Subject();
        s1.English=80;
        s1.Maths=70;
        s1.Gk=90;
        
        //display the details of Student1
        System.out.println("Student1"+"  "+" English:"+s1.English+"  "+"GK:"+s1.Gk+"Maths:"+s1.Maths);
//Mark of Student2
        Subject s2=new Subject();
        s2.English=80;
        s2.Maths=70;
        s2.Gk=90;
    }
}
