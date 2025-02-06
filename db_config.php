
<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

$servername = "127.0.0.1:33060"; 
$username = "root"; 
$password = "elorrieta";
$dbname = "basegrupo7"; 

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Error en la conexión: " . $conn->connect_error);
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $usuario = $conn->real_escape_string($_POST['usuario']);
    $contraseña = $conn->real_escape_string($_POST['contraseña']);

    $sql = "SELECT * FROM agencia WHERE Nombre = '$usuario'";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();

        if (trim($contraseña) === trim($row["contraseña"])) {
            echo "✅ Login exitoso";
        } else {
            echo "❌ Contraseña incorrecta";
        }
    } else {
        echo "❌ Usuario no encontrado";
    }
}

$conn->close();
?>