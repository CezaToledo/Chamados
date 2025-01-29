/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author samuel.toledo
 */
public class Tables {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("create table chamado(chamado_pk int AUTO_INCREMENT primary key, título varchar(200), descrição varchar(500),requerente varchar(200))");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
