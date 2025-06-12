

import java.sql.*;
public class ExecuteProcess {
    public static void main(String[] args)throws Exception {

        String url="jdbc:postgresql://localhost:5432/postgres";
        String userName="postgres";
        String password="database"; //your postgres password
        String query="select name from student where id=1;";
        Connection con=DriverManager.getConnection(url,userName,password);
        System.out.println("Connected...");
        Statement st=con.createStatement();   //create statement
        ResultSet rt=st.executeQuery(query); // storing result;
        String value=null;
        if(rt.next()) {
             value = rt.getString("name");
        }
        System.out.println("value fetched is "+value);
        con.close();


    }
}
