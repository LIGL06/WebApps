/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisIván
 */
public class Conexion {
    public String db = "registrodae";
    public String url= "jdbc:mysql://127.0.0.1" + db;
    public String user = "root";
    public String pass = "";

    public Conexion() {
    }

    public Connection connectar() {
        Connection link = null;
        try {
            Class.forName("org.gtj.mm.mysql.Driver");
            link = (Connection) DriverManager.getConnection(this.url,this.user,this.pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    return link;
    }
    

    

}
