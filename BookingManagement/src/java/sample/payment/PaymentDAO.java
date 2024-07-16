/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.payment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sample.utils.DBUtils;

/**
 *
 * @author ADMIN
 */
public class PaymentDAO {

    private final String CREATE_PAYMENT = "INSERT INTO Payments(bookingId, amount, paymentDate, paymentMethod, status)"
            + "VALUES(?, ?, ?, ?, ?)";

    public boolean createPayment(Payment payment) {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(CREATE_PAYMENT);

            ptm.setInt(1, payment.getBookingId());
            ptm.setDouble(2, payment.getAmount());
            ptm.setString(3, payment.getPaymentDate().toString());
            ptm.setString(4, payment.getPaymentMethod());
            ptm.setString(5, payment.getStatus());
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
