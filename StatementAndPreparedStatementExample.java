import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class StatementAndPreparedStatementExample {
    public static void main(String[] args) {
        try {
            // Establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");

            // Example using Statement
            System.out.println("Using Statement:");
            Statement stmt = con.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM users");
            while (rs1.next()) {
                System.out.println("ID: " + rs1.getInt("id") + ", Name: " + rs1.getString("name"));
            }

            // Example using PreparedStatement
            System.out.println("\nUsing PreparedStatement:");
            String sql = "SELECT * FROM users WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, 1);  // Set the parameter value (e.g., user ID = 1)
            ResultSet rs2 = pstmt.executeQuery();
            while (rs2.next()) {
                System.out.println("ID: " + rs2.getInt("id") + ", Name: " + rs2.getString("name"));
            }

            // Close the connections
            rs1.close();
            stmt.close();
            rs2.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
