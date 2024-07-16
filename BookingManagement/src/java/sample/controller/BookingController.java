/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sample.booking.BookingDAO;
import sample.room.Room;
import sample.room.RoomDAO;
import sample.user.User;
import sample.user.UserDAO;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "BookingController", urlPatterns = {"/booking"})
public class BookingController extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        doGet
        HttpSession session = request.getSession();
        UserDAO uDao = new UserDAO();
        RoomDAO rDao = new RoomDAO();
        
        if (session.getAttribute("userIdLogin") == null) {
            response.sendRedirect("home?login=yes");
            return;
        }

        try {
            int userId = (int) session.getAttribute("userIdLogin");
            int roomId = Integer.parseInt(request.getParameter("roomId"));
            User user = uDao.getUserById(userId);
            Room room = rDao.getRoomById(roomId);
            request.setAttribute("userLogin", user);
            request.setAttribute("room", room);
            request.getRequestDispatcher("bookingDetails.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
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
        processRequest(request, response);
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
        HttpSession session = request.getSession();
        UserDAO uDao = new UserDAO();
        RoomDAO rDao = new RoomDAO();
        BookingDAO bDao = new BookingDAO();

        try {
            int userId = (int) session.getAttribute("userIdLogin");
            int roomId = Integer.parseInt(request.getParameter("roomId"));
            User user = uDao.getUserById(userId);
            Room room = rDao.getRoomById(roomId);

            request.setAttribute("userLogin", user);
            request.setAttribute("room", room);

            String checkinDate = request.getParameter("checkinDate");
            String checkoutDate = request.getParameter("checkoutDate");
            
            
            double totalPrice = 0;
            String message = request.getParameter("message");
            if (bDao.booking(userId, roomId, checkinDate, checkoutDate, totalPrice, message, "pending")) { 
                request.setAttribute("booking", bDao.getTopBooking(userId));
                bDao.updateBookingPrice(bDao.getTopBooking(userId).getBookingId());
                request.getRequestDispatcher("payment.jsp").forward(request, response);
            } else {
                response.sendRedirect("error.jsp");
            }            
        } catch (Exception e) {
            e.printStackTrace();
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
