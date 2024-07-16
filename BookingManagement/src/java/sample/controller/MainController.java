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

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "MainController", urlPatterns = {"/main"})
public class MainController extends HttpServlet {

    private final String HOME = "home";
    private final String LOGIN = "login";
    private final String REGISTER = "register";
    private final String UPDATE_PROFILE = "updateProfile";
    private final String ADMIN = "admin";
    private final String LOGOUT = "logout";
    private final String ADD_ROOM = "addRoom";
    private final String BOOKING = "booking";
    private final String CANCEL_BOOKING = "cancelBooking";
    private final String VIEW_ROOM_DETAILS = "viewRoomDetails";
    private final String PAYMENT = "payment";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            request.getRequestDispatcher(HOME).forward(request, response);
        } else {
            switch (action) {
                case "login":
                    request.getRequestDispatcher(LOGIN).forward(request, response);
                    break;
                case "register":
                    request.getRequestDispatcher(REGISTER).forward(request, response);
                    break;
                case "updateProfile":
                    request.getRequestDispatcher(UPDATE_PROFILE).forward(request, response);
                    break;
                case "admin":
                    request.getRequestDispatcher(ADMIN).forward(request, response);
                    break;
                case "logout":
                    request.getRequestDispatcher(LOGOUT).forward(request, response);
                    break;
                case "addRoom":
                    request.getRequestDispatcher(ADD_ROOM).forward(request, response);
                    break;
                case "booking":
                    request.getRequestDispatcher(BOOKING).forward(request, response);
                    break;
                case "cancelBooking":
                    request.getRequestDispatcher(CANCEL_BOOKING).forward(request, response);
                    break;
                case "viewRoomDetails":
                    request.getRequestDispatcher(VIEW_ROOM_DETAILS).forward(request, response);
                    break;
                case "payment":
                    request.getRequestDispatcher(PAYMENT).forward(request, response);
                    break;
                default:
                    request.getRequestDispatcher(HOME).forward(request, response);
                    break;
            }
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
        processRequest(request, response);
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
