package com.company;
import java.util.Scanner;

public class Main {
    //SIMPLE CALCULATOR USING SWITCH-CASE
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result = 0;

        System.out.print("a: ");
        int a = input.nextInt();

        System.out.print("b: ");
        int b = input.nextInt();

        System.out.print("Choose an operator (+, -, *, or /): ");
        char op = input.next().charAt(0);

        if (a < b){
            int t = a;
            a = b;
            b = t;
        }

        switch (op){
            case '+' :
                result = a + b;
                System.out.println(a + " + "+  b + " = " + result);
            break;
            case '-' :
                result = a - b;
                System.out.println(a + " - "+  b + " = " + result);
            break;
            case '*' :
                result = a * b;
                System.out.println(a + " * "+  b + " = " + result);
            break;
            case '/' :
                result = a / b;
                System.out.println(a + " / "+  b + " = " + result);
            break;
            default:
                System.out.println("Invalid Operator! ");
            break;
        }


    }
}
