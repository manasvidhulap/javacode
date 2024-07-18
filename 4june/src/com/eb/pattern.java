package com.eb;

public class pattern 
{
    void printT(int n) {
        for(int i=1;i<=n;i++) {//rows
            for(int j=1;j<=i;j++) {//col
                //System.out.print("* ");
                //System.out.print(i+" ");
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern p=new pattern();
        
        p.printT(2);
        System.out.println("**");
        p.printT(3);
        System.out.println("**");
        p.printT(4);
        
    }
}