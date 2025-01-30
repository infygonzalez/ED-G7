package Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import Modelo.*;

public class MySqlConnector {
	
	public static Connection conexion = null;


	public static Connection obtenerConexion() {
		try {
			Class.forName(Dbutils.DRIVER);
			conexion = DriverManager.getConnection(Dbutils.URL, Dbutils.USER, Dbutils.PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;
	}
	
	public static ResultSet ejecutarSentencia(String sentencia, ArrayList<String> listaAtributos) throws SQLException {
		Connection c1 = MySqlConnector.obtenerConexion();
		PreparedStatement statement = c1.prepareStatement(sentencia);
		
		for (int i = 0; i < listaAtributos.size(); i++) {
			statement.setString(i+1, listaAtributos.get(i));
		}
		
		ResultSet r1  = statement.executeQuery();
		
		return r1;
	}
	public static void InsertarAgencia(Agencia agencia) {
		Connection c2 = MySqlConnector.obtenerConexion();
		Statement sentencia = null;
		
		try {
			String sql = SQLQuerys.INSERT_AGENCIA + agencia.getNombre() +  SQLQuerys.SEPARATOR + agencia.getLogo() 
			+ SQLQuerys.SEPARATOR + agencia.getColor() + SQLQuerys.SEPARATOR + agencia.getEmpleados() + SQLQuerys.SEPARATOR + agencia.getTipoAgencia() + SQLQuerys.SEPARATOR + agencia.getContraseña() + SQLQuerys.END_BLOCK;
			sentencia = c2.createStatement();
			sentencia.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}