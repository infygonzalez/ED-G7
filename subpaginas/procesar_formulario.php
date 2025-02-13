<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    error_reporting(E_ALL);
    ini_set('display_errors', 1);

    if (isset($_POST['tipo-evento'])) {
        $servicio = $_POST['tipo-evento'];
        
        if ($servicio == "vuelo") {
            include 'procesar_vuelo.php';
        } elseif ($servicio == "hotel") {
            include 'procesar_hotel.php';
        } elseif ($servicio == "otros") {
            include 'procesar_otros.php';
        }

        echo "<p>Datos guardados correctamente.</p>";
    } else {
        echo "<p>Error: No se ha seleccionado ningún servicio.</p>";
    }
}
?>