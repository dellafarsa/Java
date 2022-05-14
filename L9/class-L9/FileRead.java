import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileRead implements Runnable{
    @Override
    public void run() {

    }

    File file = new File("C:\\Users\\asus\\Desktop\\NewFile.txt");

    Scanner scanner = new Scanner(file);

    public FileRead() throws FileNotFoundException {
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }


}
