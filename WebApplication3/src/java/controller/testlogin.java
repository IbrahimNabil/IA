/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.userprovider;
import model.userbean;

/**
 *
 * @author karim
 */
public class testlogin extends HttpServlet {
    private Object conn;

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

        try {
            HttpSession session = request.getSession();
            PrintWriter out = response.getWriter();
            String userid  = request.getParameter("user");
            String pwd = request.getParameter("pass");
            Connection cdd = userprovider.getconn();
            Statement st = cdd.createStatement();
            ResultSet rs;
            ResultSet p;
            userbean user = new userbean();
            rs = st.executeQuery("select * from new where user='" + userid + "' and pass='" + pwd + "'");
           
            if (rs.next()) {
                userbean userBean = new userbean();
                userBean.setLevel(rs.getString(10));              
                 if ("KG1".equals(userBean.getLevel()))
                 {
                     RequestDispatcher rt = request.getRequestDispatcher("index1.html");
                 rt.forward(request, response);
                 }
                 else 
                  {
                      System.out.println(userBean.getLevel());
                     RequestDispatcher rt = request.getRequestDispatcher("index2.html");
                 rt.forward(request, response);
                 }   
                //out.println("welcome " + userid);
                //out.println("<a href='logout.jsp'>Log out</a>");
                //  response.sendRedirect("success.jsp");
            } else {
                // session.setAttribute("userid", userid);
                RequestDispatcher rt = request.getRequestDispatcher("index.html");
                rt.forward(request, response);
                //  out.println("Invalid password <a href='logout.jsp'>try again</a>");
            }
        } 
        catch (SQLException sq) {

        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(testlogin.class.getName()).log(Level.SEVERE, null, ex);
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
