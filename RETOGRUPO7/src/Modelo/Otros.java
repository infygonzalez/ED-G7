package Modelo;

import java.util.Date;
import java.util.Objects;

public class Otros extends Evento{
	
	private String nombreotros;
	private Date fecha;
	private double precio;
	private String descripcion;
	
	public Otros() {
		
	}

	public Otros(String id, String nombre, String tipo, Viaje viaje, String nombreotros, Date fecha, double precio,
			String descripcion) {
		super(id, nombre, tipo, viaje);
		this.nombreotros = nombreotros;
		this.fecha = fecha;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String getNombreotros() {
		return nombreotros;
	}

	public void setNombreotros(String nombreotros) {
		this.nombreotros = nombreotros;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Otros [nombreotros=" + nombreotros + ", fecha=" + fecha + ", precio=" + precio + ", descripcion="
				+ descripcion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(descripcion, fecha, nombreotros, precio);
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
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(nombreotros, other.nombreotros)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	
	
}
