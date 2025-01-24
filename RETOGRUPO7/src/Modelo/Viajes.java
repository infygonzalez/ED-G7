package Modelo;

import java.util.ArrayList;

public class Viajes {
	private String id;
	private String nombre;
	private String tipo;
	private String FechaInc;
	private String FechaFin;
	private	int duracion;
	private String Pdestino;
	private String descrip;
	private String DescServis;
	private Pais pais;
	private Agencia agencia;
	private ArrayList<Evento> evento;
	
	public Viajes() {
		
	}
	public Viajes(String id, String nombre, String tipo, String FechaInc, String FechaFin, int duracion,
			String Pdestino, String descrip, String DescServis, Pais pais, Agencia agencia, ArrayList<Evento> evento) {
		
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.FechaInc = FechaInc;
		this.FechaFin = FechaFin;
		this.duracion = duracion;
		this.Pdestino = Pdestino;
		this.descrip = descrip;
		this.DescServis = DescServis;
		this.pais = pais;
		this.agencia = agencia;
		this.evento = evento;
	}
	
	
}
