<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Agencia de Viajes Elorrieta</title>
    <link rel="stylesheet" href="../css/vuelos.css" />
    <link rel="icon" type="image/png" href="../img/icono.png" />
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
    <h1>ACTIVIDADES</h1>
      <hr/>
      <p>Nuestra agencia de viajes no solo te ayuda a reservar vuelos y hoteles, 
        sino que también te ofrece una gran variedad de actividades para hacer de tu viaje una experiencia inolvidable. A continuación, te presentamos algunas de las opciones más populares:</p>
      <table>
        <tr>
            <td><img class = imagenActividades src="../img/actividades/spa.png"><br><b>Viajes de Relax y Bienestar</b><br>Incluye visitas a spas, retiros de yoga, baños termales y experiencias de relajación en entornos paradisíacos.</td>
            <td><img class = imagenActividades src="../img/actividades/tourguiado.jpg"><br><b>Tours Guiados</b><br>Nuestra agencia organiza recorridos turísticos con guías especializados para que puedas conocer en profundidad la historia, cultura y principales atractivos de tu destino. Pueden ser a pie, en autobús, en bicicleta o incluso en segway.</td>
            <td><img class = imagenActividades src="../img/actividades/catadevino.png"><br><b>Actividades Culturales y Gastronómicas</b><br>Desde clases de cocina local y catas de vinos hasta espectáculos de música y danza tradicionales, una agencia de viajes puede ayudarte a sumergirte en la cultura del destino que visitas.</td>
        </tr>
        <tr>
            <td><img class = imagenActividades src="../img/actividades/lunademiel.png"><br><b>Viajes Temáticos</b><br>Si buscas algo diferente, puedes elegir paquetes especializados, como recorridos cinematográficos, rutas históricas, viajes de luna de miel o incluso experiencias de turismo astronómico.</td>
            <td><img class = imagenActividades src="../img/actividades/excursion.png"><br><b>Excursiones y Aventuras al Aire Libre</b><br>Si eres amante de la naturaleza, puedes optar por excursiones a parques naturales, caminatas en montañas, paseos en kayak, buceo o incluso safaris fotográficos en destinos exóticos.</td>
            <td><img class = imagenActividades src="../img/actividades/paracaidismo.png"><br><b> Deportes y Actividades Extremas</b><br>Para los más aventureros, algunas agencias ofrecen experiencias como paracaidismo, surf, rafting, esquí, escalada y muchas otras opciones llenas de adrenalina.</td>
        </tr>
    </table>
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
  </body>
</html>