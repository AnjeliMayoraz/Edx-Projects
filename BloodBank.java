package com.edx;
import java.util.Random;

public class BloodBank {
    double [][] donations;

    public BloodBank() {
        Random r = new Random();
        int n = r.nextInt(49)+1;
        donations = new double[n][];
        for (int s = 0; s < n; s++) {
            donations[s] = new double[r.nextInt(5)+1];
        }
        for (int i = 0; i < donations.length; i++) {
            for (int j = 0; j < donations[i].length; j++) {
                donations[i][j] = (int)(r.nextDouble() * 2000)/10.0;
            }
        }
    }

    public int findTopDonor(){
        double max_count = 0;
        int location_max_count = 0;
        int global_location_index = 0;
        for (int state = 0; state < donations.length; state++){
            double count = 0;
            for (int location = 0; location < donations[state].length; location++){
                count = donations[state][location];
                if (count > max_count){
                    max_count = count;
                    location_max_count = global_location_index;
                }
                global_location_index++;
            }
        }
        return location_max_count;
    }

    public int findTopState(){
        double max_count = 0;
        int state_max_count = 0;
        for (int state = 0; state < donations.length; state++){
            double count = 0;
            for (int location = 0; location < donations[state].length; location++){
                count += donations[state][location];
            }
            if (count > max_count){
                max_count = count;
                state_max_count = state;
            }
        }
        return state_max_count;
    }
    public void makeDonation(double amt, int state, int location){
        donations[state][location] += amt;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < donations.length; i++) {
            for (int j = 0; j < donations[i].length; j++) {
                s = s + donations[i][j] + "\t";
            }
            s = s + "\n";
        }
        return s;
    }

    public static void main(String[] args){
        BloodBank bd = new BloodBank();
        System.out.println(bd);
        int topDonor = bd.findTopDonor();
        System.out.println("The top donor is " + topDonor);
        System.out.println("The top state is " + bd.findTopState());
    }
}