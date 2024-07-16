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
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
    private final String COMPLETE_BOOKING = "UPDATE Bookings SET status = 'completed' WHERE bookingId = ?";
    private final String BOOKING = "INSERT INTO Bookings (userId, roomId, checkinDate, checkoutDate, totalPrice, message, status)"
            + " VALUES (?, ?, ?, ?, ?, ?, ?)";
    private final String GET_TOP_BOOKING = "SELECT TOP 1 * FROM Bookings b JOIN Rooms r ON b.roomId = r.roomId WHERE userId = ? ORDER BY bookingId DESC";
    private final String GET_BOOKING_BY_ID = "SELECT * FROM Bookings b JOIN Rooms r ON b.roomId = r.roomId WHERE bookingId = ?";
    private final String UPDATE_BOOKING_DETAILS = "UPDATE Bookings SET checkinDate = ?, checkoutDate = ?, message = ?, status = 'pending' WHERE bookingId = ?";
    private final String UPDATE_BOOKING_PRICE = "UPDATE Bookings SET totalPrice = ? WHERE bookingId = ?";
    private final String GET_ROOM_PRICE = "SELECT pricePerDay FROM Rooms WHERE roomId = (SELECT roomId FROM Bookings WHERE bookingId = ?)";
    private final String SEARCH = "  SELECT * FROM Bookings b\n"
            + "  JOIN Rooms r\n"
            + "  ON b.roomId = r.roomId \n"
            + "  WHERE [bookingId] = ?  OR [userId] = ? OR r.roomId = ?";

    public boolean updateBooking(String checkinDate, String checkoutDate, String message, int bookingId) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(UPDATE_BOOKING_DETAILS);
            ps.setString(1, checkinDate);
            ps.setString(2, checkoutDate);
            ps.setString(3, message);
            ps.setInt(4, bookingId);
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

    public Booking getBookingById(int bookingId) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(GET_BOOKING_BY_ID);
            ps.setInt(1, bookingId);
            rs = ps.executeQuery();
            if (rs.next()) {
                int userId = rs.getInt(2);
                int roomId = rs.getInt(3);
                Date checkinDate = rs.getDate(4);
                Date checkoutDate = rs.getDate(5);
                double totalPrice = rs.getDouble(6);
                Date bookingDate = rs.getDate(7);
                String message = rs.getString(8);
                String status = rs.getString(9);
                String roomNumber = rs.getString("roomNumber");
                String imageUrl = rs.getString("imageUrl");

                return (new Booking(bookingId, userId, roomId, checkinDate, checkoutDate, totalPrice, bookingDate, message, status, roomNumber, imageUrl));
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
        return null;
    }

    public Booking getTopBooking(int userId) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(GET_TOP_BOOKING);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            if (rs.next()) {
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

                return (new Booking(bookingId, userId, roomId, checkinDate, checkoutDate, totalPrice, bookingDate, message, status, roomNumber, imageUrl));
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
        return null;
    }

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

    public boolean completeBooking(int bookingId) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            ps = connection.prepareStatement(COMPLETE_BOOKING);
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

    public boolean updateBookingPrice(int bookingId) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();

            String getBookingInfoSQL = "SELECT checkinDate, checkoutDate, roomId FROM Bookings WHERE bookingId = ?";
            ps = connection.prepareStatement(getBookingInfoSQL);
            ps.setInt(1, bookingId);
            rs = ps.executeQuery();

            if (!rs.next()) {
                return false;
            }

            LocalDate checkinDate = LocalDate.parse(rs.getString("checkinDate"));
            LocalDate checkoutDate = LocalDate.parse(rs.getString("checkoutDate"));
            int roomId = rs.getInt("roomId");

            long numberOfDays = Math.abs(ChronoUnit.DAYS.between(checkinDate, checkoutDate));

            ps = connection.prepareStatement(GET_ROOM_PRICE);
            ps.setInt(1, bookingId);
            rs = ps.executeQuery();

            if (!rs.next()) {
                return false;
            }

            double pricePerDay = rs.getDouble("pricePerDay");

            double totalPrice = numberOfDays * pricePerDay;

            ps = connection.prepareStatement(UPDATE_BOOKING_PRICE);
            ps.setDouble(1, totalPrice);
            ps.setInt(2, bookingId);

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

    public List<Booking> search(String keyword) throws SQLException {
        List<Booking> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH);
                ptm.setString(1, keyword);
                ptm.setString(2, keyword);
                ptm.setString(3, keyword);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int bookingId = rs.getInt(1);
                    int userId = rs.getInt(2);
                    int roomId = rs.getInt(3);
                    Date checkinDate = rs.getDate(4);
                    Date checkoutDate = rs.getDate(5);
                    double totalPrice = rs.getDouble(6);
                    Date bookingDate = rs.getDate(7);
                    String message = rs.getString(8);
                    String status = rs.getString(9);
                    String imageUrl = rs.getString("imageUrl");
                    String roomNumber = rs.getString("roomNumber");
                    Booking booking = new Booking(bookingId, userId, roomId, checkinDate, checkoutDate, totalPrice, bookingDate, message, status, roomNumber, imageUrl);
                    list.add(booking);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }
//
//    public static void main(String[] args) throws SQLException {
//        BookingDAO dao = new BookingDAO();
//        System.out.println(dao.updateBookingPrice(19));
//    }
}
