/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.booking;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBUtils;

/**
 *
 * @author ADMIN
 */
public class BookingDAO {

    private final String GET_BOOKING_LIST = "SELECT * FROM Bookings b JOIN Rooms r ON b.roomId = r.roomId WHERE userId = ? ORDER BY b.bookingDate DESC";
    private final String CANCEL_BOOKING = "UPDATE Bookings SET status = 'canceled' WHERE bookingId = ?";
    private final String BOOKING = "INSERT INTO Bookings (userId, roomId, checkinDate, checkoutDate, totalPrice, message, status)"
            + " VALUES (?, ?, ?, ?, ?, ?, ?)";
    
    public boolean booking(int userId, int roomId, String checkinDate, 
            String checkoutDate, double totalPrice, String message, String status) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(BOOKING);
            ps.setInt(1, userId);
            ps.setInt(2, roomId);
            ps.setString(3, checkinDate);
            ps.setString(4, checkoutDate);
            ps.setDouble(5, totalPrice);
            ps.setString(6, message);
            ps.setString(7, status);
            
            return ps.executeUpdate() > 0;            
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
        return false;
    }
    
    public boolean cancelBooking(int bookingId) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(CANCEL_BOOKING);
            ps.setInt(1, bookingId);
            return ps.executeUpdate() > 0;            
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
        return false;
    }

    public List<Booking> getBookingList(int userId) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Booking> list = new ArrayList<>();
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(GET_BOOKING_LIST);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            while (rs.next()) {
                int bookingId = rs.getInt(1);
                int roomId = rs.getInt(3);
                Date checkinDate = rs.getDate(4);
                Date checkoutDate = rs.getDate(5);
                double totalPrice = rs.getDouble(6);
                Date bookingDate = rs.getDate(7);
                String message = rs.getString(8);
                String status = rs.getString(9);
                String roomNumber = rs.getString("roomNumber");
                String imageUrl = rs.getString("imageUrl");

                list.add(new Booking(bookingId, userId, roomId, checkinDate, checkoutDate, totalPrice, bookingDate, message, status, roomNumber, imageUrl));
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
        return list;
    }

    public static void main(String[] args) throws SQLException {
        BookingDAO dao = new BookingDAO();
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println(date);
        for (Booking b : dao.getBookingList(1)) {
            System.out.println(b.getBookingDate().before(new java.sql.Date(System.currentTimeMillis())));
        }
    }
}
