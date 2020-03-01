package com.edx;

public class Room {
    private int roomNumber;
    private int daysRented;
    private String roomType;
    private String occupantName;

    public Room(int roomNum, String roomKind){
        roomNumber = roomNum;
        daysRented = 0;
        occupantName = null;
        if(roomKind.equals("single king") || roomKind.equals("double queen") || roomKind.equals("suite")){
            roomType = roomKind;
        } else {
            roomType = "double queen";
        }
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public int getDaysRented(){
        return daysRented;
    }

    public String getRoomType(){
        return roomType;
    }

    public String getOccupantName(){
        return occupantName;
    }

    public boolean setOccupant(String guestName, int numStay){
        if(daysRented == 0) {
            occupantName = guestName;
            daysRented = numStay;
            return true;
        }
        return false;
    }

    public void advanceDay(){
        if(daysRented <= 1){
            occupantName = null;
            daysRented = 0;
        } else {
            daysRented = daysRented - 1;
        }
    }

    public String toString(){
        if(occupantName == null){
            return "Room " + roomNumber + ": " + roomType + " - free";
        }
        return "Room " + roomNumber + ": " + roomType + " - rented";
    }
}