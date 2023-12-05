<%-- 
    Document   : horarios
    Created on : 3 dic. 2023, 18:08:45
    Author     : harryjosecastrorodriguez
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.Programacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<!DOCTYPE html>
<html>
<head>
    <title>Horarios</title>
</head>
<body>

<h1>Resultados de Programaciones</h1>

<%
    List<Programacion> programaciones = (List<Programacion>)request.getAttribute("programaciones");

    if (programaciones != null && !programaciones.isEmpty()) {
        for (Programacion programacion : programaciones) {
%>
            <div>
                <p>ID Programación: <%= programacion.getId() %></p>
                <p>Fecha: <%= programacion.getDate() %></p>
                <p>Hora: <%= programacion.getHour() %></p>
                <p>Ruta origen: <%= programacion.getRuta().getOrigin() %></p>
                <p>Ruta destino: <%= programacion.getRuta().getDestination() %></p>
                <hr/>
            </div>
<%
        }
    } else {
%>
        <p>No hay programaciones disponibles para la consulta seleccionada.</p>
<%
    }
%>

</body>
</html>
