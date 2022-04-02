import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        int x = input.nextInt();

        System.out.print("y: ");
        int y = input.nextInt();

        System.out.print("e: ");
        int e = input.nextInt();

        System.out.print("f: ");
        int f = input.nextInt();

        Equation eq1 = new Equation(x, y, e, f);
    }
}
