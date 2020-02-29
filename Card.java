package com.edx;

public class Card implements Comparable<Card>{
    private String name;
    private String nationality;
    private int yearBorn;
    private int yearDied;

    public Card(String nam, String nat, int born, int died){
        name = nam;
        nationality = nat;
        yearBorn = born;
        yearDied = died;
    }

    public int compareTo(Card card){
        return name.compareTo(card.name);
    }

    public String toString(){
        if(yearDied == -1){
            return String.format("%s (%d-present) - %s", name, yearBorn, nationality);
        } else {
            return String.format("%s (%d-%d) - %s", name, yearBorn, yearDied, nationality);
        }
    }

//    public static void main(String[] args) {
//	// write your code here
//        Card alan("Turing", "British", 1910, 1953);
//        Card lovelace("Ada Lovelace", "American", 1880, 1960);
//        int comp = alan.compareTo(lovelace);
//    }
}