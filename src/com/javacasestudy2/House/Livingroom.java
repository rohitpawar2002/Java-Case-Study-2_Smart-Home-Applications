package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.LivingroomDevices;
import com.javacasestudy2.Device.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
                livingRoomDevices.add(new AirConditioner(rand.nextInt(1000),"AirConditioner",false));
                return false;
            case 2:
                livingRoomDevices.add(new Fan(rand.nextInt(1000),"Fan",false));

                return true;
            case 3:
                livingRoomDevices.add(new Light(rand.nextInt(1000),"Light",false));
                return true;
            case 4:
                livingRoomDevices.add(new Television(rand.nextInt(1000),"Television",false));
                return false;
            case 5:
                System.out.println("You cant add Geyser to the LivingRoom");
                return false;
            case 6:
                System.out.println("You cant add Exhaust to the LivingRoom");
                return false;
            default:
                return false;
        }
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
