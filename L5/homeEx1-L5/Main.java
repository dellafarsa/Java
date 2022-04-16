import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("username: ");
        String username = input.next();

        System.out.print("name: ");
        String name = input.next();

        System.out.print("password: ");
        String password = input.next();

        System.out.print("age: ");
        int age = input.nextInt();

        System.out.print("address: ");
        String address = input.next();

        System.out.print("cell: ");
        String cell = input.next();

        System.out.print("degree: ");
        String degree = input.next();

        User user = new User().setUsername(username).setName(name).setPassword(password).setAge(age).setCell(cell).setDegree(degree);

        System.out.println(user.getUsername());
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println(user.getAge());
        System.out.println(user.getAddress());
        System.out.println(user.getCell());
        System.out.println(user.getDegree());
    }
}

