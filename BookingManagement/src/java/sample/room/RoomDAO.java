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

    final String GET_ROOMS = "SELECT * FROM Rooms";

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
    
    public static void main(String[] args) throws SQLException {
        RoomDAO dao = new RoomDAO();
        
        System.out.println(dao.getRoomList());
    }
}
