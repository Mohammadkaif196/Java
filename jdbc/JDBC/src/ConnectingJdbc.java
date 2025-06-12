//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
public class ConnectingJdbc {
    public static void main(String[] args) throws Exception{
        /*
         1.import driver
         2.load and register driver
         3.create connection
         4.create statement
         5.execute statement
         6.close connection
         */

        String url="jdbc:postgresql://localhost:5432/postgres";
        String userName="postgres";
        String password="database"; //your postgres password
       // Class.forName("org.postgresql.Driver"); //step-2

        Connection con=DriverManager.getConnection(url,userName,password); //step-3
        System.out.println("database connected...");
    }
}