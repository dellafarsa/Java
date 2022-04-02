import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//---------user1
        System.out.println("-----------User1------------");
        System.out.print("name: ");
        String name = input.next();

        System.out.print("family name: ");
        String family = input.next();

        System.out.print("age: ");
        int age = input.nextInt();

        User user1 = new User(name, family, age);
//---------user2
        System.out.println("-----------User2------------");
        System.out.print("name: ");
        name = input.next();

        System.out.print("family name: ");
        family = input.next();

        System.out.print("age: ");
        age = input.nextInt();

        User user2 = new User(name, family, age);

        //exception handling
        if (user1.user[0].equals(user2.user[0]) & user1.user[1].equals(user2.user[1]) & user1.user[2].equals(user2.user[2])){
            try {
                throw new SameUserException("identical users.");
            } catch (SameUserException e) {
                e.printStackTrace();
            }finally {
                System.out.print("Try Again.");
            }
        }else
            System.out.print("Thank you.");

    }
}
