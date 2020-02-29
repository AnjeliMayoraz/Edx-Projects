package com.edx;
import java.util.*;

public class CardCollection {
    private String owner;
    private ArrayList<Card> myCollection;

    public CardCollection(String own){
        owner = own;
        myCollection = new ArrayList<Card>();
    }

    public boolean addCard(Card card){
        if(myCollection.size() == 0){
            myCollection.add(card);
            return true;
        }

        for(int i = 0; i < myCollection.size(); i++){
            if(card.compareTo(myCollection.get(i)) == 0){
                return false;
            } else if(card.compareTo(myCollection.get(i)) == -1){
                myCollection.add(i, card);
                return true;
            }
        }

        myCollection.add(card);
        return true;
    }

    public void removeCard(int i){
        myCollection.remove(i);
    }

    public int getSize(){
        return myCollection.size();
    }

    public ArrayList<Card> mergeCollections(CardCollection c){
        ArrayList<Card> dup = new ArrayList<Card>();
        for(int i = 0; i < c.getSize(); i++){
            if(!addCard(c.myCollection.get(i))){
                dup.add(c.myCollection.get(i));
            }
        }
        c.myCollection.clear();
        return dup;
    }

    public String toString(){
        int len = owner.length();
        String res = owner + "\n";

        for(int i = 0; i < len; i++){
            res = res + "-";
        }

        res = res + "\n";

        for(int i = 0; i < myCollection.size(); i++){
            res = res + myCollection.get(i).toString() + "\n";
        }
        return res;
    }
}
