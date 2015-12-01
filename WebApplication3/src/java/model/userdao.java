/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karim
 */
public class userdao {

    private Connection conn;

    public userdao() {
        try {
            conn = userprovider.getconn();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userdao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addUser(userbean userBean) {
        try {
            String sql = "INSERT INTO new(child,first,last,age,mobile,user,pass,skills,diseases,level,address) VALUES (? , ? , ? , ? , ? , ? , ? , ? , ? , ? ,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, userBean.getChild());
            ps.setString(2, userBean.getFirst());
            ps.setString(3, userBean.getLast());
            ps.setInt(4, userBean.getAge());
            ps.setString(5,userBean.getMobile());
            ps.setString(6,userBean.getUser());
            ps.setString(7,userBean.getPass());
            ps.setString(8, userBean.getSkills());
            ps.setString(9, userBean.getDiseases());
            ps.setString(10,userBean.getLevel());
            ps.setString(11,userBean.getAddress());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUser(String user) {
        try {
            String sql = "DELETE FROM new WHERE user=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setString(6,user);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//lma nkoon b n3'iar el password
    public void editUser(userbean userBean) {
        try {
            String sql = "UPDATE new SET pass=?"
                    + " WHERE user=?";
            PreparedStatement ps = conn
                    .prepareStatement(sql);
            ps.setString(7, userBean.getPass());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    public List getAllUsers() {
        List users = new ArrayList();
        try {
            String sql = "SELECT * FROM new";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                userbean userBean = new userbean();
                userBean.setChild(rs.getString(1));
                userBean.setFirst(rs.getString(2));
                userBean.setLast(rs.getString(3));
                userBean.setAge(rs.getInt(4));
                userBean.setMobile(rs.getString(5));
                userBean.setUser(rs.getString(6));
                userBean.setPass(rs.getString(7));
                userBean.setSkills(rs.getString(8));
                userBean.setDiseases(rs.getString(9));
                userBean.setLevel(rs.getString(10));
                userBean.setAddress(rs.getString(11));
                
                users.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public userbean getUserById(String user) {
        userbean userBean = new userbean();
        try {
            String sql = "SELECT pass FROM new WHERE user=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setString(6, user);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
               // userBean.setChild(rs.getString(1));
               // userBean.setFirst(rs.getString(2));
                //userBean.setLast(rs.getString(3));
                //userBean.setAge(rs.getInt(4));
                //userBean.setMobile(rs.getString(5));
                //userBean.setUser(rs.getString(6));
                userBean.setPass(rs.getString(7));
                //userBean.setSkills(rs.getString(8));
                //userBean.setDiseases(rs.getString(9));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }
    /*
    public userbean login(String user,String PASS) {
        userbean userBean = new userbean();
        try {
            String sql = "SELECT pass FROM new WHERE user=?";
            PreparedStatement ps = conn.
                    prepareStatement(sql);
            ps.setString(6, user);
            ResultSet rs = ps.executeQuery();

                userBean.setPass(rs.getString(7));
            if (PASS==(rs.getString(7)))
            {
                System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            }
            else 
                System.out.println("ERROR ERROR ");
           
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userBean;
    }
*/
}

