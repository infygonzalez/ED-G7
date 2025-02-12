package Modelo;

import java.util.Objects;

public class Aerolinea {

	private String codigoAerolinea;
	private String descripcionAerolinea;
	
	public Aerolinea() {
		codigoAerolinea="";
		descripcionAerolinea="";
		
	}
	
	public Aerolinea(String codigoAerolinea, String descripcionAerolinea) {
		this.codigoAerolinea = codigoAerolinea;
		this.descripcionAerolinea= descripcionAerolinea;
	}

	public String getCodigoAerolinea() {
		return codigoAerolinea;
	}

	public void setCodigoAerolinea(String codigoAerolinea) {
		this.codigoAerolinea = codigoAerolinea;
	}

	public String getDescripcionAerolinea() {
		return descripcionAerolinea;
	}

	public void setDescripcionAerolinea(String descripcionAerolinea) {
		this.descripcionAerolinea = descripcionAerolinea;
	}


	
	@Override
	public String toString() {
		return "Aerolinea [codigoAerolinea=" + codigoAerolinea + ", descripcionAerolinea=" + descripcionAerolinea
		+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoAerolinea, descripcionAerolinea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aerolinea other = (Aerolinea) obj;
		return Objects.equals(codigoAerolinea, other.codigoAerolinea)
				&& Objects.equals(descripcionAerolinea, other.descripcionAerolinea);
	}
	

}