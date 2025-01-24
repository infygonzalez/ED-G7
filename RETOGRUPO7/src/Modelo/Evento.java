package Modelo;

public class Evento {
	private String id;
	private String nombre;
	private String tipo;
	private Viajes viaje;
	
	
	public Evento(String id, String nombre, String tipo, Viajes viaje) {
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
	
	@Override
	public String toString() {
		return "Evento [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
	
	
}
