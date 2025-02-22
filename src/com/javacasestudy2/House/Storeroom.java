package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.StoreroomDevices;
import com.javacasestudy2.Device.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Storeroom extends Rooms{
    Scanner sc = new Scanner(System.in);
    ArrayList<Device> storeroomDevices = new ArrayList<Device>();

    //Default Constructor
    public Storeroom() {
    }

    //Parametrise Constructor
    public Storeroom(String roomName, int noOfDevices) {
        super(roomName, noOfDevices);
    }

    public boolean addDevice(){
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

        switch (choice){
            case 1:
                System.out.println("You cant add AirConditioner to the StoreRoom");
                return false;
            case 2:
                storeroomDevices.add(new Fan(rand.nextInt(1000),"Fan",false));
                return true;
            case 3:
                storeroomDevices.add(new Light(rand.nextInt(1000),"Light",false));
                return true;
            case 4:
                System.out.println("You cant add Television to the StoreRoom");
                return false;
            case 5:
                System.out.println("You cant add Geyser to the StoreRoom");
                return false;
            case 6:
                storeroomDevices.add(new ExhaustFan(rand.nextInt(1000),"Exhaust Fan",false));
                return true;
            default:
                return false;
        }
    }


    public void display() {
        System.out.println("Number of devices available in Store room");
        System.out.println("+--------------------------------------------+");
        for (int i = 0; i < storeroomDevices.size(); i++) {
            System.out.println("["+(i+1) + ". Device ID - " + storeroomDevices.get(i).getProductId() + ", Device Name - "+storeroomDevices.get(i).getDeviceName()+"]");
        }
        System.out.println("+--------------------------------------------+");
    }

    @Override
    public boolean removeDevice() {
        if(storeroomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter the Devise you would like to Uninstall");
            System.out.println("+------------------------------------------+");
            for (int i = 0; i < storeroomDevices.size(); i++) {
                System.out.println(storeroomDevices.get(i).getDeviceName() + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            storeroomDevices.remove(choice - 1);
            return true;
        }
        return false;
    }

    @Override
    public void checkStatusofDevice() {
        if(storeroomDevices.isEmpty())
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
                for (int i = 0; i < storeroomDevices.size(); i++) {
                    System.out.println(storeroomDevices.get(i).getDeviceName() + "      press-" + (i + 1));
                }
                System.out.println("+------------------------------------------+");
                System.out.println("Enter your preferred choice");
                int choice = sc.nextInt();

                System.out.println("[Device Name- " + storeroomDevices.get(choice - 1).getDeviceName() + "       " + "Status - " + (storeroomDevices.get(choice - 1).isStatus() ? "On" : "Off") + "]");
            } else if (option == 2) {
                for (int i = 0; i < storeroomDevices.size(); i++) {
                    System.out.println("["+(i+1)+". Device Name- " + storeroomDevices.get(i).getDeviceName() + "       " + "Status - " + (storeroomDevices.get(i).isStatus() ? "On" : "Off") + "]");
                }
            }
            else
                System.out.println("Invalid choice , Please enter correct choice");
        }
    }

    @Override
    public boolean deviceOn()
    {
        if(storeroomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter which device you want to control");
            System.out.println("+-----------------------------------------------------------+");
            for (int i = 0; i < storeroomDevices.size(); i++) {
                System.out.println("Device Name - "+ storeroomDevices.get(i).getDeviceName()+"      [Status - "+ (storeroomDevices.get(i).isStatus() ? "On" : "Off")+"]" + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            if(storeroomDevices.get(choice-1).getOn())
                return true;
            else
                return false;
        }
        return false;
    }
}
