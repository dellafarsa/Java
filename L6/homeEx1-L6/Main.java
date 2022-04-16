import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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

                        System.out.print("USERNAME: ");
                        String username = input.next();

                        System.out.print("PASSWORD: ");
                        int pass = input.nextInt();

                        System.out.print("EMAIL: ");
                        String email = input.next();

                        System.out.print("AGE: ");
                        int age = input.nextInt();

                        System.out.print("DEGREE: ");
                        String degree = input.next();

                        st.executeUpdate("insert into users (id, code, username, password, email, age, degree) values('"+i+"','"+code+"', '"+username+"', '"+pass+"', '"+email+"', '"+age+"', '"+degree+"')");
                    }
                        System.out.print("Do you want to update your information?");
                        String ans = input.next();
                        if (ans.equals("yes")){
                            System.out.print("user code?");
                            String code = input.next();

                            System.out.print("What information type?");
                            String type = input.next();
                            switch (type){
                                case "username":
                                    System.out.print("username: ");
                                    String username = input.next();
                                    st.executeUpdate("update users users set username = '"+username+"' where code = '"+code+"'");
                                    break;
                                case "password":
                                    System.out.print("password: ");
                                    int password = input.nextInt();
                                    st.executeUpdate("update users users set password = '"+password+"' where code = '"+code+"'");
                                    break;
                                case "email":
                                    System.out.print("email: ");
                                    String email = input.next();
                                    st.executeUpdate("update users users set email = '"+email+"' where code = '"+code+"'");
                                    break;
                                case "age":
                                    System.out.print("age: ");
                                    int age = input.nextInt();
                                    st.executeUpdate("update users users set age = '"+age+"' where code = '"+code+"'");
                                    break;
                                case "degree":
                                    System.out.print("degree: ");
                                    String degree = input.next();
                                    st.executeUpdate("update users users set degree = '"+degree+"' where code = '"+code+"'");
                                    break;
                            }
                        }
                        System.out.println("VALUES INSERTED SUCCESSFULLY.");

                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

