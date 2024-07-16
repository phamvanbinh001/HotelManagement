/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.booking.Booking;
import sample.booking.BookingDAO;
import sample.room.Room;
import sample.room.RoomDAO;
import sample.user.User;
import sample.user.UserDAO;

/**
 *
 * @author traut
 */
@WebServlet(name = "ViewBookingDetailsController", urlPatterns = {"/bookingDetails"})
public class BookingDetailsController extends HttpServlet {

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
        BookingDAO bDao = new BookingDAO();
        RoomDAO rDao = new RoomDAO();
        UserDAO uDao = new UserDAO();
        try {
            int bookingId = Integer.parseInt(request.getParameter("id"));
            bDao.updateBookingPrice(bookingId);
            Booking booking = bDao.getBookingById(bookingId);
            Room room = rDao.getRoomById(booking.getRoomId());
            User user = uDao.getUserById((int)request.getSession().getAttribute("userIdLogin"));
            request.setAttribute("booking", booking);
            request.setAttribute("target", "update");
            request.setAttribute("room", room);
            request.setAttribute("userLogin", user);
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
        BookingDAO bDao = new BookingDAO();
        RoomDAO rDao = new RoomDAO();
        UserDAO uDao = new UserDAO();
        try {
            int bookingId = Integer.parseInt(request.getParameter("id"));
            String checkinDate = request.getParameter("checkinDate");
            String checkoutDate = request.getParameter("checkoutDate");
            String message = request.getParameter("message");
            if (bDao.updateBooking(checkinDate, checkoutDate, message, bookingId)) {
                bDao.updateBookingPrice(bookingId);
                request.setAttribute("update", "true");
            } else {
                request.setAttribute("update", "false");
            }
            Booking booking = bDao.getBookingById(bookingId);
            Room room = rDao.getRoomById(booking.getRoomId());
            User user = uDao.getUserById((int)request.getSession().getAttribute("userIdLogin"));
            request.setAttribute("booking", booking);
            request.setAttribute("target", "update");
            request.setAttribute("room", room);
            request.setAttribute("userLogin", user);
            request.getRequestDispatcher("bookingDetails.jsp").forward(request, response);
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
