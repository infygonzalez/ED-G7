package Modelo;

import java.util.Date;
import java.util.Objects;

public class Vuelo extends Evento {
	private String codV;
	private double precio;
	private Date fecSal;
	private String hora;
	private String duracion;
	private String aerodestino;
	private String aeroorigen;
	private String coddep;
	
	public Vuelo() {
		
	}


	public Vuelo(String id, String nombre, String tipo, Viaje viaje, String codV, double precio, Date fecSal,
			String hora, String duracion, String aerodestino, String aeroorigen, String coddep) {
		super(id, nombre, tipo, viaje);
		this.codV = codV;
		this.precio = precio;
		this.fecSal = fecSal;
		this.hora = hora;
		this.duracion = duracion;
		this.aerodestino = aerodestino;
		this.aeroorigen = aeroorigen;
		this.coddep = coddep;
	}


	public String getCoddep() {
		return coddep;
	}


	public void setCoddep(String coddep) {
		this.coddep = coddep;
	}


	public String getAerodestino() {
		return aerodestino;
	}


	public void setAerodestino(String aerodestino) {
		this.aerodestino = aerodestino;
	}


	public String getAeroorigen() {
		return aeroorigen;
	}


	public void setAeroorigen(String aeroorigen) {
		this.aeroorigen = aeroorigen;
	}


	public String getCodV() {
		return codV;
	}

	public void setCodV(String codV) {
		this.codV = codV;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFecSal() {
		return fecSal;
	}

	public void setFecSal(Date fecSal) {
		this.fecSal = fecSal;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		return "Vuelo [codV=" + codV + ", precio=" + precio + ", fecSal=" + fecSal + ", hora=" + hora + ", duracion="
				+ duracion + ", aerodestino=" + aerodestino + ", aeroorigen=" + aeroorigen + ", coddep=" + coddep + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(aerodestino, aeroorigen, codV, coddep, duracion, fecSal, hora, precio);
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
		Vuelo other = (Vuelo) obj;
		return Objects.equals(aerodestino, other.aerodestino) && Objects.equals(aeroorigen, other.aeroorigen)
				&& Objects.equals(codV, other.codV) && Objects.equals(coddep, other.coddep)
				&& Objects.equals(duracion, other.duracion) && Objects.equals(fecSal, other.fecSal)
				&& Objects.equals(hora, other.hora)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}



	
	
}
