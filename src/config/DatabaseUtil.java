package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Class.forName;

public class DatabaseUtil {
    static {
        try {
            // load and register
            forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public  static Connection getConnection() throws SQLException {
        //establish connection
        String url="jdbc:mysql://localhost:3306/school_db";
        String user="root";
        String password="56224jobailabu";
        return DriverManager.getConnection(url,user,password);
    }
public  static void closeConnection(Connection connection, Statement statement) throws SQLException {
        statement.close();
        connection.close();
}
}
