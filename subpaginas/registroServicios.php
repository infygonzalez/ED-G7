<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro de Servicios</title>
    <link rel="icon" type="image/png" href="../img/icono.png">
    <link rel="stylesheet" href="../css/registroServicios.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
</head>
<body>
        <form class="form-container" method="post" action="procesar_formulario.php">
        <div class="logo">
            <img src="../img/logo_grupo7.png" alt="Logo Grupo 7">
        </div>
        <label for="tipoviaje">Seleccione el viaje:</label>
        <select id="viajes" name="viajes" >
            <?php
            error_reporting(E_ALL);
            ini_set('display_errors', 1);
            $servername = "localhost";
            $username   = "root";
            $password   = "";
            $dbname     = "retogrupo7mejorado";
        
            $conn = new mysqli($servername, $username, $password, $dbname);
            if ($conn->connect_error) {
                die("Conexión fallida: " . $conn->connect_error);
            }
            $sql = "SELECT idViajes FROM viajes ORDER BY idViajes ASC";
            $result = $conn->query($sql);
            if ($result->num_rows > 0) {
                echo '<option value="" disabled selected>--Elige--</option>';
                while ($row = $result->fetch_assoc()) {
                    echo '<option value="' . $row['idViajes'] . '">' . $row['idViajes'] . '</option>';
                }
            } else {
                echo '<option value="">No se encontraron viajes</option>';
            }
            $conn->close();
            ?>
        </select>

        <label for="nombre-evento">Nombre evento:</label>
        <input type="text" id="nombre-evento" name="nombre-evento" >

        <p>¿Qué servicio quieres registrar?</p>
        <div class="radio-group">
            <input type="radio" name="tipo-evento" value="vuelo" onclick="mostrarFormulario('vuelo')" >
            <label><b>Vuelo</b></label>
            <input type="radio" name="tipo-evento" value="hotel" onclick="mostrarFormulario('hotel')" >
            <label><b>Alojamiento</b></label>
            <input type="radio" name="tipo-evento" value="otros" onclick="mostrarFormulario('otros')" >
            <label><b>Otros</b></label>
        </div>

        <!-- Sección Vuelo -->
        <div id="vuelo-section" class="ocultar">
            <p>¿Qué tipo de vuelo es?</p>
            <div class="radio-group">
                <input type="radio" name="tipoVuelo" value="ida" onclick="mostrarFormularioVuelo('ida')" >
                <label><b>Ida</b></label>
                <input type="radio" name="tipoVuelo" value="ida-vuelta" onclick="mostrarFormularioVuelo('ida-vuelta')" >
                <label><b>Ida / Vuelta</b></label>
            </div>
            
            <label for="aeropuerto-procedencia">Aeropuerto de Procedencia:</label>
            <select id="aeropuerto-procedencia" name="aeropuerto-procedencia" >
                <?php
                error_reporting(E_ALL);
                ini_set('display_errors', 1);
                $servername = "localhost";
                $username   = "root";
                $password   = "";
                $dbname     = "retogrupo7mejorado";
        
                $conn = new mysqli($servername, $username, $password, $dbname);
                if ($conn->connect_error) {
                    die("Conexión fallida: " . $conn->connect_error);
                }
                $sql = "SELECT CodAeropuerto, nombre_aeropuerto FROM Aeropuerto ORDER BY nombre_aeropuerto ASC";
                $result = $conn->query($sql);
                if ($result->num_rows > 0) {
                    echo '<option value="" disabled selected>--Elige--</option>';
                    while ($row = $result->fetch_assoc()) {
                        echo '<option value="' . $row['CodAeropuerto'] . '">' . $row['nombre_aeropuerto'] . '</option>';
                    }
                } else {
                    echo '<option value="">No se encontraron aeropuertos</option>';
                }
                $conn->close();
                ?>
            </select>
            
            <label for="aeropuerto-destino">Aeropuerto de Destino:</label>
            <select id="aeropuerto-destino" name="aeropuerto-destino" >
                <?php
                error_reporting(E_ALL);
                ini_set('display_errors', 1);
                $servername = "localhost";
                $username   = "root";
                $password   = "";
                $dbname     = "retogrupo7mejorado";
        
                $conn = new mysqli($servername, $username, $password, $dbname);
                if ($conn->connect_error) {
                    die("Conexión fallida: " . $conn->connect_error);
                }
                $sql = "SELECT CodAeropuerto, nombre_aeropuerto FROM Aeropuerto ORDER BY nombre_aeropuerto ASC";
                $result = $conn->query($sql);
                if ($result->num_rows > 0) {
                    echo '<option value="" disabled selected>--Elige--</option>';
                    while ($row = $result->fetch_assoc()) {
                        echo '<option value="' . $row['CodAeropuerto'] . '">' . $row['nombre_aeropuerto'] . '</option>';
                    }
                } else {
                    echo '<option value="">No se encontraron aeropuertos</option>';
                }
                $conn->close();
                ?>
            </select>
            
            <label for="codigo-vuelo">Código del Vuelo:</label>
            <input type="text" id="codigo-vuelo" name="codigo-vuelo" >
            
            <label for="aerolinea">Aerolínea:</label>
            <select id="aerolinea" name="aerolinea" >
                <?php
                error_reporting(E_ALL);
                ini_set('display_errors', 1);
                $servername = "localhost";
                $username   = "root";
                $password   = "";
                $dbname     = "retogrupo7mejorado";
        
                $conn = new mysqli($servername, $username, $password, $dbname);
                if ($conn->connect_error) {
                    die("Conexión fallida: " . $conn->connect_error);
                }
                $sql = "SELECT CodAerolinea, nombre_aerolinea FROM Aerolinea ORDER BY nombre_aerolinea ASC";
                $result = $conn->query($sql);
                if ($result->num_rows > 0) {
                    echo '<option value="" disabled selected>--Elige--</option>';
                    while ($row = $result->fetch_assoc()) {
                        echo '<option value="' . $row['CodAerolinea'] . '">' . $row['nombre_aerolinea'] . '</option>';
                    }
                } else {
                    echo '<option value="">No se encontraron aerolíneas</option>';
                }
                $conn->close();
                ?>
            </select>
            
            <label for="precio">Precio (€):</label>
            <input type="number" id="precio" name="precio" >
            
            <label for="fecha-salida">Fecha de salida:</label>
            <input type="date" id="fecha-salida" name="fecha-salida" min="2025-01-01" >
            
            <label for="hora-salida">Hora de salida:</label>
            <input type="time" id="hora-salida" name="hora-salida" >
            
            <label for="duracion-viaje">Duración del viaje (en horas):</label>
            <input type="number" id="duracion-viaje" name="duracion-viaje" >

            <!-- Sección Ida y Vuelta -->
            <div id="vuelta-section" class="ocultar">
                <p><b>Vuelo (vuelta)</b></p>
                <label for="fecha-vuelta">Fecha de Vuelta:</label>
                <input type="date" id="fecha-vuelta" name="fecha-vuelta" >
                
                <label for="hora-vuelta">Hora de Vuelta:</label>
                <input type="time" id="hora-vuelta" name="hora-vuelta" >
                
                <label for="viaje-duracion-vuelta">Duración del Vuelo de Vuelta (en horas):</label>
                <input type="number" id="viaje-duracion-vuelta" name="viaje-duracion-vuelta" >
                
                <label for="vuelo-codigo-vuelta">Código del Vuelo de Vuelta:</label>
                <input type="text" id="vuelo-codigo-vuelta" name="vuelo-codigo-vuelta" >
                
                <label for="aerolinea-vuelta">Aerolínea de Vuelta:</label>
                <select id="aerolinea-vuelta" name="aerolinea-vuelta" >
                    <?php
                    error_reporting(E_ALL);
                    ini_set('display_errors', 1);
                    $servername = "localhost";
                    $username   = "root";
                    $password   = "";
                    $dbname     = "retogrupo7mejorado";
            
                    $conn = new mysqli($servername, $username, $password, $dbname);
                    if ($conn->connect_error) {
                        die("Conexión fallida: " . $conn->connect_error);
                    }
                    $sql = "SELECT CodAerolinea, nombre_aerolinea FROM Aerolinea ORDER BY nombre_aerolinea ASC";
                    $result = $conn->query($sql);
                    if ($result->num_rows > 0) {
                        echo '<option value="" disabled selected>--Elige--</option>';
                        while ($row = $result->fetch_assoc()) {
                            echo '<option value="' . $row['CodAerolinea'] . '">' . $row['nombre_aerolinea'] . '</option>';
                        }
                    } else {
                        echo '<option value="">No se encontraron aerolíneas</option>';
                    }
                    $conn->close();
                    ?>
                </select>
            </div>
        </div>
        <script>
            document.addEventListener("DOMContentLoaded", function () {
                let fechaSalidaInput = document.getElementById("fecha-salida");
                let fechaVueltaInput = document.getElementById("fecha-vuelta");

                fechaSalidaInput.addEventListener("change", function () {
                fechaVueltaInput.min = fechaSalidaInput.value;
                
                if (fechaVueltaInput.value && fechaVueltaInput.value < fechaSalidaInput.value) {
                    fechaVueltaInput.value = fechaSalidaInput.value;
                }
                });
            });
        </script>

        <!-- Sección Hotel -->
        <div id="hotel-section" class="ocultar">
            <label for="nombre-hotel">Nombre hotel:</label>
            <input type="text" id="nombre-hotel" name="nombre-hotel" >

            <label for="ciudad">Ciudad:</label>
            <input type="text" id="ciudad" name="ciudad" >

            <label for="precio-hotel">Precio (€):</label>
            <input type="number" id="precio-hotel" name="precio-hotel" >

            <label for="dia-entrada">Día de entrada:</label>
            <input type="date" id="dia-entrada" name="dia-entrada" >

            <label for="dia-salida">Día de salida:</label>
            <input type="date" id="dia-salida" name="dia-salida" >

            <label for="tipo-habitacion">Tipo de habitación:</label>
            <select id="tipo-habitacion" name="tipo-habitacion">
                <option value="">--Elige--</option>
                <option value="BD">Doble</option>
                <option value="DUI">Doble uso individual</option>
                <option value="SIN">Individual</option>
                <option value="TPL">Triple</option>
            </select>
        </div>
        <script>
            document.addEventListener("DOMContentLoaded", function () {
                let diaEntradaInput = document.getElementById("dia-entrada");
                let diaSalidaInput = document.getElementById("dia-salida");

                diaEntradaInput.addEventListener("change", function () {
                diaSalidaInput.min = diaEntradaInput.value;
                
                if (diaSalidaInput.value && diaSalidaInput.value < diaEntradaInput.value) {
                    diaSalidaInput.value = diaEntradaInput.value;
                }
                });
            });
        </script>

        <!-- Sección Otros servicios -->
        <div id="otros-section" class="ocultar">
            <label for="nombre-otros">Nombre:</label>
            <input type="text" id="nombre-otros" name="nombre-otros" >

            <label for="fecha-otros">Fecha:</label>
            <input type="date" id="fecha-otros" name="fecha-otros" >

            <label for="descripcon-otros">Descripción:</label>
            <textarea id="otdescripcion-otros" name="descripcion-otros"></textarea>

            <label for="precio-otros">Precio (€):</label>
            <input type="number" id="precio-otros" name="precio-otros" >
        </div>

        <button type="submit" id="guardar">Guardar Servicios</button>
    </form>
    <script>
        function mostrarFormulario(tipo) {
           document.getElementById('vuelo-section').classList.add('ocultar');
           document.getElementById('hotel-section').classList.add('ocultar');
           document.getElementById('otros-section').classList.add('ocultar');
           
           if (tipo === 'vuelo') {
               document.getElementById('vuelo-section').classList.remove('ocultar');
           } else if (tipo === 'hotel') {
               document.getElementById('hotel-section').classList.remove('ocultar');
           } else if (tipo === 'otros') {
               document.getElementById('otros-section').classList.remove('ocultar'); 
           }
         }

        function mostrarFormularioVuelo(tipo) {
            document.getElementById('vuelta-section').classList.add('ocultar');
            if (tipo === 'ida-vuelta') {
                document.getElementById('vuelta-section').classList.remove('ocultar');
            }
        }
    </script>
</body>
</html>

