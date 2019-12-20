package com.edx;

public class ParkingSpace {
    int spaceNum;
    char floor;
    boolean isCompact;
    boolean isOccupied;

    ParkingSpace(int space, char flo, boolean isC){
        spaceNum = space;
        floor = flo;
        isCompact = isC;
        isOccupied = false;
    }

    public int getSpaceNum(){
        return spaceNum;
    }

    public char getFloor(){
        return floor;
    }

    public boolean getCompact(){
        return isCompact;
    }

    public boolean getOccupied(){
        return isOccupied;
    }

    public void setOccupied(boolean occupied){
        isOccupied = occupied;
    }

    public String toString(){
        String s = Character.toString(floor) + spaceNum + " (";
        if (isCompact){
            s = s + "C ";
        } else {
            s = s + "N ";
        }
        if (isOccupied){
            s = s + "X";
        } else {
            s = s + "O";
        }
        s = s + ")";
        return s;
    }

    public static void main(String[] args){
    }
}