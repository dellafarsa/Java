package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//IF / IF ELSE/ SWITCH-CASE STATEMENTS
        Scanner input = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = input.nextInt();

        if (num > 0)
            System.out.println("Positive.");
        else if (num == 0)
            System.out.println("Neutral.");
        else
            System.out.println("Negative.");

        System.out.print("enter a day(in lower case): ");
        String day = input.next();

        System.out.print("short form: ");
        switch (day) {
            case "monday" -> System.out.print("mon");
            case "tuesday" -> System.out.print("tue");
            case "wednesday" -> System.out.print("wed");
            case "thursday" -> System.out.print("thu");
            case "friday" -> System.out.print("fri");
            case "saturday" -> System.out.print("sat");
            case "sunday" -> System.out.print("sun");
            default -> System.out.print("invalid day.");
        }


    }
}
