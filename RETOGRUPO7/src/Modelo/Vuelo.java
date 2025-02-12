package Modelo;

import java.util.Date;
import java.util.Objects;

public class Vuelo extends Evento {
	private String codV;
	private Date fecSal;
	private String hora;
	private String duracion;
	private Aeropuerto aerodestino;
	private Aeropuerto aeroorigen;
	private Vuelo vueloida;
	private double precio;
	private Aerolinea aerolinea;
	private String codDep;
	
	public Vuelo() {
		
	}

	
	public Vuelo(String id, String nombre, String tipo, int idviaje, double precio, String codV, Date fecSal,
			String hora, String duracion, Aeropuerto aerodestino, Aeropuerto aeroorigen, Vuelo vueloida, Aerolinea aerolinea, String codDep) {
		super(id, nombre, tipo, idviaje);
		this.codV = codV;
		this.fecSal = fecSal;
		this.hora = hora;
		this.duracion = duracion;
		this.aerodestino = aerodestino;
		this.aeroorigen = aeroorigen;
		this.vueloida = vueloida;
		this.precio = precio;
		this.aerolinea = aerolinea;
		this.codDep = codDep;
	}

	
	public String getCodDep() {
		return codDep;
	}


	public void setCodDep(String codDep) {
		this.codDep = codDep;
	}


	public Aerolinea getAerolinea() {
		return aerolinea;
	}


	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}


	public Aeropuerto getAerodestino() {
		return aerodestino;
	}


	public void setAerodestino(Aeropuerto aerodestino) {
		this.aerodestino = aerodestino;
	}


	public Aeropuerto getAeroorigen() {
		return aeroorigen;
	}


	public void setAeroorigen(Aeropuerto aeroorigen) {
		this.aeroorigen = aeroorigen;
	}


	public Vuelo getVueloida() {
		return vueloida;
	}


	public void setVueloida(Vuelo vueloida) {
		this.vueloida = vueloida;
	}


	public String getCodV() {
		return codV;
	}

	public void setCodV(String codV) {
		this.codV = codV;
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


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Vuelo [codV=" + codV + ", fecSal=" + fecSal + ", hora=" + hora + ", duracion=" + duracion
				+ ", aerodestino=" + aerodestino + ", aeroorigen=" + aeroorigen + ", vueloida=" + vueloida + ", precio="
				+ precio + ", aerolinea=" + aerolinea + ", codDep=" + codDep + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(aerodestino, aerolinea, aeroorigen, codDep, codV, duracion, fecSal, hora,
				precio, vueloida);
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
		return Objects.equals(aerodestino, other.aerodestino) && Objects.equals(aerolinea, other.aerolinea)
				&& Objects.equals(aeroorigen, other.aeroorigen) && Objects.equals(codDep, other.codDep)
				&& Objects.equals(codV, other.codV) && Objects.equals(duracion, other.duracion)
				&& Objects.equals(fecSal, other.fecSal) && Objects.equals(hora, other.hora)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(vueloida, other.vueloida);
	}


	
	
	




	


	
	
}
