import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Book title ");
        String x = input.next();

        Library book1 = new Library(x);
//write any method you want or change the book title
        book1.searchBook(x);
    }
}
