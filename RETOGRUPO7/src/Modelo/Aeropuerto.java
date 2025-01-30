package Modelo;

import java.util.ArrayList;
import java.util.Objects;

public class Aeropuerto {
	private String codigoaero;
	private String nombre;
	
	public Aeropuerto() {
		
	}

	public Aeropuerto(String codigoaero, String nombre) {
		this.codigoaero = codigoaero;
		this.nombre = nombre;
	}

	public String getCodigoaero() {
		return codigoaero;
	}

	public void setCodigoaero(String codigoaero) {
		this.codigoaero = codigoaero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Aeropuerto [codigoaero=" + codigoaero + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoaero, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aeropuerto other = (Aeropuerto) obj;
		return Objects.equals(codigoaero, other.codigoaero) && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
