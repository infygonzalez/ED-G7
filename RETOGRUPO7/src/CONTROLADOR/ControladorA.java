package CONTROLADOR;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Connector.MySqlConnector;
import Modelo.Aeropuerto;
import Modelo.Agencia;
import Modelo.Alojamiento;
import Modelo.Dbutils;
import Modelo.Evento;
import Modelo.Otros;
import Modelo.Pais;
import Modelo.SQLQuerys;
import Modelo.Viaje;
import Modelo.Vuelo;

public class ControladorA {
	
	//**********************************************************
	//VARIABLES DE SESION
	public static Agencia agenciaSesion;
	
	
	//**********************************************************
	
	static String sql = SQLQuerys.SELECT_AGENCIA_ID;
	static String sql1 = SQLQuerys.SELECT_AGENCIA_NOMBRE;
	static String sql2 = SQLQuerys.SELECT_AGENCIA_LOGO;
	static String sql3 = SQLQuerys.SELECT_AGENCIA_COLOR_DE_MARCA;
	static String sql4 = SQLQuerys.SELECT_AGENCIA_NUMERO_DE_EMPLEADOS;
	static String sql5 = SQLQuerys.SELECT_AGENCIA_TIPO_DE_AGENCIA;
	static String sql6 = SQLQuerys.INSERT_VIAJE;
	static String sql7 = SQLQuerys.SELECT_AGENCIA_COLOR_LOGO;
	static String sql8 = SQLQuerys.SELECT_PAIS;
	static String sql9 = SQLQuerys.SELECT_VIAJES;
	static String sql10 =SQLQuerys.SELECT_EVENTOS_POR_VIAJE;
	static String sql11 = SQLQuerys.DELETE_VIAJES;
	static String sql12 = SQLQuerys.DELETE_EVENTOS;
	static String sql13 = SQLQuerys.HACER_LOGIN;
	static String sql14 = SQLQuerys.SELECT_NOMBRE_PAIS;
	static String sql15 = SQLQuerys.SELECT_CODPAIS;
	static String sql16 = SQLQuerys.SELECT_AEROPUERTO;
	static String sql17 = SQLQuerys.SELECT_CODAERO;
	static String sql18 = SQLQuerys.SELECT_ALOJAMIENTO;
	static String sql19 = SQLQuerys.INSERT_EVENTO;
	static String sql20 = SQLQuerys.SELECT_VIAJE_ID;
	static String sql21 = SQLQuerys.INSERT_VUELO;
	static String sql22 = SQLQuerys.INSERT_ALOJAMIENTO;
	static String sql23 = SQLQuerys.INSERT_OTROS;
	
	
public static void insertarViaje(Viaje viaje) {
	ArrayList<Viaje> viajes = new ArrayList<Viaje>();
	try {
		ArrayList<String> listaAtributos = new ArrayList<String>();
		listaAtributos.add(viaje.getId());
		listaAtributos.add(viaje.getAgencia().getId());
		listaAtributos.add(viaje.getPais().getCodPais());
		listaAtributos.add(viaje.getNombre());
		listaAtributos.add(viaje.getTipo());

		// Crear un formateador de fecha
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		// Convertir las fechas a formato correcto antes de agregarlas a la lista
		String fechaInicioFormatted = sdf.format(viaje.getFechaInc());
		String fechaFinFormatted = sdf.format(viaje.getFechaFin());

		// Agregar las fechas formateadas a la lista
		listaAtributos.add(fechaInicioFormatted);
		listaAtributos.add(fechaFinFormatted);

		listaAtributos.add(String.valueOf(viaje.getDuracion()));
		listaAtributos.add(viaje.getPais().getNombre());
		listaAtributos.add(viaje.getDescrip());
		listaAtributos.add(viaje.getDescServis());
		
		MySqlConnector.ejecutarSentenciaUpdate(sql6, listaAtributos);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}	

public static void insertarVuelo(Vuelo vuelo) {
	try {
		
		
		ArrayList<String> listaAtributos = new ArrayList<String>();
		listaAtributos.add(vuelo.getCodV());
		listaAtributos.add(vuelo.getAerolinea().getCodigoAerolinea());
		listaAtributos.add(vuelo.getCodDep());
		listaAtributos.add(vuelo.getId());
		listaAtributos.add(vuelo.getAeroorigen().getCodigoaero());
		listaAtributos.add(vuelo.getAerodestino().getCodigoaero());
		listaAtributos.add(String.valueOf(vuelo.getPrecio()));
		listaAtributos.add((String) vuelo.getFecSal().toString());
		listaAtributos.add(vuelo.getHora());
		listaAtributos.add(vuelo.getDuracion());
		
		MySqlConnector.ejecutarSentenciaUpdate(sql21, listaAtributos);
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
	
public static void insertarAlojamiento (Alojamiento alojamiento) {
	try {
		ArrayList<String> listaAtributos = new ArrayList<String>();
		listaAtributos.add(alojamiento.getId());
		listaAtributos.add(String.valueOf(alojamiento.getViaje()));
		listaAtributos.add(alojamiento.getNombreh());
		listaAtributos.add(alojamiento.getCiudad());
		listaAtributos.add(String.valueOf(alojamiento.getPrecio()));
		listaAtributos.add((String) alojamiento.getFecEnt().toString());
		listaAtributos.add((String) alojamiento.getFecSal().toString());
		listaAtributos.add(alojamiento.getTipoh());
		
		MySqlConnector.ejecutarSentenciaUpdate(sql22, listaAtributos);
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
}

public static void insertarOtros (Otros otros) {
	try {
		
		ArrayList<String> listaAtributos = new ArrayList<String>();
		listaAtributos.add(otros.getId());
		listaAtributos.add(String.valueOf(otros.getViaje()));
		listaAtributos.add(otros.getNombre());
		listaAtributos.add((String) otros.getFecha().toString());
		listaAtributos.add(otros.getDescripcion());
		listaAtributos.add(String.valueOf(otros.getPrecio()));
		
		MySqlConnector.ejecutarSentenciaUpdate(sql23, listaAtributos);
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
	
	
	
public static ArrayList<Pais> obtenerPaisId(String id){
	ArrayList<Pais> paises = new ArrayList<Pais>();
	try {
		ArrayList<String> listaAtributos = new ArrayList<String>();
		listaAtributos.add(id);
		ResultSet r1 = MySqlConnector.ejecutarSentencia(sql15, listaAtributos);
	
	while(r1.next()) {
		Pais p1 = new Pais();
		p1.setCodPais(r1.getString("CodPais"));
		p1.setNombre(r1.getString("nombre_pais"));
		paises.add(p1);
	}
	System.out.println("Cantidad de países encontrados: " + paises.size());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return paises;
}	
	
public static ArrayList<Aeropuerto> obtenerIdAeropuerto(String id){
	ArrayList<Aeropuerto> aero = new ArrayList<Aeropuerto>();
	
	try {
		ArrayList<String> listaAtributos = new ArrayList<String>();
		listaAtributos.add(id);
		ResultSet r1 = MySqlConnector.ejecutarSentencia(sql17, listaAtributos);
		
	while(r1.next()) {
		Aeropuerto a1 = new Aeropuerto();
		a1.setCodigoaero(r1.getString("CodAeropuerto"));
		a1.setNombre(r1.getString("nombre_aeropuerto"));
		aero.add(a1);
	}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return aero;
}	
	

public static ArrayList<Viaje> obtenerViajeId(String id, ArrayList<Pais> paises, Agencia agencia){
	ArrayList<Viaje> viajes = new ArrayList<Viaje>();
	try {
		ArrayList<String> listaAtributos = new ArrayList<String>();
		listaAtributos.add(id);
		ResultSet r1 = MySqlConnector.ejecutarSentencia(sql20, listaAtributos);
	
	while(r1.next()) {
		Viaje v1 = new Viaje();
		v1.setId(r1.getString("idViajes"));
		v1.setNombre(r1.getString("nombre_viaje"));
		v1.setDescrip(r1.getString("descripcion"));
		v1.setTipo(r1.getString("tipo_de_viaje"));
		v1.setFechaInc(r1.getDate("fecha_inicio"));
		v1.setFechaFin(r1.getDate("fecha_fin"));
		v1.setDuracion(Integer.parseInt(r1.getString("duracion_viaje")));
		v1.setDescServis(r1.getString("servicios_no_incluidos"));
		
		String codigoPais = r1.getString("codPais");
		
		for(Pais pais : paises) {
			if(pais.getCodPais().equals(codigoPais)) {
				v1.setPais(pais);
			}
		}
		String idAgencia = r1.getString("idAgencia");
		if(agencia.getId().equals(idAgencia)) {
			v1.setAgencia(agencia);
		}	
		viajes.add(v1);
	}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return viajes;
}
public static ArrayList<Agencia> obtenerAgenciaId(String id) {
	
	ArrayList<Agencia> agencias = new ArrayList<Agencia>();

	try {	
		
	ArrayList<String> listaAtributos = new ArrayList<String>();
	listaAtributos.add(id);
	ResultSet r1  = MySqlConnector.ejecutarSentencia(sql, listaAtributos);
	
	while(r1.next()) {
		Agencia a1 = new Agencia();
		a1.setId(r1.getString("idAgencia"));
		a1.setNombre(r1.getString("nombre"));
		agencias.add(a1);
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return agencias;
	}

public boolean autenticarUsuario(String usuario, String contraseña) {
	ArrayList<String> listaAtributos = new ArrayList<String>();
	listaAtributos.add(usuario);
	listaAtributos.add(contraseña);
	try {
		ResultSet r1 = MySqlConnector.ejecutarSentencia(sql13, listaAtributos);
		Agencia a1 = new Agencia();
		if(r1.next()) {
			
			a1.setId(r1.getString("idAgencia"));
			a1.setNombre("nombre");
			a1.setLogo(r1.getString("logo"));
			a1.setColor("color_de_marca");
			a1.setTipoAgencia("tipo_de_agencia");
			a1.setEmpleados("numero_de_empleados");
				
			agenciaSesion = a1;
			System.out.println("Id agencia " + a1.getId());
			return true;
		}
		else {
			return false;
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
		return false;
	}
}

public static ArrayList<Agencia> obtenerAgenciaNombre(String nombre) {
	
	ArrayList<Agencia> agencias = new ArrayList<Agencia>();

	try {	
		
	ArrayList<String> listaAtributos = new ArrayList<String>();
	listaAtributos.add(nombre);
	ResultSet r1  = MySqlConnector.ejecutarSentencia(sql1, listaAtributos);
	
	while(r1.next()) {
		Agencia a1 = new Agencia();
		a1.setNombre(r1.getString("nombre"));
		agencias.add(a1);
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return agencias;
	}

public static ArrayList<Agencia> obtenerAgenciaLogo(String logo) {
	
	ArrayList<Agencia> agencias = new ArrayList<Agencia>();

	try {	
		
	ArrayList<String> listaAtributos = new ArrayList<String>();
	listaAtributos.add(logo);
	ResultSet r1  = MySqlConnector.ejecutarSentencia(sql2, listaAtributos);
	
	while(r1.next()) {
		Agencia a1 = new Agencia();
		a1.setLogo(r1.getString("logo"));
		agencias.add(a1);
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return agencias;
	}


public static ArrayList<Pais> mostrarPaises() {
	
	ArrayList<Pais> paises = new ArrayList<Pais>();

	try {	
		
	ArrayList<String> listaAtributos = new ArrayList<String>();
	ResultSet r1  = MySqlConnector.ejecutarSentencia(sql8, listaAtributos);
	
	while(r1.next()) {
		Pais p1 = new Pais();
		p1.setCodPais(r1.getString("CodPais"));
		p1.setNombre(r1.getString("nombre_pais"));
		paises.add(p1);
	}
	System.out.println("Cantidad de países encontrados: " + paises.size());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return paises;
	}

public static ArrayList<Pais> mostrarNombrePais(){
	ArrayList<Pais> pais = new ArrayList<Pais>();
	try {
		ArrayList<String> listaAtributos = new ArrayList<String>();
		ResultSet r1  = MySqlConnector.ejecutarSentencia(sql14, listaAtributos);
		while(r1.next()) {
			Pais p1 = new Pais();
			p1.setCodPais(r1.getString("CodPais"));
			p1.setNombre(r1.getString("nombre_pais"));
			pais.add(p1);
		}
		System.out.println("Cantidad de países encontrados: " + pais.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pais;
}

public static ArrayList<Aeropuerto> mostrarNombreAeropuerto(){
	ArrayList<Aeropuerto> aero = new ArrayList<Aeropuerto>();
	try {
		ArrayList<String> listaAtributos = new ArrayList<String>();
		ResultSet r1 = MySqlConnector.ejecutarSentencia(sql16, listaAtributos);
		while (r1.next()) {
			Aeropuerto a1 = new Aeropuerto();
			a1.setCodigoaero(r1.getString("CodAeropuerto"));
			a1.setNombre(r1.getString("nombre_aeropuerto"));
			aero.add(a1);
		}
		System.out.println("Cantidad de aeropuertos encontrados: " + aero.size());
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return aero;
}

public static ArrayList<Viaje> buscarViajes(ArrayList<Pais> paises, Agencia agencia){
	ArrayList<Viaje> viajes = new ArrayList<Viaje>();
	
	try {	
		
		ArrayList<String> listaAtributos = new ArrayList<String>();
		listaAtributos.add(agencia.getId());
		ResultSet r1  = MySqlConnector.ejecutarSentencia(sql9, listaAtributos);
		
		while(r1.next()) {
			Viaje v1 = new Viaje();
			v1.setId(r1.getString("idViajes"));
			v1.setNombre(r1.getString("nombre_viaje"));
			v1.setDescrip(r1.getString("descripcion"));
			v1.setTipo(r1.getString("tipo_de_viaje"));
			v1.setFechaInc(r1.getDate("fecha_inicio"));
			v1.setFechaFin(r1.getDate("fecha_fin"));
			v1.setDuracion(Integer.parseInt(r1.getString("duracion_viaje")));
			v1.setDescServis(r1.getString("servicios_no_incluidos"));
			
			String codigoPais = r1.getString("codPais");
			
			for(Pais pais : paises) {
				if(pais.getCodPais().equals(codigoPais)) {
					v1.setPais(pais);
				}
			}
			String idAgencia = r1.getString("idAgencia");
			if(agencia.getId().equals(idAgencia)) {
				v1.setAgencia(agencia);
			}	
			viajes.add(v1);
			
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return viajes;
}

public static void insertarAgencia(Agencia agencia) {
	MySqlConnector a1 = new MySqlConnector();
	a1.insertarAgencia(agencia);
}

public static ArrayList<Alojamiento> mostrarAlojamientos(Viaje viaje) {
	ArrayList<Alojamiento> a1 = new ArrayList<Alojamiento>();
	ArrayList<String> listaAtributos = new ArrayList<String>();
	listaAtributos.add(viaje.getId());
	try {
		ResultSet r1 = MySqlConnector.ejecutarSentencia(sql18, listaAtributos);
	while(r1.next()) {
		Alojamiento alojamiento = new Alojamiento();
	}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return a1;
}

public static ArrayList<Evento> obtenerEventos(int idViaje) {
	ArrayList<Evento> v1 = new ArrayList<Evento>();
	ArrayList<String> listaAtributos = new ArrayList<String>();
	listaAtributos.add(String.valueOf(idViaje));
	try {
		ResultSet r1  = MySqlConnector.ejecutarSentencia(sql10, listaAtributos);
		while(r1.next()) {
			Evento evento = new Evento();
			evento.setId(r1.getString("idEvento"));
			evento.setViaje(Integer.parseInt(r1.getString("idViajes")));
			evento.setNombre(r1.getString("nombre_evento"));
			evento.setTipo(r1.getString("tipo_evento"));
			evento.setPrecio(r1.getDouble("precio"));
			v1.add(evento);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return v1;
}

public static void borrarViajes(String id){
	ArrayList<String> listaAtributos = new ArrayList<String>();
	listaAtributos.add(id);
	try {
		MySqlConnector.ejecutarSentenciaUpdate(sql11, listaAtributos);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void borrarEventos(String id){
	ArrayList<String> listaAtributos = new ArrayList<String>();
	listaAtributos.add(id);
	try {
		MySqlConnector.ejecutarSentenciaUpdate(sql12, listaAtributos);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}