<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agencia de Viajes Elorrieta</title>
    <link rel="stylesheet" href="../css/inicio.css">
    <link rel="icon" type="image/png" href="../img/icono.png" >
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
  <script src="./js/iniciosesion.js"></script>
</head>
<header>
    <img src="../img/logo_grupo7.png" id="logo">
    <nav>
        <ul>
            <li><a href="inicio.php"> INICIO </a></li>
            <li><a href="informacion.php">INFORMACIÓN</a>
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
        <div class="contenidoinicio">  
        </div>
    </section>
</header>
<body>
    <div class="nuestrosServicios">
        <h1 id="nombreUsuario"></h1>
        <hr>
        <div class="texto">
        <p>En <b>Agencia de Viajes Elorrieta,</b> hacemos realidad tus sueños de viajar. 
            Ya sea que busques relajarte en playas paradisíacas, explorar ciudades llenas de historia o 
            aventurarte en destinos exóticos, 
            estamos aquí para diseñar la experiencia perfecta para ti.<br> <b> <i>¡Descubre el mundo con nosotros!</i></b></p>
        </div>
        <hr>
        <div class="botones">
            <button class="btnviaje" onclick="location.href='registroViajes.php'">
            </button>
            <button class="btnservicios" onclick="location.href='registroServicios.php'">
            </button>
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

<script>
    const nombreUsuario = localStorage.getItem("nombreUsuario");
    let textoUsuario = localStorage.getItem("textoUsuario");
    const saludoUsuario = document.getElementById("nombreUsuario");

    if (nombreUsuario) {
        saludoUsuario.textContent = `Hola, ${nombreUsuario}`;

        // Cambiar el color del texto según el usuario
        if (nombreUsuario.toLowerCase() === "admin") {
            saludoUsuario.style.color = "black";
        } else if (nombreUsuario.toLowerCase() === "ekaitz") {
            saludoUsuario.style.color = "blue";
        } else if (nombreUsuario.toLowerCase() === "lucia") {
            saludoUsuario.style.color = "red";
        } else if (nombreUsuario.toLowerCase() === "izaro") {
            saludoUsuario.style.color = "green";
        }

        if (textoUsuario) {
            textoUsuario = textoUsuario.toUpperCase();
            document.getElementById("textoUsuario").textContent = textoUsuario; 
        }

        if (colorUsuario) {
            document.querySelector("header").style.backgroundColor = colorUsuario;
            document.querySelector("footer").style.backgroundColor = colorUsuario;
        }
    } else {
        saludoUsuario.textContent = "No se ha iniciado sesión";
    }

                
                document.getElementById("cerrarSesion").addEventListener("click", function(event) {
            event.preventDefault();

            // Eliminar la información de sesión
            localStorage.removeItem("nombreUsuario");
            localStorage.removeItem("colorUsuario");
            localStorage.removeItem("textoUsuario");

            // Redirigir al login y reemplazar la página actual en el historial
            window.location.replace("../index.php");

            // Reemplazar la entrada en el historial para evitar que el usuario regrese a la página de inicio
        });
</script>
</body>
</html>