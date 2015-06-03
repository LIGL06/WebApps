/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.vAlumnos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
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
    String [] titulos = {"Matricula","Nombre","Telefono","Correo","Nivel","Semestre"};
    String [] registro = new String [6];
    totalregistros=0;
    modelo = new DefaultTableModel(null, titulos);
    
    sSQL = "Select * from users where User_ID like '%"+ buscar+"%' order by User_ID ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
            registro [0] = rs.getString("User_ID");
            registro [1] = rs.getString("User_Name");
            registro [2] = rs.getString("User_phone");
            registro [3] = rs.getString("User_email");
            registro [4] = rs.getString("User_grade");
            registro [5] = rs.getString("User_sem");
            
            totalregistros = totalregistros+1;
            modelo.addRow(registro);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
            return modelo;
        }    
    }
    public boolean insertar(vAlumnos dts){
            sSQL = "insert into users(User_ID,User_Name,User_phone,User_email,User_grade,User_sem)"+ "values (?,?,?,?,?,?)";
            try {
                PreparedStatement pst = cn.prepareStatement(sSQL);
                pst.setString(1,dts.getUser_ID());
                pst.setString(2,dts.getUser_Name());
                pst.setString(3,dts.getUser_phone());
                pst.setString(4,dts.getUser_email());
                pst.setString(5,dts.getUser_grade());
                pst.setString(6,dts.getUser_sem());
                
                int n = pst.executeUpdate();
                
                if(n!=0){
                return true;
                }
                else {
                return false;
                }
                
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        }
        public boolean editar(vAlumnos dts){
            sSQL = "update users set User_ID=?,User_Name=?,User_phone=?,User_email=?,User_grade=?,User_sem=?"+ " where User_ID = ?";   
            try {
                PreparedStatement pst = cn.prepareStatement(sSQL);
                pst.setString(1,dts.getUser_ID());
                pst.setString(2,dts.getUser_Name());
                pst.setString(3,dts.getUser_phone());
                pst.setString(4,dts.getUser_email());
                pst.setString(5,dts.getUser_grade());
                pst.setString(6,dts.getUser_sem());
                
                int n = pst.executeUpdate();
                
                if(n!=0){
                return true;
                }
                else {
                return false;
                }
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        }
    
        public boolean eliminar(vAlumnos dts){
            sSQL = "delete users set where User_ID = ?";
            
            try {
                PreparedStatement pst = cn.prepareStatement(sSQL);
                pst.setString(1,dts.getUser_ID());                
                int n = pst.executeUpdate();
                
                if(n!=0){
                return true;
                }
                else {
                return false;
                }
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                return false;
            }
        }
}