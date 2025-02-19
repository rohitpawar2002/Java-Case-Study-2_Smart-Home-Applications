package com.javacasestudy2.House;

import java.util.ArrayList;

public class House {
    String houseName;

    ArrayList<Rooms> rooms;

    public House(String houseName) {
        this.houseName = houseName;

        rooms = new ArrayList<Rooms>(10);

        rooms.add(0, new Bedroom("Bedroom", 0));
        rooms.add(1, new Kitchen("Kitchen", 0));
        rooms.add(2, new Livingroom("Living room", 0));
        rooms.add(3, new Washroom("Wash room", 0));
        rooms.add(4, new Storeroom("Store room", 0));
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
}
