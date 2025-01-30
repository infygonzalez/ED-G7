package Modelo;

import java.util.ArrayList;
import java.util.Objects;

public class Viaje {
	private String id;
	private String nombre;
	private String tipo;
	private String FechaInc;
	private String FechaFin;
	private	int duracion;
	private String descrip;
	private String DescServis;
	private Agencia agencia;
	private Pais pais;
	private ArrayList<Evento> eventos;
	
	public Viaje() {
		
	}
	
	public Viaje(String id, String nombre, String tipo, String fechaInc, String fechaFin, int duracion, 
			String descrip, String descServis, Agencia agencia, ArrayList<Evento> evento) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		FechaInc = fechaInc;
		FechaFin = fechaFin;
		this.duracion = duracion;
		this.descrip = descrip;
		DescServis = descServis;
		this.agencia = agencia;
		this.eventos= evento;
	}
	
	public ArrayList<Evento> getEvento() {
		return eventos;
	}

	public void setEvento(ArrayList<Evento> evento) {
		this.eventos = evento;
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
	public String getFechaInc() {
		return FechaInc;
	}
	public void setFechaInc(String fechaInc) {
		FechaInc = fechaInc;
	}
	public String getFechaFin() {
		return FechaFin;
	}
	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getDescServis() {
		return DescServis;
	}
	public void setDescServis(String descServis) {
		DescServis = descServis;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "Viaje [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", FechaInc=" + FechaInc + ", FechaFin="
				+ FechaFin + ", duracion=" + duracion + ", descrip=" + descrip
				+ ", DescServis=" + DescServis + ", agencia=" + agencia + ", evento=" + eventos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(DescServis, FechaFin, FechaInc, agencia, descrip, duracion, eventos, id, nombre,
				tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Viaje other = (Viaje) obj;
		return Objects.equals(DescServis, other.DescServis) && Objects.equals(FechaFin, other.FechaFin)
				&& Objects.equals(FechaInc, other.FechaInc) && Objects.equals(agencia, other.agencia) && Objects.equals(descrip, other.descrip)
				&& duracion == other.duracion && Objects.equals(eventos, other.eventos) && Objects.equals(id, other.id)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(tipo, other.tipo);
	}


	
	
	
}
