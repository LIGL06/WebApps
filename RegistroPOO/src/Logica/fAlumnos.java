/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LuisIván
 */
public class fAlumnos {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.connectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public DefaultTableModel mostrar(String buscar){
    DefaultTableModel modelo;
    String [] titulos = {"USER_ID","User_Name","Group_ID"};
    
    
    }
    
}