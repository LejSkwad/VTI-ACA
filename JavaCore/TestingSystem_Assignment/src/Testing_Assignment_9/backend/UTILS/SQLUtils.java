package Testing_Assignment_9.backend.UTILS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLUtils {

    private Connection connection;

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        if(connection == null || connection.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/testing_assignment_1";
            String user = "root";
            String password = "facebook.com";

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }

    public void closeConnection() throws SQLException {
        if(connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

}
