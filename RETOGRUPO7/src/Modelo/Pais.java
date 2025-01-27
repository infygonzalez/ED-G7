package Modelo;

import java.util.ArrayList;
import java.util.Objects;

public class Pais {

	private String codPais;
	private String nombre;
	private ArrayList<Viaje> viaje;
	
	
	public Pais () {
		
	}
	
	public Pais(String codPais, String nombre, ArrayList<Viaje> viaje) {
		this.codPais = codPais;
		this.nombre = nombre;
		this.viaje = viaje;
	}
	
	public String getCodPais() {
		return codPais;
	}
	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Viaje> getViaje() {
		return viaje;
	}
	public void setViaje(ArrayList<Viaje> viaje) {
		this.viaje = viaje;
	}

	@Override
	public String toString() {
		return "Pais [codPais=" + codPais + ", nombre=" + nombre + ", viaje=" + viaje + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPais, nombre, viaje);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(codPais, other.codPais) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(viaje, other.viaje);
	}
	
	
	
}
