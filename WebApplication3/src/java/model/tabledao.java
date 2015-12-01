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
public class tabledao {

    private Connection conn;

    public tabledao() {
        try {
            conn = userprovider.getconn();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tabledao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addRecord(tablebean tableBean) {
        try {
            String sql = "INSERT INTO time(day,first,second,third,fourth,fifth) VALUES (? , ? , ? , ? , ? , ? )";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, tableBean.getDay());
            ps.setString(2, tableBean.getFirst());
            ps.setString(3, tableBean.getSecond());
            ps.setString(4, tableBean.getThird());
            ps.setString(5, tableBean.getFourth());
            ps.setString(6, tableBean.getFifth());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List getAll() {
        List users = new ArrayList();
        try {
            String sql = "SELECT * FROM time";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tablebean tableBean = new tablebean();
                tableBean.setDay(rs.getString(1));
                tableBean.setFirst(rs.getString(2));
                tableBean.setSecond(rs.getString(3));
                tableBean.setThird(rs.getString(4));
                tableBean.setFourth(rs.getString(5));
                tableBean.setFifth(rs.getString(6));
                
                users.add(tableBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
}

