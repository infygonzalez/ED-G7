<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

$servername = "127.0.0.1:33060"; //ruta de el puerto.
$username = "root"; 
$password = "elorrieta";
$dbname = "basegrupo7"; 

$conn = new mysqli($servername, $username, $password, $dbname);

// Obtener datos del formulario
$nombre_viaje = $_POST['nombre'];
$tipo_de_viaje = $_POST['viajes'];
$fecha_inicio = $_POST['fechainc'];
$fecha_fin = $_POST['fechafin'];
$duracion_viaje = $_POST['dias'];
$pais_destino = $_POST['paises'];
$descripcion = $_POST['descripcion'];
$servicios_no_incluidos = $_POST['servicios'];

$idAgencia = 1; // Valor fijo (modificar si es necesario)

// Obtener CodPais si hay una tabla relacionada
$CodPais = '';
$consulta_pais = $conn->prepare("SELECT codigo FROM pais WHERE nombre = ?");
$consulta_pais->bind_param("s", $pais_destino);
$consulta_pais->execute();
$resultado_pais = $consulta_pais->get_result();
if ($fila = $resultado_pais->fetch_assoc()) {
    $CodPais = $fila['codigo'];
}
$consulta_pais->close();

// Insertar en la tabla viajes
$stmt = $conn->prepare("INSERT INTO viajes (idAgencia, CodPais, nombre_viaje, descripcion, tipo_de_viaje, fecha_inicio, fecha_fin, duracion_viaje, pais_destino, servicios_no_incluidos)
                        VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

$stmt->bind_param("isssssssss", $idAgencia, $CodPais, $nombre_viaje, $descripcion, $tipo_de_viaje, $fecha_inicio, $fecha_fin, $duracion_viaje, $pais_destino, $servicios_no_incluidos);

if ($stmt->execute()) {
    echo json_encode(['success' => true, 'message' => 'Datos guardados correctamente.']);
} else {
    echo json_encode(['success' => false, 'message' => 'Error al guardar los datos: ' . $stmt->error]);
}

$stmt->close();
$conn->close();
?>
