package CONTROLADOR;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connector.MySqlConnector;
import Modelo.Agencia;
import Modelo.Dbutils;
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
	static String sql6 = SQLQuerys.INSERT_AGENCIA;
	static String sql7 = SQLQuerys.SELECT_AGENCIA_COLOR_LOGO;
	static String sql8 = SQLQuerys.SELECT_PAIS;
	static String sql9 = SQLQuerys.SELECT_VIAJES;
	
	
public static ArrayList<Agencia> obtenerAgenciaId(String id) {
	
	ArrayList<Agencia> agencias = new ArrayList<Agencia>();

	try {	
		
	ArrayList<String> listaAtributos = new ArrayList<String>();
	listaAtributos.add(id);
	ResultSet r1  = MySqlConnector.ejecutarSentencia(sql, listaAtributos);
	
	while(r1.next()) {
		Agencia a1 = new Agencia();
		a1.setId(r1.getString("id"));
		a1.setNombre(r1.getString("nombre"));
		agencias.add(a1);
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return agencias;
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


public static ArrayList<Pais> mostrarPaises(String codPais, String nombre) {
	
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
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return paises;
	}


public static void insertarAgencia(Agencia agencia) {
	MySqlConnector a1 = new MySqlConnector();
	a1.InsertarAgencia(agencia);
}
}