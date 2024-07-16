/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sample.booking.BookingDAO;
import sample.payment.PaymentDAO;
import sample.room.Room;
import sample.room.RoomDAO;
import sample.user.User;
import sample.user.UserDAO;

/**
 *
 * @author traut
 */
@WebServlet(name = "PaymentController", urlPatterns = {"/payment"})
public class PaymentController extends HttpServlet {

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
        HttpSession session = request.getSession();
        UserDAO uDao = new UserDAO();
        RoomDAO rDao = new RoomDAO();
        BookingDAO bDao = new BookingDAO();

        try {
            int userId = (int) session.getAttribute("userIdLogin");
            int bookingId = Integer.parseInt(request.getParameter("bookingId"));
            User user = uDao.getUserById(userId);

            request.setAttribute("userLogin", user);

            String checkinDate = request.getParameter("checkinDate");
            String checkoutDate = request.getParameter("checkoutDate");

            double totalPrice = 0;
            String message = request.getParameter("message");
            request.setAttribute("booking", bDao.getBookingById(bookingId));
            request.getRequestDispatcher("payment.jsp").forward(request, response);
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
        PaymentDAO pDao = new PaymentDAO();
        BookingDAO bDAO = new BookingDAO();

        try {
            int userId = (int) session.getAttribute("userIdLogin");
            int bookingId = Integer.parseInt(request.getParameter("bookingId"));
            String paymentMethod = request.getParameter("paymentMethod");
            double amount = Double.parseDouble(request.getParameter("amount"));
            if (pDao.pay(bookingId, amount, paymentMethod)) {
                response.sendRedirect("viewBooking?pay=true");
                bDAO.completeBooking(bookingId);
            } else {
                response.sendRedirect("viewBooking?pay=false");
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
