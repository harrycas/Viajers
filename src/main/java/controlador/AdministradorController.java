/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AdministradorDAO;

/**
 *
 * @author bmmar
 */
@WebServlet(name = "AdministradorController", urlPatterns = {"/AdministradorController"})
public class AdministradorController extends HttpServlet {

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
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            AdministradorDAO usuarioDAO = new AdministradorDAO();

            if (usuarioDAO.validarUsuario(username, password)) {
                // Login exitoso, redireccionar a la interfaz de gestión de reservas
                response.sendRedirect("gestionarReserva.jsp");
            } else {
                // Login fallido, mostrar mensaje de error o redireccionar a la página de inicio de sesión
                response.sendRedirect("login.jsp");
            }
        }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
    
