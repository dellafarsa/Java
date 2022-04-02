package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //FIND THE MAXIMUM NUMBER IN AN ARRAY
	    Scanner input = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int len = input.nextInt();

        int arr[] = new int[len];
        int max = 0;

        for (int i = 0; i < len; i++){
            System.out.print("arr[" + i + "]= ");
            arr[i] = input.nextInt();
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.print("Maximum number in array: " + max);


    }
}
