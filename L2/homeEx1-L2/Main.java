import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("num1: ");
        int num1 = input.nextInt();

        System.out.print("num2: ");
        int num2 = input.nextInt();

        Calculator2 cal = new Calculator2(num1, num2);

        System.out.print("Choose an operator (+, -, *, /): ");
        String op = input.next();

        switch (op) {
            case "+" -> cal.addIt();
            case "-" -> cal.subtract();
            case "*" -> cal.multiply();
            case "/" -> cal.divide();
            default -> System.out.println("Invalid Operator!");
        }
    }
}
