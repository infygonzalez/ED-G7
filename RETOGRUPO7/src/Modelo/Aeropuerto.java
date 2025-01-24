package Modelo;

import java.util.ArrayList;

public class Aeropuerto {
	private String codigo;
	private String nombre;
	private ArrayList<Vuelo> vuelo;
	
	public Aeropuerto(String codigo, String nombre, ArrayList<Vuelo> vuelo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.vuelo = vuelo;
	}
	
}
