import java.sql.*;
public class PreparedStatementExample {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String userName = "postgres";
        String password = "database"; //your postgres password

        int id=12;
        String name="king";
        int marks=99;

        String query="insert into student values (?,?,?)";
        Connection con = DriverManager.getConnection(url, userName, password);

        PreparedStatement st=  con.prepareStatement(query);
        st.setString(1,name);
        st.setInt(2,id);
        st.setInt(3,marks);
        st.execute();


    }
}
