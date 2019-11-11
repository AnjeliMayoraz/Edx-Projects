package com.edx;
import java.util.Scanner;

public class Alphabet {
    public static String whatsMissing(String input){
        String missing = "";
        for(char i = 97; i <= 122; i++){
            boolean found = false;
            for(int j = 0; j < input.length(); j++){
                if(i == input.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(! found){
                missing = missing + i;
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string that you wish to test");
        String str = scan.nextLine();
        System.out.print("The missing letters are: ");
        System.out.println(Alphabet.whatsMissing(str));
    }
}
