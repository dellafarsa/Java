import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Thread1 implements Runnable {
    public String username ;
    public int pass;


    @Override
    public void run() {
        try {
            input();
            System.out.println(username);
            System.out.println(pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void input() throws ClassNotFoundException, SQLException {
            Scanner input = new Scanner(System.in);
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "delaram",
                        "1073");
                Statement st = connection.createStatement();

                System.out.println("CONNECTED");
                System.out.println("SIGN UP");

                    System.out.print("ID: ");
                    int id = input.nextInt();

                    System.out.print("USERNAME: ");
                    username = input.next();


                    System.out.print("PASSWORD: ");
                    pass = input.nextInt();

                    st.executeUpdate("insert into users (id, username, password) values('"+id+"', '"+username+"', '"+pass+"')");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

    }

}

