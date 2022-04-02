import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Shape name: ");
        String shape = input.next();

        if (shape.equals("square")){
            System.out.print("x: ");
            int x = input.nextInt();

            Square square = new Square(x);
            square.area();
            square.circ();

        }else if (shape.equals("rectangle")){
            System.out.print("x: ");
            int x = input.nextInt();

            System.out.print("y: ");
            int y = input.nextInt();

            Rectangle rectangle = new Rectangle(x, y);
            rectangle.area();
            rectangle.circ();
        }else
            System.out.print("Shape is not available.");
    }
}
