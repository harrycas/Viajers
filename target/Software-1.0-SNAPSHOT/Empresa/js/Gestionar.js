// Obtén el modal de confirmación
var modalConfirmacion = document.getElementById("modalConfirmacion");

// Función para mostrar el modal de confirmación
function confirmarReserva() {
  modalConfirmacion.style.display = "block";
}

// Función para cerrar el modal
function cerrarModal() {
  modalConfirmacion.style.display = "none";
}

// Función para realizar la reserva (puedes personalizar esto según tus necesidades)
function reservar() {
  alert("Reserva pagada con éxito.");
  window.location.href = 'Boleto.html';
  cerrarModal();
}




function confirmarEliminar() {
  // Display the delete confirmation modal
  document.getElementById("modalEliminar").style.display = "block";
}

function cerrarModalEliminar() {
  // Close the delete confirmation modal
  document.getElementById("modalEliminar").style.display = "none";
}

function eliminar() {
  cerrarModalEliminar();
}

function eliminar() {

  // Display an alert message
  alert("Reserva eliminada");

  // Close the modal after deletion
  cerrarModalEliminar();
}