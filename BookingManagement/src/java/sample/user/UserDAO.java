/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sample.utils.DBUtils;
import sample.utils.Hashing;

/**
 *
 * @author ADMIN
 */
public class UserDAO {

    private static final String LOGIN = "SELECT * FROM Users WHERE username = ? OR email = ?";
    private static final String CHECK_UNIQUE = "SELECT userId FROM [Users] WHERE ";
    private static final String REGISTER = "INSERT INTO [Users](username, password, fullName, email, role) VALUES(?, ?, ?, ?, 'user')";

    public User login(String usernameOrEmail, String passIn) throws SQLException {
        User user = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(LOGIN);
            ps.setString(1, usernameOrEmail);
            ps.setString(2, usernameOrEmail);
            rs = ps.executeQuery();
            if (rs.next()) {
                String passDB = rs.getString("password");
                if (Hashing.checkPassword(passIn, passDB)) {
                    int userId = rs.getInt("userId");
                    String username = rs.getString("username");
                    String fullName = rs.getString("fullName");
                    String email = rs.getString("email");
                    String role = rs.getString("role");
                    boolean isAvailable = rs.getBoolean("isAvailable");
                    user = new User(userId, username, "***", fullName, email, role, isAvailable);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return user;
    }

    public boolean checkUnique(String columnName, String value) {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(CHECK_UNIQUE + columnName + " = '" + value + "'");
            rs = ptm.executeQuery();
            return rs.next();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ptm != null) {
                    ptm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean register(String username, String email, String password) {
        Connection conn = null;
        PreparedStatement ptm = null;
        String pass;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(REGISTER);
            pass = Hashing.hashPassword(password);

            ptm.setString(1, username);
            ptm.setString(2, pass);
            ptm.setString(3, "New User");
            ptm.setString(4, email);
            return ptm.executeUpdate() > 0;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ptm != null) {
                    ptm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
