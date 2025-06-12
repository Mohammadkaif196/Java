import java.sql.*;
public class CrudOperations {
    public static void main(String[] args)  throws Exception{
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String userName = "postgres";
        String password = "database"; //your postgres password
//        String query = "INSERT INTO student (id, name, marks) VALUES (11, 'firo', 90);";
//        String query="UPDATE student SET name = 'Subhani' WHERE id=2";
        String query="DELETE FROM student WHERE id = 3";
        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println("Connected...");
        Statement st = con.createStatement();   //create statement
         st.execute(query); // for inserting, updating, deleteing
        con.close();
        System.out.println("connection closed");
    }
}
