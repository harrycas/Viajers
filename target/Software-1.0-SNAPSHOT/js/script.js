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

    // Verificar las credenciales (puedes ajustar esto según tus necesidades)
    if (username === "harrycas" && password === "tripleconpiña") {
        // Redirigir al usuario a la página de inicio después de iniciar sesión
        window.location.href = "gestionarReserva.jsp";
        return false; // Evitar que el formulario se envíe
    } else {
        alert("Credenciales incorrectas. Intenta de nuevo.");
        return false; // Evitar que el formulario se envíe
    }
}
  