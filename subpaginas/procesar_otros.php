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
$nombreOtros = $_POST['nombre-otros'];
$fechaOtros = $_POST['fecha-otros'];
$descripcionOtros = $_POST['descripcion-otros'];
$precioOtros = $_POST['precio-otros'];

$sql = "INSERT INTO otros ( idEvento, viaje_id, nombre, fecha, descripcion, precio)
                        VALUES ($eventoid, $viaje_id, '$nombreOtros', '$fechaOtros', '$descripcionOtros', '$precioOtros')";
                if ($conn->query($sql) === TRUE) {
                    echo "<script>alert('Servicio registrado correctamente'); window.location.href='registroServicios.php';</script>";
                } else {
                    echo "Error: " . $conn->error;
                }

$conn->close();
?>