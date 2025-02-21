package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.StoreroomDevices;

import java.util.ArrayList;

public class Storeroom extends Rooms{

    ArrayList<StoreroomDevices> storeroomDevices = new ArrayList<StoreroomDevices>(10);

    //Default Constructor
    public Storeroom() {
    }

    //Parametrise Constructor
    public Storeroom(String roomName, int noOfDevices) {
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
