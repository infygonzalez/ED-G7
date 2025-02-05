package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dbutils {
	
	public static final String URL = "jdbc:mysql://localhost:3306/retogrupo7";
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String USER = "ekaitzi";
	public static final String PASSWORD = "";
	public static PreparedStatement sentencia = null;
	
}
