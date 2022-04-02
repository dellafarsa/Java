package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //FOR / WHILE / DO WHILE STATEMENTS
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a text: ");
        String text = scanner.nextLine();

        char[] arr = text.toCharArray();

        System.out.print("reversed text: ");
        for (int i = arr.length - 1; i >= 0; i--) {//i = 5
            System.out.print(arr[i]);
        }
        System.out.print("\n");

        int x = 10;
        while (x > 0){
            System.out.println(x);
            x--;
        }

        System.out.print("\n");

        do {
            System.out.println(x);
            x++;
        }while (x < 11);
    }
}
