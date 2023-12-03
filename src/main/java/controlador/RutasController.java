/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.RutasDAO;

/**
 *
 * @author harryjosecastrorodriguez
 */
@WebServlet(name = "RutasController", urlPatterns = {"/Cliente/RutasController"})
public class RutasController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        cargarCiudades(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        cargarCiudades(request, response);
        
    }
    
    private void cargarCiudades(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        RutasDAO rutas = new RutasDAO();
        
        List<String> ciudadesOrigen = rutas.listarCiudadesOrigen();

        // Convertir la lista a JSON
        String ciudadesJson = new Gson().toJson(ciudadesOrigen);

        // Configurar la respuesta
        response.setContentType("application/json");
        
        response.setCharacterEncoding("UTF-8");

        // Escribir los datos JSON en la respuesta
        response.getWriter().write(ciudadesJson);

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
