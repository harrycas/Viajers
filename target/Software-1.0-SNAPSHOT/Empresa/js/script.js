function checkLogin() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var passwordError = document.getElementById("password-error");

    // Restablecer el mensaje de error
    passwordError.textContent = "";

    // Verificar la longitud mínima de la contraseña
    if (password.length < 8) {
        passwordError.textContent = "La contraseña debe tener al menos 8 caracteres.";
        return false; // Evitar que el formulario se envíe
    }

    var validacionExitosa = true;

    // Devolver el resultado de la validación
    if (validacionExitosa) {
        return true; // Permitir que el formulario se envíe
    } else {
        return false; // Evitar que el formulario se envíe
    }
}
  