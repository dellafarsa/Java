import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Thread1 thread1 = new Thread1();
        Thread thread11 = new Thread(thread1);

        Thread2 thread2 = new Thread2(thread1.username, thread1.pass);
        Thread thread22 = new Thread(thread2);

        Thread3 thread3 = new Thread3();
        Thread thread33 = new Thread(thread3);

        synchronized (thread22){
            thread11.start();
            try {
                thread11.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        thread22.start();

        thread33.start();
    }
}
