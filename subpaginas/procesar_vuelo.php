<?php
$servername = "localhost";
$username   = "root";
$password   = "";
$dbname     = "retogrupo7mejorado";

$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
    die("Conexión fallida: " . $conn->connect_error);
}

$idViajes = $_POST["viajes"];
$nombreEvento = $_POST["nombre-evento"];
$tipoEvento = $_POST["tipo-evento"];


$sql = "INSERT INTO eventos (idViajes, nombre_evento, tipo_evento) 
        VALUES ($idViajes, '$nombreEvento', '$tipoEvento')";
$stmt = $conn->prepare($sql);
$stmt->execute();

$sql2 = "Select max(idEvento) FROM EVENTOS";
$stmt2 = $conn->prepare($sql2);
$stmt2->execute();
$resultado = $stmt2->get_result();

$eventoid;
if ($resultado->num_rows > 0) {
    $row = $resultado->fetch_assoc();
$eventoid = $row["max(idEvento)"];
}
$viaje_id = $_POST['viajes'];
$codigoVuelo = $_POST['codigo-vuelo'];
$aerolinea = $_POST['aerolinea'];
$aeropuertoProcedencia = $_POST['aeropuerto-procedencia'];
$aeropuertoDestino = $_POST['aeropuerto-destino'];
$precio = $_POST['precio'];
$fechaSalida = $_POST['fecha-salida'];
$horaSalida = $_POST['hora-salida'];
$duracionViaje = $_POST['duracion-viaje'];
$tipoVuelo = $_POST['tipoVuelo'];
$sql = "INSERT INTO Vuelos (idEvento,CodVuelo, CodAerolinea, aeropuerto_origen, aeropuerto_destino, precio, fecha_salida, horario_salida, duracion_viaje) 
        VALUES ($eventoid,$codigoVuelo, '$aerolinea', '$aeropuertoProcedencia', '$aeropuertoDestino', '$precio', '$fechaSalida', '$horaSalida', $duracionViaje)";

        if ($conn->query($sql) === TRUE) {
            echo "<script>alert('Viaje registrado correctamente'); window.location.href='registroViajes.php';</script>";
        } else {
            echo "Error: " . $conn->error;
        }

$stmt->execute();

if ($tipoVuelo == "ida-vuelta") {
    $codigoVueloVuelta = $_POST['vuelo-codigo-vuelta'];
    $aerolineaVuelta = $_POST['aerolinea-vuelta'];
    $fechaVuelta = $_POST['fecha-vuelta'];
    $horaVuelta = $_POST['hora-vuelta'];
    $duracionVuelta = $_POST['viaje-duracion-vuelta'];
    $codigoDependencia = $_POST['codigo-vuelo'];
    $sql2 = "INSERT INTO Vuelos (CodDependencia,idEvento,CodVuelo, CodAerolinea, aeropuerto_origen, aeropuerto_destino, precio, fecha_salida, horario_salida, duracion_viaje) 
    VALUES ( '$codigoDependencia',$eventoid,$codigoVueloVuelta, '$aerolineaVuelta', '$aeropuertoProcedencia', '$aeropuertoDestino', '$precio', '$fechaVuelta', '$horaVuelta', $duracionVuelta)";
}
    if ($conn->query($sql) === TRUE) {
        echo "<script>alert('Viaje registrado correctamente'); window.location.href='registroServicios.php';</script>";
    } else {
        echo "Error: " . $conn->error;
    }
$stmt->execute();
$conn->close();
?>

