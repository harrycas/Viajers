/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Documento;
import modelo.DocumentoDAO;
import modelo.Pasajero;
import modelo.PasajeroDAO;

/**
 *
 * @author harryjosecastrorodriguez
 */
@WebServlet(name = "PasajeroController", urlPatterns = {"/PasajeroController"})
public class PasajeroController extends HttpServlet {

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
        
        // Obtener parámetros del formulario
        String typeDoc = request.getParameter("tipoDocumento");
        
        DocumentoDAO docDAO = new DocumentoDAO();
        
        int idDoc = docDAO.obtenerIdDocumentoDesdeTipo(typeDoc);        
                
        Documento doc = new Documento(idDoc,typeDoc);
        
        String idPasajero = request.getParameter("doc_nro");
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String birthday = request.getParameter("birthday");
        String cellphone = request.getParameter("cellphone");
        String sex = request.getParameter("sex");
        String mail = request.getParameter("mail");
        
        // Crear objeto Pasajero
        Pasajero pasajero = new Pasajero(idPasajero, name,lastName,birthday,cellphone,sex,mail,doc);
        
        // Imprimir datos en la consola para verificar
        System.out.println("Datos del Pasajero:");
        System.out.println("Id: " + pasajero.getIdPasajero());
        System.out.println("Nombre: " + pasajero.getName());
        System.out.println("Apellido: " + pasajero.getLastName());
        System.out.println("Fecha de nacimiento: " + pasajero.getBirthday());
        System.out.println("Teléfono: " + pasajero.getCellphone());
        System.out.println("Género: " + pasajero.getSex());
        System.out.println("Correo electrónico: " + pasajero.getMail());
        System.out.println("Documento - Tipo: " + pasajero.getDoc().getType());

        
        PasajeroDAO pasajeroDAO = new PasajeroDAO();
        
        boolean registroExitoso = pasajeroDAO.registrarPasajero(pasajero);
        
        System.out.println("Registro exitoso: " + registroExitoso);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
