<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro de Servicios</title>
    <link rel="icon" type="image/png" href="../img/icono.png" >
    <link rel="stylesheet" href="../css/registroServicios.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
</head>
<body>
    <form class="form-container" method="post">
        <div class="logo">
            <img src="../img/logo_grupo7.png">
        </div>
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

        <p>¿Que servicio quieres registrar?</p>
        <div class="radio-group">
            <input type="radio" name="ocultar" value="vuelo" onclick="mostrarFormulario('vuelo')">
            <label><b>Vuelo</b></label>
            <input type="radio" name="ocultar" value="hotel" onclick="mostrarFormulario('hotel')">
            <label><b>Alojamiento</b></label>
            <input type="radio" name="ocultar" value="otros" onclick="mostrarFormulario('otros')">
            <label><b>Otros</b></label>
        </div>

        <!-- Sección Vuelo -->
        <div id="vuelo-section" class="ocultar">
            <p>¿Que tipo de vuelo es?</p>
            <div class="radio-group">
                <input type="radio" name="tipoVuelo" value="ida" onclick="mostrarFormularioVuelo('ida')">
                <label><b>Ida</b></label>
                <input type="radio" name="tipoVuelo" value="ida-vuelta" onclick="mostrarFormularioVuelo('ida-vuelta')">
                <label><b>Ida / Vuelta</b></label>
            </div>
            
            <label for="aeropuerto-procedencia">Aeropuerto de Procedencia:</label>
            <select id="aeropuerto-procedencia" name="aeropuerto-procedencia" required>
                <option value="">--Elige--</option>
                <option value="Alicante">Alicante</option>
                <option value="Asturias">Asturias</option>
                <option value="Gerona">Gerona</option>
                <option value="Madrid">Madrid</option>
                <option value="Barcelona">Barcelona</option>
                <option value="Lamzarote">Lanzarote</option>
                <option value="Bilbao">Bilbao</option>
                <option value="Badajoz">Badajoz</option>
                <option value="Santander">Santander</option>
                <option value="Malaga">Malaga</option>
                <option value="Reus">Reus</option>
                <option value="Murcia">Murcia</option>
                <option value="Valenia">Valencia</option>
                <option value="Hierro">Hierro</option>
                <option value="Fuerteventura">Fuerteventura</option>
                <option value="Nueva York">Nueva York</option>
                <option value="Miami">Miami</option>
                <option value="Boston">Boston</option>
            </select>
            
            
            <label for="aeropuerto-destino">Aeropuerto de Destino</label>
            <select id="aeropuerto-destino" name="aeropuerto-destino" required>
                <option value="">--Elige--</option>
                <option value="Alicante">Alicante</option>
                <option value="Asturias">Asturias</option>
                <option value="Gerona">Gerona</option>
                <option value="Madrid">Madrid</option>
                <option value="Barcelona">Barcelona</option>
                <option value="Lamzarote">Lanzarote</option>
                <option value="Bilbao">Bilbao</option>
                <option value="Badajoz">Badajoz</option>
                <option value="Santander">Santander</option>
                <option value="Malaga">Malaga</option>
                <option value="Reus">Reus</option>
                <option value="Murcia">Murcia</option>
                <option value="Valenia">Valencia</option>
                <option value="Hierro">Hierro</option>
                <option value="Fuerteventura">Fuerteventura</option>
                <option value="Nueva York">Nueva York</option>
                <option value="Miami">Miami</option>
                <option value="Boston">Boston</option>
            </select>
            
            <label for="codigo-vuelo">Código del Vuelo:</label>
            <input type="text" id="codigo-vuelo">
            
            <label for="aerolinea">Aerolínea:</label>
            <select id="aerolinea" name="aerolinea" required>
                <option value="">--Elige--</option>
                <option value="RYNAIR">RYNAI</option>
                <option value="KLM">KLM</option>
                <option value="Aerolinea Vueling SA">Aerolinea Vueling SA</option>
                <option value="Finnair">Finnair</option>
                <option value="SATA (Air Acores)">SATA (Air Acores)</option>
                <option value="Air Francw">Air Francw</option>
                <option value="World2Fly">World2Fly</option>
                <option value="Badajoz">Badajoz</option>
                <option value="TAP Portugal">TAP Portugal</option>
                <option value="Worls 2 Fly Portugal, S.A">Worls 2 Fly Portugal, S.A</option>
                <option value="Brussels Airlines">Brussels Airlines</option>
                <option value="Condor Flugdienst GmbH">Condor Flugdienst GmbH</option>
                <option value="Lufthansa">Lufthansa</option>
                <option value="TUlfly Gmbh">TUlfly Gmbh</option>
                <option value="Britich Airways PLC">Britich Airways PLC</option>
                <option value="Virgin Atlantic Airways Ltd">Virgin Atlantic Airways Ltd </option>
                <option value="Air Greenland">Air Greenland</option>
                <option value="Pegasus Airlines">Pegasus Airlines</option>
            </select>
            
            <label for="precio">Precio (€):</label>
            <input type="number" id="precio" required>
            
            <label for="fecha-salida">Fecha de salida:</label>
            <input type="date" id="fecha-salida">
            
            <label for="hora-salida">Hora de salida</label>
            <input type="time" id="hora-salida">
            
            <label for="duracion-viaje">Duración del viaje (en horas):</label>
            <input type="number" id="duracion-viaje">

            <!-- Sección Ida y Vuelta -->
            <div id="vuelta-section" class="ocultar">
                <p><b>Vuelo (vuelta)</b></p>
                <label for="fecha-vuelta">Fecha de Vuelta:</label>
                <input type="date" id="fecha-vuelta"required>
                
                <label for="hora-vuelta">Hora de Vuelta:</label>
                <input type="time" id="hora-vuelta" required>
                
                <label for="viaje-duracion-vuelta">Duración del Vuelo de Vuelta (en horas):</label>
                <input type="number" id="viaje-duracion-vuelta" required>
                
                <label for="vuelo-codigo-vuelta">Código del Vuelo de Vuelta:</label>
                <input type="text" id="vuelo-codigo-vuelta" required>
                
                <label for="aerolinea-vuelta">Aerolínea de Vuelta:</label>
                <select id="aerolinea-vuelta" name="aerolinea-vuelta" required>
                    <option value="">--Elige--</option>
                    <option value="RYNAIR">RYNAIR</option>
                    <option value="KLM">KLM</option>
                    <option value="Aerolinea Vueling SA">Aerolinea Vueling SA</option>
                    <option value="Finnair">Finnair</option>
                    <option value="SATA (Air Acores)">SATA (Air Acores)</option>
                    <option value="Air Francw">Air Francw</option>
                    <option value="World2Fly">World2Fly</option>
                    <option value="Badajoz">Badajoz</option>
                    <option value="TAP Portugal">TAP Portugal</option>
                    <option value="Worls 2 Fly Portugal, S.A">Worls 2 Fly Portugal, S.A</option>
                    <option value="Brussels Airlines">Brussels Airlines</option>
                    <option value="Condor Flugdienst GmbH">Condor Flugdienst GmbH</option>
                    <option value="Lufthansa">Lufthansa</option>
                    <option value="TUlfly Gmbh">TUlfly Gmbh</option>
                    <option value="Britich Airways PLC">Britich Airways PLC</option>
                    <option value="Virgin Atlantic Airways Ltd">Virgin Atlantic Airways Ltd</option>
                    <option value="Air Greenland">Air Greenland</option>
                    <option value="Pegasus Airlines">Pegasus Airlines</option>
                </select>
            </div>
        </div>


        <!-- Sección hotel -->
        <div id="hotel-section" class="ocultar">

            <label for="nombre-hotel">Nombre hotel:</label>
            <input type="text" id="nombre-hotel" required>

            <label for="ciudad">Ciudad:</label>
            <input type="text" id="ciudad" required>

            <label for="precio">Precio (€):</label>
            <input type="number" id="precio" required>

            <label for="dia-entrada">Día de entrada:</label>
            <input type="date" id="dia-entrada" required>

            <label for="dia-salida">Día de salida:</label>
            <input type="date" id="dia-salida" required>

            <label for="tipo-habitacion">Tipo de habitación:</label>
            <input list="tipos" id="tipo-habitacion" name="tipo-habitacion" placeholder="--Elige--" required>
                 <datalist id="tipos">
                    <option value="Doble"></option>
                    <option value="Doble uso individual"></option>
                    <option value="Individual"></option>
                    <option value="Triple"></option>
                </datalist>

        </div>

        <!-- Sección Otros servicios -->
        <div id="otros-section" class="ocultar">
            <label for="nombre-otros">Nombre:</label>
            <input type="text" id="nombre-otros" required>

            <label for="fechaotros">Fecha:</label>
            <input type="date" id="fecha-otros" required>

            <label for="descripcon-otros">Descripción:</label>
            <textarea id="otdescripcion-otros"></textarea>

            <label for="precio-otros">Precio (€):</label>
            <input type="number" id="precio-otros" required>
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
           }
            else if (tipo === 'otros') {
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