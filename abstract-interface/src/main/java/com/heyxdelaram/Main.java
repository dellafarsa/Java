package com.heyxdelaram;

import com.heyxdelaram.Entity.*;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Vehicle[] vehicles = new Vehicle[100];
    static int count = 0;

    public static void main(String[] args) {

        while (true) {
            //menu options
            System.out.println("\n\nPlease enter vehicle number:");
            System.out.println("1- Airplane");
            System.out.println("2- Car");
            System.out.println("3- Ship");
            System.out.println("4- Helicopter");
            System.out.println("5- Motorcycle");
            System.out.println("0- Exit");

            int menu = scanner.nextInt();
            System.out.println("Number of vehicles of this type:");
            int num = scanner.nextInt();

            //todo make an array for each vehicle in their class so the array get stored in one place everytime

            switch (menu) {
                case 1:
                    for (int i = 0; i < num; i++){
                        Airplane airplane = new Airplane();
                        airplane.setName("airplane "+i);
                        vehicles[count] = airplane;
                        count++;
                    }
                    System.out.println("VEHICLES SUCCESSFULLY CREATED.");
                    break;
                case 2:
                    for (int i = 0; i < num; i++){
                        Car car = new Car();
                        car.setName("car"+i);
                        vehicles[count] = car;
                        count++;
                    }
                    System.out.println("VEHICLES SUCCESSFULLY CREATED.");
                    break;
                case 3:
                    for (int i = 0; i < num; i++){
                        Ship ship = new Ship();
                        ship.setName("ship "+i);
                        vehicles[count] = ship;
                        count++;
                    }
                    System.out.println("VEHICLES SUCCESSFULLY CREATED.");
                    break;
                case 4:
                    for (int i = 0; i < num; i++){
                        Helicopter helicopter = new Helicopter();
                        helicopter.setName("helicopter "+i);
                        vehicles[count] = helicopter;
                        count++;
                    }
                    System.out.println("VEHICLES SUCCESSFULLY CREATED.");
                    break;
                case 5:
                    for (int i = 0; i < num; i++){
                        Motorcycle motorcycle = new Motorcycle();
                        motorcycle.setName("motorcycle "+i);
                        vehicles[count] = motorcycle;
                        count++;
                    }
                    System.out.println("VEHICLES SUCCESSFULLY CREATED.");
                    break;
                case 0:
                    System.out.println("Have a nice day.");
                    return;
                default:
                    System.out.println("Invalid number.");
                    break;

            }
        }
    }
}