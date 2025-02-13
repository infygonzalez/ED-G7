<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="./css/index.css">
    <link rel="icon" type="image/png" href="img/icono.png">
</head>
<body>
    <div class="formulario">
        <div class="logo">
         <img src="img/logo_grupo7.png">
        </div>
        <p class="registrarse"> No tienes una cuenta? <a href="./subpaginas/registro.php">Registrarse</a></p>
        
        <form id="form" method="POST"> 

            <div class="username">
                <input id="usuario" name="usuario" type="text" required placeholder="Usuario: ">
            </div>

            <div class="username">
                <input id="contraseña" name="contraseña" type="password" required placeholder="Contraseña: ">
            </div>

            <button type="submit" id="botonLogin" name="botonLogin">INICIAR SESIÓN</button>

            <p id="mensaje" style="color:red;"></p>
            
            <div class="recordar">
                <a href="#">¿Ha olvidado su contraseña?</a>
            </div>
        </form>
    </div>
    <script>
        // Bloqueo de la navegación hacia atrás (opcional)
        const blockNavigation = () => {
            history.pushState(null, '', window.location.href);
            window.addEventListener('popstate', () => {
                history.pushState(null, '', window.location.href);
            });
        };
        blockNavigation();
        
        // Envío del formulario mediante fetch (se asigna el evento 'submit' al formulario)
        document.getElementById("form").addEventListener("submit", function(event) {
            event.preventDefault(); // Evita el envío tradicional del formulario
            
            let formData = new FormData(this);

            fetch("login.php", {
                method: "POST",
                body: formData
            })
            .then(response => response.text())
            .then(data => {
                if (data.trim() === "success") {
                    window.location.href = "../subpaginas/inicio.php"; // Redirige si el login es correcto
                } else {
                    document.getElementById("mensaje").textContent = "❌ Usuario o contraseña incorrectos";
                }
            })
            .catch(error => console.error("Error:", error));
        });
    </script>
</body>
</html>
