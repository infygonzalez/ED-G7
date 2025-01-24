package Modelo;

import java.util.ArrayList;

public class Pais {
	private String codPais;
	private String nombre;
	private ArrayList<Viajes> viaje;
	
	public Pais(String codPais, String nombre, ArrayList<Viajes> viaje) {
		
		this.codPais = codPais;
		this.nombre = nombre;
		this.viaje = viaje;
	}
	
}
