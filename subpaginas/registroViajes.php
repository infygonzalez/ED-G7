<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro de Viajes</title>
    <link rel="icon" type="image/png" href="../img/icono.png" >
    <link rel="stylesheet" href="../css/registroViajes.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
</head>
<body>
    <form class="form-container" method="post" id="registroViajeForm" action="../guardar_viaje.php">
        <div class="logo">
            <img src="../img/logo_grupo7.png">
        </div>
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required>

        <label for="tipoviaje">Tipo de viaje:</label>
        <select id="viajes" name="viajes" required>
            <option value="">--Elige--</option>
            <option value="Novios">Novios</option>
            <option value="Senior">Senior</option>
            <option value="Grandes viajes (destinos exoticos)">Grandes viajes (destinos exoticos)</option>
            <option value="Combinado (vuelo+hotel)">Combinado (vuelo+hotel)</option>
            <option value="Escapadas">Escapadas</option>
            <option value="Familias con niños menores">Familias con niños menores</option>
        </select>

        <label for="fechainc">Fecha de Inicio:</label>
        <input type="date" id="fechainc" name="fechainc" min="2025-01-01" required>

        <label for="fechafin">Fecha de Fin:</label>
        <input type="date" id="fechafin" name="fechafin" required> 

        <label for="dias">Días</label>
        <input type="number" id="dias" name="dias"> 

        <script>
            document.addEventListener("DOMContentLoaded", function () {
                let fechaincInput = document.getElementById("fechainc");
                let fechafinInput = document.getElementById("fechafin");
                let diasInput = document.getElementById("dias");

                fechaincInput.addEventListener("change", function () {
                    fechafin.min = fechaincInput.value;
                    
                    if (fechafinInput.value && fechafinInput.value < fechaincInput.value) {
                        fechafinInput.value = fechaincInput.value;
                    }
                    calcularDias();
                });

                fechafinInput.addEventListener("change", calcularDias);

                function calcularDias() {
                    if (fechaincInput.value && fechafinInput.value) {
                        let inc = new Date(fechaincInput.value);
                        let fin = new Date(fechafinInput.value);
                        let diferencia = (fin - inc) / (1000 * 60 * 60 * 24);
                        diasInput.value = diferencia >= 0 ? diferencia : 0;
                    }
                }
            });
        </script>

        <label for="paises">Paises:</label>
        <select id="paises" name="paises" required>
            <option value="">--Elige--</option>
            <?php
                // Conexión a la base de datos
                error_reporting(E_ALL);
                ini_set('display_errors', 1);
                
                $servername = "127.0.0.1:33060";
                $username = "mañana";
                $password = "ikermari19";
                $dbname = "Basegrupo7";

                $conn = new mysqli($servername, $username, $password, $dbname);
                
                if ($conn->connect_error) {
                    die("Conexión fallida: " . $conn->connect_error);
                }
                
                // Consultar la tabla de países
                $sql = "SELECT CodPais, nombre_pais FROM pais ORDER BY nombre_pais ASC";
                $result = $conn->query($sql);

                if ($result->num_rows > 0) {
                    while ($row = $result->fetch_assoc()) {
                        // Mostrar los países en el select
                        echo '<option value="' . $row['CodPais'] . '">' . $row['nombre_pais'] . '</option>';
                    }
                } else {
                    echo '<option value="">No se encontraron países</option>';
                }

                $conn->close();
            ?>
        </select>

        <label for="descripcion">Descripción:</label>
        <textarea id="descripcion" name="descripcion" placeholder="Max. 300 palabras" maxlength="300"></textarea>

        <label for="servicios">Servicios que se quedan fuera:</label>
        <textarea id="servicios" name="servicios" placeholder="Max. 300 palabras" maxlength="300"></textarea>

        <button type="submit" id="enviar">ENVIAR DATOS</button>
    </form>
</body>
</html>
