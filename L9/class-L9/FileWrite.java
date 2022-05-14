import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class FileWrite extends FileRead implements Runnable{

    String fileContent = "//THIS IS THE Copied FILE.\n";
    public FileWrite() throws IOException {

        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("C:\\Users\\asus\\Desktop\\NewFile2.txt");
        writer.write(fileContent);
        writer.close();

    }

}
