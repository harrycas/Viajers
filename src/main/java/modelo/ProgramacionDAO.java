/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import config.Conexion;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harryjosecastrorodriguez
 */
public class ProgramacionDAO {
    
    Connection conex;
    
    Conexion con = new Conexion();
    
    // Método para obtener las programaciones disponibles según la ciudad origen, destino y fecha
    public List<Programacion> obtenerProgramacionesDisponibles(String ciudadOrigen, String ciudadDestino, java.util.Date fecha) {
        
        PreparedStatement ps;
        
        ResultSet rs;
        
        List<Programacion> programaciones = new ArrayList<>();

        try {
            
            conex = con.getConexion();
            
            ps = conex.prepareStatement("SELECT * FROM Programacion p " +
                                        "JOIN Ruta r ON p.ruta_id = r.idRuta " +
                                        "WHERE r.origin = ? AND r.destination = ? AND p.date = ?");
            
            ps.setString(1, ciudadOrigen);
            
            ps.setString(2, ciudadDestino);
            
            // Cambia el tipo de fecha a java.sql.Date
            java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
            
            ps.setDate(3, fechaSql);
            
            rs = ps.executeQuery();
            
            System.out.println("Consulta SQL: " + ps.toString());  // Imprime la consulta SQL
            
            while (rs.next()) {
                
                int idProg = rs.getInt("idProgramacion");
                
                Date date = rs.getDate("date");
                
                String hour = rs.getString("hour");
                
                int idRuta = rs.getInt("idRuta");
                
                String origin = rs.getString("origin");
                
                String destination = rs.getString("destination");
                
                BigDecimal price = rs.getBigDecimal("price");
                
                Rutas ruta = new Rutas(idRuta,origin,destination,price);
                
                Programacion programacion = new Programacion(idProg,date,hour,ruta);
                
                programaciones.add(programacion);
                
            }

        } catch (SQLException e) {
            
            System.out.println(e.toString());
            
        }

        return programaciones;
    }
    
}
