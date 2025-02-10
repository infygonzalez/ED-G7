package Modelo;

public class SQLQuerys {

	//SELECTS
	public static final String SELECT_AGENCIA_NOMBRE = "select * from Agencia WHERE nombre = ?";
	public static final String SELECT_AGENCIA_ID = "select * from Agencia WHERE idAgencia=?";
	public static final String SELECT_AGENCIA_LOGO = "select * from Agencia WHERE logo = ?";
	public static final String SELECT_AGENCIA_COLOR_DE_MARCA = "select * from Agencia WHERE color_de_marca = ?";
	public static final String SELECT_AGENCIA_NUMERO_DE_EMPLEADOS = "select * from Agencia WHERE numero_de_empleados = ?";
	public static final String SELECT_AGENCIA_TIPO_DE_AGENCIA = "select * from Agencia WHERE tipo_de_agencia = ?";
	public static final String SELECT_AGENCIA_COLOR_LOGO = "select color_de_marca, logo FROM Agencia WHERE nombre = ?";
	public static final String SELECT_PAIS = "select * from Pais";
	public static final String SELECT_VIAJES = "select * from Viajes where idAgencia =?";
	public static final String SELECT_EVENTOS_POR_VIAJE = "select * from Eventos where idViajes = ?";
	public static final String DELETE_VIAJES = "delete from Viajes where idViajes =?";
	public static final String DELETE_EVENTOS = "delete from Eventos where idViajes =?";
	public static final String HACER_LOGIN = "select * from Agencia where nombre =? and contraseña = ?";
	public static final String SELECT_NOMBRE_PAIS = "select nombre_pais from Pais";
	//INSERTS
	public static final String INSERT_AGENCIA = "insert into Agencia(nombre, logo, color_de_marca, numero_de_empleados, tipo_de_agencia, contraseña) values ('";
	public static final String INSERT_VIAJE = "insert into Viajes(idAgencia, CodPais, nombre_viaje, tipo_de_viaje, fecha_inicio, fecha_fin, duracion_viaje, pais_destino, descripcion, servicios_no_incluidos) values('";
	public static final String SEPARATOR = "', '";
	public static final String END_BLOCK = "')";
	
	
}
