import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = input.nextInt();

        Integer number = new Integer();

        System.out.println("Is it Even?");
        number.isEven(num);

        System.out.println("Is it Odd?");
        number.isOdd(num);

        System.out.println("Is it Positive?");
        number.isPositive(num);

        System.out.println("Is it Negative?");
        number.isNegative(num);

        System.out.println("Is it Zero?");
        number.isZero(num);
    }
}
