package Modelo;

import java.util.Date;
import java.util.Objects;

public class Otros extends Evento{
	
	private Date fecha;
	private String descripcion;
	
	public Otros() {
		
	}

	

	public Otros(String id, String nombre, String tipo, Viaje viaje, double precio, Date fecha,
			String descripcion) {
		super(id, nombre, tipo, viaje, precio);
		this.fecha = fecha;
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Otros [fecha=" + fecha + ", descripcion=" + descripcion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(descripcion, fecha);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Otros other = (Otros) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(fecha, other.fecha);
	}
	
	
	
}
