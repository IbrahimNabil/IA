/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.tablebean;
import model.tabledao;

/**
 *
 * @author karim
 */
public class servlet extends HttpServlet {

    private static String INSERT = "/table.jsp";
    private static String UserRecord = "/schedule.jsp";
    private tabledao dao;

    public servlet() {
       super();
       dao=new tabledao();
    }
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String redirect = "";
        String uId = request.getParameter("day");
        String action = request.getParameter("action");
        if (!((uId) == null) && action.equalsIgnoreCase("insert")) {
            //int id = Integer.parseInt(uId);
            tablebean user = new tablebean();
            user.setDay(uId);
            user.setFirst(request.getParameter("first"));
            user.setSecond(request.getParameter("second"));
            user.setThird(request.getParameter("third"));
            //String Age =String.valueOf(request.getParameter("age"));
            user.setFourth(request.getParameter("fourth"));
            user.setFifth(request.getParameter("fifth"));
            dao.addRecord(user);
            redirect = UserRecord;
            request.setAttribute("user",dao.getAll());
            System.out.println("Record Added Successfully");
        } else if (action.equalsIgnoreCase("list")) {
            redirect = UserRecord;
            request.setAttribute("users", dao.getAll());
       
        } else {
            redirect = INSERT;
        }

        RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
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
    }}

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   