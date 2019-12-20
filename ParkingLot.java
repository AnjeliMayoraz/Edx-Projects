package com.edx;

public class ParkingLot {
    ParkingSpace[] parkingLot;
    int numSpaces;
    int numFloors;

    ParkingLot(int spacePF, int numFlo){
        numSpaces = spacePF * numFlo;
        numFloors = numFlo;
        parkingLot = new ParkingSpace[numSpaces];
        for (int i = 0; i < numSpaces; i++){
            char fl = (char)((i / spacePF) + 65);
            int num = i % spacePF + 1;
            boolean isC = num <= 4;
            parkingLot[i] = new ParkingSpace(num, fl, isC);
        }
    }

    public ParkingSpace enterLot(boolean comp){
        for (int i = 0; i < numSpaces; i++){
            if (parkingLot[i].getOccupied() == false){
                if (comp || parkingLot[i].getCompact() == false){
                    parkingLot[i].setOccupied(true);
                    return parkingLot[i];
                }
            }
        }
        return null;
    }

    public void leaveLot(ParkingSpace ps){
        ps.setOccupied(false);
    }

    public static void main(String[] args){
    }
}