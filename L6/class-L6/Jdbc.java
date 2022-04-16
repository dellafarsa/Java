import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;

public class Jdbc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "delaram",
                    "1073");
            Statement st = connection.createStatement();

            System.out.println("CONNECTED");
            System.out.println("SIGN UP");

            int i = 1;
            while (i > 0){
                System.out.print("id: ");
                i = input.nextInt();

                if (i == 0)
                    break;

                System.out.print("NAME: ");
                String name = input.next();

                System.out.print("USERNAME: ");
                String username = input.next();

                System.out.print("PASSWORD: ");
                int pass = input.nextInt();

                System.out.print("EMAIL: ");
                String email = input.next();

                st.executeUpdate("insert into users (id, name, username, password, email) values('"+i+"','"+name+"', '"+username+"', '"+pass+"', '"+email+"')");

                System.out.print("Do you want to log in?");
                String ans = input.next();
                if (ans.equals("yes")){
                    while (true){
                        System.out.print("USERNAME: ");
                        String username2 = input.next();

                        System.out.print("PASSWORD: ");
                        int pass2 = input.nextInt();
                        if (username.equals(username2) && pass == pass2){
                            System.out.println("SUCCESSFULLY LOGGED IN.");
                            break;
                        }
                        else
                            System.out.println("LOGIN UNSUCCESSFUL- TRY AGAIN.");
                    }
                }else
                    System.out.println("VALUE INSERTED SUCCESSFULLY.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
