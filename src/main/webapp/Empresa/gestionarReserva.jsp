<%-- 
    Document   : gestionarReserva
    Created on : 5 dic. 2023, 02:48:36
    Author     : bmmar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="../css/estilosGestionar.css" rel="stylesheet" type="text/css"/>
  <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&display=swap">

</head>

<body>

  <nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
      <a class="navbar-brand"><img src="../img/Logo Viajers.png" alt="Logo"></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
        aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
          <a class="nav-link" href="login_backend.html">Cerrar sesión</a>
        </div>
      </div>
    </div>
  </nav>

  <section class="container mt-5 mb-3">
    <div class="content col-md-12">
      <div class="container text-center">
        <div class="row">
          <div class="col-md offset-md cabezal">
            <span>GESTIONAR</span>
          </div>
        </div>
        <div class="row">
          <div class="col-md offset-md container-tabla">
            <div class="buscador">
              <h6>Ingresa el DNI</h6>
              <input type="text" placeholder="Buscar">
            </div>

            <div class="buscador">
              <h6>Codigo de reserva</h6>
              <input type="text" placeholder="Buscar...">
            </div>

            <button class="my-button">Buscar</button>
          </div>

          <div class="ruta">
            <h4>Trujillo - Lima, Miércoles 13 de Noviembre - 9:30am</h4>
          </div>


          <div class="Titulo">
            <span>RESULTADOS</span>
          </div>

          <table class="table table-bordered">
            <thead>
              <tr>
                <th scope="col"></th>
                <th scope="col">DNI</th>
                <th scope="col">Nombre y Apellidos</th>
                <th scope="col">Informacion del viaje</th>
                <th scope="col">Asiento</th>
                <th scope="col">Precio</th>
              </tr>
            </thead>
            <tbody>
              <tr>
              <tr>
                <td class="clickable" style="vertical-align: middle;"><input type="radio" id="opt-732061" value="732061"
                    name="opt-itinerario-ida">
                </td>
                <th scope="row">78569563</th>
                <td>Carlos Cueva Angulo</td>
                <td>Super Cama</td>
                <td>12</td>
                <td>S/120.00</td>
              </tr>



            </tbody>
          </table>
          <div class="container mt-5 mb-3">
            <div class="contenedor">
              <div class="Botones">
                <button class="my-button" onclick="confirmarReserva()">Pagar</button>
                <button class="my-button" onclick="confirmarEliminar()">Eliminar</button>

              </div>
            </div>
          </div>
        </div>
      </div>



  </section>


  <!-- Agrega el modal de confirmación -->
  <div id="modalConfirmacion" class="modal">
    <div class="modal-content">
      <p>¿Estás seguro de que deseas pagar?</p>
      <div class="modal-buttons">
        <button id="btnAceptar" class="btn" onclick="reservar()">Aceptar</button>
        <button id="btnCancelar" class="btn btn-cancel" onclick="cerrarModal()">Cancelar</button>
      </div>
    </div>
  </div>

  <div id="modalEliminar" class="modal">
    <div class="modal-content">
      <p>¿Estás seguro de que deseas eliminar?</p>
      <div class="modal-buttons">
        <button id="btnEliminar" class="btn" onclick="eliminar()">Eliminar</button>
        <button id="btnCancelarEliminar" class="btn btn-cancel" onclick="cerrarModalEliminar()">Cancelar</button>
      </div>
    </div>
  </div>









  <script src="../js/Gestionar.js" type="text/javascript"></script>
</body>

</html>>
