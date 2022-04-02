import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student<String, Long> student = new Student<>();

        System.out.print("Name: ");
        student.setName(input.next());

        System.out.print("Student Number: ");
        student.setNum(input.nextLong());

        System.out.print("Father's Name: ");
        student.setFname(input.next());

        float num;
        List<Float> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++){
            System.out.print("Grade" + i +":");
            num = input.nextFloat();
            list.add(num);
        }

        System.out.println("\n\nStudents information");
        System.out.println("Student's Name: " + student.getName());

        System.out.println("Student Number: " + student.getNum());

        System.out.println("Student Father's Name: " + student.getFname());

        int c = 1;
        for (Float i : list){
            System.out.println("Grade" + c +": " + i);
            c++;
        }
    }
}
