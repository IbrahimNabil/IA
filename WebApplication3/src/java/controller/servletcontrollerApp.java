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
import model.userbean;
import model.userdao;

/**
 *
 * @author karim
 */
public class servletcontrollerApp extends HttpServlet {

    private static String INSERT = "/registration.html";
    private static String Edit = "/edit.jsp";
    private static String UserRecord = "/listUser.jsp";
    private static String User = "/index.html";
   // private static String login="/login.html";
    private userdao dao;

    public servletcontrollerApp() {
       super();
       dao=new userdao();
    }
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String redirect = "";
        String uId = request.getParameter("user");
        String action = request.getParameter("action");
        if (!((uId) == null) && action.equalsIgnoreCase("insert")) {
            //int id = Integer.parseInt(uId);
            userbean user = new userbean();
            user.setUser(uId);
            user.setChild(request.getParameter("child"));
            user.setFirst(request.getParameter("first"));
            user.setLast(request.getParameter("last"));
            //String Age =String.valueOf(request.getParameter("age"));
            int Age = Integer.parseInt(request.getParameter("age"));
            user.setAge(Age);
            user.setMobile(request.getParameter("mobile"));
            user.setAddress(request.getParameter("address"));
            user.setPass(request.getParameter("pass"));
            user.setLevel(request.getParameter("level"));
            user.setSkills(request.getParameter("skills"));
            user.setDiseases(request.getParameter("diseases"));
            dao.addUser(user);
            redirect = User;
            
          //  request.setAttribute("user",dao.getAllUsers());
            System.out.println("Record Added Successfully");
        } else if (action.equalsIgnoreCase("delete")) {
            String userId = request.getParameter("user");
            //int uid = Integer.parseInt(userId);
            dao.removeUser(userId);
            redirect = UserRecord;
           request.setAttribute("users", dao.getAllUsers());
            System.out.println("Record Deleted Successfully");
        } else if (action.equalsIgnoreCase("editform")) {
            redirect = Edit;
        } else if (action.equalsIgnoreCase("edit")) {
            String userId = request.getParameter("user");
            //int uid = Integer.parseInt(userId);
            userbean user = new userbean();
            user.setUser(userId);
            user.setChild(request.getParameter("child"));
            user.setFirst(request.getParameter("first"));
            user.setLast(request.getParameter("last"));
            int Age = Integer.parseInt(request.getParameter("age"));
            user.setAge(Age);
            user.setMobile(request.getParameter("mobile"));
            user.setPass(request.getParameter("pass"));
            user.setLevel(request.getParameter("level"));
            user.setSkills(request.getParameter("skills"));
            user.setDiseases(request.getParameter("diseases"));
            dao.editUser(user);
            request.setAttribute("user", user);
            redirect = UserRecord;
            System.out.println("Record updated Successfully");
        } else if (action.equalsIgnoreCase("listUser")) {
            redirect = UserRecord;
            request.setAttribute("users", dao.getAllUsers());
       
        /*}else if (action.equalsIgnoreCase("login"))
        {
            String userId = request.getParameter("user");
            String P = request.getParameter("passs");
            redirect = UserRecord;
            request.setAttribute("users", dao.login(userId,P));
            */
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
   