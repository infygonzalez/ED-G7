package Modelo;

import java.util.Objects;

public class Evento {
	
	private String id;
	private String nombre;
	private String tipo;
	private int idviaje;
	private double precio;
	
	
	public Evento() {
		
	}

	public Evento(String id, String nombre, String tipo, int idViaje, double precios) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.idviaje = idViaje;
		this.precio = precio;
	}


	public int getIdviaje() {
		return idviaje;
	}

	public void setIdviaje(int idviaje) {
		this.idviaje = idviaje;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getViaje() {
		return idviaje;
	}

	public void setViaje(int viaje) {
		this.idviaje = viaje;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Evento [id=").append(id).append(", nombre=").append(nombre).append(", tipo=").append(tipo)
				.append(", idviaje=").append(idviaje).append(", precio=").append(precio).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idviaje, nombre, precio, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(id, other.id) && idviaje == other.idviaje && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(tipo, other.tipo);
	}

	

	
	
	
}
