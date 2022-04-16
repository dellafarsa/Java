import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.next();
        User.getInstance().setUsername(username);

        System.out.print("Password: ");
        String password = input.next();
        User.getInstance().setPassword(password);

        System.out.println("\nUser's Information");
        System.out.println(User.getInstance().getUsername());
        System.out.println(User.getInstance().getPassword());
    }
}
