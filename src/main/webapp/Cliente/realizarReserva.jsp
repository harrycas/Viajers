<%-- 
    Document   : realizarReserva
    Created on : 5 dic. 2023, 18:49:09
    Author     : harryjosecastrorodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/realizarReserva.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&display=swap">
        <title>Viajers</title>
    </head>
    <body>
        
            <!-- Aquí iría el navbar -->
      <nav class="navbar navbar-expand-lg">
        <div class="container-fluid">
            <a class="navbar-brand" href="index.html"><img src="../img/Logo Viajers.png" alt="Logo"></a>
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