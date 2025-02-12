package Modelo;

public class SQLQuerys {

	//SELECTS
	public static final String SELECT_AGENCIA_NOMBRE = "select * from Agencia WHERE nombre = ?";
	public static final String SELECT_AGENCIA_ID = "select * from Agencia WHERE idAgencia=?";
	public static final String SELECT_VIAJE_ID = "select * from Viajes where idViajes =?";
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
	public static final String SELECT_NOMBRE_PAIS = "select * from Pais";
	public static final String SELECT_CODPAIS = "select * from Pais where CodPais =?";
	public static final String SELECT_AEROPUERTO = "select * from Aeropuerto";
	public static final String SELECT_CODAERO ="select * from Aeropuerto where CodAeropuerto =?";
	public static final String SELECT_ALOJAMIENTO = "select * from Alojamiento where viaje_id = ?";
	//INSERTS
	public static final String INSERT_AGENCIA = "insert into Agencia(nombre, logo, color_de_marca, numero_de_empleados, tipo_de_agencia, contraseña) values ('";
	public static final String INSERT_VIAJE = "insert into Viajes(idViajes, idAgencia, CodPais, nombre_viaje, tipo_de_viaje, fecha_inicio, fecha_fin, duracion_viaje, pais_destino, descripcion, servicios_no_incluidos) values(?,?,?,?,?,?,?,?,?,?,?)";
	public static final String INSERT_EVENTO = "insert into Evento(idEvento, idViajes, nombre_evento, tipo_evento)";
	public static final String INSERT_VUELO = "insert into Vuelos(CodVuelo, CodAerolinea, CodDependencia, idEvento, CodAeropuerto,codigo_aeropuerto_origen, aeropuerto_origen, codigo_aeropuerto_destino, aeropuerto_destino, precio, fecha_salida, horario_salida, duracion_viaje) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String SEPARATOR = "', '";
	public static final String END_BLOCK = "')";
	
	
}
