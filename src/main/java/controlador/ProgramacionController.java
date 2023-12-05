/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Programacion;
import modelo.ProgramacionDAO;

/**
 *
 * @author harryjosecastrorodriguez
 */
@WebServlet(name = "ProgramacionController", urlPatterns = {"/ProgramacionController"})
public class ProgramacionController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("Solicitud recibida en ProgramacionController");
    
        // Obtener parámetros del formulario
        String ciudadOrigen = request.getParameter("Origen");
        String ciudadDestino = request.getParameter("Destino");

        System.out.println("Ciudad Origen: " + ciudadOrigen);
        System.out.println("Ciudad Destino: " + ciudadDestino);

        // Obtener la fecha del formulario
        String fechaStr = request.getParameter("fechaInput");
        System.out.println("Fecha recibida antes del formateo: " + fechaStr);

        // Convertir la fecha del formulario (String) a un objeto LocalDate
        LocalDate fecha = null;
        DateTimeFormatter dtfEntrada = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            fecha = LocalDate.parse(fechaStr, dtfEntrada);
            System.out.println("Fecha después del formateo: " + fecha);
            
            RequestDispatcher dispatcher = null;
            
            // Llamar a ProgramacionDAO para obtener las programaciones disponibles
            ProgramacionDAO programacionDAO = new ProgramacionDAO();
            List<Programacion> programaciones = programacionDAO.obtenerProgramacionesDisponibles(ciudadOrigen, ciudadDestino, Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant()));

            // Imprimir en la consola toda la información de las programaciones
            for (Programacion programacion : programaciones) {
                System.out.println("ID Programación: " + programacion.getId());
                System.out.println("Fecha: " + programacion.getDate());
                System.out.println("Hora: " + programacion.getHour());
            }

            // Enviar los resultados a la página JSP correspondiente
            request.setAttribute("programaciones", programaciones);
            //this.getServletConfig().getServletContext().getRequestDispatcher("/Software/Cliente/horarios.jsp").forward(request, response);
            dispatcher = request.getRequestDispatcher("/Cliente/horarios.jsp");
            dispatcher.forward(request, response);
            

        } catch (DateTimeParseException ex) {
            Logger.getLogger(ProgramacionController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
