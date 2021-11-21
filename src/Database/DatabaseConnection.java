package Database;

import java.sql.*;

public class DatabaseConnection {
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightmanagementbooking", "root", "root");
            return con;
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
}
