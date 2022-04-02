import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Student name: ");
        String name = input.next();

        System.out.print("Username : ");
        String username = input.next();

        System.out.print("Password: ");
        int pass = input.nextInt();

        Student student = new Student();
        if (!name.equals(student.studentName) || !username.equals(student.username) || pass != student.password){
            //exception management
            try {
                throw new IncompatibleException("Incorrect username or password.");
            } catch (IncompatibleException e) {
                e.printStackTrace();
            }finally {
                System.out.print("Try again.");
            }
        }
        else
            System.out.print("Successfully logged in.");
    }
}
