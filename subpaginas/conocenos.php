<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Agencia de Viajes Elorrieta</title>
    <link rel="stylesheet" href="../css/conocenos.css" />
    <link rel="icon" type="image/png" href="../img/icono.png"/>
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet"/>
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
      <h1>SOMOS AGENCIA DE VIAJES ELORRIETA, TU AGENCIA DE VIAJES A MEDIDA</h1>
      <hr/>
      <div class="texto">
        <p>
          En <b>Agencia de Viajes Elorrieta</b>, nos especializamos en hacer
          realidad tus sueños de viajar. Con años de experiencia en la industria
          del turismo, ofrecemos una amplia variedad de servicios para que vivas
          experiencias inolvidables sin preocupaciones.
        </p>
      </div>
      <hr/>
      <div class="imagenconocenos">
        <img src="../img/imagenmanos.png" />
      </div>
      <h1>¿QUE OFRECEMOS?</h1>
      <hr/>
      <table>
        <tr>
            <td><b>Paquetes turísticos:</b> Diseñamos itinerarios personalizados a destinos nacionales e internacionales, adaptados a tus gustos y necesidades.</td>
            <td><b>Reservación de vuelos y hoteles:</b> Contamos con alianzas con las mejores aerolíneas y cadenas hoteleras para garantizarte comodidad y buenos precios.</td>
            <td><b>Excursiones y tours:</b> Disfruta de recorridos guiados en los lugares más icónicos del mundo, con guías expertos que harán tu viaje aún más especial.</td>
            <td><b>Asesoría de viajes:</b> Te ayudamos con trámites de visado, seguros de viaje y recomendaciones para que tu experiencia sea placentera y segura.</td>
        </tr>
    </table>
    <hr>
    <h1>¿POR QUÉ ELEGIRNOS?</h1>
      <hr/>
      <table>
        <tr>
            <td><img class = manos src="../img/manos.png"><br><b>Experiencia y confianza:</b> Contamos con un equipo de profesionales apasionados por el turismo </td>
            <td><img class = manos src="../img/precioscompetitivos.png"><br><b>Precios competitivos:</b> Ofrecemos opciones accesibles sin sacrificar la calidad.</td>
            <td><img class = manos src="../img/atencionpersonalizada.png"><br><b>Atención personalizada:</b>Nos preocupamos por cada detalle para que solo disfrutes.</td>
        </tr>
    </table>
    </div>


    <footer>
        <div class="footer">
            <ul>
                <li><a href="inicio.php">INICIO</a></li>
                <li><a href="informacion.php">INFORMACIÓN</a></li>
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
