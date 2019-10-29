package com.edx;
import java.util.Scanner;

public class Associative {

    public int a;
    public int b;
    public int c;

    public Associative(int x, int y, int z){
        a = x;
        b = y;
        c = z;
    }

    public int firstTwo(){
        return (a + b) * c;
    }

    public int lastTwo(){
        return a + (b * c);
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first value");
        int vala = myObj.nextInt();

        System.out.println("Enter second value");
        int valb = myObj.nextInt();

        System.out.println("Enter third value");
        int valc = myObj.nextInt();

        Associative ass = new Associative(vala, valb, valc);
        System.out.println("Result of first calculation: " + ass.firstTwo());
        System.out.println("Result of second calculation: " + ass.lastTwo());
    }
}
