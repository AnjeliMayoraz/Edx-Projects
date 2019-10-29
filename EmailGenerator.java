package com.edx;
import java.util.Scanner;

public class EmailGenerator {
    public static String makeUserName(String firstName, String lastName){
        return Character.toString(firstName.toLowerCase().charAt(0)) + lastName.toLowerCase();
    }

    public static String makeEmail(String firstPart, String secondPart){
        return firstPart + "@" + secondPart;
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = myObj.next();

        System.out.println("Enter your last name");
        String lastName = myObj.next();

        System.out.println("Enter your company name");
        String company = myObj.next();

        String userName = EmailGenerator.makeUserName(firstName, lastName);
        String email = EmailGenerator.makeEmail(userName, company);

        System.out.println("Your email address is: " + email);
    }
}