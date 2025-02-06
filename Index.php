
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="./css/index.css">
    <link rel="icon" type="image/png" href="img/icono.png">
    <script defer src="./js/iniciosesion.js"></script> 
</head>
<body>
    <div class="formulario">
        <div class="logo">
         <img src="img/logo_grupo7.png">
        </div>
        <p class="registrarse"> No tienes una cuenta? <a href="./subpaginas/registro.php">Registrarse</a></p>
        
        <form id="form"> 

            <div class="username">
                <input id="name" type="text" required placeholder="Usuario: ">
            </div>

            <div class="username">
                <input id="contra" type="password" required placeholder="Contraseña: ">
            </div>


            <button type="submit" id="botonLogin">INICIAR SESIÓN</button>
            

            <div class="recordar">
                <a href="#">¿Ha olvidado su contraseña?</a>
            </div>
        </form>
    </div>

    <script>
document.getElementById("botonLogin").addEventListener("click", function(event) {
    event.preventDefault(); // Evitar que el formulario recargue la página

    const usuario = document.getElementById("name").value;
    const contraseña = document.getElementById("contra").value;
    const mensaje = document.getElementById("mensaje");

    fetch("db_config.php", {
        method: "POST",
        headers: { "Content-Type": "application/x-www-form-urlencoded" },
        body: `usuario=${encodeURIComponent(usuario)}&contraseña=${encodeURIComponent(contraseña)}`
    })
    .then(response => response.text())
    .then(data => {
        if (data.includes("✅ Login exitoso")) {
            localStorage.setItem("name", usuario);
            window.location.href = "../subpaginas/inicio.php";
        } else {
            mensaje.textContent = data;  // Mostrar el mensaje de error del servidor
        }
    })
    .catch(error => {
        console.error("Error en la solicitud:", error);
        mensaje.textContent = "❌ Error al conectar con el servidor";
    });
});
</script>
</body>
</html>
