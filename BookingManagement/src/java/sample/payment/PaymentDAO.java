/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.payment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sample.utils.DBUtils;

/**
 *
 * @author ADMIN
 */
public class PaymentDAO {

    private final String PAY = "INSERT INTO Payments (bookingId, amount, paymentMethod) VALUES (?, ?, ?)";
    private final String GET_REVENUE = "SELECT SUM(amount) FROM Payments";
    private final String GET_CUSTOMERS = "SELECT * FROM Payments";

    public boolean pay(int bookingId, double amount, String paymentMethod) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(PAY);
            ps.setInt(1, bookingId);
            ps.setDouble(2, amount);
            ps.setString(3, paymentMethod);

            return ps.executeUpdate() > 0;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return false;
    }

    public static void main(String[] args) throws SQLException {
        PaymentDAO dao = new PaymentDAO();

        System.out.println(dao.pay(4, 500, "credit"));
    }

    public double getRevenue() throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        double revenue = 0;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(GET_REVENUE);
            rs = ps.executeQuery();
            if (rs.next()) {
                revenue = rs.getDouble(1);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return revenue;
    }

    public int getCusomers() throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int customer = 0;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(GET_CUSTOMERS);
            rs = ps.executeQuery();
            while (rs.next()) {
                customer++;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return customer;
    }
}
