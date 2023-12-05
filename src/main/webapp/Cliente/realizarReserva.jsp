<%-- 
    Document   : realizarReserva
    Created on : 4 dic. 2023, 22:59:56
    Author     : bmmar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="../css/estilos.css" rel="stylesheet" type="text/css"/>
  <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&display=swap">

</head>

<body>

  <!-- Aquí iría el navbar -->
  <nav class="navbar navbar-expand-lg">
          <div class="container-fluid">
              <a class="navbar-brand"><img src="../img/Logo Viajers.png" alt=""/></a>                         
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                  <div class="navbar-nav">
                      <a class="nav-link" href="#nosotros">Nosotros</a>
                      <a class="nav-link" href="#servicios">Servicios</a>
                  </div>
              </div>
          </div>
        </nav>

  <div class="container mt-5 mb-3">
    <div class="contenedor">
      <div class="Letras">
        <h1 class="LetrasGrandes">REALIZAR RESERVA</h1>
      </div>
    </div>
  </div>

  <section class="contanier">
    <div class="container mt-5 mb-3">
      <div class="row">
        <div class="col-md-4">
          <div class="card text-center">
            <div class="card-header">
              PASAJERO
            </div>
            <div class="card-body">
              <h5 class="card-title">NOMBRES Y APELLIDOS</h5>
              <p class="card-text">Carlos Villegas Florian</p>
              <h5 class="card-title">RUTA</h5>
              <p class="card-text">Casa Grande - Trujillo</p>
              <h5 class="card-title">ASIENTO SELECCIONADO</h5>
              <p class="card-text">12</p>
              <div class="recuadro-azul">
                <h6 class="Titulo">Precio: S/120.00 </h6>
              </div>
            </div>
            <div class="card-footer text-body-secondary">
              Máximo de 48hr para cancelar
            </div>
          </div>

        </div>
        <div class="col-md-4">
          <div class="card text-center">
            <div class="card-header">
              PASAJERO
            </div>
            <div class="card-body">
              <h5 class="card-title">NOMBRES Y APELLIDOS</h5>
              <p class="card-text">Carlos Villegas Florian</p>
              <h5 class="card-title">RUTA</h5>
              <p class="card-text">Casa Grande - Trujillo</p>
              <h5 class="card-title">ASIENTO SELECCIONADO</h5>
              <p class="card-text">12</p>
              <div class="recuadro-azul">
                <h6 class="Titulo">Precio: S/120.00 </h6>
              </div>
            </div>
            <div class="card-footer text-body-secondary">
              Máximo de 48hr para cancelar
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card text-center">
            <div class="card-header">
              PASAJERO
            </div>
            <div class="card-body">
              <h5 class="card-title">NOMBRES Y APELLIDOS</h5>
              <p class="card-text">Carlos Villegas Florian</p>
              <h5 class="card-title">RUTA</h5>
              <p class="card-text">Casa Grande - Trujillo</p>
              <h5 class="card-title">ASIENTO SELECCIONADO</h5>
              <p class="card-text">12</p>
              <div class="recuadro-azul">
                <h6 class="Titulo">Precio: S/120.00 </h6>
              </div>
            </div>
            <div class="card-footer text-body-secondary">
              Máximo de 48hr para cancelar
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="container mt-5 mb-3">
      <div class="contenedor">
        <div class="mi-recuadro">
          <h5 class="Total-Letras">Total: S/360.00</h5>
        </div>
      </div>
    </div>

    <div class="container mt-5 mb-3">
      <div class="contenedor">
        <div class="Botones">
          <button class="my-button" onclick="confirmarReserva()">Reservar</button>

        </div>
      </div>
    </div>

    <!-- Agrega el modal de confirmación -->
    <div id="modalConfirmacion" class="modal">
      <div class="modal-content">
        <p>¿Estás seguro de que deseas reservar?</p>
        <div class="modal-buttons">
          <button id="btnAceptar" class="btn" onclick="reservar()">Aceptar</button>
          <button id="btnCancelar" class="btn btn-cancel" onclick="cerrarModal()">Cancelar</button>
        </div>
      </div>
    </div>

    <script src="../js/Reserva.js" type="text/javascript"></script>
  </section>


</body>

</html>
