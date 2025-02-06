function comprobarCampos(){
    let usuarioCorrecto ="admin";
    let contraseñaCorrecta = "1234";

    let usu = document.getElementById(name).value;
    let contra = document.getElementById(contra).value;
    
    if(usu === usuarioCorrecto && contra === contraseñaCorrecta){
        alert('¡Ha iniciado sesión correctamente!');
        window.location.href = "./subpaginas/js/inicio.html";
    } else{
        alert('Las creedenciales no son correctas');
    }
}
    function limpiar(){
        document.getElementById('name').value = '';
        document.getElementById('contra').value ='';
        document.getElementById('envio').setAttribute('disabled', true);
    }