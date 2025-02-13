<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Agencia de Viajes Elorrieta</title>
    <link rel="stylesheet" href="../css/informacion.css" />
    <link rel="icon" type="image/png" href="../img/icono.png"/>
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
            <li>
              <a href="alojamientos.php"> ALOJAMIENTOS </a>
            </li>
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


      <div class="texto">
        <p>
          Somos expertos en crear experiencias inolvidables, adaptadas a tus gustos y necesidades.
          <br/>
          Desde escapadas de fin de semana hasta grandes aventuras por el mundo,
          tenemos el destino perfecto para ti. 
          <br>
          <br>
          <b>✈️ Nuestros servicios incluyen:</b>
          <br>
          ✔️ Paquetes turísticos personalizados 
          <br>
          ✔️ Reservas de vuelos y alojamientos al mejor precio 
          <br>
          ✔️ Asesoramiento en visados y seguros de viaje 
          <br>
          🌴 Viaja con tranquilidad 
          <br>
          Nos encargamos de cada detalle para que solo te preocupes por disfrutar. 
          <br>
          Con nuestro equipo de expertos en viajes, recibirás atención personalizada y recomendaciones exclusivas.
        </p>
      </div>
      <hr />
<h1> TIPOS DE EVENTOS </h1>
<hr>
      <div class="botones">
        <button
          class="btnAlojamientos"
          onclick="location.href='alojamientos.php'"
        ></button>
        <button
          class="btnVuelos"
          onclick="location.href='vuelos.php'"
        ></button>
      </div>
    </div>
    <footer>
      <div class="footer">
        <ul>
          <li><a href="inicio.php">INICIO</a></li>
          <li><a href="informacion.php">INFORMACIÓN</a></li>
          <li><a href="conocenos.php">CONÓCENOS</a></li>
          <li><a href="contacto.php">CONTACTO</a></li>
        </ul>
        <p class="copyright">Agencia de Viajes Elorrieta © 2025</p>
        <div class="licencias">
          <a
            href="https://creativecommons.org/licenses/by-nc-nd/4.0/?ref=chooser-v1"
            target="_blank"
            rel="license noopener noreferrer"
            style="display: inline-block"
          >
            <img
              style="
                height: 22px !important;
                margin-left: 3px;
                vertical-align: text-bottom;
              "
              src="https://mirrors.creativecommons.org/presskit/icons/cc.svg?ref=chooser-v1"
              alt="Creative Commons logo"
            />
            <img
              style="
                height: 22px !important;
                margin-left: 3px;
                vertical-align: text-bottom;
              "
              src="https://mirrors.creativecommons.org/presskit/icons/by.svg?ref=chooser-v1"
              alt="BY logo"
            />
            <img
              style="
                height: 22px !important;
                margin-left: 3px;
                vertical-align: text-bottom;
              "
              src="https://mirrors.creativecommons.org/presskit/icons/nc.svg?ref=chooser-v1"
              alt="NC logo"
            />
            <img
              style="
                height: 22px !important;
                margin-left: 3px;
                vertical-align: text-bottom;
              "
              src="https://mirrors.creativecommons.org/presskit/icons/nd.svg?ref=chooser-v1"
              alt="ND logo"
            />
          </a>
        </div>
      </div>
    </footer>
  </body>
</html>