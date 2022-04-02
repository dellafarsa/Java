import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int creds = 0;
        int x, y;
        System.out.print("How many subjects do have? ");
        int sub = input.nextInt();

        switch (sub) {
            case 6:
                for (int i = 0; i < 6; i++){
                    System.out.print("subj" + i + ": ");
                    x = input.nextInt();
                    System.out.print("credit: ");
                    y = input.nextInt();
                    creds += y;
                    sum += x * y;
                }
                sum = sum / creds;
                System.out.println("sum: " + sum);
                break;
            case 5:
                for (int i = 0; i < 5; i++){
                    System.out.print("subj" + i + ": ");
                    x = input.nextInt();
                    System.out.print("credit: ");
                    y = input.nextInt();
                    creds += y;
                    sum += x * y;
                }
                sum = sum / creds;
                System.out.println("sum: " + sum);
                break;
            case 4:
                for (int i = 0; i < 4; i++){
                    System.out.print("subj" + i + ": ");
                    x = input.nextInt();
                    System.out.print("credit: ");
                    y = input.nextInt();
                    creds += y;
                    sum += x * y;
                }
                sum = sum / creds;
                System.out.println("sum: " + sum);

                break;
            default:
                System.out.println("The amount of subjects is not standard.");
                break;
        }

        Student student = new Student((int) sum);
        student.validation();
    }
}
