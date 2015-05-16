/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.PopupMenu;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LuisIván
 */
public class Zoologico extends ArrayList{
        ArrayList<Animal> Animales = new ArrayList <Animal>();
        
    public Zoologico() {
    }
     
    public DefaultTableModel mostrar(String buscar){
    DefaultTableModel modelo;
    String [] titulos = {"ID","Nombre","Continente","Peso","Edad"};
        modelo = new DefaultTableModel(titulos,0);
    
        try {
            
            
            Animales.add(new Animal(1,"Elefante", "Asia",506.82,6));
                for (int i = 0; i < Animales.size(); i++){
                    int id = Animales.get(i).getId();
                    String name = Animales.get(i).getNombre();
                    String pais = Animales.get(i).getPaisOrigen();
                    double peso = Animales.get(i).getPeso();
                    int edad = Animales.get(i).getEdad();
                Object[] data = {id,name,pais,peso,edad};
                    modelo.addRow(data);
        } 
            
        
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la tabla");
            return modelo;
        }    
        return modelo;
    }
    
    public DefaultTableModel insertar(int ID,String name, String pais, double peso, int edad){
    DefaultTableModel modelo;
    String [] titulos = {"ID","Nombre","Continente","Peso","Edad"};
        modelo = new DefaultTableModel(titulos,0);
    
        try {
           
            int n = 0;
                Animales.add(new Animal(ID,name,pais,peso,edad));
                for (int i = 0; i < Animales.size(); i++){
                    int id = Animales.get(i).getId();
                    name = Animales.get(i).getNombre();
                    pais = Animales.get(i).getPaisOrigen();
                    peso = Animales.get(i).getPeso();
                    edad = Animales.get(i).getEdad();
                Object[] data = {id,name,pais,peso,edad};
                    modelo.addRow(data);
        } 
            
        
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la tabla");
            return modelo;
        }    
        return modelo;
    }
    
    public DefaultTableModel eliminar(){
    DefaultTableModel modelo;
    String [] titulos = {"ID","Nombre","Continente","Peso","Edad"};
        modelo = new DefaultTableModel(titulos,0);
    
        try {
            
            int num = JOptionPane.showConfirmDialog(null, "¿Clausurar?");
            if(num!=0){
                Animales.clear();
                modelo.removeRow(1);
            } else {
        }
            
            
        
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la tabla");
            return modelo;
        }    
        return modelo;
    }

    public boolean existe(String nombre) {
            for (Animal Animale : Animales) {
                if (nombre.equals(Animale.getNombre())) {
                    JOptionPane.showMessageDialog(null, "¡Si existe!");
                } else {
                    JOptionPane.showMessageDialog(null, "¡No existe!");
                }
            }
        return true;
    } 
    
    public int edadPromedio() { int edad=0; int count = 0;
        for (Animal Animale : Animales) {
                edad += edad;
                count +=1;
                int promedio;
        promedio = (edad/count);
            }
        return 0;
    }

    public int edadPrimero() {int numero = 0;
       Iterator it = Animales.iterator();
    	while (it.hasNext()){
    		System.out.print(it.next());
    	} System.out.println();
    return numero;
    }
    

    public double pesoUltimo() {  double peso = 0;
        Iterator it = Animales.iterator();
    	while (it.hasNext()){
    		System.out.print(it.next());
    	} System.out.println();
    return peso;
    }

    public void buscar(String pais) {
        for(int i = 0; i<Animales.size();i++){
        if(!"".equals(Animales.get(i).getPaisOrigen())){
        JOptionPane.showMessageDialog(null, "¡Si existe!: "+i+" Animales");
        }
        }
        }
  
    public void totalAnimales(){
            for (Animal Animale : Animales) {
            JOptionPane.showMessageDialog(null, "Existen: "+Animales.size());
            }
            
    }
}
  
