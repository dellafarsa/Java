import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Calculator[] cal = new Calculator[3];

        String[] cal = new String[3];

        System.out.print("Number1: ");
        cal[0] = input.next();
        int num1 = Integer.parseInt(cal[0]);

        System.out.print("Operator: ");
        cal[1] = input.next();

        System.out.print("Number2: ");
        cal[2] = String.valueOf(input.nextInt());
        int num2 = Integer.parseInt(cal[2]);

        CalcFactory calcFactory = new CalcFactory(num1, cal[1], num2);
        calcFactory.getOperator(cal[1]);

    }
}
