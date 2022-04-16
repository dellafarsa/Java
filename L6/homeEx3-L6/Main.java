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

                System.out.print("YEAR: ");
                int year = input.nextInt();

                System.out.print("GPA: ");
                float gpa = input.nextInt();
                st.executeUpdate("insert into users (id, code, name, year, gpa) values('"+i+"','"+code+"', '"+name+"', '"+year+"', '"+gpa+"')");
            }
            System.out.print("Do you want to update your information?");
            String ans = input.next();
            if (ans.equals("yes")){
                System.out.print("user code?");
                String code = input.next();

                System.out.print("What information type?");
                String type = input.next();
                switch (type){
                    case "name":
                        System.out.print("name: ");
                        String name = input.next();
                        st.executeUpdate("update users users set name = '"+name+"' where code = '"+code+"'");
                        break;
                    case "year":
                        System.out.print("year: ");
                        int year = input.nextInt();
                        st.executeUpdate("update users users set year = '"+year+"' where code = '"+code+"'");
                        break;
                    case "gpa":
                        System.out.print("gpa: ");
                        float gpa = input.nextInt();
                        st.executeUpdate("update users users set gpa = '"+gpa+"' where code = '"+code+"'");
                        break;
                }
            }
            System.out.print("Do you want to delete your information?");
            ans = input.next();
            if (ans.equals("yes")){
                System.out.print("user code?");
                String code = input.next();

                st.executeUpdate("delete from users where code = '"+code+"'");
            }
            System.out.println("VALUES INSERTED SUCCESSFULLY.");
            } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
