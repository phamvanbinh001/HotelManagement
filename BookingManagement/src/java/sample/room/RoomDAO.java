/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.room;

import java.sql.Connection;
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
public class RoomDAO {

    private final String GET_ROOMS = "SELECT * FROM Rooms";
    private final String FILTER = "SELECT * FROM Rooms WHERE type = ?";
    private final String GET_ROOM_BY_ID = "SELECT * FROM Rooms WHERE roomId = ?";
    private final String UPDATE_ROOM = "UPDATE [Rooms]"
            + " SET [roomNumber]= ?,"
            + "[doubleBeds] = ?,"
            + "[singleBeds] = ?,"
            + "[pricePerDay] = ?,"
            + "[type] = ?, "
            + "[amenitiesDescription] = ?,"
            + "[imageUrl] = ?, "
            + "[isAvailable] = ? "
            + "WHERE roomId = ?";
    private final String SEARCH = "SELECT * FROM Rooms WHERE roomNumber LIKE ? OR roomId = ?";
    private final String ADD = "INSERT INTO Rooms VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

    public boolean add(String roomNumber, int doubleBeds, int singleBeds, double pricePerDay, String type, String desc, String imgUrl, boolean available) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(ADD);
            ptm.setString(1, roomNumber);
            ptm.setInt(2, doubleBeds);
            ptm.setInt(3, singleBeds);
            ptm.setDouble(4, pricePerDay);
            ptm.setString(5, type);
            ptm.setString(6, desc);
            ptm.setString(7, imgUrl.isEmpty() ? "img/room-default.jpg" : imgUrl);
            ptm.setBoolean(8, available);
            return ptm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public List<Room> filter(int singleBedsIn, int doubleBedsIn, String typeIn) throws SQLException {
        List<Room> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = FILTER;
                if (singleBedsIn > 0) {
                    query = query.concat(" AND singleBeds = " + singleBedsIn);
                }
                if (doubleBedsIn > 0) {
                    query = query.concat(" AND doubleBeds = " + doubleBedsIn);
                }
                ptm = conn.prepareStatement(query);
                ptm.setString(1, typeIn);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int roomId = rs.getInt(1);
                    String roomNumber = rs.getString(2);
                    int doubleBeds = rs.getInt(3);
                    int singleBeds = rs.getInt(4);
                    Double pricePerDay = rs.getDouble(5);
                    String type = rs.getString(6);
                    String amenitiesDescription = rs.getString(7);
                    String imageUrl = rs.getString(8);
                    if (imageUrl == null || imageUrl.isEmpty()) {
                        imageUrl = "img/room-default.jpg";
                    }
                    boolean isAvailable = rs.getBoolean(9);
                    list.add(new Room(roomId, roomNumber, doubleBeds, singleBeds, pricePerDay, type, amenitiesDescription, imageUrl, isAvailable));
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

    public Room getRoomById(int roomId) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GET_ROOM_BY_ID);
                ptm.setInt(1, roomId);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String roomNumber = rs.getString(2);
                    int doubleBeds = rs.getInt(3);
                    int singleBeds = rs.getInt(4);
                    Double pricePerDay = rs.getDouble(5);
                    String type = rs.getString(6);
                    String amenitiesDescription = rs.getString(7);
                    String imageUrl = rs.getString(8);
                    if (imageUrl == null || imageUrl.isEmpty()) {
                        imageUrl = "img/room-default.jpg";
                    }
                    boolean isAvailable = rs.getBoolean(9);
                    return (new Room(roomId, roomNumber, doubleBeds, singleBeds, pricePerDay, type, amenitiesDescription, imageUrl, isAvailable));
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
        return null;
    }

    public List<Room> getRoomList() throws SQLException {
        List<Room> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GET_ROOMS);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int roomId = rs.getInt(1);
                    String roomNumber = rs.getString(2);
                    int doubleBeds = rs.getInt(3);
                    int singleBeds = rs.getInt(4);
                    Double pricePerDay = rs.getDouble(5);
                    String type = rs.getString(6);
                    String amenitiesDescription = rs.getString(7);
                    String imageUrl = rs.getString(8);
                    if (imageUrl == null || imageUrl.isEmpty()) {
                        imageUrl = "img/room-default.jpg";
                    }
                    boolean isAvailable = rs.getBoolean(9);
                    list.add(new Room(roomId, roomNumber, doubleBeds, singleBeds, pricePerDay, type, amenitiesDescription, imageUrl, isAvailable));
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

    public boolean updateRoom(Room room) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(UPDATE_ROOM);
            ptm.setString(1, room.getRoomNumber());
            ptm.setInt(2, room.getDoubleBeds());
            ptm.setInt(3, room.getSingleBeds());
            ptm.setDouble(4, room.getPricePerDay());
            ptm.setString(5, room.getType());
            ptm.setString(6, room.getAmenitiesDescription());
            ptm.setString(7, room.getImageUrl());
            ptm.setBoolean(8, room.isIsAvailable());
            ptm.setInt(9, room.getRoomId());
            return ptm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public List<Room> search(String keyword) throws SQLException {
        List<Room> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH);
                ptm.setString(1, "%" + keyword + "%");
                ptm.setString(2, keyword);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int roomId = rs.getInt(1);
                    String roomNumber = rs.getString(2);
                    int doubleBeds = rs.getInt(3);
                    int singleBeds = rs.getInt(4);
                    Double pricePerDay = rs.getDouble(5);
                    String type = rs.getString(6);
                    String amenitiesDescription = rs.getString(7);
                    String imageUrl = rs.getString(8);
                    if (imageUrl == null || imageUrl.isEmpty()) {
                        imageUrl = "img/room-default.jpg";
                    }
                    boolean isAvailable = rs.getBoolean(9);
                    list.add(new Room(roomId, roomNumber, doubleBeds, singleBeds, pricePerDay, type, amenitiesDescription, imageUrl, isAvailable));
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
//        RoomDAO dao = new RoomDAO();
//
//        System.out.println(dao.filter(-1, -2, "Luxury"));
//    }
}
