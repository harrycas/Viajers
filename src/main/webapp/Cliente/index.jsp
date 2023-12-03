<%-- 
    Document   : index
    Created on : 2 dic. 2023, 09:53:58
    Author     : harryjosecastrorodriguez
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/homepageStyle.css" rel="stylesheet" type="text/css"/>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700;800&display=swap" rel="stylesheet">
        <title>Viajers</title>
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
        <!------------------------------------------------------------------------------------>

        <!--PRIMERA DIVISIÓN-->
        <div class="cuerpo container-fluid">
            <div class="row container-fluid">
                <div class="col-md-5 text-center justify-content-center align-items-center">
                    <h1 class="logo1" style="font-size: 62px;"><br> VIAJA CON COMODIDAD Y SEGURIDAD</h1>
                    <h3 class="logo2">Tu Destino, Nuestro Compromiso</h3>

                </div>
                <div class="col-md-7 d-flex justify-content-center align-items-center">
                    <div class="card" style="width: 520px; " >
                        <div class="card-header text-center" style="font-size: 25px;">
                          BUSCAR VIAJES
                        </div>                      
                        <form class="container-fluid form1">  
                            <br>
                            <label for="Origen">Ciudad de origen</label>
                            <br>    
                            <select id="Origen" name="Origen" style="width: 100%;" required>
                                <option value="" disabled selected></option>                              
                            </select>
                            <br><br>
                            <label>Ciudad de destino</label>    
                            <br>
                            <select id="Destino" name="Destino"style="width: 100%;" required>
                                <option value="" disabled selected></option>
                                <option value="destino1">Destino1</option>
                                <option value="destino2">Destino2</option>
                                <option value="destino3">Destino3</option>
                                <option value="destino4">Destino4</option>
                                <option value="destino5">Destino5</option>

                            </select>
                            <br><br>
                            <label>Fecha de viaje</label>
                            <input style="width: 100%;" type="date" id="fechaInput" min="" required />
                            <br><br>
                            <div class="text-center">
                                <button type="button" class="boton estiloboton" onclick="validarYRedirigir()">Buscar</button>
                            </div>
                            <br><br>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!----------------------------------------------------------------------------------->

        <!--DIV BLANCO-->
        <div><br></div>
        <!----------------------------------------------------------------------------------->

        <!--SEGUNDA DIVISION-->
        <div class="container-fluid corp" id="nosotros">
            <br><br>
            <h1 class="logo1" style="text-align: center; font-size: 62px;">SOBRE NOSOTROS</h1>
            <br><br>
        </div>
        <div></div>
        <div class="container-fluid">
            <div class="row container-fluid">
                <div class="col-md-7 textodiv">
                    <p class="fondo2">En Viajers, estamos dedicados a simplificar y enriquecer la experiencia de viaje de nuestros usuarios. Somos una plataforma en línea que conecta personas y comunidades a través de soluciones de compra y reserva de pasajes. <br><br>Nuestra misión es facilitar la vida de aquellos que confían en nosotros para sus desplazamientos, brindándoles acceso a las mejores ofertas de transporte, oportunidades para socializar y conectarse con otros viajeros, y una comunidad de apoyo que comparte consejos y experiencias de viaje.</p>
                </div>
                <div class="col-md-4" style="text-align: center;" >
                    <br>
                    <img  class="fondo3" src="../css/img/pasajero.jpg">
                </div>
            </div>
        </div>
        <!---------------------------------------------------------------------------------->

        <!--TERCERA DIVISION-->
        <div class="container-fluid corp2" id="servicios">
            <br><br>
            <h1 class="logo1" style="text-align: center; font-size: 62px;">NUESTROS SERVICIOS</h1>
            <br><br>
        </div>
        <div><br></div>
        <div class="container-fluid d-flex justify-content-center align-items-center">
            <section class="card form2" style="width: 300px; margin-right: 55px; margin-top: 30px;">
                <div class="card-header1 fondocard" style="width: 300px;">
                </div>
                <form class="container-fluid form2" style="text-align: center;">  
                    <h3 class="logo2" >SUPER CAMA</h3>
                    <br>
                    <p style="text-align: center;">¡Date el Lujo que mereces en tu viaje!</p>
                </form>
            </section>
            <section class="card form2" style="width: 300px; margin-left: 55px; margin-top: 30px;">
                <div class="card-header1 fondocard1" style="width: 300px;";>
                </div>
                <form class="container-fluid form2" style="text-align: center;">  
                    <h3 class="logo2">ECONOMICO</h3>
                    <br>
                    <p style="text-align: center;">¡Una experiencia genial al alcance de todos!</p>
                </form>
            </section> 
        </div>
        <div>
            <br><br>
            <p style="text-align: center;"><strong>“TU DESTINO, NUESTRO COMPROMISO...”</strong></p> 
        </div>
        <div><br><br></div>
    
    <!---------------------------------------------------------------------------------->
        
        <script src="../js/jquery-3.7.1.min.js" type="text/javascript"></script>
        <script src="../js/popper.min.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
    
        <script>
            document.addEventListener("DOMContentLoaded", function () {
                var fechaInput = document.getElementById("fechaInput");

                // Obtén la fecha actual en la zona horaria local del usuario
                var fechaActual = new Date().toLocaleDateString('en-CA'); // Ajusta el código según la zona horaria necesaria

                // Establece la fecha actual como el valor mínimo del input
                fechaInput.min = fechaActual;
            });
        </script>

        <script>
            function validarYRedirigir() {
                // Obtener los valores de los campos del formulario
                var origen = document.getElementById("Origen").value;
                var destino = document.getElementById("Destino").value;
                var fecha = document.getElementById("fechaInput").value;

                // Realizar la validación, puedes agregar otras condiciones según tus necesidades
                if (origen === "" || destino === "" || fecha === "") {
                    alert("Por favor, completa todos los campos antes de buscar.");
                } else {
                    // Redirigir a la página index.html
                    window.location.href = "seleccionarBus.html";
                }
            }
        </script>
        
        <script>
            $(document).ready(function () {
                // Realizar solicitud AJAX al controlador
                $.get('RutasController', function (data) {

                    console.log(data);

                    // Actualizar las opciones del menú desplegable con las ciudades recibidas
                    var origenSelect = $('#Origen');
                    origenSelect.empty(); // Limpiar opciones existentes

                    if (data.length > 0) {
                        $.each(data, function (index, ciudad) {
                            origenSelect.append($('<option>', {
                                value: ciudad,
                                text: ciudad
                            }));
                        });
                    } else {
                        // Si no hay ciudades, añadir un mensaje
                        origenSelect.append($('<option>', {
                            value: "null",
                            text: "No hay ciudades disponibles"
                        }));
                    }
                });
            });
        </script>      

    </body>
</html>
