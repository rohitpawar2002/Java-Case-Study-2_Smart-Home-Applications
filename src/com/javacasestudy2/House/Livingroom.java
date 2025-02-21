package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.LivingroomDevices;

import java.util.ArrayList;

public class Livingroom extends Rooms{

    ArrayList<LivingroomDevices> livingRoomDevices = new ArrayList<LivingroomDevices>(10);

    //Default Constructor
    public Livingroom() {
    }

    //Parametrise Constructor
    public Livingroom(String roomName, int noOfDevices) {
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
}
