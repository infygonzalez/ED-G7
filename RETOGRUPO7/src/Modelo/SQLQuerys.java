package Modelo;

public class SQLQuerys {

	//SELECTS
	public static final String SELECT_ALUMNOS_APELLIDOS = "select * from Alumnos WHERE apellido like ?";
	public static final String SELECT_ALUMNOS_EDAD = "select * from Alumnos WHERE timestampdiff (year , FecNac , curren_date) > ?";
	
	//INSERTS
	public static final String INSERT_ALUMNO = "insert into Alumnos values ('";
	public static final String SEPARATOR = "', '";
	public static final String END_BLOCK = "')";
	
	
}
