/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author LuisIván
 */
public class Animal {
        private int id;
	private String nombre;
	private String paisOrigen;
	private double peso;
	private int edad;
	
	/**
	 * Constructor de la clase inicializa los valores en vacio o cero
	 */
	public Animal( ) {
                id = 0;
		nombre = "";
		paisOrigen = "";
		peso = 0.0;
		edad = 0;
	}

    public Animal(int id, String nombre, String paisOrigen, double peso, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.peso = peso;
        this.edad = edad;
    }
	
	/**
	 * Constructor de la clase inicializa los valores según los parámetros dados
	 *
	 * @param nombre valor <code>String</code>
	 * @param paisOrigen valor <code>String</code>
	 * @param peso valor <code>double</code>
	 * @param edad valor <code>int</code>
	 */
	

	
	/**
	 * Metodo modificador establece el nombre
	 *
	 * @param nombre variable <code>String</code>
	 */
	public void setNombre(String nombre) {
	
		this.nombre = nombre;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
	
        
        
	/**
	 * Metodo modificador establece el pais de origen
	 *
	 * @param paisOrigen variable <code>String</code>
	 */
	public void setPaisOrigen(String paisOrigen) {
	
		this.paisOrigen = paisOrigen;
	}

	/**
	 * Metodo modificador establece el peso
	 *
	 * @param peso variable <code>double</code>
	 */
	public void setPeso(double peso) {
	
		this.peso = peso;
	}

	/**
	 * Metodo modificador establece la edad
	 *
	 * @param edad variable <code>int</code>
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Metodo de acceso para nombre
	 *
	 * @return el nombre del animal
	 */	
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo de acceso para pais de origen
	 *
	 * @return el pais de origen del animal
	 */	
	public String getPaisOrigen() {
	
		return paisOrigen;
	}
	
	/**
	 * Metodo de acceso para peso
	 *
	 * @return el peso del animal
	 */	
	public double getPeso() {

		return peso;
	}
	
	/**
	 * Metodo de acceso para edad
	 *
	 * @return la edad del animal
	 */	
	public int getEdad() {
	
		return edad;
	}
	
	/**
	 * Sobreescribe al método toString de java.lang.Object
	 *
	 * @return una cadena compuesta de: nombre pais edad peso separados por espacio
	 */
        @Override
	public String toString() {
		return getNombre() + " " + getPaisOrigen() + " " + getEdad() + " " + getPeso();
	}
	
	/**
	 * Sobreescribe al método equals de java.lang.Object
	 *
	 * @return la igualdad de objetos de tipo Animal basado en el nombre
	 *        true si los nombres son iguales, false en caso contrario
	 */
        @Override
	public boolean equals(Object object) {
		if (object instanceof Animal) {
			return (((Animal)object).getNombre().equals(getNombre()))? true : false;
		} else {
			return false;
		}
	}
}