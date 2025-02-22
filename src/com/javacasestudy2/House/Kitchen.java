package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.BedroomDevices;
import com.javacasestudy2.CategoryOfDevices.KitchenDevices;
import com.javacasestudy2.Device.Device;
import com.javacasestudy2.Device.ExhaustFan;
import com.javacasestudy2.Device.Fan;
import com.javacasestudy2.Device.Light;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kitchen extends Rooms{
    Scanner sc = new Scanner(System.in);
    ArrayList<Device> kitchenDevices = new ArrayList<Device>();

    //Default Constructor
    public Kitchen() {
    }

    //Parametrise Constructor
    public Kitchen(String roomName, int noOfDevices) {
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
                System.out.println("You cant add Air conditioner to the kitchen");
                return false;
            case 2:
                kitchenDevices.add(new Fan(rand.nextInt(1000),"Fan",false));
                return true;
            case 3:
                kitchenDevices.add(new Light(rand.nextInt(1000),"Light",false));
                return true;
            case 4:
                System.out.println("You cant add Television to the kitchen");
                return false;
            case 5:
                System.out.println("You cant add Geyser to the kitchen");
                return false;
            case 6:
                kitchenDevices.add(new ExhaustFan(rand.nextInt(1000),"Exhaust Fan",false));
                return true;
            default:
                return false;
        }
    }

    public void display() {
        System.out.println("Number of devices available in Kitchen");
        System.out.println("+--------------------------------------------+");
        for (int i = 0; i < kitchenDevices.size(); i++) {
            System.out.println("["+(i+1) + ". Device ID - " + kitchenDevices.get(i).getProductId() + ", Device Name - "+kitchenDevices.get(i).getDeviceName()+"]");
        }
        System.out.println("+--------------------------------------------+");
    }

    @Override
    public boolean removeDevice() {
        if(kitchenDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter the Devise you would like to Uninstall");
            System.out.println("+------------------------------------------+");
            for (int i = 0; i < kitchenDevices.size(); i++) {
                System.out.println(kitchenDevices.get(i).getDeviceName() + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            kitchenDevices.remove(choice - 1);
            return true;
        }
        return false;
    }

    @Override
    public void checkStatusofDevice() {

    }

    @Override
    public boolean deviceOn() {
        return true;
    }
}
