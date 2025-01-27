package Modelo;

import java.util.Objects;

public class Evento {
	private String id;
	private String nombre;
	private String tipo;
	private Viaje viaje;
	
	
	public Evento() {
		
	}

	public Evento(String id, String nombre, String tipo, Viaje viaje) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.viaje = viaje;
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
	
	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", Viaje=" + viaje + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, tipo, viaje);
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
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre) && Objects.equals(tipo, other.tipo)
				&& Objects.equals(viaje, other.viaje);
	}


	
	
	
}
