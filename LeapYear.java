package com.edx;
import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year){
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = myObj.nextInt();
        LeapYear.isLeapYear(year);
        if (LeapYear.isLeapYear(year)){
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
}
