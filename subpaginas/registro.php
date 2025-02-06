<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Formulario de Registro</title>
    <link rel="stylesheet" href="../css/registro.css">
    <link rel="icon" type="image/png" href="../img/icono.png">
    <script src="./js/iniciosesion.js"></script>
</head>
<body>

    <div class="formulario">
        <div class="logo">
            <img src="../img/logo_grupo7.png">
        </div>
      
        <p class="registrarse"> Ya estas registrado? <a href="../index.php">Inicia sesion</a></p>
        <form method="post">

            <!--Zona para crear usuario-->
            <div class="username">
                <input id="name" type="text" required placeholder="Usuario: ">   
            </div>

            <!--Zona para crear la contraseña-->
            <div class="password">
                <input id="contra" type="password" required placeholder="Contraseña: ">
            </div>

            <!--Zona para crear el gmail-->
            <div class="gmail">
                <input id="correo" type="email" pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$" required placeholder="Correo electronico:">
            </div>        

            <!--Boton de registrar-->
            <input type="submit" value="REGISTRARSE">
        </form>
    </div>
</body>