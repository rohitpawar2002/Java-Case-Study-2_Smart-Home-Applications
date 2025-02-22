package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.BedroomDevices;
import com.javacasestudy2.Device.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bedroom extends Rooms {
    Scanner sc = new Scanner(System.in);
    ArrayList<Device> bedRoomDevices = new ArrayList<Device>();

    //Default Constructor
    public Bedroom() {
    }

    //Parametrise Constructor
    public Bedroom(String roomName, int noOfDevices) {

        super(roomName, noOfDevices);
        Random rand = new Random();
        bedRoomDevices.add(new Light(rand.nextInt(1000), "Light", false));
    }

    @Override
    public boolean addDevice() {
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
                bedRoomDevices.add(new AirConditioner(rand.nextInt(1000), "AirConditioner", false));
                return true;
            case 2:
                bedRoomDevices.add(new Fan(rand.nextInt(1000), "Fan", false));
                return true;
            case 3:
                bedRoomDevices.add(new Light(rand.nextInt(1000), "Light", false));
                return true;
            case 4:
                bedRoomDevices.add(new Television(rand.nextInt(1000), "Television", false));
                return true;
            case 5:
                System.out.println("You cannot add geyser in the Bedroom");
                return false;
            case 6:
                System.out.println("You cannot add ExhaustFan in the Bedroom");
            default:
                return false;
        }
    }

    @Override
    public void display() {
        System.out.println("Number of devices available in Bedroom");
        System.out.println("+--------------------------------------------+");
        for (int i = 0; i < bedRoomDevices.size(); i++) {
            System.out.println("["+(i+1) + ". Device ID - " + bedRoomDevices.get(i).getProductId() + ", Device Name - "+bedRoomDevices.get(i).getDeviceName()+"]");
        }
        System.out.println("+--------------------------------------------+");
    }

    @Override
    public boolean removeDevice() {
        if(bedRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter the Devise you would like to Uninstall");
            System.out.println("+------------------------------------------+");
            for (int i = 0; i < bedRoomDevices.size(); i++) {
                System.out.println(bedRoomDevices.get(i).getDeviceName() + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            bedRoomDevices.remove(choice - 1);
            return true;
        }
        return false;
    }

    @Override
    public void checkStatusofDevice() {
        if(bedRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("+-----------------------------------------+");
            System.out.println("1. Check single device status    press-1");
            System.out.println("2. Check all device status       press-2");
            System.out.println("+-----------------------------------------+");
            System.out.println("Enter your choice");
            int option = sc.nextInt();

            if (option == 1) {
                System.out.println("Enter the Devise you would like to check status of it");
                System.out.println("+------------------------------------------+");
                for (int i = 0; i < bedRoomDevices.size(); i++) {
                    System.out.println(bedRoomDevices.get(i).getDeviceName() + "      press-" + (i + 1));
                }
                System.out.println("+------------------------------------------+");
                System.out.println("Enter your preferred choice");
                int choice = sc.nextInt();

                System.out.println("[Device Name- " + bedRoomDevices.get(choice - 1).getDeviceName() + "       " + "Status - " + (bedRoomDevices.get(choice - 1).isStatus() ? "On" : "Off") + "]");
            } else if (option == 2) {
                for (int i = 0; i < bedRoomDevices.size(); i++) {
                    System.out.println("["+(i+1)+". Device Name- " + bedRoomDevices.get(i).getDeviceName() + "       " + "Status - " + (bedRoomDevices.get(i).isStatus() ? "On" : "Off") + "]");
                }
            }
            else
                System.out.println("Invalid choice , Please enter correct choice");
        }
    }

    public boolean deviceOn()
    {
        if(bedRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter which device you want to control");
            System.out.println("+-----------------------------------------------------------+");
            for (int i = 0; i < bedRoomDevices.size(); i++) {
                System.out.println("Device Name - "+bedRoomDevices.get(i).getDeviceName()+"      [Status - "+ (bedRoomDevices.get(i).isStatus() ? "On" : "Off")+"]" + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            if(bedRoomDevices.get(choice-1).getOn())
                return true;
            else
                return false;
        }
        return false;
    }
}

