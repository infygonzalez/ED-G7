package Modelo;

import java.util.Date;
import java.util.Objects;

public class Alojamiento extends Evento{

	private String nombreh;
	private String ciudad;
	private Date fecEnt;
	private Date fecSal;
	private String tipoh;
	
	
	public Alojamiento() {
		
	}
	
	public Alojamiento(String id, String nombre, String tipo, int idviaje, double precio, String nombreh, String ciudad,
			Date fecEnt, Date fecSal, String tipoh) {
		super(id, nombre, tipo, idviaje, precio);
		this.nombreh = nombreh;
		this.ciudad = ciudad;
		this.fecEnt = fecEnt;
		this.fecSal = fecSal;
		this.tipoh = tipoh;
	}



	public String getNombreh() {
		return nombreh;
	}
	public void setNombreh(String nombreh) {
		this.nombreh = nombreh;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Date getFecEnt() {
		return fecEnt;
	}
	public void setFecEnt(Date fecEnt) {
		this.fecEnt = fecEnt;
	}
	public Date getFecSal() {
		return fecSal;
	}
	public void setFecSal(Date fecSal) {
		this.fecSal = fecSal;
	}
	public String getTipoh() {
		return tipoh;
	}
	public void setTipoh(String tipoh) {
		this.tipoh = tipoh;
	}
	
	@Override
	public String toString() {
		return "Alojamiento [nombreh=" + nombreh + ", ciudad=" + ciudad + ", fecEnt=" + fecEnt
				+ ", fecSal=" + fecSal + ", tipoh=" + tipoh + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(ciudad, fecEnt, fecSal, nombreh, tipoh);
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
		Alojamiento other = (Alojamiento) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(fecEnt, other.fecEnt)
				&& Objects.equals(fecSal, other.fecSal) && Objects.equals(nombreh, other.nombreh)
				&& Objects.equals(tipoh, other.tipoh);
	}
	
	
	
	
}
