package com.eb;

public class Typecast {

	public static void main(String[] args) {
		byte b=10;//1 byte
        Short s=100;//2 byte
        int i=b;//4 byte
        int ii=s;
        int j=200;
        long l=j;//8 byte
        short s1=b;//i convert byte into short datatype
        System.out.println(s1);
        //smaller-->bigger---->Implicit(done automatically)-->Widening
        System.out.println(i);
        //bigger-->smaller-->Explicit( U have to do--->Narrowing
        int ii1=126;
        byte b1=(byte) ii1;
        System.out.println("b1:"+b1);
        //byte b1=(byte) ii1;
        short ss=(short) ii1;
        byte bb1=(byte) l;
        float f=ii1;
    }

}
