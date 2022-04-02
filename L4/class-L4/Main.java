import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person1 = new Person();

        System.out.print("name: ");
        String name = input.next();
        person1.setName(name);

        System.out.print("family name: ");
        String family = input.next();
        person1.setFamily(family);

        System.out.print("age: ");
        int age = input.nextInt();
        person1.setAge(age);

        System.out.print("username: ");
        String username = input.next();
        person1.setUsername(username);

        System.out.print("password: ");
        String pass = input.next();
        person1.setPassword(pass);

        System.out.print("job: ");
        String job = input.next();
        person1.setJob(job);

        System.out.print("What information do you want? ");
        String ans = input.next();

        switch (ans) {
            case "name" -> System.out.println(person1.getName());
            case "family" -> System.out.println(person1.getFamily());
            case "age" -> System.out.println(person1.getAge());
            case "username" -> System.out.println(person1.getUsername());
            case "password" -> System.out.println(person1.getPassword());
            case "job" -> System.out.println(person1.getJob());
            default -> System.out.print("Required information is unavailable.");
        }
    }
}
