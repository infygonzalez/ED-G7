package Modelo;

import java.util.Objects;

public class Evento {
	
	private String id;
	private String nombre;
	private String tipo;
	private double precio;
	private int idviaje;
	
	
	public Evento() {
		
	}

	public Evento(String id, String nombre, String tipo, int idViaje, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.idviaje = idViaje;
		this.precio = precio;
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
		return "Evento [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", viaje=" + idviaje
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, precio, tipo, idviaje);
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
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(tipo, other.tipo) && Objects.equals(idviaje, other.idviaje);
	}


	
	
	
}
