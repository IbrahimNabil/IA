/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author karim
 */
public class userprovider {
      public static Connection getconn() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cc = null;
        try {
            cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/baby1", "root", "root");

        } catch (SQLException ex) {
          ex.getMessage();
            // Logger.getLogger(conneodb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cc;
    }
}