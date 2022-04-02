import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        System.out.print("c = ");
        int c = input.nextInt();

        int delta = (b * b) - (4 * a * c);

        if (delta < 0){
            try {
                throw new UnsolvableEquationException("This equation cannot be solved.");
            } catch (UnsolvableEquationException e) {
                e.printStackTrace();
            }finally {
                System.out.printf("Try again.");
            }
        }else{
            if (delta == 0){
                int x = (-b) / (2 * a);
                System.out.println("x = " + x);
            }else{
                int sqrt = (int) Math.sqrt(delta);
                int x1 = (-b - sqrt) / (2 * a);
                int x2 = (-b + sqrt) / (2 * a);

                System.out.println("x1 = " + x1);

                System.out.println("x2 = " + x2);
            }
        }

    }
}
