package com.javacasestudy2.House;

import java.util.ArrayList;

public class House {
    String houseName;

    ArrayList<Rooms> rooms;

    public House(String houseName) {
        this.houseName = houseName;

        rooms = new ArrayList<Rooms>(10);
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
}
