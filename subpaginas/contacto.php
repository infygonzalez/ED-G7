<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agencia de Viajes Elorrieta</title>
    <link rel="stylesheet" href="../css/contacto.css">
    <link rel="icon" type="image/png" href="../img/icono.png">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,100..900;1,100..900&display=swap"
        rel="stylesheet">
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
    <div class="formularioContacto">
        <h1>FORMULARIO DE CONTACTO</h1>
        <hr>

        <div class="texto">
            <p>Rellene este formulario y nos podremos en contacto contigo:</p>
        </div>
    </div>
    <div class="contact_form">
        <div class="formulario">
            <form action="submeter-formulario.php" method="post">
                <p>
                    <label for="nombre" class="colocar_nombre">Nombre:
                        <span class="obligatorio">*</span>
                    </label>
                    <input type="text" name="introducir_nombre" id="nombre" required placeholder="Escribe tu nombre">
                </p>

                <p>
                    <label for="email" class="colocar_email">Correo electronico:
                        <span class="obligatorio">*</span>
                    </label>
                    <input type="email" name="introducir_email" id="email" required placeholder="Escribe tu Email">
                </p>

                <p>
                    <label for="telefone" class="colocar_telefono">Teléfono:
                    </label>
                    <input type="tel" name="introducir_telefono" id="telefono" placeholder="Escribe tu teléfono">
                </p>

                <p>
                    <label for="mensaje" class="colocar_mensaje">Mensaje:
                        <span class="obligatorio">*</span>
                    </label>
                    <textarea name="introducir_mensaje" class="texto_mensaje" id="mensaje" required="obligatorio"
                        placeholder="Deja aquí tu comentario..."></textarea>
                </p>

                <button type="submit" name="enviar_formulario" id="enviar">
                    <p>ENVIAR</p>
                </button>

                <p class="aviso">
                    <span class="obligatorio"> * </span>los campos son obligatorios.
                </p>

            </form>
        </div>
    </div>
</body>

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