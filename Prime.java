package com.edx;
import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for(int i = 2; i < java.lang.Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer of which you wish to test sire");
        int num = scan.nextInt();
        if (Prime.isPrime(num)){
            System.out.println(num + " 'Tis of the prime good sir");
        } else {
            System.out.println(num + " 'Tis not of the prime your grace");
        }
    }
}
