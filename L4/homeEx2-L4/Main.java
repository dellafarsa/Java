import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        User<String, Integer> user1 = new User<>();

        user1.username = "delaram123";
        user1.password = 1919;

        System.out.println("user1");
        System.out.println(user1);
        System.out.println("username: " + user1.username);
        System.out.println("password: " + user1.password);

        User<String, Integer> user2 = null;
        User<String, Integer> user3 = null;

        try {
            user2 = (User) user1.clone();
            user3 = (User) user1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("user2");
        System.out.println(user2);
        System.out.println("username: " + user2.username);
        System.out.println("password: " + user2.password);

        System.out.println("user3");
        System.out.println(user3);
        System.out.println("username: " + user3.username);
        System.out.println("password: " + user3.password);

    }
}
