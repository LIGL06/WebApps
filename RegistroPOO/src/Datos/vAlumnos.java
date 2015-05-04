/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author LuisIván
 */
public class vAlumnos {
    private String User_ID;
    private String User_Name;
    private String User_phone;
    private String User_email;
    private String User_grade;
    private String User_sem;
    
    public vAlumnos() {
    }

    public vAlumnos(String User_ID, String User_Name, String User_phone, String User_email, String User_grade, String User_sem) {
        this.User_ID = User_ID;
        this.User_Name = User_Name;
        this.User_phone = User_phone;
        this.User_email = User_email;
        this.User_grade = User_grade;
        this.User_sem = User_sem;
    }
     public String getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(String User_ID) {
        this.User_ID = User_ID;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public String getUser_phone() {
        return User_phone;
    }

    public void setUser_phone(String User_phone) {
        this.User_phone = User_phone;
    }

    public String getUser_email() {
        return User_email;
    }

    public void setUser_email(String User_email) {
        this.User_email = User_email;
    }

    public String getUser_grade() {
        return User_grade;
    }

    public void setUser_grade(String User_grade) {
        this.User_grade = User_grade;
    }

    public String getUser_sem() {
        return User_sem;
    }

    public void setUser_sem(String User_sem) {
        this.User_sem = User_sem;
    }
 
}