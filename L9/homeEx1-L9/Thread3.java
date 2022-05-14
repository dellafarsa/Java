import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Thread3 implements Runnable{

    public Thread3() throws IOException {
        File file = new File("C:\\Users\\asus\\Desktop\\NewFile.txt");
        Scanner scan = new Scanner(file);

        String content = "";

        while (scan.hasNextLine()){

            content = content.concat(scan.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("NewFile-copy.txt");
        writer.write(content);
        writer.close();
    }

    @Override
    public void run() {

    }


}
