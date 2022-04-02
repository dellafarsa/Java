package com.company;
import java.util.Scanner;

public class Main {
    // SEARCH A NUMBER IN AN ARRAY OF NUMBERS
    private static boolean isInArray( int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
        //return num > 0
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("How many numbers? ");
        int len = input.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("arr[" + i + "]= ");
            arr[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == num) {
                count += 1;
            }
        }
        if (count > 0)
            System.out.println("Number of array elements similar to your number: " + count);


        System.out.println(isInArray(count));
    }


}
