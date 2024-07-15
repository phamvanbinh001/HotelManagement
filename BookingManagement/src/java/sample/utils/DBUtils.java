package sample.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    private static final String DB = "HotelManagement";
    private static final String USER_NAME = "sa";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=";
        Class.forName(dbDriver);
        Connection conn = DriverManager.getConnection(dbURL + DB, USER_NAME, PASSWORD);
        return conn;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println(getConnection().getCatalog());
    }
}