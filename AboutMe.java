package com.edx;

public class AboutMe {
    public String myName() {
        return "Anjeli";
    }

    public int myAge(){
        return 15;
    }

    public String mySchool() {
        return "KLS";
    }

    public static void main(String[] args) {
        AboutMe a = new AboutMe();
        System.out.println("Hello my name is " + a.myName() + ", and I am " + a.myAge() + " years old. I attend "
                + a.mySchool() + ", and I am in high school.");
    }
}