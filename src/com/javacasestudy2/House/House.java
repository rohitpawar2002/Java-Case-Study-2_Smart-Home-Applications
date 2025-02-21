package com.javacasestudy2.House;

import java.util.ArrayList;

public class House {
    String houseName;

    ArrayList<Rooms> rooms;

    public House(String houseName) {
        this.houseName = houseName;

        rooms = new ArrayList<Rooms>();

        rooms.add(0, new Bedroom("Bedroom", 1));
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

    public void addDevice(String RoomName)
    {
        boolean status = false;
        for(int i=0; i < rooms.size();i++)
        {
            if(RoomName.equals(rooms.get(i).roomName))
            {
                status = true;
                boolean result = rooms.get(i).addDevice();
                if(result)
                    System.out.println("Device added successfully");
                else
                    System.out.println("Device is unable to install, Please try again");
                break;
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void display(String RoomName)
    {
        for (int i=0;i < rooms.size();i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                rooms.get(i).display();
            }
        }
    }

    public void removeDevice(String RoomName)
    {
        boolean status = false;
        for(int i=0; i < rooms.size();i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                boolean result = rooms.get(i).removeDevice();
                if (result)
                    System.out.println("Device remove successfully");
                else
                    System.out.println("Device is unable to Uninstall, Please try again");
                break;
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void checkStatusofDevice(String RoomName)
    {
        boolean status = false;
        for(int i=0; i < rooms.size();i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                rooms.get(i).checkStatusofDevice();
            }
        }
    }
}
