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
$nombreHotel = $_POST['nombre-hotel'];
$ciudad = $_POST['ciudad'];
$precioHotel = $_POST['precio-hotel'];
$diaEntrada = $_POST['dia-entrada'];
$diaSalida = $_POST['dia-salida'];
$tipoHabitacion = $_POST['tipo-habitacion'];

$sql = "INSERT INTO alojamientos ( idEvento, viaje_id, nombre_hotel, ciudad, precio, fecha_entrada, fecha_salida, tipo_habitacion)
                        VALUES ($eventoid, $viaje_id, '$nombreHotel', '$ciudad', '$precioHotel', '$diaEntrada', '$diaSalida', '$tipoHabitacion')";
                if ($conn->query($sql) === TRUE) {
                    echo "<script>alert('Servicio registrado correctamente'); window.location.href='registroServicios.php';</script>";
                } else {
                    echo "Error: " . $conn->error;
                }

$conn->close();
?>
