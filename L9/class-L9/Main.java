import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileRead reader = new FileRead();
        Thread thread1 = new Thread(reader);

        FileWrite writer = new FileWrite();
        Thread thread2 = new Thread(writer);


        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        thread2.start();

    }
}
