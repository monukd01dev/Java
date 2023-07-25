import java.sql.Connection;
import java.sql.*;

public class FetchingData {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql:///clg", "root", "root");
        Statement s = c.createStatement();
//        ResultSet rs = s.executeUpdate("insert into student(stu_name,roll_no,branch,shift,sem) values()");

    }
}
