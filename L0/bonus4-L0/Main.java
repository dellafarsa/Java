package com.company;

public class Main {

    public static void main(String[] args) {
	//BREAK & CONTINUE
        //break
        System.out.println("break");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
        //continue
        System.out.println("continue");

        i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
