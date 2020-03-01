package com.edx;

public class Hotel {
    private String hotelName;
    private Room[] rooms;
    private int totalRooms;

    public Hotel(String hotelNam, int totRooms, int numFloors){
        totalRooms = totRooms;
        Room[] rooms = new Room[totalRooms];
        int roomsPerFloor = totRooms / numFloors;
        for(int i = 0; i < totalRooms; i++){
            int roomN = i % roomsPerFloor + 100 * ((i / roomsPerFloor) + 1);
            String roomT;
            if(i % roomsPerFloor == roomsPerFloor - 1) {
                roomT = "suite";
            } else if(i % roomsPerFloor >= roomsPerFloor - 5){
                roomT = "single king";
            } else {
                roomT = "double queen";
            }
            rooms[i] = new Room(roomN, roomT);
        }
    }

    public int getTotalRooms(){
        return totalRooms;
    }

    public int getNumberOccupied(){
        int count = 0;
        for(int i = 0; i < totalRooms; i++){
            if(rooms[i].getOccupantName() != null){
                count++;
            }
        }
        return count;
    }

    public double getOccupancyRate(){
        return (double)(getNumberOccupied()) / getTotalRooms();
    }

    public boolean rentRoom(String roomType, String occupantName, int numDays){
        for(int i = 0; i < totalRooms; i++){
            if(rooms[i].getRoomType().equals(roomType) && rooms[i].getOccupantName() == null){
                rooms[i].setOccupant(occupantName, numDays);
                return true;
            }
        }
        return false;
    }

    public void advanceDay(){
        for(int i = 0; i < totalRooms; i++){
            rooms[i].advanceDay();
        }
    }

    public String toString(){
        return hotelName + ": " + Double.toString(getOccupancyRate()) * 100) + "% occupied";
    }
}