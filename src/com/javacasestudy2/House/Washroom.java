package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.WashroomDevices;

import java.util.ArrayList;

public class Washroom extends Rooms{

    ArrayList<WashroomDevices> washRoomDevices = new ArrayList<WashroomDevices>(10);

    //Default Constructor
    public Washroom() {
    }

    //Parametrise Constructor
    public Washroom(String roomName, int noOfDevices) {
        super(roomName, noOfDevices);
    }

    public boolean addDevice(){
        return true;
    }

    public void display() {}

    @Override
    public boolean removeDevice() {
        return false;
    }

    @Override
    public void checkStatusofDevice() {

    }
}
