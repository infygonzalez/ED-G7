package Modelo;

import java.util.Date;

public class Alojamiento extends Evento{
	
	private String hotel;
	private String ciudad;
	private double precio;
	private Date FecEnt;
	private Date FecSal;
	private String tipoh;
	
		Alojamiento(String id, String nombre, String tipo, Viajes viaje, String hotel, String ciudad, double precio, Date FecEnt, Date FecSal, String tipoh){
			super(id, nombre, tipo, viaje);
			this.hotel = hotel;
			this.ciudad = ciudad;
			this.precio = precio;
			this.FecEnt = FecEnt;
			this.FecSal = FecSal;
			this.tipoh = tipoh;
		}
}
