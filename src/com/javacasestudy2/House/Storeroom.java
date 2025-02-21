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
                System.out.println("You cant add Television to the StoreRoom");
                return false;
            case 6:
                storeroomDevices.add(new ExhaustFan(rand.nextInt(1000),"Exhaustfan",false));
                return true;
            default:
                return false;
        }
    }


    public void display() {
        for (int i=0;i < storeroomDevices.size();i++)
        {
            System.out.println(storeroomDevices.get(i));
        }
    }

    @Override
    public boolean removeDevice() {
        System.out.println("Enter the Devise you would like to Uninstall");
        System.out.println("+------------------------------------------+");
        for (int i=0;i < storeroomDevices.size();i++)
        {
            System.out.println(storeroomDevices.get(i).getDeviceName() + "press-"+i+1);
        }
        System.out.println("+------------------------------------------+");
        System.out.println("Enter your preferred choice");
        int choice = sc.nextInt();

        storeroomDevices.remove(choice - 1);
        return true;
    }

    @Override
    public void checkStatusofDevice() {

    }
}
