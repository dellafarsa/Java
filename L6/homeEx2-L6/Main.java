import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
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

                System.out.print("CODE: ");
                int code = input.nextInt();

                System.out.print("NAME: ");
                String name = input.next();

                System.out.print("IDNUM: ");
                int idnum = input.nextInt();

                System.out.print("FATHER'S NAME: ");
                String fname = input.next();

                System.out.print("POSITION: ");
                String position = input.next();

                System.out.print("SALARY: ");
                int salary = input.nextInt();

                System.out.print("YEARS OF EXPERIENCE: ");
                int expyear= input.nextInt();
                st.executeUpdate("insert into users (id, code, name, idnum, fname, position, salary, expyear) values('"+i+"','"+code+"', '"+name+"', '"+idnum+"', '"+fname+"', '"+position+"', '"+salary+"', '"+expyear+"')");
            }
            System.out.print("Do you want to delete your information?");
            String ans = input.next();
            if (ans.equals("yes")){
                System.out.print("user code?");
                String code = input.next();

                st.executeUpdate("delete from users where code = '"+code+"'");
                }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
