import java.util.Objects;

public class Library {
    public String title;
    public String genre;
    public String author;
    public int numOfPages;
    public int width;
    public int height;
    public int yearOfProduction;

    public Library (String title){
        this.title = title;
    }

    public void borrow(String x){
        if (Objects.equals(x, this.title))
            System.out.println(this.title + " can be borrowed.");
        else
            System.out.println("Book is unavailable.");
    }
    public void returnBook(String x){
        System.out.println("Thank you for returning this book!");
    }
    public void searchBook(String x){
        if (Objects.equals(x, this.title))
            System.out.println(this.title + " is available.");
        else
            System.out.println(this.title + " is available.");
    }
    public void buy(String x){
        this.searchBook(x);
    }
    public void read(String x){
        System.out.println("What book do you want to read? ");
        this.searchBook(x);
    }
}
