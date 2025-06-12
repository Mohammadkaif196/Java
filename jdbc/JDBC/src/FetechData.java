import java.sql.*;

public class FetechData {
    public static void main(String[] args)throws Exception {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String userName = "postgres";
        String password = "database"; //your postgres password
        String query = "select * from student";
        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println("Connected...");
        Statement st = con.createStatement();   //create statement
        ResultSet rt = st.executeQuery(query); // storing result;
        while(rt.next()){
            System.out.print(rt.getInt(2)+"- ");
            System.out.print(rt.getString(1)+"- ");
            System.out.println(rt.getInt(3));
        }
        System.out.println("all data fetched successfully..");
        con.close();
    }
}
