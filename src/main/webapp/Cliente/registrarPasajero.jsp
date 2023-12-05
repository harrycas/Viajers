<%-- 
    Document   : registrarPasajero
    Created on : 4 dic. 2023, 17:32:56
    Author     : harryjosecastrorodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Viajers</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
    <link href="../css/estilos-registrar-pasajeros.css" rel="stylesheet" type="text/css"/>
</head>

<!-- <a class="navbar-brand titulo" href="#">Viajers.com</a> -->

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

<div class="image-container" style="background-color: #71b700;">
    <div class="content col-md-12">
        <div class="container text-center">
            <h2 style="margin-bottom: 50px;">Registro de Pasajero</h2>
            <div class="row contenedor" style="background-color: white; color: black;">
                <div class="container" style="padding: 50px 50px;">

                    <div class="col-md-2">
                        <div id="infoAsiento" style="margin-bottom: 50px; background-color: #71b700; color: white;">
                            Asiento: 12</div>
                    </div>

                    <form action="/Software/PasajeroController" method="POST" id="formularioRegistro">
                        <div class="row">
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="tipoDocumento">Tipo de Documento*</label>
                                    <select class="form-control" id="tipoDocumento" name="tipoDocumento">
                                        <option value="">-----------</option>
                                        <option value="dni">DNI</option>
                                        <!-- <option value="carnetExtranjeria">Carnet de Extranjería</option> -->
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="numeroDocumento">Número de Documento*</label>
                                    <input type="text" class="form-control" name="doc_nro" id="numeroDocumento"
                                           oninput="validarLongitudDocumento()">
                                    <div id="mensajeErrorDocumento" style="color: red;"></div>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="genero">Género*</label>
                                    <select class="form-control" name="sex" id="genero">
                                        <option value="">-----------</option>
                                        <option value="hombre">Masculino</option>
                                        <option value="mujer">Femenino</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="nombre">Nombre*</label>
                                    <input type="text" class="form-control" name="name" id="nombre">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="apellidoPaterno">Apellido*</label>
                                    <input type="text" class="form-control" name="lastName" id="apellido">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="datepicker">Seleccionar fecha:</label>
                                    <input type="date" class="form-control" name="birthday" id="datepicker" [max]="fechaMax()">
                                    <div id="mensajeErrorFecha" style="color: red;"></div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-2">
                                
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="email">Email*</label>
                                    <input type="email" class="form-control" name="mail" id="email" oninput="validarCorreo()">
                                    <div id="mensajeErrorCorreo" style="color: red;"></div>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="email">Nro Celular*</label>
                                    <input type="tel" class="form-control" name="cellphone" id="nroCelular" oninput="validarNumeroCelular()">
                                    <div id="mensajeErrorCelular" style="color: red;"></div>
                                </div>
                            </div>
                            <div class="col-md-2">
                                
                            </div>
                        </div>
                        <div class="container">
                            <div class="col-md-4">
                                
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" value=""
                                           id="esContactoPrincipal">
                                    <label class="form-check-label" for="esContactoPrincipal">
                                        Marcar como contacto principal
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div>
                            <button type="submit" class="btn btn-success" name="accion" value="Enviar" onclick="validarFormulario()">Registrar</button>
                        </div>
                    </form>
                    
                </div>
            </div>
        </div>

        


    </div>
</div>

<script src="../js/jquery-3.7.1.min.js" type="text/javascript"></script>
<script src="../js/popper.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min.js" type="text/javascript"></script>
<script src="../js/registrarPasajeros.js" type="text/javascript"></script>
</body>

</html>