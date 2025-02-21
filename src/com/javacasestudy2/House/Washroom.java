package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.WashroomDevices;
import com.javacasestudy2.Device.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Washroom extends Rooms {
    Scanner sc = new Scanner(System.in);
    ArrayList<Device> washRoomDevices = new ArrayList<Device>();

    //Default Constructor
    public Washroom() {
    }

    //Parametrise Constructor
    public Washroom(String roomName, int noOfDevices) {
        super(roomName, noOfDevices);
    }

    public boolean addDevice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Devise you would like to install");
        System.out.println("+----------------------------------------------+");
        System.out.println("1. AirConditioner   press-1");
        System.out.println("2. Fan              press-2");
        System.out.println("3. Light            press-3");
        System.out.println("4. Television       press-4");
        System.out.println("5. Geyser           press-5");
        System.out.println("6. ExhaustFan       press-6");
        System.out.println("+----------------------------------------------+");
        System.out.println("Enter your preferred choice");
        int choice = sc.nextInt();
        Random rand = new Random();

        switch (choice) {
            case 1:
                System.out.println("You cant add AirConditioner to the Washroom");
                return false;
            case 2:
                System.out.println("You cant add Fan to the Washroom");
                return false;
            case 3:
                washRoomDevices.add(new Light(rand.nextInt(1000), "Light", false));
                return true;
            case 4:
                System.out.println("You cant add Television to the Washroom");
                return false;
            case 5:
                washRoomDevices.add(new Geyser(rand.nextInt(1000), "Geyser", false));
                return true;
            case 6:
                washRoomDevices.add(new ExhaustFan(rand.nextInt(1000), "ExhaustFan", false));
                return true;
            default:
                return false;
        }
    }

    public void display() {
        System.out.println("Number of devices available in Washroom");
        System.out.println("+--------------------------------------------+");
        for (int i = 0; i < washRoomDevices.size(); i++) {
            System.out.println("[" + (i + 1) + ". Device ID - " + washRoomDevices.get(i).getProductId() + ", Device Name - " + washRoomDevices.get(i).getDeviceName() + "]");
        }
        System.out.println("+--------------------------------------------+");
    }

    @Override
    public boolean removeDevice() {
        if (washRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter the Devise you would like to Uninstall");
            System.out.println("+------------------------------------------+");
            for (int i = 0; i < washRoomDevices.size(); i++) {
                System.out.println(washRoomDevices.get(i).getDeviceName() + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            washRoomDevices.remove(choice - 1);
            return true;
        }
        return false;
    }

    @Override
    public void checkStatusofDevice() {

    }

    @Override
    public void deviceOn() {

    }
}
