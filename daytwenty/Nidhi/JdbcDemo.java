package daytwenty.Nidhi;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/your_database_name"; // Replace with your database name
        String username = "root";
        String password = "your_password"; // Replace with your password
        String query = "select * from employee";

        Class.forName("com.mysql.cj.jdbc.Driver"); // completed
        Connection con = DriverManager.getConnection(url, username, password); // completed
        Statement st = con.createStatement(); // completed

        ResultSet rs = st.executeQuery(query); // completed
        // using while loop
        while (rs.next()) {

            String table = "";

            table = rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3) + ":" + rs.getInt(4);
            System.out.println(table);
        }

        st.close(); // completed
        con.close(); // completed

    }

}