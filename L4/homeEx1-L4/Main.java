import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Student Number: ");
        String num = input.next();

        System.out.print("Student Name: ");
        String name = input.next();

        System.out.print("Student GPA: ");
        String gpa = input.next();

        HashMap<String, String> map = new HashMap<>();
        map.put("Student Number", num);
        map.put("Student Name", name);
        map.put("Student GPA", gpa);

        System.out.println(map);


    }
}
