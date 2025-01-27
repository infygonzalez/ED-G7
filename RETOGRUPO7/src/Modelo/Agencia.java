package Modelo;

import java.util.ArrayList;
import java.util.Objects;

public class Agencia {
	private String id;
	private String nombre;
	private String logo;
	private String color;
	private int empleados;
	private String tipoAgencia;
	private ArrayList<Viaje> viaje;

	public Agencia() {
		
	}
	
	public Agencia(String id, String nombre, String logo, String color, int empleados, String tipoAgencia,
			ArrayList<Viaje> viaje) {
		this.id = id;
		this.nombre = nombre;
		this.logo = logo;
		this.color = color;
		this.empleados = empleados;
		this.tipoAgencia = tipoAgencia;
		this.viaje = viaje;
	}



	public ArrayList<Viaje> getViaje() {
		return viaje;
	}

	public void setViaje(ArrayList<Viaje> viaje) {
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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEmpleados() {
		return empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}

	public String getTipoAgencia() {
		return tipoAgencia;
	}

	public void setTipoAgencia(String tipoAgencia) {
		this.tipoAgencia = tipoAgencia;
	}

	@Override
	public String toString() {
		return "Agencia [id=" + id + ", nombre=" + nombre + ", logo=" + logo + ", color=" + color + ", empleados="
				+ empleados + ", tipoAgencia=" + tipoAgencia + ", viaje=" + viaje + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, empleados, id, logo, nombre, tipoAgencia, viaje);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agencia other = (Agencia) obj;
		return Objects.equals(color, other.color) && empleados == other.empleados && Objects.equals(id, other.id)
				&& Objects.equals(logo, other.logo) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(tipoAgencia, other.tipoAgencia) && Objects.equals(viaje, other.viaje);
	}


	
}