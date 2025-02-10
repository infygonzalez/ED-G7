package CONTROLADOR;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Connector.MySqlConnector;
import Modelo.Agencia;
import Modelo.Dbutils;
import Modelo.Evento;
import Modelo.Pais;
import Modelo.SQLQuerys;
import Modelo.Viaje;

public class ControladorA {
	
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
		return r1.next();
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
		p1.setCodPais(r1.getString("codPais"));
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
			v1.setFechaInc(r1.getString("fecha_inicio"));
			v1.setFechaFin(r1.getString("fecha_fin"));
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