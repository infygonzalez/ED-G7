package CONTROLADOR;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connector.MySqlConnector;
import Modelo.Agencia;
import Modelo.Dbutils;
import Modelo.SQLQuerys;

public class ControladorA {
	
	static String sql = SQLQuerys.SELECT_AGENCIA_ID;
	static String sql1 = SQLQuerys.SELECT_AGENCIA_NOMBRE;
	static String sql2 = SQLQuerys.SELECT_AGENCIA_LOGO;
	static String sql3 = SQLQuerys.SELECT_AGENCIA_COLOR_DE_MARCA;
	static String sql4 = SQLQuerys.SELECT_AGENCIA_NUMERO_DE_EMPLEADOS;
	static String sql5 = SQLQuerys.SELECT_AGENCIA_TIPO_DE_AGENCIA;
	
	
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
}