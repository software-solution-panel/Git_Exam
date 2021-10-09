package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // 1st rule
    private static DBConnection dbConnection;

    private Connection connection;

    // 2nd rule
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade", "root", "chathumal");
    }

    // 3rd rule
    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        return (null==dbConnection) ? (dbConnection = new DBConnection()) : (dbConnection);
    }

    public Connection getConnection() {
        return connection;
    }
}
