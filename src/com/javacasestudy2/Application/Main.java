package com.javacasestudy2.Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;

        do{
            System.out.println("+-----------------------------------------------------+");
            System.out.println("        Welcome to Smart Home Application");
            System.out.println("+-----------------------------------------------------+");
            System.out.println("1. Install Device in the Room              press-1");
            System.out.println("2. Uninstall Device from the Room          press-2");
            System.out.println("3. Show number of Devices in the Room      press-3");
            System.out.println("4. Check status of Device in the Room      press-4");
            System.out.println("5. Exit application                        press-5");
            System.out.println("+-----------------------------------------------------+");
            System.out.println("Please enter preferred choice");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    int roomChoice = 1;
                    do {
                        System.out.println("Select Room in which you want to Install Device");
                        System.out.println("+-------------------------------+");
                        System.out.println("1. Bedroom           press-1");
                        System.out.println("2. Kitchen           press-2");
                        System.out.println("3. Washroom          press-3");
                        System.out.println("4. Living room       press-4");
                        System.out.println("5. Store room        press-5");
                        System.out.println("6. Go to Main menu   press-6");
                        System.out.println("+-------------------------------+");
                        System.out.println("Please enter preferred choice");

                        roomChoice = sc.nextInt();

                        switch (roomChoice) {
                            case 1:
                                System.out.println("bedroom");
                                break;
                            case 2:
                                System.out.println("kitchen");
                                break;
                            case 3:
                                System.out.println("Washroom");
                                break;
                            case 4:
                                System.out.println("Living room");
                                break;
                            case 5:
                                System.out.println("Store room");
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Invalid choice! Please enter correct choice");
                                break;
                        }
                    }while (roomChoice!=6);
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("Exit successfully, Thank you for using Smart Home Application");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter correct choice");
                    break;
            }
        }while (choice!=5);
    }
}