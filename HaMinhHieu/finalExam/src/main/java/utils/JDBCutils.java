package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutils {
    private Connection connection;

    public Connection getConnection() throws SQLException {
        if(connection == null || connection.isClosed()){
            String url = "jdbc:mysql://localhost:3306/finalExam";
            String user = "root";
            String password = "facebook.com";
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }

    public void CloseConnection() throws SQLException {
        if(connection != null && !connection.isClosed()){
            connection.close();
        }
    }
}
