import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Car Name: ");
        String car = input.next();

        CarFactory carFactory = new CarFactory();

        System.out.println("\nCAR FEATURES");
        carFactory.getCar(car).fuel();
        carFactory.getCar(car).price();
        System.out.println(carFactory.getCar(car).isSmart());

    }
}
