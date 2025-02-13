<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Agencia de Viajes Elorrieta</title>
    <link rel="stylesheet" href="../css/vuelos.css" />
    <link rel="icon" type="image/png" href="../img/icono.png"  />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,100..900;1,100..900&display=swap"
      rel="stylesheet"
    />
    <script src="./js/iniciosesion.js"></script>
  </head>
  <header>
    <img src="../img/logo_grupo7.png" id="logo" />
    <nav>
      <ul>
        <li><a href="inicio.php"> INICIO </a></li>
        <li>
          <a href="informacion.php">INFORMACIÓN</a>
          <ul class="submenu">
            <li><a href="alojamientos.php"> ALOJAMIENTOS </a></li>
            <li><a href="vuelos.php"> VUELOS </a></li>
            <li><a href="otros.php"> OTROS </a></li>
          </ul>
        </li>
        <li><a href="conocenos.php"> CONÓCENOS </a></li>
        <li><a href="contacto.php"> CONTACTO </a></li>
        <button id="cerrarSesion" onclick="location.href='../index.php'">Log Out
        </button>
      </ul>
    </nav>
    <section id="inicio" class="imageninicio">
      <div class="contenidoinicio"></div>
    </section>
  </header>
  <body>
    <div class="nuestrosServicios">
    <h1>¿POR QUÉ ELEGIRNOS?</h1>
      <hr/>
      <table>
        <tr>
            <td><img class = imagenAerolinea src="../img/aerolineas/aerolineasargentinas.png"><br><b>Aerolineas Argentinas S.A.</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/aeromexico.png"><br><b>Aerovias de Mexico SA de CV dba AeroMexico</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/aireuropa.png"><br><b>Air Europa Lineas Aereas, S.A.</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/airfrance.png"><br><b>Air France</b></td>
        </tr>
        <tr>
            <td><img class = imagenAerolinea src="../img/aerolineas/airgreenland.png"><br><b>Air Greenland</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/airnostrum.png"><br><b>Air Nostrum, Lineas aereas del Mediterra neo SA</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/airtransant.png"><br><b>Air Transat</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/alia.png"><br><b>Alia - The Royal Jordanian Airlines </b></td>
        </tr>
        <tr>
            <td><img class = imagenAerolinea src="../img/aerolineas/world2fly.png"><br><b>World 2 Fly Portugal, S.A.</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/americanairlines.png"><br><b>American Airlines</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/avianca.png"><br><b>AVIANCA-Ecuador dba AVIANCA</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/britishairways.png"><br><b>British Airways PLC</b></td>
        </tr>
        <tr>
            <td><img class = imagenAerolinea src="../img/aerolineas/britisheuroflyer.png"><br><b>BA Euroflyer Limited dba British Airways</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/brusselsairlines.png"><br><b>Brussels Airlines</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/challengeairlines.png"><br><b>Challenge Airlines (BE) S.A.</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/chinaairlines.png"><br><b>China United Airlines</b></td>
        </tr>
        <tr>
            <td><img class = imagenAerolinea src="../img/aerolineas/condor.png"><br><b>Condor Flugdienst GmbH</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/croatiaairlines.png"><br><b>Croatia Airlines d.d.</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/delta.png"><br><b>Delta Air Lines Inc</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/easyjet.png"><br><b>Easyjet Switzerland S.A</b></td>
        </tr>
        <tr>
            <td><img class = imagenAerolinea src="../img/aerolineas/edelweiss.png"><br><b>Edelweiss Air AG</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/egyptair.png"><br><b>Egyptair</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/finnair.png"><br><b>Finnair</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/klm.png"><br><b>KLM</b></td>
        </tr>
        <tr>
            <td><img class = imagenAerolinea src="../img/aerolineas/klmcityhopper.png"><br><b>KLM Cityhopper</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/lufthansa.png"><br><b>Lufthansa</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/maltaairtravel.png"><br><b>Malta Air Travel Ltd dba Malta MedAir</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/norse.png"><br><b>Norse Atlantic Airways AS</b></td>
        </tr>
        <tr>
            <td><img class = imagenAerolinea src="../img/aerolineas/pegasus.png"><br><b>Pegasus Airlines</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/qatarairways.png"><br><b>Qatar Airways Group Q.C.S.C dba Qatar Airways</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/ryanair.png"><br><b>Rynair</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/sata.png"><br><b>SATA (Air Acores)</b></td>
        </tr>
        <tr>
            <td><img class = imagenAerolinea src="../img/aerolineas/swiss.png"><br><b>SWISS Internation Air Lines Ltd</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/tam.png"><br><b>Tam Linhas Aereas SA dba Latam Airlines Brasil</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/tapportugal.png"><br><b>TAP Portugal</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/tufly.png"><br><b>TUIfly Gmbh</b></td>
        </tr>
        <tr>
            <td><img class = imagenAerolinea src="../img/aerolineas/turkishairlines.png"><br><b>Turkish Airlines Inc</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/unitedairlines.png"><br><b>United Airlines Inc</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/virginatlantic.png"><br><b>Virgin Atlantic Airways Ltd</b></td>
            <td><img class = imagenAerolinea src="../img/aerolineas/vueling.png"><br><b>Aerolínea Vueling SA</b></td>
        </tr>
        <tr>
        </tr>

        </tr>
    </table>
    </div>
    <footer>
        <div class="footer">
            <ul>
                <li><a href="inicio.php">INICIO</a></li>
                <li><a href="informacion.php">INOFMRACIÓN</a></li>
                <li><a href="conocenos.php">CONOCENOS</a></li>
                <li><a href="contacto.php">CONTACTO</a></li>
            </ul>
            <p class="copyright">Agencia de Viajes Elorrieta © 2025</p>
            <div class="licencias">
                <a href="https://creativecommons.org/licenses/by-nc-nd/4.0/?ref=chooser-v1" target="_blank"
                    rel="license noopener noreferrer" style="display:inline-block;">
                    <img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;"
                        src="https://mirrors.creativecommons.org/presskit/icons/cc.svg?ref=chooser-v1"
                        alt="Creative Commons logo">
                    <img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;"
                        src="https://mirrors.creativecommons.org/presskit/icons/by.svg?ref=chooser-v1" alt="BY logo">
                    <img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;"
                        src="https://mirrors.creativecommons.org/presskit/icons/nc.svg?ref=chooser-v1" alt="NC logo">
                    <img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;"
                        src="https://mirrors.creativecommons.org/presskit/icons/nd.svg?ref=chooser-v1" alt="ND logo">
                </a>
            </div>
        </div>
    </footer>
  </body>
</html>
