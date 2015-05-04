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
    private int User_ID;
    private String User_Name;
    private int Group_ID;

    public vAlumnos(int User_ID, String User_Name, int Group_ID) {
        this.User_ID = User_ID;
        this.User_Name = User_Name;
        this.Group_ID = Group_ID;
    }

    public vAlumnos() {
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int User_ID) {
        this.User_ID = User_ID;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public int getGroup_ID() {
        return Group_ID;
    }

    public void setGroup_ID(int Group_ID) {
        this.Group_ID = Group_ID;
    }
    
    
}
