<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Agencia de Viajes Elorrieta</title>
    <link rel="stylesheet" href="../css/alojamientos.css" />
    <link rel="icon" type="image/png" href="../img/icono.png" />
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
      <h1>ALOJAMIENTOS</h1>
      <hr/>
      <div class="texto">
      </div>
      <div class="imagenconocenos">
        <img src="../img/alojamiento.png" />
      </div>
      <h1>TIPOS DE HABITACIONES</h1>
      <hr/>
      <p>En nuestra agencia de viajes, queremos asegurarnos de que tu estancia sea cómoda y se adapte a tus necesidades. 
        Por ello, te ofrecemos diferentes tipos de habitaciones según el número de huéspedes y el nivel de comodidad que prefieras.</p>
      <table>
        <tr>
            <td><b>Doble:<br></b> Perfecta para parejas o amigos que viajan juntos, la habitación doble está equipada con una cama doble o dos camas individuales. 
                Disfruta de un ambiente acogedor y todas las comodidades necesarias para una estancia placentera.</td>
            <td><b>Doble uso individual:<br></b>Si viajas solo pero deseas mayor espacio y confort, esta opción es ideal para ti. 
                Se trata de una habitación doble reservada para una sola persona, ofreciéndote más amplitud sin necesidad de compartir.</td>
            <td><b>Individual: <br></b> Diseñada especialmente para viajeros solitarios, la habitación individual cuenta con una cama individual y todas las comodidades esenciales. 
                Es una opción práctica y económica para quienes buscan privacidad y descanso.</td>
            <td><b>Triple:<br></b> Perfecta para familias o grupos pequeños, esta habitación está equipada con tres camas individuales o una cama doble y una cama individual. 
                Proporciona espacio suficiente para una estancia cómoda y funcional.</td>
        </tr>
    </table>
<hr>
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
    </html>