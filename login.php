<?php
session_start();

// Comprobamos que la petición se haya hecho por POST
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Verificamos que se hayan recibido los campos necesarios
    if (isset($_POST['usuario']) && isset($_POST['contraseña'])) {
        $usuario = $_POST['usuario'];
        $contrasena = $_POST['contraseña'];

        // Parámetros de conexión a la base de datos (ajusta estos valores a tu configuración)
        $servername = "localhost";
        $dbUsername = "root";
        $dbPassword = "";
        $dbName = "retogrupo7mejorado";

        // Conexión a la base de datos
        $conn = new mysqli($servername, $dbUsername, $dbPassword, $dbName);
        if ($conn->connect_error) {
            die("Error de conexión: " . $conn->connect_error);
        }

        // Preparamos la consulta para evitar inyecciones SQL
        $stmt = $conn->prepare("SELECT * FROM Agencia WHERE nombre = ? AND contraseña = ?");
        $stmt->bind_param("ss", $usuario, $contrasena);
        $stmt->execute();
        $resultado = $stmt->get_result();

        // Si se encontró un registro, las credenciales son correctas
        if ($resultado->num_rows > 0) {
            $fila = $resultado->fetch_assoc();
            $_SESSION['idAgencia'] = $fila['idAgencia']; // Guardamos el idAgencia en sesión
            $_SESSION['nombre'] = $fila['nombre']; // Guardamos el nombre en sesión

            echo "success";
        } else {
            echo "error";
        }

        $stmt->close();
        $conn->close();
    } else {
        echo "error";
    }
} else {
    echo "error";
}
?>
