/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.room.Room;
import sample.room.RoomDAO;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "UpdateRoomController", urlPatterns = {"/updateRoom"})
public class UpdateRoomController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String roomNumber = request.getParameter("roomNumber");
        int roomId = Integer.parseInt(request.getParameter("roomId"));
        int singleBeds = Integer.parseInt(request.getParameter("singleBeds"));
        int doubleBeds = Integer.parseInt(request.getParameter("doubleBeds"));
        double pricePerDay = Double.parseDouble(request.getParameter("pricePerDay"));
        String description = request.getParameter("description");
        String type = request.getParameter("type");
        boolean isAvailable = Boolean.parseBoolean(request.getParameter("isAvailable"));
        String imgUrl = request.getParameter("imageUrl");
        RoomDAO dao = new RoomDAO();
        Room room = new Room(roomId, roomNumber, doubleBeds, singleBeds, pricePerDay, type, description, imgUrl, isAvailable);
        if (dao.updateRoom(room)) {
            response.sendRedirect("admin?success=true");
        } else {
            response.sendRedirect("admin?success=false");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateRoomController.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("error.jsp");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateRoomController.class.getName()).log(Level.SEVERE, null, ex);
            response.sendRedirect("error.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
